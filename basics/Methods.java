public class Methods {
  public static void main(String[] args) {
    System.out.println("Hello, World!");

    reprint();

    System.out.println(returnIt("Hello", "!"));
  }

  public static void reprint() {
    System.out.println("Hello again, World!");
  }

  public static String returnIt(String s, String a) {
    return s + a;
  }
}