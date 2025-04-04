/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * La clase abstracta {@code InstrumentoViento} representa un instrumento musical de viento.
 * 
 * <p>
 * Implementa la interfaz {@link InstrumentoMusical} y provee una implementación base para
 * los instrumentos de viento. Las subclases deberán definir cómo se toca y afina el instrumento.
 * </p>
 * 
 * @author Issmael
 */
public abstract class InstrumentoViento extends Object implements InstrumentoMusical {
    
    /**
     * Tipo de instrumento, constante que identifica a este tipo de instrumento.
     */
    private final String TIPO_INSTRUMENTO = "InstrumentoViento";

    /**
     * Método abstracto para tocar el instrumento.
     */
    @Override
    public abstract void tocar();

    /**
     * Método abstracto para afinar el instrumento.
     */
    @Override
    public abstract void afinar();

    /**
     * Devuelve el tipo de instrumento.
     *
     * @return el tipo de instrumento como {@code String}.
     */
    @Override
    public String tipoInstrumento() {
        return TIPO_INSTRUMENTO;
    }

    /**
     * Devuelve una representación en {@code String} del objeto.
     *
     * @return la representación en {@code String} del objeto.
     */
    @Override
    public String toString() {
        return super.toString() + " InstrumentoViento{ " + TIPO_INSTRUMENTO + " }";
    }
}