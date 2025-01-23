package Genaral;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY array
     */

    public static int sockMerchant(int n, int[] ar) {
    // Write your code here
    	
    	int pairs = 0;
    	
    	int Ele = ar[0];
    	int firstMatch = 0;
    	
    	
    	
    	
    	
    	
    	return pairs;

    }

}

public class SalesByMatch {
    public static void main(String[] args) throws IOException {
       
    	int n = 9;
    	int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
    	
    	
        int result = Result.sockMerchant(n, ar);

      System.out.println(result);
    }
}
