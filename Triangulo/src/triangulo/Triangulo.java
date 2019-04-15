package triangulo;

public class Triangulo {

    //Atributos
    private float lado1;
    private float lado2;
    private float lado3;
    
    //Construtor
   public Triangulo(float l1, float l2, float l3){
       lado1 =l1;
       lado2 = l2;
       lado3 = l3;
   }
    

    //Métodos de Acesso
    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    //Métodos gerais
    public boolean ehTriangulo() {
        return (lado1 < lado2 + lado3 && 
                   lado2 < lado1 + lado3 && 
                   lado3 < lado1 + lado2);
    }

    public String tipoTriangulo(){
        if (ehTriangulo() ){
            if (lado1 == lado2 && lado1 == lado3){
                return "Triângulo Equilátero";
            }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                return "Triângulo Isósceles";
            } else {
                return "Triângulo Escaleno";
            }
        }else{
            return "Os lados não formam triângulo!";
        }
    }//fim do método tipoTriangulo
}//fim da classe
