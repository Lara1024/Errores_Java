/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;



/**
 *
 * @author ColochoSama
 */
public class errorRelativo {
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public static void main(String[] args) {
        double numero=8.5252719;
        System.out.print("El numero 8.5252719 con 2 decimales queda "+ redondearDecimales(numero, 2));
        System.out.println(". Con 4 decimales queda "+redondearDecimales(numero, 4)+
 " y con 6 decimales queda "+redondearDecimales(numero, 6));
        numero=12.5552917;
        System.out.print("El numero 12.5552917 con 2 decimales queda "+ redondearDecimales(numero, 2));
        System.out.println(". Con 4 decimales queda "+redondearDecimales(numero, 4)+
 " y con 6 decimales queda "+redondearDecimales(numero, 6));
        numero= -12.5566112345;
        System.out.print("El numero -12.5566112345 con 2 decimales queda "+ redondearDecimales(numero, 2));
        System.out.println(". Con 4 decimales queda "+redondearDecimales(numero, 4)+
 " y con 6 decimales queda "+redondearDecimales(numero, 6));
    }

    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }
}

    
