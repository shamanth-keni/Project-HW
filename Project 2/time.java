import java.util.Scanner;

public class time {
  public static void main(String[] args) {
    Scanner min = new Scanner(System.in);
    System.out.println("Enter the number of minutes:");
    int minutes = min.nextInt();
    min.close();
    int year = minutes / 525600;
    int day = minutes / 1440;
    int remainingMinutes = day % 525600;
    System.out.println(minutes + " minutes is approximately " + year + " years and "  +  remainingMinutes + " days ");
    }

   }
