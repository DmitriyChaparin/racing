package Passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();

        passports.add(new Passport("12345", "Сидоров", "Илья", "Петрович", LocalDate.now().minusYears(30)));
        passports.add(new Passport("34214", "Петров", "Максим", "Петрович", LocalDate.now().minusYears(13)));
        passports.add(new Passport("55555", "Иванов", "Семён", "", LocalDate.now().minusYears(25)));
        passports.add(new Passport("12345", "Грачёв", "Николай", "Петрович", LocalDate.now().minusYears(20)));


        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);

    }
}
