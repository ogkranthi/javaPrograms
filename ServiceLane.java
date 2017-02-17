/**
 * Created by kranthikumar on 2/16/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ServiceLane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        int arr[] = new int[n];
        int sortedArr[] = new int[n];
        int i=0;
        int j=0;
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            i = in.nextInt();
            j = in.nextInt();

            sortedArr = Arrays.copyOfRange(width,i,j+1);
            Arrays.sort(sortedArr);
            System.out.println(sortedArr[0]);
        }

    }
}

