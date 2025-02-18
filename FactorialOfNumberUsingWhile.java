import java.util.Scanner;
class FactorialOfNumberUsingWhile{
public static void main(String[] args){
  int number,factorial=1;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter number: ");
  number = input.nextInt();// storing input value in the variable
  if(number>0){
    while(number>0){//using while loop
		factorial *= number;//calculating factorial of a number
		number--;//using decrement operator to decrease the value by 1
	}
  }
  System.out.println(factorial);
  input.close();//closing scanner object
}
}