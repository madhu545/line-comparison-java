import java.util.Scanner;
public class equalityofline {
             public static void main(String[] args) {
                    Scanner sc= new Scanner(System.in);
                    System.out.println("Enter the values for line");
                    double x1 = sc.nextDouble();
                    double y1 = sc.nextDouble();
                    double x2 = sc.nextDouble();
                    double y2 = sc.nextDouble();
                    double l1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
                    System.out.println("length of first line is=" + l1);

                    System.out.println("Enter the values for line");
                    double p1 = sc.nextDouble();
                    double p2 = sc.nextDouble();
                    double q1 = sc.nextDouble();
                    double q2 = sc.nextDouble();
                    double l2 = Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
                    System.out.println("length of first line is=" + l2);

                    String s1 = String.valueOf(l1);
                    String s2 = String.valueOf(l2);
        
                    if (s1.equals(s2)) {
                           System.out.println("The length of the first and second line is equal");
                     }

                    else {
                           System.out.println("The length of first and second lines are not equal");
                     }

  }
}

