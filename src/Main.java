import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Introduzca el nombre del titular: ");
        String titular = scan1.next();
        Banco c1 = new Banco(0, titular);
        
        for (int i = 0; i < 2; i++) {
            
        
        System.out.println(c1.Ingresar(scan1.nextFloat()));
        }
    }
}
