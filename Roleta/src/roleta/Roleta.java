package roleta;
//imports
import java.util.Scanner;
import java.util.Random;

public class Roleta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();

        int nItens = 10; // Itens da roleta
        
        // Criando os itens da roleta
        Item itens[] = new Item[nItens];
        itens[0] = new Item("Rocket");
        itens[1] = new Item("Falo Gás");
        itens[2] = new Item("Golfe");
        itens[3] = new Item("Mine");
        itens[4] = new Item("Cartas contra a humanidade");
        itens[5] = new Item("Gta");
        
        itens[6] = new Item("Fortnite");
        itens[7] = new Item("Gartic");
        itens[8] = new Item("Telefone sem fio");
        itens[9] = new Item("Stop");
        
        int key, index_, index;
        int nMin = ler.nextInt(); //número de vezes que um item tem que cair para ganhar
        String op = ler.nextLine();
        
        
        while(true){
            if(op.equals("p")){
                System.exit(0);
            }else if(op.equals("r")){
                key = gerador.nextInt();
                index_ = (key%nItens);
                index = Math.abs(index_);
                itens[index].itemUpdate();
                if(itens[index].getQuant() == nMin){
                    System.out.println(itens[index].getNome() + " ganhou!");
                    System.exit(0);
                }
                System.out.println(itens[index].mostraItem());
            }
            op = ler.nextLine();
        }
    }
    
}