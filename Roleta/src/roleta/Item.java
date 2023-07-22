package roleta;

public class Item {
    private final String nome;
    private int quant;

    public Item(String nome) {
        this.nome = nome;
        this.quant = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    public String mostraItem(){
        return this.nome + " - " + String.valueOf(this.quant);
    }
    
    public void itemUpdate(){
        this.quant++;
    }
    
}
