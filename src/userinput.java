
import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        // int a,b;
         float a,b;
         boolean c;
         System.out.println("Enter the value of a and b:");
           Scanner sc =new Scanner(System.in);  // mein apna ek naya object bana raha hu jise mein apne according use karu ga;
               //   a=sc.nextInt();            // like this and more;
                //  b=sc.nextInt();
                    a=sc.nextFloat();
                    b=sc.nextFloat();
           System.out.println(a+b);
              c=sc.hasNextInt();
           System.out.println(" 'C' is a integer number :"+(c));


    }
}
