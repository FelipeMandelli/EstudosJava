package ado1;

/**
 *
 * @author Felipe Mandelli
 * Date: 09/03/2022
 */
public class Estado {
    
    // Declarando os Atributos de "Estado"
    private String nomeEstado;
    private float pibEstado;
    
    // Constructor
    public Estado(String nomeEstado, float pibEstado){
        this.nomeEstado = nomeEstado;
        this.pibEstado = pibEstado;
    }
    
    public String getNome(){
        return nomeEstado;
    }
    
    public float getPib(){
        return pibEstado;
    }
    
}
