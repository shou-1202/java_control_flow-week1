import java.util.Scanner;
class SumOfnNaturalNumbers{
public static void main(String[] args){
  int number1, sum;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter a number: ");
  number1 = input.nextInt();// storing input value in the variable
  sum = (number1*(number1+1))/2;
  if (number1>0){
    System.out.println("The sum of "+number1+" natural numbers is "+sum);
  }
  else{
	  System.out.println("The number "+number1+" is not a natural number ");
  }
  input.close();//closing scanner object
}
}  