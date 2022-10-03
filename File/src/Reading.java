import java.io.*;

public class Reading {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(filePath));

        String result = "";
        while (input.available() > 0) {
            int current = input.read();
            char symbol = (char) current;
            result += symbol;
        }

        System.out.println(result);

        reader.close();
        input.close();
    }
}

