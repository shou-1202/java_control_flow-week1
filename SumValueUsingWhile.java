import java.util.Scanner;
class SumValueUsingWhile{
public static void main(String[] args){
  double total=0.0, number;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter a number: ");
   number = input.nextDouble();// storing input value in the variable
  while(number!=0){
   total += number;//adding value of number to class
   System.out.println("Enter a number: ");
   number = input.nextDouble();// storing input value in the variable
  }
  System.out.println("Sum = "+total);
  input.close();//closing scanner object
}
}