/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado1;

/**
 *
 * @author Desktop
 */
public class Regiao {
    
    private String nomeRegiao;
    private String[] estados;
    
    public Regiao(String nome){
        nomeRegiao = nome;
    }
    
    public void addEstado(String estado, int index){
        estados[index] = estado;
    }
    
    public String getEstado(int index){
        return estados[index];
    }
}
