
package quiz;

import javax.swing.JOptionPane;


public class Quiz {

    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"Bem vindo ao QUIZ sobre o Brasil . ☻ \n "
                + "serão 10 perguntas simples ." );
        
        
        JOptionPane.showMessageDialog(null,"Qual a cidade mais populosa do Brasil? " + "\n"
        + "1: São Paulo \n"
                + " 2: Minas Gerais "
                + "\n3: Bahia \n "
                + "4: Rio de Janeiro"
                + "\n 5: Amazonas " );
        String  res =  JOptionPane.showInputDialog(null, "Qual a resposta ? ");
        int res1 = Integer.parseInt(res);
        
        JOptionPane.showMessageDialog(null,"O Brasil é localizado em qual continente? " + "\n" + 
                "1: Europa \n "
                + "2: America do Sul "
                + "\n 3: Asia "
                + "\n 4: Oceania "
                + "\n 5: Africa  ");
        res =  JOptionPane.showInputDialog(null, "Qual a resposta ? ");
        int res2 = Integer.parseInt(res);
        
       JOptionPane.showMessageDialog(null,"Quem foi o descobridor do Brasil? " + "\n" + "1: José de Anchieta \n "
               + "2: Mario Covas \n "
               + "3: Dom Pedro \n "
               + "4: Jucelino Kubichek \n "
               + "5: Pedro Alves Cabral ");
       res =  JOptionPane.showInputDialog(null, "Qual a resposta ? ");
        int res3 = Integer.parseInt(res);
        
        JOptionPane.showMessageDialog(null,"Qual a capital do Brasil?" + "\n" + "1: Ceara \n"
                + "2: São Paulo \n"
                + "3: Brasilia\n" 
                + "4: Rio de Janeiro \n"
                + "5: Paraiba");
        res =  JOptionPane.showInputDialog(null, "Qual a resposta ? ");
        int res4 = Integer.parseInt(res);
        
        JOptionPane.showMessageDialog(null,"Em que dia, mês e ano foi declarada a independência do Brasil?" + " \n" + "1: 25 de Maio de 1828 \n"
                + "2: 30 de Dezembro de 1850 \n"
                + "3: 14 de julho de 1848 \n"
                + "4: 07 de Setembro de 1822 \n"
                + "5: 22 de Abril de 1500 \n ");
        res =  JOptionPane.showInputDialog(null, "Qual a resposta ? ");
        int res5 = Integer.parseInt(res);
        
        JOptionPane.showMessageDialog(null,"Qual desses países NÃO faz fronteira com o Brasil?" + "\n" + "1: Chile \n"
                + "2: Argentina \n"
                + "3: Colombia \n"
                + "4: Suriname \n"
                + "5: Bolivia");
        res =  JOptionPane.showInputDialog(null, "Qual a resposta ? ");
        int res6 = Integer.parseInt(res);
        
       
       
        
        
    }
    
}
