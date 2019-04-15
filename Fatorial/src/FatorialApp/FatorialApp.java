package FatorialApp;

import javax.swing.JOptionPane;

public class FatorialApp {

    public static void main(String[] args) {
                int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número fatorial",
                "Fatorial", 3));
        
        
        Fatorial objFatorial = new Fatorial();
        
        objFatorial.setNumero(numero1);

        JOptionPane.showMessageDialog(null, "o resultado fatorial do número é: " + objFatorial.calcFatorial(), "Fatorial", 1);

    }

}
