package FatorialApp;


public class Fatorial {
    //ATRIBUTOS 
    private int numero1;

    
    //MÉTODOS DE ACESSO
    public int getNumero() {
        return numero1;
    }

    public void setNumero(int numero) {
        this.numero1 = numero;
    }
    
    
    //MÉTODO GERAL
    public int calcFatorial() {

        if (numero1== 0 || numero1 == 1){
        return 1;
        }else{
            int fat=1;
            for(int cont = numero1;cont > 1; cont --){
            fat=fat*cont;
            }
            return fat;



        }
        
    }
    
}
