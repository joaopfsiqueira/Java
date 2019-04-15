
package contaembanco;


public class Pessoa {
    private String nome;
    private String sobrenome;
    
    //construtor
    public Pessoa(String nome, String s){
        this.nome=nome;
        sobrenome=s;
    }
    
    public Pessoa(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String nomeCompleto(){
        return nome + " " + sobrenome;
    }
    
}
