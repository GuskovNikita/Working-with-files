import java.io.*;
import java.util.ArrayList;

public class Recording {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            String input = reader.readLine();
            strings.add(input);
            if (input.equals("exit")) break;
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (String string: strings) {
            System.out.print(string);
            writer.write(string+"\n");
        }

        reader.close();
        writer.close();
    }
}
