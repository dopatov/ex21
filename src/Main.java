import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc=new Scanner (System.in);

        int numero;
        int HayNegativo=0;
        int HayPositivo=0;

        for (int i=0; i<10; i++)
        {
            System.out.println("- Introduce un numero");
            numero=sc.nextInt();
            if (numero<0)
                HayNegativo++;
            else
            {
                HayPositivo++;
            }

        }

        System.out.println("Se han introducido " +HayNegativo +" valores negativos y " +HayPositivo +" valores positivos");

    }
}
