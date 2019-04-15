
package Programa;

import java.util.Scanner;
import projetonovo.Colecionador;
import projetonovo.Item;


public class Programa {

public static void main(String args[]) {
    Colecionador colecionador;
    Item item;
    String nomeDoColecionador, nomeDoItem;
    int ano;
    Scanner lerDados = new Scanner(System.in);
    
    System.out.print("Informe o nome do colecionador: ");
    
    nomeDoColecionador = lerDados.nextLine();
    
    
    
    colecionador = new Colecionador(nomeDoColecionador);
    while(true){
    System.out.println("==========================");
    System.out.print("Informe o nome do Item: ");
    nomeDoItem = lerDados.nextLine();
    
    if (nomeDoItem.isEmpty()) {
    break;
    }
    
    System.out.print("Informe o ano em que esse item foi fabricado: ");
    ano = Integer.parseInt(lerDados.nextLine());
    
    item = new Item(nomeDoItem, ano);
    colecionador.getColecao().add(item);
    }
    System.out.println("A coleção de " + 
    colecionador.getNome() + " é: " + colecionador.getColecao());
}
    
}
