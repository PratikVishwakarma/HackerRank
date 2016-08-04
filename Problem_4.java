import java.util.Scanner;

/**
 *
 * @author pratik
 */
/*
You are given an array of integers of size . You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

Input Format

The first line of the input consists of an integer . The next line contains  space-separated integers contained in the array.

Output Format

Print a single value equal to the sum of the elements in the array.

Constraints 
 

Sample Input

5
1000000001 1000000002 1000000003 1000000004 1000000005
Output

5000000015
*/
public class Problem_4 {
    public static void main(String[] args) {
        long sum = 0;
        Scanner scr = new Scanner(System.in);
        int N = scr.nextInt();
        long array_N[] = new long[N];
        for(int i=0; i < N; i++){
            array_N[i] = scr.nextLong();
            sum = sum + array_N[i];
        }
        System.out.println(sum);
        
    }
}
