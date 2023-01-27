//Sanidhya Sharma
//12016372
import java.util.Scanner;

public class burp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long is your burp?");
        int length = sc.nextInt();
        String msg="";
        for(int i=1;i<=length;i++) {
            msg = msg+"r";
        }
        System.out.println("Bu"+msg+"p");
    }
}
