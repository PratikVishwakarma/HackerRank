import java.util.Scanner;

/**
 *
 * @author pratik
 */
 
 /*
  HackerRank Problem for valiables add 3 variable an int, an double and an String which are given to the another int, double and String 
  which are taken as input.
 */
public class Problem_5 {
            
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int i1;
        double d1;
        String s1;
        i1 = scan.nextInt();
        d1 = scan.nextDouble();
        scan.nextLine();
        s1 = scan.nextLine();
        String scon= s.concat(s1);
        
        System.out.println(i + i1);
        System.out.println(d + d1);
        System.out.println(scon);
        
    }
    
}
