package ArrayHW;

import java.util.Arrays;

public class StringArrays {
    public static void main(String[] args) {

        String []words = {"Hi","","Yall"};
        System.out.println(Arrays.toString(words));
        System.out.println("==============================================================================================");

        String sentence = String.join(" ",words);
        // delimiter removes " - but you can pass anything through
        System.out.println(sentence);


            // STRING OF COUNTRIES - FIND IF AUSTRALIA IS IN THE LIST
        String[] countries = {"USA","Canada","France","Germany"};
        String target = "France";
        boolean found = false;
                      // vaariable: name of string
        for (String country : countries) {
            // check if the country is equal to the target
            if(country.equals(target)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(target + " is in the list of countries");
        }else{
            System.out.println(target + " is not in the list of countries");
        }

        // SORT LIST BY CITY
        String [] cities = {"Los Angeles","New York", "Chicago", "loner"};
        Arrays.sort(cities);
        System.out.println("Sorted by: ");

        for(String city : cities) {
       //     to print the arrat you have to name it then call it by the name
            System.out.println(city);
        }

       String myData ="hello, this, is,lo";
        // removes , and writes exactly a spaced
        String [] userData = myData.split(",");
        for(String data:userData) {
            System.out.print(data);
        }
    }
}
