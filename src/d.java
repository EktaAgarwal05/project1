import java.util.Scanner;
public class d

{

    public static void main(String[] args)
    {

        String name= "Heena";


        int num1=2;
        float num2=5.5f;
        num1 +=5;

        System.out.println(name);

        System.out.print("The value of num1 % num2 is");
        System.out.println(num1--);
        System.out.println(num1%num2);

        System.out.println(++num1);


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Input");
        String input=scan.nextLine();
        System.out.println(input);



    }
}
