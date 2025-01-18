package aluguelcarros;

import java.time.LocalDateTime;

public class Administrador extends Pessoa {

    private Controlador controlador;

    public Administrador(String nome, String cpf, int idade, String email, String senha, Controlador controlador) {
        super(nome, cpf, idade, email, senha);
        this.controlador = controlador;
    }

    public void cadastrarCarroComoAdmin(Pessoa pessoa, String cor, String marca, String modelo, double preco, boolean disponibilidade) {
        controlador.cadastrarCarro(pessoa, cor, marca, modelo, preco, disponibilidade);
    }

    public void removerCarroComoAdmin(Pessoa pessoa, int  id) {
        controlador.removerCarro(pessoa, id);
    }

    public void listarCarrosComoAdmin() {
        controlador.listarCarros();
    }



    public Controlador getControlador() {
        return controlador;
    }

<<<<<<< HEAD
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
=======
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
    public void editar(Carro c1, String cor, String marca, String modelo, double preco, boolean disponibilidade) {

    }
    public void remover(Carro c1) {

>>>>>>> 001c7da5f20a58eaabf7f7b1ebe7d0b46ebc7b3f
    }
}
