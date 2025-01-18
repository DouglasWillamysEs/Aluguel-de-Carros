package aluguelcarros;

import java.time.LocalDateTime;

public class Reserva {

    private int idReserva;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private double preco;
    private boolean statusPagamento;
    private boolean ativa;

<<<<<<< HEAD
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Reserva(int idReserva, LocalDateTime dataInicio, LocalDateTime dataFim, double preco, boolean statusPagamento){
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.preco = preco;
        this.statusPagamento = statusPagamento;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public boolean validarDataReserva() {
        if (dataInicio.isAfter(dataFim)) {
            return false;
        }
        return true;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}


=======
    public Reserva(LocalDateTime dataInicio, LocalDateTime dataFim, double preco, boolean statusPagamento){
    this.dataInicio = dotaInicio;
    this.dataFim = dataFim;
    this.preco = preco;
    this.statusPagamento = statusPagamento;
    }
    public void alterarStatusPagamento() {

    }

}
>>>>>>> 001c7da5f20a58eaabf7f7b1ebe7d0b46ebc7b3f
