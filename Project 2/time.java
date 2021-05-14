import java.util.Scanner;

public class time {
  public static void main(String[] args) {
    Scanner min = new Scanner(System.in);
    // Prompt user for number of minutes
    System.out.println("Enter the number of minutes:");
    int minutes = min.nextInt();
    min.close();

     // Number of minutes in a year
    int year = minutes / 525600;
    int day = minutes / 1440;
    int remainingMinutes = day % 525600;


    System.out.println(minutes + " minutes is approximately " + year + " years and "  +  remainingMinutes + " days ");
    }

   }