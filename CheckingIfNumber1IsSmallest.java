import java.util.Scanner;
class CheckingIfNumber1IsSmallest{
public static void main(String[] args){
  int number1, number2, number3;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter a number: ");
  number1 = input.nextInt();// storing input value in the variable
  System.out.println("Enter a number: ");
  number2 = input.nextInt();
  System.out.println("Enter a number: ");
  number3 = input.nextInt();
  System.out.println("Is the first number the smallest? "+ ((number1<number2) && (number1<number3)) );
  input.close();//closing scanner object
}
}  