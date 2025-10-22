
import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = getName(input);
        String contact = getContactInfo(input);
        String education = getEducation(input);
        String experience = getWorkExperience(input);
        String skills = getSkills(input);
        buildResume(name, contact, education, experience, skills);
        input.close();

    }

    public static String getName(Scanner input) {
        System.out.println("Enter your first name.");
        String firstName = input.nextLine();
        System.out.println("Enter your last name.");
        String lastName = input.nextLine();
        return firstName + " " + lastName;
    }

    public static String getContactInfo(Scanner input) {
        System.out.println("Enter your phone number.");
        String phoneNumber = input.nextLine();
        System.out.println("Enter your email.");
        String email = input.nextLine();
        return phoneNumber + " " + email;
    }

    public static String getEducation(Scanner input) {
        System.out.println("Enter your university.");
        String university = input.nextLine();
        System.out.println("Enter your major.");
        String major = input.nextLine();
        System.out.println("Enter your year of graduation.");
        String graduation = input.nextLine();
        return university + " " + major + " " + graduation;

    }

    public static String getWorkExperience(Scanner input) {
        System.out.println("Most recent Job Experience.");
        String work = input.nextLine();
        return work;
    }

    public static String getSkills(Scanner input) {
        System.out.println("List 3 of your skills.");
        String skillOneString = input.nextLine();
        String skillTwoString = input.nextLine();
        String skillThreeString = input.nextLine();
        return skillOneString + " " + skillTwoString + " " + skillThreeString;
    }

    public static void buildResume(String name, String contact, String education, String experience, String skills) {
        System.out.println(name);
        System.out.println(contact);
        System.out.println(education);
        System.out.println(experience);
        System.out.println(skills);

    }
}
