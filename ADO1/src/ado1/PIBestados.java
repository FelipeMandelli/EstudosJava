package ado1;

import java.io.*;
import java.util.*;


/**
 *
 * @author Felipe Mandelli
 * Date: 09/03/2022
 */
public class PIBestados {

    public static void main(String[] args) {
        
        // Declarando Variaveis necessarias 
        String arquivoPIB = "Pib.txt";        
        String linha = null;  
        String linha2 = null;
        float somaPib = 0;
        ArrayList<Estado> estados = new ArrayList();  // ArrayList dos Objetos
        ArrayList<String> estados_list = new ArrayList();
        File arquivoSaida = new File("Saida.txt");
        ArrayList<String> regioes = new ArrayList();
        
        
        /*
        *       Fazendo a Primeira Parte do Trabalho
        *   Feito com uso da Classe "Estado"
        */
        
        // Formato Try-Catch para tratar possiveis erros
        try {
            FileReader leitor = new FileReader(arquivoPIB); // Inicia um leitor no arquivo
            
            BufferedReader leitorBuffer = new BufferedReader(leitor); // Torna ele em um leitor com buffer            
                       
            while((linha = leitorBuffer.readLine()) != null) { // Loop para armazenar os dados do arquivo 
                
                String[] linhaSeparada = linha.split(";");
                estados.add (new Estado(linhaSeparada[0], Float.parseFloat(linhaSeparada[1])));
                estados_list.add(linha);
            }
                        
            leitorBuffer.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Arquivo inexistente: '" + arquivoPIB + "'");
        }
        catch(IOException ex){
            System.out.println("Erro lendo o arquivo '" + arquivoPIB + "'");
        }
        
        
        for(Estado e: estados){ // Loop para somar todos os valores de PIB
            somaPib += e.getPib();
        }
        
        float auxiliar = 100/somaPib; // Variavel com fator para multiplicacao 
        
        for(Estado e: estados){
            System.out.println(e.getNome() + ":" + "\n Pib: "+ e.getPib()*auxiliar + "%");
            System.out.println();
        }
        
        System.out.println("PIB Total dos Estados: " + somaPib);
        
        /*
        *       Fazendo a Segunda Parte do Trabalho
        *   Feito com o uso de Listas 
        */
        
        try {
            FileReader leitor = new FileReader("regioes.txt");      // Cria um Leitor
            BufferedReader leitorBuffer = new BufferedReader(leitor);
            
            FileWriter escritor = new FileWriter("saida.txt");    // Cria um Escritor de Arquivo
            BufferedWriter escritorBuffer = new BufferedWriter(escritor);
            
            List<String> linhaTexto = new ArrayList<String>();  // Lista de Strings para Armazenar dados do Arquivo
            List<String> ragioes = new ArrayList<String>();     // Lista de Strings para Tratar as Regioes Separadamente
         

            while((linha2 = leitorBuffer.readLine()) != null) { // Armazena os Dados do Arquivo na Lista "linhaTexto"
                linhaTexto.add(linha2);
            }   

            linhaTexto.add("");     // Finaliza "linhaTexto"
            
            for(int i = 0; i < linhaTexto.size(); i++){     // Percorre o Arquivo Copiado
                if(linhaTexto.get(i).isEmpty()){    // Encontra Linhas Vazias
                    float valorRegiao = 0;

                    for(int j = 0; j < regioes.size(); j++){
                        for(int k = 0; k < estados_list.size(); k++){
                            if(regioes.get(j).equals(estados_list.get(k).split(";")[0])){   // Procura Valor do PIB do Estado em Regioes
                                valorRegiao = valorRegiao + Float.parseFloat(estados_list.get(k).split(";")[1]); // Armazena o Pib da Regiao
                            }
                        }
                    }
                    escritorBuffer.write(regioes.get(0) + "\t-\t" + valorRegiao + "\n");    // Escreve no Arquivo o nome da Regiao e o PIB Calculado
                    regioes.clear();    // Reseta a Lista Para Calcular a Proxima Regiao
                } else{
                    regioes.add(linhaTexto.get(i));     // Armazena Dados em Regioes Antes de Linha Vazia
                }
            }
            
            leitorBuffer.close();       // Encerra Leitor            
            escritorBuffer.close();     // Encerra Escritor
            
        }
        catch(FileNotFoundException ex){
            System.out.println("Arquivo inexistente ");
        }
        catch(IOException ex){
            System.out.println("Erro lendo o arquivo");
        }
    }    
}
