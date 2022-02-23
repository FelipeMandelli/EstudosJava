/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2;

/**
 *
 * @author Felipe Mandelli
 */
public class ExerciciosAula2 {

    public static void main(String[] args) {
        int controle = 0;
        switch (controle) {
            case 1:
                int[] numeros = {1,2,3,4,5,6,7,8,9,10};
                for (int posicao : numeros){
                    System.out.println("contagem : " + posicao);
                }
                break;
                
            case 2:
                char [] caracteres = {'a','b','c','f','g','h','i','j'};
                for (char letras : caracteres){
                    System.out.println("letra: " + letras);
                }
                break;
                
            default:
                System.out.println("Caso Default!");
                break;
        }
    }
    
}
