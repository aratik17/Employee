package Employee;

public class Employeee {
    private String name;
    private int id;
    private double salary;
    private String department;
    public Employeee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }
    public void dispay() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
    public static void main(String[] args) {
        Employeee emp = new Employeee("John Doe", 12345, 50000.0, "Engineering");
        emp.dispay();
    }
}



