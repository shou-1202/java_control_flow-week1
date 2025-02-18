import java.util.Scanner;
class CountdownUsingFor{
public static void main(String[] args){
  int counter;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter counter: ");
  counter = input.nextInt();// storing input value in the variable
  for(int i = counter;i>0;i--){
	  System.out.print(i+"....");
  }
  input.close();//closing scanner object
}
}