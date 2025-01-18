package aluguelcarros;

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

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
}
