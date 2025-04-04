/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 * La interfaz {@code InstrumentoMusical} define el contrato que deben cumplir los instrumentos musicales.
 *
 * <p>
 * Las clases que implementen esta interfaz deberán proporcionar implementaciones para
 * tocar, afinar, devolver el tipo de instrumento y tocar la melodía "Oda a la Alegría".
 * </p>
 * 
 * @author Issmael
 */
public interface InstrumentoMusical {

    /**
     * Realiza la acción de tocar el instrumento.
     */
    void tocar();

    /**
     * Realiza la acción de afinar el instrumento.
     */
    void afinar();

    /**
     * Devuelve el tipo de instrumento.
     *
     * @return una cadena que representa el tipo de instrumento.
     */
    String tipoInstrumento();

    /**
     * Toca la melodía "Oda a la Alegría".
     */
    void tocarOdaToJoy();
}