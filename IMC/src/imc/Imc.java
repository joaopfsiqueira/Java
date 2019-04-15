package imc;

import javax.swing.JOptionPane;

public class Imc {

    public static void main(String[] args) {

        double peso;
        peso = Double.parseDouble(JOptionPane.showInputDialog(
                null, "Informe o peso",
                "IMC", 3));
        double altura;
        altura = Double.parseDouble(JOptionPane.showInputDialog(
                null, "Informe a altura",
                "IMC", 3));

        CalcImc objCalc = new CalcImc();

        objCalc.setPeso(peso);
        objCalc.setAltura(altura);
        
        JOptionPane.showMessageDialog(null,"Você está " + objCalc.situacao(),"IMC", 1);

    }

}
