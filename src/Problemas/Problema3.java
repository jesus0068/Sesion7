/*
Crear un programa en Java que permita ingresar las notas de un examen,
y que permita hallar el promedio de las notas.

por ejemplo:
nota1: 20
nota2: 15
nota3: 20
nota4: 05
resultados:
promedio: 14.5
 */

package Problemas;
import java.util.Scanner;
public class Problema3 {
    public static void main(String [] args){
        //declarar variables
        int cp,se;
        double ch,prom;
        String opc;
        Scanner lectura=new Scanner(System.in);
        //proceso
        cp=0;
        se=0;
        do{
            System.out.println("Ingrese la nota del examen: ");
            ch=lectura.nextDouble();
            cp++; //contador
            se+=ch; //acumulador
            System.out.println("¿Desea continuar? si/no");
            opc=lectura.next();
        }while(opc.equals("si"));
        prom=se/cp;
        //salida de datos
        System.out.println("el promedio de notas del salón es : "+prom);
    }
}
