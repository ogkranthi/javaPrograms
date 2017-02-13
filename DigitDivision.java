/**
 * Created by kranthikumar on 2/13/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DigitDivision {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int k = 0;
        int count=0;
        int N=1;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            count=0;
            N = n;
            while (n!=0) {
                k = n%10;
                if ((k!=0)&&(N%k)==0)
                {
                    count++;
                    //         System.out.print(k);
                }
                n = n/10;
            }
            System.out.println(count);
        }
    }
}

