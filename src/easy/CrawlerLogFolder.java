package easy;

public class CrawlerLogFolder {
  public static void main(String[] args) {
    CrawlerLogFolderSolution solution = new CrawlerLogFolderSolution();
    System.out.println(solution.minOperations(new String[]{"./", "wz4/", "../", "mj2/", "../", "../", "ik0/", "il7/"}));
  }
}

class CrawlerLogFolderSolution {
  public int minOperations(String[] logs) {
    int steps = 0;
    for (int i = 0; i < logs.length; i++) {
      String str = logs[i];
      if (str.equals("../")) {
        // make sure we don't cross below zero
        if (steps > 0) {
          steps--;
        }
      } else if (str.equals("./")) {
        //. empty operation
      } else {
        steps++;
      }
    }

    if (steps < 0) {
      steps = 0;
    }

    return steps;
  }
}
