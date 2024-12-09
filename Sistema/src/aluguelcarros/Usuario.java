package aluguelcarros;

import java.time.LocalDateTime;

public class Usuario {

    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String Cadastrados = newArrayList();
    private ArrayList<Usuario> cadastrados = new ArrayList();

    public Usuario (String nome, String cpf, String email, String senha) {
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

    public void criarConta(String nome, String cpf, String email, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;

    }
    public void realizarLogin(String email, String senha) {

    }
    public void mostrarHistorico() {

    }
    public void realizarReserva(LocalDateTime dataInicio, LocalDateTime dataFim, double preco, boolean statusPagamento) {

    }

}
