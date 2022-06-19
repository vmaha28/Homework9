package Exercise2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Programmer pro = new Programmer("Vasile", "Pop", LocalDate.of(1996, Month.FEBRUARY, 28), "Cluj", LocalDate.of(2022, Month.JULY, 1), "Java");
        DatabaseAdmin databaseAdmin = new DatabaseAdmin("VASILE", "pop", LocalDate.of(1996, Month.FEBRUARY, 28), "Cluj", LocalDate.of(2022, Month.JULY, 1), "Java");
        System.out.println(ex3(pro));
        System.out.println("getPosition for programmer " + pro.getPosition());
        System.out.println("getAddress for dbAdmin " + databaseAdmin.getAddress());
    }

    public static String ex3(Employee employee) {
        LocalDate today = LocalDate.now();
        Period p = Period.between(employee.getBirthday(), today);

        String infoName = "Full Name: " + employee.getFirstName() + " " + employee.getLastName();
        String infoAge = "Age: " + p.getYears();

        return infoName + "\n" + infoAge;
    }
}