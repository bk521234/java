import java.io.*;

class file1 {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("C:/data1.txt");
        file.write("Blah some text!");
        file.close();
    }
}
