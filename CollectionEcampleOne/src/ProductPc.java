import java.util.List;
import java.util.Set;

public class ProductPc extends Product<String,String> {


    private String cpu;
    private String ram;
    private String hdd;


    public ProductPc(int id, String name, List<String> logs, Set<String> whoIsBuyed, String cpu, String ram, String hdd) {
        super(id, name, logs, whoIsBuyed);
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "cpu= " + cpu + '\'' +
                "ram= " + ram + '\'' +
                "hdd= " + hdd + '\'' ;

    }

    void print(){
        System.out.println("ProductPc");
    }
}
