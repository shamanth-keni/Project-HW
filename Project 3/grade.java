import java.util.Scanner;

public class grade {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int english, chemistry, computers, physics, maths; 
	    float total, Percentage;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks : ");
        System.out.println("\nEnglish");
		english = sc.nextInt();	
        System.out.println("Chemistry");
		chemistry = sc.nextInt();	
        System.out.println("Computer");
		computers = sc.nextInt();	
        System.out.println("Physics");
		physics = sc.nextInt();	
        System.out.println("Math");
		maths = sc.nextInt();	
		
		total = english + chemistry + computers + physics + maths;
	    Percentage = (total / 500) * 100;
	 
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Marks Percentage =  " + Percentage+"%");
    
        System.out.print("The student Grade is:");
        if(Percentage>=80)
        {
            System.out.print("A");
        }
        else if(Percentage>=60 && Percentage<80)
        {
           System.out.print("B");
        } 
        else if(Percentage>=40 && Percentage<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }

}
     