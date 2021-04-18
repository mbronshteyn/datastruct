package leetcode.easy;

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 * <p>
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The given address is a valid IPv4 address.*
 */
public class DefantIpAddress {

  public static void main(String[] args) {
    DefangIpAddressSolution solution = new DefangIpAddressSolution();

    System.out.println(solution.defangIPaddr("1.1.1.1"));
  }
}

class DefangIpAddressSolution {
  public String defangIPaddr(String address) {
    char[] addressArray = address.toCharArray();
    StringBuilder stb = new StringBuilder();

    for (int i = 0; i < addressArray.length; i++) {
      if (addressArray[i] == '.') {
        stb.append("[.]");
      } else {
        stb.append(addressArray[i]);
      }

    }

    return stb.toString();

  }

}
