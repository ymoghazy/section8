import java.util.Scanner;
public class LetterWeight{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
   double weight;
     while (true){
       System.out.println("Enter a weight in ounces for letters to mail out.");
       System.out.print("When yoou are done entering, please enter -1 to finish: ");
       weight = input.nextDouble();
       if( weight > 0 && weight <= 1) {
        System.out.println("You can use forever stamp");
       }
       else if(weight > 1){
         System.out.println("You need additional postage than a forever stamp");
       }
       else {
         System.out.print("Goodbye!!");
         System.exit(0);
       }
     }
  }
}
