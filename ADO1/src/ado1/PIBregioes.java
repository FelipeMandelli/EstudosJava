/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ado1;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Desktop
 */
public class PIBregioes {

    public static void main(String[] args) {
        
        // Declarando Variaveis necessarias 
//        String arquivoPIB = "Pib.txt";        
//        String linha = null;  
        String linha2 = null;
//        float somaPib = 0;
//        ArrayList<Estado> estados = new ArrayList();  // ArrayList dos Objetos
        File arquivoSaida = new File("Saida.txt");
        ArrayList<Regiao> regioes = new ArrayList();
        
        
//        // Formato Try-Catch para tratar possiveis erros
//        try {
//            FileReader leitor = new FileReader(arquivoPIB); // Inicia um leitor no arquivo
//            
//            BufferedReader leitorBuffer = new BufferedReader(leitor); // Torna ele em um leitor com buffer            
//                       
//            while((linha = leitorBuffer.readLine()) != null) { // Loop para armazenar os dados do arquivo 
//                
//                String[] linhaSeparada = linha.split(";");
//                estados.add (new Estado(linhaSeparada[0], Float.parseFloat(linhaSeparada[1])));
//            }
//                        
//            leitorBuffer.close();
//        }
//        catch(FileNotFoundException ex){
//            System.out.println("Arquivo inexistente: '" + arquivoPIB + "'");
//        }
//        catch(IOException ex){
//            System.out.println("Erro lendo o arquivo '" + arquivoPIB + "'");
//        }
//        
//        
//        for(Estado e: estados){ // Loop para somar todos os valores de PIB
//            somaPib += e.getPib();
//        }
//        
//        float auxiliar = 100/somaPib; // Variavel com fator para multiplicacao 
//        
//        for(Estado e: estados){
//            System.out.println(e.getNome() + ":" + "\n Pib: "+ e.getPib()*auxiliar + "%");
//            System.out.println();
//        }
//        
//        System.out.println("PIB Total dos Estados: " + somaPib);
        
        try {
            FileReader leitor = new FileReader("regioes.txt");
            BufferedReader leitorBuffer = new BufferedReader(leitor);
             while((linha2 = leitorBuffer.readLine()) != null){
                regioes.add (new Regiao(linha2));
                int i = 0;
                while(linha2 != "\n"){
                    .addEstado(linha2,i++);
                }
             }
            
            leitorBuffer.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Arquivo inexistente ");
        }
        catch(IOException ex){
            System.out.println("Erro lendo o arquivo");
        }


        try {            
            arquivoSaida.createNewFile();
            FileWriter escreve = new FileWriter(arquivoSaida,true);            
            escreve.write("Testes!!");
            escreve.close();
        }
        catch(IOException ex){
            System.out.println("Erro ao criar arquivo!");
        }
    }
    
}
