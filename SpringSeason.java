import java.util.Scanner;
class SpringSeason{
public static void main(String[] args){
  int month, day;//declaring a variable
  Scanner input = new Scanner(System.in);//opening scanner object to take input from the user
  System.out.println("Enter month: ");
  month = input.nextInt();// storing input value in the variable
  System.out.println("Enter day: ");
  day = input.nextInt();// storing input value in the variable
  if((month==3)||(month == 5)){
    if((day>20)&&(day<31)){
		System.out.println("Its a Spring Season");
	}
	else{
		System.out.println("Its not a Spring Season");
	}
  }
  if((month==4)){
	  if((day>20)&&(day<30)){
		  System.out.println("Its a Spring Season");
	  }
	  else{
		  System.out.println("Its not a Spring Season");
	  }
  }
  if(month==6){
	  if((day>=1)&&(day<20)){
		  System.out.println("Its a Spring Season");
	  }
	  else{
		  System.out.println("Its not a Spring Season");
	  }
  }
  input.close();//closing scanner object
}
}