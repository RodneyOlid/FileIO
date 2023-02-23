import java.io.*;
import java.util.*;
public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("C:/Users/rodne/OneDrive/Documents/ISTxtFileLocation/nameAgeFile.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNext()) {
                String name = myReader.next();
                int age = myReader.nextInt();
                System.out.println(name + " and they are " + age + " years old.");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Error");
        }
    }
}
