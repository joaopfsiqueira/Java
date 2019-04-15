
package contaembanco;

import javax.swing.JOptionPane;


public class ContaEmBanco {

   
    public static void main(String[] args) {
       ContaCorrente minhaConta; //Declarando o construtor
       
       String nome=JOptionPane.showInputDialog(null, "Nome do Titular","Banco MuBank",3);
       String sobrenome=JOptionPane.showInputDialog(null, "Sobrenome do Titular","Banco MuBank",3);
       String numeroConta=JOptionPane.showInputDialog(null, "Digite o Número da conta", "MuBank",3);
       
       //Pessoa Titular=new Pessoa(nome,sobrenome);
       minhaConta=new ContaCorrente(numeroConta, new Pessoa(nome, sobrenome));//numeroConta,titular);
       
       String operacoes[]={"Saldo","Saque","Depósito","Sair"};
       
       String opUsr ="";
       
       while(!opUsr.equalsIgnoreCase("Sair")){
           opUsr=(String)JOptionPane.showInputDialog
            (null,"Selecione a operação desejada","ContaEmBanco",3,null,operacoes,operacoes[0]);
           
           if (opUsr.equals(operacoes[0])){
           JOptionPane.showMessageDialog(null,"Conta N° " + minhaConta.getNumeroDaConta() + "\nTitular: " + 
                   minhaConta.getTitular()
           +"\nSaldo: " + minhaConta.getSaldo(),"ContaEmBanco",1);
           }
    }
       
    }
    
}
