public class Employee {
    private String type;
    private String department;
    private String salary;

    public Employee() {

    }
    public Employee(String type, String department) {
        this.type = type;
        this.department = department;
    }
    public Employee(String type, String department, String salary) {
        this.type = type;
        this.department = department;
        this.salary = salary;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }

    public boolean hasVacation() {
        return true;
    }

    public static String paidTimeOff(String paidTimeOffString ) {
        return paidTimeOffString;
    }
    public static void main(String[] args) {
        Employee employee = new Employee("full time", "sales" , "hourly" );
        System.out.println(Employee.paidTimeOff("You are eligble for vacation time! "));
    }
}
