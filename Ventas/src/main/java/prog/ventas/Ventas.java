
package prog.ventas;

import java.util.Scanner;


public class Ventas {

    public static void main(String[] args) {
        double[][] suc1 = new double[2][5];
        double[][] suc2 = new double[2][5];
        double[][] suc3 = new double[2][5];
        double[][] suc4 = new double[2][5];
        
        int i, j;
        Scanner reader = new Scanner(System.in);
        
        System.out.println ("Ingrese la informacion de la SUCURSAL 1 en el siguiente orden: precio - cantidad");
        for ( i = 0; i < 2; i++ ){
            for ( j = 1; j <= 5; j++ ){
                if (i==0){
                    System.out.println("Precio Articulo " + j);
                    suc1[i][j-1] = reader.nextDouble();
                }
                else{
                    System.out.println("Cantidad Articulo " + j);
                    suc1[i][j-1] = reader.nextDouble();
                }
            }
        }
        
        System.out.println ("Ingrese la informacion de la SUCURSAL 2 en el siguiente orden: precio - cantidad");
        for ( i = 0; i < 2; i++ ){
            for ( j = 1; j <= 5; j++ ){
                if (i==0){
                    System.out.println("Precio Articulo " + j);
                    suc2[i][j-1] = reader.nextDouble();
                }
                else{
                    System.out.println("Cantidad Articulo " + j);
                    suc2[i][j-1] = reader.nextDouble();
                }
            }
        }
        
        System.out.println ("Ingrese la informacion de la SUCURSAL 3 en el siguiente orden: precio - cantidad");
        for ( i = 0; i < 2; i++ ){
            for ( j = 1; j <= 5; j++ ){
                if (i==0){
                    System.out.println("Precio Articulo " + j);
                    suc3[i][j-1] = reader.nextDouble();
                }
                else{
                    System.out.println("Cantidad Articulo " + j);
                    suc3[i][j-1] = reader.nextDouble();
                }
            }
        }
        
        System.out.println ("Ingrese la informacion de la SUCURSAL 4 en el siguiente orden: precio - cantidad");
        for ( i = 0; i < 2; i++ ){
            for ( j = 1; j <= 5; j++ ){
                if (i==0){
                    System.out.println("Precio Articulo " + j);
                    suc4[i][j-1] = reader.nextDouble();
                }
                else{
                    System.out.println("Cantidad Articulo " + j);
                    suc4[i][j-1] = reader.nextDouble();
                }
            }
        }
        double cantidad=0;
        double total=0;
        for (i=0;i<5;i++) {
            cantidad += suc1[1][i];
            cantidad += suc2[1][i];
            cantidad += suc3[1][i];
            cantidad += suc4[1][i];
            System.out.println("La cantidad existente del producto "+ i +" en las sucursales es = " + cantidad);
        }
         
        for (i=0;i<5;i++) {
            cantidad += suc2[1][i];
            System.out.println("La cantidad existente de productos en las sucursal 2  = " + cantidad);
        }
        
        System.out.println("La cantidad existente de producto 3 en las sucursal 1  = " + suc1[1][2]);
        
        for ( i = 0; i < 5; i++ ){
                total += suc1[0][i];
                total += suc2[0][i];
                total += suc3[0][i];
                total += suc4[0][i];
        }
        System.out.println("La recaudacion total en las 4 sucursales es = " + total);
        
        double[] totales = new double[4];
        
         for ( i = 0; i < 5; i++ ){
                totales[0] += suc1[0][i];
                totales[1] += suc2[0][i];
                totales[2] += suc3[0][i];
                totales[3] += suc4[0][i];
        }
        System.out.println("La recaudacion total en la sucursal 1 es = " + totales[0]);
        System.out.println("La recaudacion total en la sucursal 2 es = " + totales[1]);
        System.out.println("La recaudacion total en la sucursal 3 es = " + totales[2]);
        System.out.println("La recaudacion total en la sucursal 4 es = " + totales[3]);
        
        double max = totales[0];
        for (double valor : totales) {
            if (valor > max)
                max = valor;
        }
        
        System.out.println("La recaudacion mayor es = " + max);

        }
    
}
