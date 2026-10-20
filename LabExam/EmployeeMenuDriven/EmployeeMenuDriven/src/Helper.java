import java.util.Scanner;

public class Helper {
    
    public static LinkedList list = new LinkedList();
    public static Scanner sc = new Scanner(System.in);

    public void addEmployee(){
        System.out.println(" Enter empid : ");
        int empid = sc.nextInt();
        System.out.println(" Enter Name : ");
        String name = sc.next();
        System.out.println(" Enter Salary : ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(empid, name, salary);
        list.addLast(emp);
        list.display();
    }

    public void displayAllEmployees(){
        list.display();
    }

    public void searchEmployeeByName(){
        System.out.println(" Enter name to Search : ");
        String searchName = sc.next();
        list.searchByName(searchName);
    }

    public void deleteEmployee(){
        System.out.println(" Enter Empid to be deleted : ");
        int deleteId = sc.nextInt();
        list.deleteById(deleteId);
        list.display();
    }

    public void updateSalary(){
        System.out.println(" Enter empid : ");
        int updateId = sc.nextInt();
        list.findById(updateId);
        System.out.println(" Enter updated Salary : ");
        double updateSalary = sc.nextDouble();

        list.updateSalary(updateId, updateSalary);
    }

    public void sortEmployeeBySalary(){
        list.sortBySalary();
        list.display();
    }

}
