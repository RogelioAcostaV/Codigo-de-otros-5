/*
El código determina si un número introducido por el usuario es "afortunado" o no, según una regla específica.
Regla: Un número es considerado "afortunado" si tiene más dígitos que sean 3, 7, 8 o 9 que dígitos que no sean ninguno de estos.

*/

import java.util.Scanner;

public class codigo5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //1. La clase Scanner necesita un parámetro en su constructor, como System.in, para leer la entrada estándar.

        System.out.print("Introduzca un número: ");
        String ni = s.nextLine();

        int numero = Integer.parseInt(ni);
        //se convierte la cadena de texto a un número entero utilizando Integer.parseInt(ni).
        //se debe convertir ni a un número entero antes de realizar la operación.


        int afo = 0;
        int noAfo = 0;

        while (numero > 0) {
            int digito = numero % 10;
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            numero /= 10;
        }
        //se debe utilizar una variable numérica para controlar el bucle.



        if (afo > noAfo) {
             System.out.println("El " + ni + " es un número afortunado.");
             //debe ser System.out.println.

        } else {
            System.out.println("El " + ni + " no es un número afortunado.");
     }
}
}

