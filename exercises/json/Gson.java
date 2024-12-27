import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Gson {
    public static void main(String[] arg) {
      Person andrew = new Person("Andrew");
      System.out.println(andrew);
    }
public static List<Person> readFile(String filename) throws FileNotFoundException {
    List<Person> people = new ArrayList<>();

    try (FileReader reader = new FileReader(filename)) {
      List<Person> filePeople = new Gson().fromJson(reader, new TypeToken<List<Person>>() {}).getType();
      if (filePeople != null) {
        people = filePeople;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
    public static void save (Person person, String filename) throws FileNotFoundException
        {List<Person> people;

        try (FileWriter writer= new FileWriter(filename)){
            people = readFile(filename);
            people.add(person);
        new GsonBuilder().setPrettyPrinting().create().toJson(people, writer);
            System.out.println("Data saved to file:" + filename);
    }   catch (IOException e) {
            e.printStackTrace();

        }
        }
  }
