
package contaembanco;


public class ContaCorrente {
    private String numeroDaConta;
    private Pessoa titular;
    private double saldo;
    
    public ContaCorrente(String numero, Pessoa titular){
        numeroDaConta=numero;
        this.titular=titular;
        saldo=0;
    }
    //Métodos de acesso

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {//nao precisa do set por que o saldo só muda com depósito e saque 
        return saldo;
    }
    
    //Métodos Gerais
    public void deposito(float valor){
        saldo+=valor;
    }
    public boolean saque(float valor){
        if(saldo >=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }
}
