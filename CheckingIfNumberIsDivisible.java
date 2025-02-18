import java.util.Scanner;
class CheckingIfNumberIsDivisible{
public static void main(String[] args){
  int number;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter a number: ");
  number = input.nextInt();// storing input value in the variable
  System.out.println("Is the number "+number+" divisible by 5?"+ (number%5==0));// the output is Is the number 48 divisible by 5?false
  input.close();//closing scanner object
}
}  