public class Void {
  
  static void isNumberGreaterThanTen(double number) {
    if (number > 10) 
      System.out.println(true);
    else {
      System.out.println(false);
    }
  }
  
  public static void main(String[] args) {
    isNumberGreaterThanTen(.37);
    isNumberGreaterThanTen(49);
  } 
}