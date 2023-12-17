package AirlineCompany;

import java.time.LocalDateTime;

public class Pilot {

    private String name;
    private long id;
    private LocalDateTime birthDate;
    private LocalDateTime jobStartDate;
    private String status;


    public Pilot() {
    }
    public Pilot(String name, long id, LocalDateTime birthDate, LocalDateTime jobStartDate, String status) {
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
        this.jobStartDate = jobStartDate;
        this.status = status;
    }




    int getAge(){
        return LocalDateTime.now().getYear() - this.birthDate.getYear();
    }

    int getExperience(){
        return LocalDateTime.now().getYear() - this.jobStartDate.getYear();
    }

    String displayPilotInformation(){
        return "Pilot" +'\n' +
                "name=" + name +'\n' +
                "age=" + getAge() +'\n' +
                "experience= " + getExperience() + " years" +'\n' +
                "id=" + id +'\n' +
                "birthDate=" + birthDate +'\n' +
                "jobStartDate=" + jobStartDate +'\n' +
                "status='" + status ;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getJobStartDate() {
        return jobStartDate;
    }

    public void setJobStartDate(LocalDateTime jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
