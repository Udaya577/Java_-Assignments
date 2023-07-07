
import java.util.Scanner;

class Name

{

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        String rev = "";

        System.out.println("enter name");

        String s = sc.next();

        for(int i=s.length()-1;i>=0;i--)

  	System.out.println(s.charAt(i));

        System.out.println(rev);

    }
}