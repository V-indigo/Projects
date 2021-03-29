package DeleteTheComments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class DeleteComments {
    public static void main(String[] args) {
//        Path filePath = Paths.get("C:\\Users\\bnbat\\IdeaProjects\\Test\\src\\DeleteTheComments\\example.txt");
        System.out.println(removeComments(Paths.get("C:\\Users\\bnbat\\IdeaProjects\\Test\\src\\DeleteTheComments\\example.txt")));
    }

    public static int removeComments(Path filePath) {
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = 0;
        for (int i = 0; i < lines.size() -1; i++) {
            if (lines.get(i).trim().startsWith("//")) {
                lines.remove(i--);
                count++;
            } else if (lines.get(i).contains("//")){

                int index = lines.get(i).indexOf("//");
                lines.set(i, lines.get(i).substring(0, index));
                count++;
            }
        }

        try {
            Files.write(filePath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
