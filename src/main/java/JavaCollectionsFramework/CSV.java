package JavaCollectionsFramework;

import java.io.FileWriter;

public class CSV {
    public static void main(String[] args) {
        //  readCSV();
        //   writeCSV();
    }
}
/*
    public static void readCSV() {


        String pathToCSV = "C:/Users/zurim/OneDrive/Desktop/myCSV.csv";
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
        String filePath = "C:/Users/zurim/OneDrive/Desktop/myCSVWrite.csv";
        String[] headers = {"ID", "Name", "Age", "Country"};
        String[][] data = {
                {"1", "Zuri", "30", "USA"},
                {"2", "Max", "33", "Singapore"},
                {"3", "Billy", "25", "Canada"},

        };
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class csvHomework {
    public static void main(String[] args) {

        String pathToCSV = "Path to your FILE";

        try(CSVReader csvReader = new CSVReader(new FileReader(pathToCSV))){
            String[] values;
            while ((values = csvReader.readNext())!= null){
                for (String cell: values) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }catch (IOException | CsvValidationException e){
            e.printStackTrace();
        }

    }
}

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

 */