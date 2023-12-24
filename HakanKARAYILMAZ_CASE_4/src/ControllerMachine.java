import java.util.ArrayList;


public class ControllerMachine extends Machine {


    private String department;
    private ArrayList<ScheduledMachine> scheduledMachines = new ArrayList<>();


    public ControllerMachine(Priority priority, String specification, String department, ArrayList<ScheduledMachine> scheduledMachines) {
        super(priority, specification);
        this.department = department;
        this.scheduledMachines = scheduledMachines;
    }

    public ControllerMachine(Priority priority, String specification, String department) {
        super(priority, specification);
        this.department = department;

    }

    void addMachine(ScheduledMachine scheduledMachine) {


        if (scheduledMachines.size() > 3) {
            System.out.println("You can not add more than 4 machines");
        } else {
            scheduledMachines.add(scheduledMachine);
            System.out.println("Machine inserted successfully");
        }
    }

    @Override
    void printInformation() {
        System.out.println("Controller Machine");
        System.out.println("Department: " + department);
        System.out.println("Priority: " + getPriority());
        System.out.println("Specification: " + getSpecification());
        System.out.println("Scheduled Machines: ");
        for (ScheduledMachine scheduledMachine : scheduledMachines) {
            System.out.println("Job List: ");
            scheduledMachine.printInformation();

        }
    }

    public String getDepartment() {
        return department;
    }

    public ArrayList<ScheduledMachine> getScheduledMachines() {
        return scheduledMachines;
    }
}
