import java.util.Scanner;
class CheckingIfNumberIsPositiveNegativeZero{
public static void main(String[] args){
  int number;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter a number: ");
  number = input.nextInt();// storing input value in the variable
  if (number>0){
    System.out.println("The number is positive");//printing the result
  }
  else if(number <0){
	System.out.println("The number is negative");//printing the result
  }
  else{
    System.out.println("The number is zero");//printing the result  
  }
  input.close();//closing scanner object
}
}