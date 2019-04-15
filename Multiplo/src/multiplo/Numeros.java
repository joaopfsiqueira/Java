package multiplo;

public class Numeros {

    //Atributos 
    private int numero1;
    private int numero2;

    //methods de acesso
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //métodos gerais
    public boolean ehMultiplo() {
        boolean resultado = false;
        if (numero1 % numero2 == 0) {
            resultado = true;
        }
        return resultado;
    }

}

// outras formas de métodos gerais nesse caso:
//public boolean ehMultiplo(){
//if(numero1 % numero2 ==0){
//return true;}
//return false;
//}


//public boolean ehMultiplo(){                
//int resto=numero1 % numero2;
//if (resto ==0){
//return true;
//}
//return false;
    //} 
