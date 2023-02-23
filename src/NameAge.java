import java.util.*;
import java.io.*;

public class NameAge {
    public static void main(String[] args) throws IOException {
        File nameAgeFile = new File("C:/Users/rodne/OneDrive/Documents/ISTxtFileLocation/nameAgeFile.txt");
        PrintWriter out = new PrintWriter(nameAgeFile);
        out.println("John " + 18);
        out.println("Bob " + 20);
        out.println("Sarah " + 21);
        out.close();
    }
}
