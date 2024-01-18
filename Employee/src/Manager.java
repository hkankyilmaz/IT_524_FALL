public class Manager extends Employee {

    private final String department;


    public Manager(String jobTitle, LevelType level, String name, String department) {
        super(jobTitle, name, level);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void printInformation() {
        super.printInformation();
        System.out.println("Department: " + department);
        System.out.println("Type: Manager");
    }
}
