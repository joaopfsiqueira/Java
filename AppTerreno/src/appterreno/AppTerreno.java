package appterreno;

import javax.swing.JOptionPane;

public class AppTerreno {

    public static void main(String[] args) {
        String comp = JOptionPane.showInputDialog(null, "Digite o comprimento", "AppTerreno v.1.0", JOptionPane.QUESTION_MESSAGE);
        String larg = JOptionPane.showInputDialog(null, "Digite a largura", "AppTerreno v.1.0", JOptionPane.QUESTION_MESSAGE);

        //CONVERTE STRING PARA FLOAT COM O PARSE    
        float comprimento = Float.parseFloat(comp);
        float largura = Float.parseFloat(larg);

        //CRIAÇÃO OU INSTANCIAÇÃO DO OBJETO
        Terreno objTerreno = new Terreno();

        objTerreno.setComprimento(comprimento);
        objTerreno.setLargura(largura);

        JOptionPane.showInputDialog(null, "Serão necessários "+objTerreno.calculaPerimetro()+" metros de arame ", "AppTerreno v1.0",JOptionPane.INFORMATION_MESSAGE);
    }

}
