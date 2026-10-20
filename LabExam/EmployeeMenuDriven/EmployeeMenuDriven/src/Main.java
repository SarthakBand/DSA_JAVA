import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Helper help = new Helper();

        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println(
                    "0. Exit\n1. Add employee\n2. Display all employees\n3. Search employee by name\n4. Delete employee by empid\n5. Update salary of employee\n6. Sort employees by salary");
            System.out.print(" Enter you choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    help.addEmployee();
                    break;
                }

                case 2: {
                    help.displayAllEmployees();
                    break;
                }

                case 3: {
                    help.searchEmployeeByName();
                    break;
                }

                case 4: {
                    help.deleteEmployee();
                    break;
                }

                case 5: {
                    help.updateSalary();
                    break;
                }

                case 6: {
                    help.sortEmployeeBySalary();
                    break;
                }


                
            }
        }

        sc.close();
    }
}
