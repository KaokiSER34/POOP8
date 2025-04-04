/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * La clase {@code Flauta} representa un instrumento musical de viento, en concreto
 * una flauta.
 * 
 * <p>
 * Hereda de {@link InstrumentoViento} y proporciona implementaciones concretas para
 * los métodos definidos en la interfaz {@link InstrumentoMusical}.
 * </p>
 * 
 * @author Issmael
 */
public class Flauta extends InstrumentoViento {
    
    /**
     * Nombre del instrumento.
     */
    public String nombreInstrumento;

    /**
     * Constructor por defecto.
     */
    public Flauta() {}
    
    /**
     * Constructor que asigna un nombre al instrumento.
     *
     * @param nombreInstrumento el nombre de la flauta.
     */
    public Flauta(String nombreInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
    }
    
    /**
     * Realiza la acción de tocar la flauta.
     */
    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }
    
    /**
     * Realiza la acción de afinar la flauta.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando boquilla de la flauta");
    }
    
    /**
     * Toca la melodía "Oda a la Alegría".
     */
    @Override
    public void tocarOdaToJoy() {
        System.out.println("Esta tocando OdaToJoy");
    }
}