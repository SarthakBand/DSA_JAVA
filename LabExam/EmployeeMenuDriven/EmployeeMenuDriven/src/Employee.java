public class Employee {
    private int empid;
    private String name;
    private double salary;

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpid() {
        return this.empid;
    }

    public void setEmpid(int id) {
        this.empid = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }

    public String toString() {
        return String.format("Emp ID: %d | Name: %s | Salary: %.2f",
                empid, name, salary);
    }

}