package Java.io;
import java.io.*;
import java.io.FileWriter;
import com.opencsv.CSVReader;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

/*
OPEN EXCEL AND SAVE IT AS A CSV FILE
     TWO TYPES
CSV - COMMA SEPARATED VALUE (CSV)
EXCEL - MS EXCEL


FIRSRT STEP
GO TO
https://mvnrepository.com/artifact/com.opencsv/opencsv/5.8
<!-- https://mvnrepository.com/artifact/com.opencsv/opencsv -->
<dependency>
    <groupId>com.opencsv</groupId>
    <artifactId>opencsv</artifactId>
    <version>5.8</version>
</dependency>

 */
public class CSV {
    public static void main(String[] args) {
        readCSV();
        writeCSV();
    }

    public static void readCSV() {

        // CHANGE TO FORWARD SLASH

        String pathToCSV = "C:/Users/User/Desktop/qa auto/New folder/myCSV.csv";
        // \Users\User\Desktop\Desktop


        try (CSVReader csvReader = new CSVReader(new FileReader(pathToCSV))) {
            String[] values;
            while ((values = csvReader.readNext()) != null) {
                for (String cell : values) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }


    public static void writeCSV() {
        String filePath = "C:/Users/User/Desktop/qa auto/New folder/myWRITECSV.csv";
        String[] headers = {"ID", "Name", "Age", "Country"};
        String[][] data = {
                {"1", "Zuri", "30", "USA"},
                {"2", "Max", "33", "Singapore"},
                {"3", "Billy", "25", "Canada"},

        };
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                //writing headers
                writer.write(String.join(",", headers));
                writer.newLine();

                //writing data
                for (String[] record : data) {
                    writer.write(String.join(",", record));
                    writer.newLine();
                }
                System.out.println("CSV file written successfully.");
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }
    }