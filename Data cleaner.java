import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.*;

public class DataCleaner {

    public static void main(String[] args) throws Exception {
        CSVReader reader = new CSVReader(new FileReader("youtube_data.csv"));
        CSVWriter writer = new CSVWriter(new FileWriter("cleaned_youtube_data.csv"));

        List<String[]> rows = reader.readAll();
        List<String[]> cleaned = new ArrayList<>();

        for (String[] row : rows) {
            boolean hasNull = false;
            for (String field : row) {
                if (field == null || field.trim().isEmpty()) {
                    hasNull = true;
                    break;
                }
            }
            if (!hasNull) {
                cleaned.add(row);
            }
        }

        writer.writeAll(cleaned);
        reader.close();
        writer.close();

        System.out.println("Cleaned dataset saved.");
    }
}
