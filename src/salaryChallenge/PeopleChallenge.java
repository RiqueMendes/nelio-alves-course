package salaryChallenge;

import java.util.Locale;
import java.util.Scanner;

public class PeopleChallenge {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        
        PeopleData peopleData = new PeopleData();

        System.out.println("Enter the name: ");
        peopleData.name = scan.nextLine();

        System.out.println(peopleData);

    }
}
