/*
Crear un programa en Java que permita ingresar los sueldos de los trabajadores,
para hallar el promedio de sueldos en la empresa.

por ejemplo:
sueldo1: 900
sueldo2: 2000
sueldo3: 1050
sueldo4: 1000
sueldo5: 1555
resultados:
promedio: 1301
 */

package Problemas;
import java.util.Scanner;
public class Problema2 {
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
            System.out.println("Ingrese su sueldo de este mes: ");
            ch=lectura.nextDouble();
            cp++; //contador
            se+=ch; //acumulador
            System.out.println("¿Desea continuar? si/no");
            opc=lectura.next();
        }while(opc.equals("si"));
        prom=se/cp;
        //salida de datos
        System.out.println("el promedio de los sueldos de este mes: "+prom);
    }
}
