package appterreno;

public class Terreno {

    //Atributos
    private float comprimento;
    private float largura;
    
    //Métodos de Acesso
    //Voi → Vazio
    //Set → Segura os dados com ele, inserir.
    //Get → Retorna os dados.
    public void setComprimento(float comp){
        comprimento=comp;
    }
    public void setLargura(float larg){ //set recebe informação
        largura=larg;
    }
    public float getComprimento(){
        return comprimento;
    }
    public float getLargura(){
        return largura; //Get devolve informação
    } 
        
    //Métodos
    public float calculaPerimetro(){
        return 2 * comprimento + 2 * largura;
    }
    
}

   


