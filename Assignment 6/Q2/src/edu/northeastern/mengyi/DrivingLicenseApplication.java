package edu.northeastern.mengyi;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date of birth in format YYYY-MM-DD:");
        String str = scanner.nextLine();
        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.parse(str);
        Period period = Period.between(dateOfBirth, today);

        if (period.getYears() < 16) {
            throw new Exception("The age of the applicant is " + period.getYears() + " which is too early to apply for a driving license");
        } else {
            System.out.print("The age of the applicant can apply for a driving license");
            scanner.close();
        }
    }
}
