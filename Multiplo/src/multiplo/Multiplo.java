package multiplo;

import javax.swing.JOptionPane;

public class Multiplo {

    public static void main(String[] args) {
        int numero1;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Informe o primeiro numero",
                "Multiplos", 3));
        int numero2;
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Informe o segundo numero",
                "Multiplos", 3));
        
        Numeros objNumero=new Numeros();
    
    objNumero.setNumero1(numero1);
    objNumero.setNumero2(numero2);
    
    boolean resultado=objNumero.ehMultiplo();    
    
    String msg="não é multiplo";
    
    if(resultado){
    msg="é multiplo";
    }

   JOptionPane.showMessageDialog(null, objNumero.getNumero1()+" "+msg+" "+objNumero.getNumero2(),"Aplicativo Múltiplo", 3);

}
}
