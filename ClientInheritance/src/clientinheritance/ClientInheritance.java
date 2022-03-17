package clientinheritance;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Felipe.fmandelli
 */
public class ClientInheritance {

    public static void main(String[] args) {
        Scanner ts = new Scanner(System.in);
        ArrayList<Cliente> c = new ArrayList();
        ArrayList<JuridicoCliente> j = new ArrayList();
        
        System.out.print("Quantos Clientes Serao Adicionados? ");
        int qtd = Integer.parseInt(ts.nextLine());        
        
        for(int i = 1; i <= qtd; i++){
            Scanner tmp = new Scanner(System.in);
            System.out.println("1 - Adicionar Juridico\n2 - Adicionar Cliente");
            int tipo = Integer.parseInt(ts.nextLine());
            
            if (tipo == 2){
                System.out.print("Digite  o Nome do Cliente:  ");
                String temp = tmp.nextLine();
        
                System.out.print("Digite  o id do Cliente:  ");
                int temp2 = Integer.parseInt(tmp.nextLine());
        
                System.out.print("Digite a data do Cliente:  ");
                String temp3 = tmp.nextLine();
                
                c.add(new Cliente(temp, temp2, temp3));
               
            }
            
            if (tipo == 1){
                System.out.print("Digite  o Nome do Cliente:  ");
                String temp = tmp.nextLine();
        
                System.out.print("Digite  o id do Cliente:  ");
                int temp2 = Integer.parseInt(tmp.nextLine());
        
                System.out.print("Digite a data do Cliente:  ");
                String temp3 = tmp.nextLine();
                
                System.out.print("Digite o CNPJ do Cliente:  ");
                String temp4 = tmp.nextLine();
                
                System.out.print("Digite o Nome Fantasia do Cliente:  ");
                String temp5 = tmp.nextLine();
                
                System.out.print("Digite a renda anual do Cliente:  ");
                int temp6 = Integer.parseInt(tmp.nextLine());
                
                j.add(new JuridicoCliente(temp, temp2, temp3, temp4, temp5, temp6));
                
            }
        }
        
                
        
            System.out.println();
            System.out.println(c.toString());
        
       
        
            System.out.println();
            System.out.println(j.toString());
        
        
    }
   
}
