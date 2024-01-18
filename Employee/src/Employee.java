public abstract class Employee {


    private final int employeeId;
    private final String jobTitle;
    private final LevelType level;
    private final String name;
    private static int employeeIdCounter = 0;

    public Employee( String jobTitle,String name, LevelType level ) {

        this.employeeId = calculateEmployeeId();
        this.jobTitle = jobTitle;
        this.level = level;
        this.name = name;
    }

     public void  printInformation() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Level: " + level);

    }

    private int calculateEmployeeId() {
        return employeeIdCounter++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public LevelType getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
