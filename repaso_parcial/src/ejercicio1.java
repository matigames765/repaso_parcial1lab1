import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        /*
        A-	Programa java para calcular si la última cifra de dos números enteros es la
        misma.
        Para realizar esto el programa lee por teclado dos números enteros y debe obtener
        la última cifra de cada uno de los números. Mediante una instrucción condicional
        if .. else mostrará un mensaje por pantalla indicando si los dos números acaban
        con la misma cifra  o no.
        Para obtener la última cifra de un número se utiliza el operador % (resto).
        La última cifra de cada número se obtiene calculando el resto de la división del
        número entre 10. Por ejemplo, si uno de los números es 123 su última cifra se
        calcula 123 % 10 = 3

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int number1 = sc.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int number2 = sc.nextInt();
        if ((number1 % 10) == (number2 % 10)){
            System.out.println("La ultima cifra de los dos numeros enteros es la misma");
        }else{
            System.out.println("La ultima cifra de los dos numeros enteros no es la misma");
        }
    }
}
