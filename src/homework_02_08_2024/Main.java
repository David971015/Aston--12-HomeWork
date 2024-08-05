package homework_02_08_2024;
import java.io.IOException;
import static homework_02_08_2024.Person.readFromFile;
import static homework_02_08_2024.Person.writeToFile;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jane", "Doe");
        String filename = "person.txt";

        try {
            // Write person to file
            writeToFile(person, filename);

            // Read person from file
            Person readPerson = readFromFile(filename);
            System.out.println("Person read from file:");
            System.out.println(readPerson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

