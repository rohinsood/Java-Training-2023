class NonVoidMethods {

  static String areFriendsWithAlbert(String person) {
    String albertsFriend = person + " is friends with Albert";
    return albertsFriend;
  }

  static int doubleNumber(int number) {
    return number*2;
  }

  static boolean invertBoolean(boolean bool) {
    return !bool;
  }

  public static void main(String[] args) {
    System.out.println(areFriendsWithAlbert("Rohin"));

    System.out.println(doubleNumber(3749));

    System.out.println(invertBoolean(true));
  }

}