import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question4 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line=bufferedReader.readLine())!=null) {
                String[] data=line.split(",");
                int id= Integer.parseInt(data[0]);
                String name= data[1];
                int marks= Integer.parseInt(data[2]);
                System.out.println(id+ " " +name + " " + marks);
            
            }
             bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
