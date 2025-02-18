import java.util.Scanner;
class SumValue1{
public static void main(String[] args){
  double total=0.0, number;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  while(true){
   System.out.println("Enter number: ");
   number = input.nextDouble();// storing input value in the variable
   if(number>0){
     total += number;//adding value of number to class
   }
   else{
     break;
   }
  }
  System.out.println("Sum = "+total);
  input.close();//closing scanner object
}
}
