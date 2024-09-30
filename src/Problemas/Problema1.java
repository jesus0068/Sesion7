/*
Crear un programa en Java que permita ingresar la cantidad de personas,
que viven en un hogar para hallar la cantidad promedio de personas,
que viven en cada casa de la localidad encuestada.

por ejemplo:
casa1: 3
casa2: 2
casa3: 5
casa4: 10
resultados:
promedio: 5
 */

package Problemas;
import java.util.Scanner;
public class Problema1 {
    public static void main(String [] args){
        //declarar variables
        int cp,ch,se,prom;
        String opc;
        Scanner lectura=new Scanner(System.in);
        //proceso
        cp=0;
        se=0;
        do{
            System.out.println("Ingrese cuantas personas viven en su casa: ");
            ch=lectura.nextInt();
            cp++; //contador
            se+=ch; //acumulador
            System.out.println("¿Desea continuar? si/no");
            opc=lectura.next();
        }while(opc.equals("si"));
        prom=se/cp;
        //salida de datos
        System.out.println("Cantidad de personas en promedio que vive en cada casa: "+prom);
    }
}
