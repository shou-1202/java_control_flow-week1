import java.util.Scanner;
class CountdownUsingWhile{
public static void main(String[] args){
  int counter;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter counter: ");
  counter = input.nextInt();// storing input value in the variable
  while(counter>=1){
     System.out.print(counter+"....");//printing value of counter
     counter--;
	}
  input.close();//closing scanner object
}
}