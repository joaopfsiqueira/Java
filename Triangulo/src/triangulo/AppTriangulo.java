
package triangulo;

import javax.swing.JOptionPane;

public class AppTriangulo {
    public static void main(String[] args) {
        //declaração do objeto
        Triangulo objTriangulo;
        
        float l1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor para o lado 1",
                                                                                                "App Triângulo",3 ));
        float l2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor para o lado 2",
                                                                                                "App Triângulo",3 ));
        float l3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor para o lado 3",
                                                                                                "App Triângulo",3 ));
       //instanciação do objeto
        objTriangulo = new Triangulo(l1,l2,l3);
        
        JOptionPane.showMessageDialog(null,objTriangulo.tipoTriangulo(), "App Triângulo",1);
        
        System.exit(0); //finaliza, de forma normal, a aplicação
    }
    
}
