
package projetonovo;


public class Item {
  //Mas, e a palavra private na declaração dos atributos? O que ela significa?
  //A palavra private, assim como a palavra public, utilizada na declaração da classe, representa um modificador de acesso. 
  //É com o uso dos modificadores de acesso que indicamos quem pode ter acesso a uma classe e a um método.  
    
    
    private String nome;
    private int anoCriacao;
    
    
    public Item(String nome, int anoCriacao) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    @Override
    public String toString() {
        return "Item{" + "nome=" + nome + ", anoCriacao=" + anoCriacao + '}';
    }
    
    
    
}
