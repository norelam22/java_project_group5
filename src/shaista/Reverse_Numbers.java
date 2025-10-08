package shaista;

import com.sun.tools.javac.Main;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Enumeration;

public class Reverse_Numbers {

    /*
        Write a return method that can reverse
        negative number and return it as int
         */

    public static void main(String[] args) {
        System.out.println(reverse(-1234));
        System.out.println(reverse(-109876));
        System.out.println(reverse(-7865));

    }

    public static int reverse(int num) {
        int reversed = 0;

        if(num < 0){
            num = -num;
            while(num > 0){
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
        }
        return reversed;
    }
}
