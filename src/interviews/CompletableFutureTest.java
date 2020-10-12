package interviews;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest {
  public static void main(String[] args) {

    List<Greet> greetList =
            Stream.of("Hello", "Beautiful", "World ")
                    .map(Greet::new)
                    .collect(Collectors.toList());

    List<CompletableFuture<String>> cfList =
            greetList.stream()
                    .map(
                            greet -> {
                              return CompletableFuture.supplyAsync(greet::getGreetingMsg);
                            })
                    .collect(Collectors.toList());

    List<String> threadInfoList =
            cfList.stream().map(CompletableFuture::join).collect(Collectors.toList());

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
  public String getGreetingMsg() {
    return msg + " running on thread " + Thread.currentThread().getName();
  }
}
