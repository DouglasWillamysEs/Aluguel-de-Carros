package aluguelcarros;

public class Pessoa {

    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private int idade;
    private boolean cadastrado;
    private Controlador controlador;

    public Pessoa(String nome, String cpf, int idade, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.cadastrado = false;
    }

    // Getters e Setters
    public boolean isCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void loginPessoa(Pessoa pessoa, String email, String senha) {
        pessoa = controlador.realizarLogin(pessoa, email, senha);
    }
}
