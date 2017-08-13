import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Horasextra
{
    public static void main(String[] args) {
        int empleados;
        int salario;
        int horas;
        int i =0;
        int j=0;
        int conta=1;
        double result=0;    
        
        Scanner tn = new Scanner(System.in);
        System.out.println("Ingrese cantidad de empleados");    
        empleados = tn.nextInt();
        tn.nextLine();
        
        double[][] datos = new double[empleados][4];
        String[][] nombres = new String[empleados][1];
        
        for (i = 0; i < empleados; i++){
            j=0;
            horas=0;
            System.out.println("Ingrese nombre de la persona numero -"+conta);
            nombres[i][0]=tn.nextLine();
            
            System.out.println("Ingrese Salario de la persona numero -"+conta);
            salario = tn.nextInt();
            datos[i][j]= salario;
                        
            System.out.println("Ingrese numero de horas extras -"+conta);
            horas = tn.nextInt();
            tn.nextLine();
            
            j++;
            datos[i][j]= horas;
                        
            j++;
            double valorhora = (salario/30)/8;
            datos[i][j] = valorhora;
                        
            j++;
            double total = (valorhora*1.25)*horas;
            datos[i][j]=total;
                                    
            conta++;
        }
        for (i = 0; i < empleados; i++){
            result=result+datos[i][3];
        }    
        for (i = 0; i < empleados; i++){
            conta=0;
            System.out.println("Resultado: \""+ nombres[i][0] +"\"");
            for (j = 0; j < 4; j++){
                System.out.println("Datos--"+conta+" - "+datos[i][j]);
                conta++;
            }
        }
        System.out.println("Total extras"+result);
    }
}