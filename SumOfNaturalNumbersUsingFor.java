import java.util.Scanner;
class SumOfNaturalNumbersUsingFor{
public static void main(String[] args){
  int number,sum=0;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter number: ");
  number = input.nextInt();// storing input value in the variable
  int sum1 = (number*(number+1))/2;// checking through another condition if the result is correct or not
  for(int i = number;i>0;i--){
     sum+=i;
  }
  System.out.println(sum);
  System.out.println(sum1);
  if(sum == sum1){
	  System.out.println("Result from both the methods are same");
  }
  input.close();//closing scanner object
}
}