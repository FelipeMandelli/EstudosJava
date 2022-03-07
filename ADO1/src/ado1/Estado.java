/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado1;

/**
 *
 * @author Desktop
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
