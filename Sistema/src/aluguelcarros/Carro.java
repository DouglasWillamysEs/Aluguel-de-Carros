package aluguelcarros;

public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private double preco;
    private boolean disponibilidade;
    private int id;
    private Controlador controlador;


    public Carro (int id, String cor, String marca, String modelo, double preco, boolean disponibilidade) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;

        this.preco = preco;
        this.disponibilidade = disponibilidade;
        this.id = id;
    }

    //Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}

