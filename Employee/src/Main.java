//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Sales Manager",
                LevelType.EXPERIENCED,
                "Jack Johns",
                "Sales");
        manager.printInformation();

        Employee skilledEmployee
                = new SkilledEmployee("Accounting Officer",
                LevelType.INTERMEDIATE,
                "Henry Williams",
                new String[]{"Excel", "Logo Soft", "SAP"});

        System.out.println("--------------");

        skilledEmployee.printInformation();
    }
}