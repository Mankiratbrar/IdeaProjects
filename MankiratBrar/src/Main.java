//import java.util.Scanner;
import java.lang.Thread;
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        //Scanner scanner=new Scanner(System.in);
        String a="My name is Mankirat Singh brar what is your name";
        for (int i = 0; i < a.length(); i++)
        {
            System.out.print(a.charAt(i));
            Thread.sleep(100);
        }
    }
}