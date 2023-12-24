public abstract class Machine {


    private Priority priority;
    private String specification;


    abstract void printInformation();


    public Machine() {
    }
    public Machine(Priority priority, String specification) {
        this.priority = priority;
        this.specification = specification;

    }

    public Priority getPriority() {
        return priority;
    }

    public String getSpecification() {
        return specification;
    }


}
