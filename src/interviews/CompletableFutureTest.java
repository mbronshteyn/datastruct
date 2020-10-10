package interviews;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest {
  public static void main(String[] args) throws Exception {

    List<Greet> greetList = Arrays.asList(new Greet("Hello"), new Greet("Beautiful"), new Greet("World "));

    List<CompletableFuture<String>> list = greetList.stream()
            .map(greet -> {
              return CompletableFuture.supplyAsync(greet::getGreeting);
            })
            .collect(Collectors.toList());

    List<String> threadInfoList = list.stream()
            .map(CompletableFuture::join)
            .collect(Collectors.toList());

    threadInfoList.forEach(System.out::println);
  }
}

class Greet {

  private final String msg;

  public Greet(String msg) {
    this.msg = msg;
  }

  /**
   * Print message along with thread info
   *
   * @return
   */
  public String getGreeting() {
    return msg + " running on thread " + Thread.currentThread().getName();
  }
}

