package REVIEW;
/*
Given a string,
return a new string where "not " has been added to the front.
 However, if the string already begins with "not", return the string unchanged.
  Note: use .equals() to compare 2 strings.
 */
public class make4 {
    public static void main(String[] args) {
        Compare(" this s not the time");
    }

    public static String Compare (String str){
  //  "double" for string 'single' char
     String str2 = "not";
        if(str.charAt(0) == 'n' && str.charAt(1) == '0' && str.charAt(2) == 't'){
            System.out.println(str);
            return str;
        }else{
            System.out.println(str2+str);
        return str2 + str;

        }
    }
}
