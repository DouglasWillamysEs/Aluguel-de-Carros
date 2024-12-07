package aluguelcarros;

import java.util.ArrayList;

public class Administrador {
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private ArrayList<Carro> carrosAll = new ArrayList();
    private ArrayList<Carro> carrosDisp = new ArrayList();
    private ArrayList<Carro> carrosNoDisp = new ArrayList();

    public Administrador (String nome, String cpf, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void cadastrar(Carro c1) {

    }
    public void editar(Carro c1, String cor, String marca, String modelo, String id, double preco, boolean disponibilidade) {

    }
    public void remover(Carro c1) {

    }
}
