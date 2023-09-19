import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        /*
        B-	Programa java para comprobar si un número entero de tres cifras es capicúa.
        El programa pide que se introduzca un número entero y comprueba si el número es
        capicúa o no lo es. Si el número introducido no tiene tres cifras se muestra un
        mensaje indicándolo y el programa finaliza.
        Un número es capicúa si se puede leer igual de izquierda a derecha que de derecha
        a izquierda. Por ejemplo, los números 1221, 35053, 969 ... son capicúa.
        Como el programa pide que el número introducido sea de tres ciftras, para comprobar
        si es capicúa solo tendremos que comprobar si la primera cifra y la última son
        iguales.

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero de tres cifras: ");
        int number = sc.nextInt();
        if (number > 999 || number < 100){
            System.out.println("El numero no tiene 3 cifras");
        }else if((number % 10) == (number / 100)){
            System.out.println("El numero es capicua");
        }else{
            System.out.println("El numero no es capicua");
        }
    }
}
