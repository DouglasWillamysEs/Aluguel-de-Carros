package aluguelcarros;

public class Carro {

    private String modelo;
    private String marca;
    private String cor;
    private double preco;
    private boolean disponibilidade;

    public Carro (String cor, String marca, String modelo, String id, double preco, boolean disponibilidade) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;

        this.preco = preco;
        this.disponibilidade = disponibilidade;   
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public void alterarDisp(boolean disponibilidade) {

    }
    public void mostrarDetalhes() {

    }
}
