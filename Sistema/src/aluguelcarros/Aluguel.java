package aluguelcarros;

import java.time.LocalDateTime;

public class Aluguel extends Reserva {

    private LocalDateTime dataAtual = LocalDateTime.now();
    private Controlador controlador;

    public Aluguel(int idReserva, LocalDateTime dataInicio, LocalDateTime dataFim, double preco, boolean statusPagamento) {
        super(idReserva, dataInicio, dataFim, preco, true);

        if (dataAtual.isBefore(dataFim) && dataAtual.isAfter(dataFim)) {
            preco = preco * 1.10;
        }
    }

    public void AdicionarAluguel(LocalDateTime dataInicio, LocalDateTime dataFim, double preco, boolean statusPagamento) {
        controlador.addAluguel(dataInicio, dataFim, preco, statusPagamento);
    }
}
