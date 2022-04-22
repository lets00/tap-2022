public class Compra {
    private String name;
    private double valor;
    private String cidade;

    public Compra(String name, double valor, String cidade) {
        this.name = name;
        this.valor = valor;
        this.cidade = cidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public String getCidade() {
        return cidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
