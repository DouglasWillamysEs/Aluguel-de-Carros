package aluguelcarros;

import java.time.LocalDateTime;

public interface AluguelCarrosInterface {
    // Métodos para Gerenciamento de Carros
    void cadastrarCarro(String cor, String marca, String modelo, double preco, boolean disponibilidade);
    void editarCarro(int id, String cor, String marca, String modelo, double preco);
    void removerCarro(int id);
    void listarCarros();

    // Métodos para Gerenciamento de Usuários
    void cadastrarUsuario(String nome, String cpf, int idade, String email, String senha);
    void listarUsuarios();

    // Métodos para Gerenciamento de Reservas
    void criarReserva(int idCarro, LocalDateTime dataInicio, LocalDateTime dataFim, double preco, boolean statusPagamento);
    void listarReservas();
    void cancelarReserva(int idReserva);

    // Métodos para Gerenciamento de Aluguéis
    void adicionarAluguel(int idReserva, LocalDateTime dataInicio, LocalDateTime dataFim, double preco, boolean statusPagamento);
    void listarAlugueis();

    // Métodos para Gerenciamento de Promoções
    void cadastrarPromocao(String descricao, double desconto);
    void listarPromocoes();
    void removerPromocao(int idPromocao);

    // Métodos adicionais
    void buscarCarroPorId(int id);
    void buscarReservaPorId(int idReserva);
}


