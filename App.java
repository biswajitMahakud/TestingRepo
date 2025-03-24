public class App{
  public static void validateAge(int age){
    if(age > 18)
      System.out.println("Yes, You can go to pub!");
    else
      System.out.println("No, You can't go to pub!");
  }
  public static void main(String[] args){
    validateAge(23);
  }
}
