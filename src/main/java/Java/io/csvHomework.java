package Java.io;


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


