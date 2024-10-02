import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
   //Shopping();
   //Quote();
   Rabbit();
  }

  public static void Quote() {
    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");
  }

  public static void Rabbit() {
    System.out.println("(\\(\\\n( - -)\n((') (')");
  }

  public static void Shopping() {
    Scanner s = new Scanner(System.in);

    System.out.println("What type of item are you buying?");
    String word = s.nextLine();
    System.out.println("How many are you buying?");
    int num = s.nextInt();
    System.out.println("How much does each one weigh?");
    double doub = s.nextDouble();

    System.out.println(num + " " + word + " at " + doub + " pounds each will weigh " + (num * doub) + " pounds total");
  }
}
