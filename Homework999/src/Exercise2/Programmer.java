package Exercise2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Programmer extends Employee{
    private String language;

    public Programmer(String firstName, String lastName, LocalDate birthday, String address, LocalDate dateOfEmployment, String language) {
        super(firstName, lastName, birthday, address, dateOfEmployment, "programmer");
        this.language = language;
    }

    public String getPosition(){
        return "Programmer";
    }
}
