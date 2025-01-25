import java.util.Scanner;

public class PhoneBook {
    private String name, city, phone;

    public PhoneBook() {
        // Default values
        name = "Thomas Jefferson";
        city = "New York";
        phone = "123-4567";
    }

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.getInput();
        book.processInputAndPrint();
    }

    public void getInput() {
        Scanner in = new Scanner(System.in);

        // Get user input for name, city, and phone number
        System.out.print("Enter name as first last: ");
        name = in.nextLine();

        System.out.print("Enter city of residence: ");
        city = in.nextLine();

        System.out.print("Enter phone number (without area code): ");
        phone = in.nextLine();
    }

    public void processInputAndPrint() {
        // Extract first and last name using indexOf and substring methods
        int spaceIndex = name.indexOf(" "); // Find where the first and last name are separated

        String firstName = name.substring(0, spaceIndex); // First name is before the space
        String lastName = name.substring(spaceIndex + 1); // Last name is after the space

        // Determine the area code based on the city
        String areaCode = "";

        if (city.equalsIgnoreCase("Mountain View") || city.equalsIgnoreCase("Palo Alto")) {
            areaCode = "(650)";
        } 
        else if (city.equalsIgnoreCase("Cupertino") || city.equalsIgnoreCase("San Jose")) {
            areaCode = "(408)";
        }

        // Format phone number with area code
        String formattedPhone = areaCode + " " + phone;

        // Alphabetize by last name initial
        char lastInitial = lastName.charAt(0);

        // Print the formatted information
        System.out.println("The phone number will be alphabetized under " + lastInitial +
                           ", under " + lastName + ", " + firstName + " at " + formattedPhone + ".");
    }
}
