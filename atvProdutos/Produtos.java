public class Produtos {

    private int id;
    private String nome;
    private double valor;
    private int quantidade;
    private String cor;

    Produtos() {
    }

    public Produtos(int id, String nome) {
        this.id = id;
        this.nome = nome.toUpperCase();
    }

    public Produtos(int quantidade, double valor, String cor) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.cor = cor.toLowerCase();
    }

    public void setInfo(int id, String nome, double valor, int quantidade, String cor) {
        this.id = id;
        this.nome = nome.toUpperCase();
        this.valor = valor;
        this.quantidade = quantidade;
        this.cor = cor.toLowerCase();
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setCor(String cor) {
        this.cor = cor.toLowerCase();
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }
}
