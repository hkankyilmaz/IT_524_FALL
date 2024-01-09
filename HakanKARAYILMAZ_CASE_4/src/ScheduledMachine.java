import java.util.ArrayList;

public class ScheduledMachine extends Machine {



    private ArrayList<String> jobList = new ArrayList<>();



    public ScheduledMachine(Priority priority, String specification, ArrayList<String> jobList) {
        super(priority, specification);
        this.jobList = jobList;
    }

    public ArrayList<String> getJobList() {
        return jobList;
    }

    @Override
    void printInformation() {
        int counter = 0;

        System.out.println("Scheduled Machine");
        System.out.println("Job List: ");
        for (String job : jobList) {
            ++counter;
            System.out.println(counter +"- "+ job);
        }
    }
}
