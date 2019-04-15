
package calculadora;

import javax.swing.JOptionPane;


public class Calculadora {


    public static void main(String[] args) {
        double numero1=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro número", "MiniCalc",3));
        double numero2=Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo número", "MiniCalc",3));
          
                
                
         //jeito dificil      
        //String numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor", "Calculadora", 1);
        //String numero2 = JOptionPane.showInputDialog(null, "Digite o segundo valor", "Calculadora", 1);
        
        //CRIAÇÃO OU INSTANCIAÇÃO DO OBJETO
        Calculator objCalculator = new Calculator ();
        
        objCalculator.setNumero1(numero1);
        objCalculator.setNumero2(numero2);
        
        JOptionPane.showMessageDialog(null, "As operações são:\n"+
                                      objCalculator.getNumero1()+"+"+objCalculator.getNumero2()+"="+objCalculator.soma()+"\n"+
                                      objCalculator.getNumero1()+"-"+objCalculator.getNumero2()+"="+objCalculator.subtracao()+"\n"+
                                       objCalculator.getNumero1()+"*"+objCalculator.getNumero2()+"="+objCalculator.multiplicacao()+"\n"+
                                        objCalculator.getNumero1()+"/"+objCalculator.getNumero2()+"="+objCalculator.divisao(),
                                        "Calculadora", JOptionPane.PLAIN_MESSAGE);
        
                }
    
}
