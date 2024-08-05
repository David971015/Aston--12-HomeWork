package homework_02_08_2024;
import java.io.*;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nSurname: " + surname;
    }

    public static void writeToFile(Person person, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Name: " + person.getName());
            writer.newLine();
            writer.write("Surname: " + person.getSurname());
        }
    }

    public static Person readFromFile(String filename) throws IOException {
        String name = null;
        String surname = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Name: ")) {
                    name = line.substring(6);
                } else if (line.startsWith("Surname: ")) {
                    surname = line.substring(9);
                }
            }
        }

        return new Person(name, surname);
    }
}
