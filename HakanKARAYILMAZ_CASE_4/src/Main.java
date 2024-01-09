import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ControllerMachine controllerMachine =
                new ControllerMachine(Priority.HIGH, "CNC", "Pre Production");


        ScheduledMachine schMachine1 = new ScheduledMachine(Priority.MEDIUM,
                "Metal Cutting",
                new ArrayList<>(Arrays.asList("Cut Part X", "Blend Part Y",
                        "Cut Part Z", "Part Z Final")));

        ScheduledMachine schMachine2 = new ScheduledMachine(Priority.MEDIUM,
                "Plastic Folding",
                new ArrayList<>(Arrays.asList("Part ZHG", "Fold Part YXS",
                        "Blend Co3Yu", "Part Z Fold")));


        ScheduledMachine schMachine3 = new ScheduledMachine(Priority.MEDIUM,
                "Quality Control",
                new ArrayList<>(Arrays.asList("Control ZHG", "Control Part YXS",
                        "Control Co3Yu", "Control Z Fold")));


        ScheduledMachine schMachine4 = new ScheduledMachine(Priority.MEDIUM,
                "Idle",
                new ArrayList<>(Arrays.asList("Idle Task", "Idle Task",
                        "Idle Task", "Idle Task")));

        ScheduledMachine schMachine5 = new ScheduledMachine(Priority.MEDIUM,
                "Idle",
                new ArrayList<>(Arrays.asList("Idle Task", "Idle Task",
                        "Idle Task", "Idle Task")));




        controllerMachine.addMachine(schMachine1);
        controllerMachine.addMachine(schMachine2);
        controllerMachine.addMachine(schMachine3);
        controllerMachine.addMachine(schMachine4);
        controllerMachine.addMachine(schMachine5);
        System.out.println("---------------");

        controllerMachine.printInformation();

    }
}