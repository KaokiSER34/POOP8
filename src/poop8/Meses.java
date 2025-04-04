/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 * La interfaz {@code Meses} define constantes para representar los meses del año.
 *
 * <p>
 * Incluye tanto constantes numéricas para cada mes como un arreglo de {@code String} con
 * los nombres de los meses.
 * </p>
 * 
 * @author Issmael
 */
public interface Meses {
    
    /**
     * Constantes numéricas que representan los meses del año.
     */
    int UNO = 1, DOS = 2, TRES = 3, CUATRO = 4, CINCO = 5, SEIS = 6,
        SIETE = 7, OCHO = 8, NUEVE = 9, DIEZ = 10, ONCE = 11, DOCE = 12;
    
    /**
     * Arreglo de {@code String} con los nombres de los meses.
     */
    String[] NOMBRE_MESES = {
        "", "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", 
        "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"
    };
}