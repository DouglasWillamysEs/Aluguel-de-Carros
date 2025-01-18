package aluguelcarros;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class  Usuario extends Pessoa{


    private Controlador controlador;

    public Usuario(String nome, String cpf, int idade, String email, String senha, Controlador controlador) {
        super(nome, cpf, idade, email, senha);
        this.controlador =  controlador;
    }

    public void realizarReservaUser(Pessoa pessoa, int id, LocalDateTime dataInicio, LocalDateTime dataFim, double preco, boolean statusPagamento){
        controlador.adicionarReserva(pessoa, id, dataInicio, dataFim, preco, true);
    }
}