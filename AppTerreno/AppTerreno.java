package appterreno;

import javax.swing.JOptionPane;

public class AppTerreno {

    public static void main(String[] args) {
        String comp = JOptionPane.showInputDialog(null, "Digite o comprimento", "AppTerreno v.1.0", JOptionPane.QUESTION_MESSAGE);
        String larg = JOptionPane.showInputDialog(null, "Digite a largura", "AppTerreno v.1.0", JOptionPane.QUESTION_MESSAGE); //JOptionPane.QUESTION_MESSAGE Icone
        
    float comprimento=Float.parseFloat(comp); //Converte o String(Comp) para float
    float largura=Float.parseFloat(larg); //Converte o String(Larg) para float
    
    //Criação ou Instanciação do objeto
    Terreno objTerreno = new Terreno();
 
    objTerreno.setComprimento(comprimento);
    objTerreno.setLargura(largura);
    
    JOptionPane.showMessageDialog(null,"Serão necessários"+objTerreno.calculaPerimetro()+"metros de arame","AppTerreno v.1.0,",
    JOptionPane.INFORMATION_MESSAGE);
    }

}
