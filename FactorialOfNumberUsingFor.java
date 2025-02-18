import java.util.Scanner;
class FactorialOfNumberUsingFor{
public static void main(String[] args){
  int number,factorial=1;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter number: ");
  number = input.nextInt();// storing input value in the variable
  if(number>0){
    for(int i = number;i>0;i--){//using for loop
		factorial *= i;//calculating factorial of a number
	}
  }
  System.out.println(factorial);
  input.close();//closing scanner object
}
}