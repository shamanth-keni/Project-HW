import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees");
        int n = sc.nextInt();
        String[] employees = new String[n * 4];

        System.out.println("Loading the inputs");
        String word = sc.nextLine();
        System.out.println(word);

        int counter = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Name, Year of Joining, Salary and Address of the employee\n");
            String name = sc.nextLine();
            String year = sc.nextLine();
            String salary = sc.nextLine();
            String address = sc.nextLine();

            employees[counter++] = name;
            employees[counter++] = year;
            employees[counter++] = salary;
            employees[counter++] = address;
        }
        sc.close();

        System.out.println("Name \tYear of Joining \tSalary \tAddress");
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(employees[count++] + "\t" + employees[count++] + "\t\t" + employees[count++] + "\t" + employees[count++]);
        } 
    }
}


