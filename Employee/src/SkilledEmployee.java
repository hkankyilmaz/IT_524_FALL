public class SkilledEmployee extends Employee {


    private final String[] skillList;


    public SkilledEmployee(String jobTitle, LevelType level, String name, String[] skillList) {
        super(jobTitle, name, level);
        this.skillList = skillList;
    }

    public String[] getSkillList() {
        return skillList;
    }

    public void printInformation() {
        super.printInformation();
        System.out.println("Skills: ");
        for (String skill : skillList) {
            System.out.println(skill);
        }
        System.out.println("Type: Skilled Employee");
    }

}
