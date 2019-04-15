
package imc;


public class CalcImc {
    private double peso;
    private double altura;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
  public  double CalcImc(){
        return peso / (altura * altura);
    }
  
    public String situacao() {
        double imc = CalcImc();

        if (imc < 18.6) {
            return "abaixo do peso";
        } else if (imc <= 24.9) {
            return "peso normal";
        } else if (imc <= 30) {
            return "excesso de peso";
        } else {
            return "obeso";
        }
      
  }
}
