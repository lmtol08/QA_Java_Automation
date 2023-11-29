package Automation001;

public class introto {
    public static void main(String[] args) {
        System.out.println("Hello Class");

        byte num1= 100;
        // data type assigned value operator value ;
        // get right value type for value
        short num2 = 5000;
        int num3 = 50000;
        long num4 = 15000000L;
        float num5 = 3.14f;
        double num6 =222.4875d;
        boolean bool = true;
        char ch = 'a';
        String str= "this is a string in java";

        System.out.println(num1);
        System.out.println(num2);

        int a = 10;
        int b = 2;

        int c = a + b;
        //without assigning a third variable
        System.out.println(c);
        System.out.println(a+b);


        System.out.println("this is assign a new variable to do the math"+c);
        System.out.println("this is direct from system out"+(a+b));
        System.out.println("this is concatination" + a+b);

        System.out.println(a-b);
        System.out.println(a/b);


        int d = a++;
        System.out.println(d);

        int e = a--;
        System.out.println(e);

        
        int f = --a;
        System.out.println(f);

int g = ++a;
        System.out.println(g);

        int x = 100;
        System.out.println(x);

        int y = 5;
        y += 3;
        System.out.println(y);

        y -= 2;
        System.out.println(y);

        y *= 2;
        System.out.println(y);

        y /= 2;
        System.out.println(y);

        y %= 2;
        System.out.println(y);

        y &= 2;
        System.out.println(y);

        y |= 2;
        System.out.println(y);

        y ^= 2;
        System.out.println(y);

        y>>= 2;
        System.out.println(y);

        y<<= 2;
        System.out.println(y);



        int v = 100;
        int n = 50;
        
        System.out.println(v == n);
        System.out.println(v != n);
        System.out.println(v < n);
        System.out.println(v > n);
        System.out.println(v <= n);
        System.out.println(v >= n);

        System.out.println("----===------====---------");
        
        
        
        // string    leters is a string variabble 
        String letters = "abcdefghijklm";


        System.out.println(letters.length());
        System.out.println("these are the eng alphabets: " + letters);
        System.out.println(letters.toUpperCase());
        System.out.println(letters.toLowerCase());
  //fing letter m
        // index  = where t is stored on memory start from 0
        System.out.println(letters.indexOf("m"));
        
        
        
        



    }

}


//byte =-128,128
//short= -32768 to 32767
//int= -2147483648 - 2147483647
//float