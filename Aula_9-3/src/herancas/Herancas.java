package herancas;

import java.util.ArrayList;

/**
 *
 * @author FelipeMandelli
 * Date: 09/03/2022
 */
public class Herancas {

    public static void main(String[] args) {
        ArrayList<ComissaoFuncionario> funcionarioComissao = new ArrayList();
        ArrayList<BaseMaisComissaoFuncionario> funcionarioBase = new ArrayList();
        
        funcionarioComissao.add (new ComissaoFuncionario("Mario", "Kart", "0123", 500, 0.4));
        funcionarioComissao.add (new ComissaoFuncionario("Charles", "Darwin", "9876", 1000, 0.8));
        
        funcionarioBase.add (new BaseMaisComissaoFuncionario("Carl", "Sagan", "0147", 980, 0.7, 300));
        funcionarioBase.add (new BaseMaisComissaoFuncionario("Leonardo", "DaVinci", "0258", 1500, 0.5, 500));
        
        for (ComissaoFuncionario c : funcionarioComissao){
            System.out.print(c.toString());            
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        for (BaseMaisComissaoFuncionario c : funcionarioBase){
            System.out.print(c.toString());
            System.out.println();
        }
    }
    
}
