import java.util.*;
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
        
        double[][] datos = new double[4][empleados];
        String[][] nombres = new String[1][empleados];
        
        for (i = 0; i <= empleados; i++){
            j=0;
            System.out.println("Ingrese nombre de la persona numero -"+conta);
            nombres[0][i]=tn.nextLine();
            
            System.out.println("Ingrese Salario de la persona numero -"+conta);
            salario = tn.nextInt();
            datos[i][j]= salario;
            
            System.out.println("Ingrese numero de horas extras"+conta);
            horas = tn.nextInt();
            
            j++;
            datos[i][j]= horas;
            
            j++;
            int valorhora=(salario/30)/8;
            datos[i][j]= valorhora;
            
            j++;
            double total = (valorhora*1.25)*horas;
            datos[i][j]=total;
            conta++;
        }
        for (i = 0; i <= empleados; i++){
            result=result+datos[i][3];
        }    
        for (i = 0; i <= empleados; i++){
            System.out.println("Resultado--"+nombres[0][i]+"--");
            for (j = 0; j <= empleados; j++){
                System.out.println("Datos"+datos[i][j]+"--");
            }
        }
        System.out.println("Total extras"+result);
    }
}

