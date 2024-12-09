package aluguelcarros;

import java.time.LocalDateTime;

public class Reserva {

    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private double preco;
    private boolean statusPagamento;

    public Reserva(LocalDateTime dataInicio, LocalDateTime dataFim, double preco, boolean statusPagamento){
    this.dataInicio = dotaInicio;
    this.dataFim = dataFim;
    this.preco = preco;
    this.statusPagamento = statusPagamento;
    }
    public void alterarStatusPagamento() {

    }

}
