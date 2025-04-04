/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 * Clase principal que contiene el método main para ejecutar la aplicación.
 * <p>Esta clase demuestra el uso de las clases e interfaces del paquete {@code poop8}.</p>
 * 
 * @author Issmael
 */

public class POOP8 {
    
    /**
     * Punto de entrada de la aplicación.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Ejemplo con Flauta:
        System.out.println("Ejemplo con Flauta:");
        Flauta f1 = new Flauta("Flauta 1");
        f1.tocar();
        f1.afinar();
        f1.tocarOdaToJoy();
        System.out.println("Nombre del instrumento: " + f1.nombreInstrumento);
        System.out.println("Tipo de instrumento: " + f1.tipoInstrumento());
        System.out.println();
        
        // Ejemplo usando la interfaz InstrumentoMusical (referencia a una instancia de Flauta)
        System.out.println("Ejemplo con InstrumentoMusical:");
        InstrumentoMusical im = new Flauta("Flauta 2");
        im.tocar();
        im.afinar();
        im.tocarOdaToJoy();
        System.out.println("Tipo de instrumento (via interfaz): " + im.tipoInstrumento());
        System.out.println();
        
        // Ejemplo de uso de Meses:
        System.out.println("Ejemplo con Meses:");
        System.out.println("Mes " + Meses.CUATRO + ": " + Meses.NOMBRE_MESES[Meses.CUATRO]);
        System.out.println("Mes " + Meses.DOS + ": " + Meses.NOMBRE_MESES[Meses.DOS]);
        System.out.println();
        
        // Uso de Math.PI (para ejemplificar el uso de constantes de clases externas)
        System.out.println("Valor de Math.PI: " + Math.PI);
    }
}