public class LinkedList {

    static class Node {
        private Employee data;
        private Node next;

        public Node(Employee value) {
            data = value;
            next = null;
        }
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node findById(int empid) {
        Node trav = head;

        while (trav != null) {

            if (trav.data.getEmpid() == empid) {
                return trav;
            }
            trav = trav.next;
        }
        return null;
    }

    public void addLast(Employee emp) {

        // Unique Employee
        if (findById(emp.getEmpid()) != null) {
            System.out.println(" Employee Already Exists !!");
            return;
        }

        Node newnode = new Node(emp);

        if (head == null) {
            head = newnode;
        } else {
            Node trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = newnode;
        }
        System.out.println(" Employee Added ! ");
    }

    public void display() {

        Node trav = head;

        System.out.println(" Employees :: ");

        while (trav != null) {
            System.out.println(trav.data.toString());

            trav = trav.next;
        }
    }

    public void searchByName(String name) {
        int count = 0;

        Node trav = head;

        while (trav != null) {

            if (trav.data.getName().equals(name)) {
                System.out.println(trav.data.toString());
                count++;
            }
            trav = trav.next;
        }

        if (count == 0) {
            System.out.println(" Employee Not Found ");
        }
    }

    public void deleteById(int empid) {

        if (head == null) {
            System.out.println(" LIST IS EMPTY ");
            return;
        }

        if (head.data.getEmpid() == empid) {
            head = head.next;
            System.out.println(" Employee Deleted ! ");
            return;
        }

        Node trav = head;

        while (trav.next != null && trav.next.data.getEmpid() != empid) {
            trav = trav.next;
        }

        if (trav.next == null) {
            System.out.println(" Employee Not Found !");
            return;
        }

        trav.next = trav.next.next;
        System.out.println(" Employee Deleted ");
    }

    public void updateSalary(int empid, double salary) {

        Node node = findById(empid);

        if (node == null) {
            System.out.println(" Employee Not Found ");
        } else {
            node.data.setSalary(salary);
            System.out.println(" Employee Salary Updated ");
        }

    }

    public void sortBySalary() {
        Node trav = head;
        int flag = 0;

        for(Node trav1 = head; trav1.next != null; trav =trav.next ){

            for(Node trav2 = trav1.next; trav2 != null; trav2 = trav2.next){

                if( trav2.data.getSalary() < trav1.data.getSalary()){
                    Employee temp = trav1.data;
                    trav1.data = trav2.data;
                    trav2.data = temp;
                    flag = 1;
                }
            }

        }
        if( flag == 0){
            System.out.println(" ERROR IN SORTING ");
        }
        else
            System.out.println(" LIST SORTED !! ");
    }
}
