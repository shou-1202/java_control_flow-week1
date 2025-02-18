import java.util.Scanner;
class AbleToVote{
public static void main(String[] args){
  int age;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter age: ");
  age = input.nextInt();// storing input value in the variable
  if (age>=18){
    System.out.println("The person's age is "+age+" and can vote ");//printing the result
  }
  else{
	  System.out.println("The person's age is "+age+" and cannot vote ");//printing the result
  }
  input.close();//closing scanner object
}
}