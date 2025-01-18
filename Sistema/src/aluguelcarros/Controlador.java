package aluguelcarros;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Controlador {

    private ArrayList<Carro> carros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Administrador> administradores = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();
    private ArrayList<Aluguel> alugueis = new ArrayList<>();



    // Método para cadastrar um carro
    public void cadastrarCarro(Pessoa pessoa, String cor, String marca, String modelo, double preco, boolean disponibilidade) {
        if (pessoa instanceof Administrador) {
            int id = carros.size() + 1; // Gera um ID único
            Carro novoCarro = new Carro(id, cor, marca, modelo, preco, disponibilidade);
            carros.add(novoCarro);

            System.out.println("Carro cadastrado com ID: " + id);
        }
    }

    // Método para editar um carro
    public void editarCarro(Pessoa pessoa, int id, String cor, String marca, String modelo, double preco) {

        if (pessoa instanceof Administrador) {
            boolean carroEncontrado = false;

            for (Carro carro : carros) {
                if (carro.getId() == id) {
                    carro.setCor(cor);
                    carro.setMarca(marca);
                    carro.setModelo(modelo);
                    carro.setPreco(preco);

                    System.out.println("Carro atualizado com sucesso:");
                    System.out.println("- ID: " + id + ", Marca: " + marca +
                            ", Cor: " + cor + ", Preço: " + preco);

                    carroEncontrado = true;
                    break;
                }
            }

            if (!carroEncontrado) {
                System.out.println("Carro com ID \"" + id + "\" não encontrado.");
            }
        }
    }

    // Método para remover um carro
    public void removerCarro(Pessoa pessoa, int id) {

        if (pessoa instanceof Administrador) {

            boolean carroEncontrado = false;

            for (int i = 0; i < carros.size(); i++) {
                Carro carro = carros.get(i);

                if (carro.getId() == id) {
                    carros.remove(i);

                    System.out.println("Carro removido com sucesso: ID " + id + ", Modelo: " + carro.getModelo());
                    carroEncontrado = true;
                    break;
                }
            }

            if (!carroEncontrado) {
                System.out.println("Carro com ID " + id + " não encontrado.");
            }
        }
    }

    // Listar carros
    public void listarCarros() {
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
            return;
        }

        System.out.println("Carros cadastrados:");
        for (Carro carro : carros) {
            System.out.println("- ID: " + carro.getId() + ", Modelo: " + carro.getModelo() +
                    ", Marca: " + carro.getMarca() + ", Disponível: " + carro.isDisponibilidade());
        }
    }

    //Método para adicionar aluguel
    public void addAluguel(LocalDateTime dataInicio, LocalDateTime dataFim, double preco, boolean statusPagamento) {

        for (Reserva reserva : reservas) {
            if (reserva.isAtiva()) { // Verifica se a reserva está ativa
                Aluguel aluguel = new Aluguel(reserva.getIdReserva(), dataInicio, dataFim, preco, statusPagamento);
                alugueis.add(aluguel);
                System.out.println("Aluguel adicionado para a reserva ID: " + reserva.getIdReserva());
            }
        }
    }


    //Método para listar ativas
    public Reserva listarReservas() {

        System.out.println("Reservas ativas:");
        for (Reserva reserva : reservas) {
            if(reserva.isAtiva()){
                System.out.println(" "+ reserva.getIdReserva());
                return reserva;
            }
        }
        return null;
    }

    //Método pra buscar carros pelo id
    public Carro buscarCarroPorId(int id) {
        if (carros == null) {
            System.out.println("Lista de carros não inicializada.");
            return null;  // ou lançar uma exceção, se necessário
        }

        for (Carro carro : carros) {
            if (carro.getId() == id) {
                return carro;
            }
        }
        System.out.println("Carro com ID " + id + " não encontrado.");
        return null;  // ou lançar uma exceção, se necessário
    }

    //Método pra buscar reserva pelo id
    public Reserva buscarReservaPorId(int idReserva) {
        if (reservas == null) {
            System.out.println("Lista de reservas não inicializada.");
            return null;
        }

        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                return reserva;
            }
        }
        System.out.println("Carro com ID " + idReserva + " não encontrado.");
        return null;
    }

    public void cadastrarUsuario(Pessoa pessoa, String nome, String cpf, int idade, String email, String senha, Controlador controlador) {
        if (!pessoa.getCadastrado()) { // Verifica se a pessoa é um "Guest"
            Usuario novoUsuario = new Usuario(nome, cpf, idade, email, senha, controlador);
            novoUsuario.setCadastrado(true); // Define como "cadastrado"
            usuarios.add(novoUsuario);

            System.out.println("Usuário cadastrado com sucesso! Nome: " + novoUsuario.getNome());
        } else {
            System.out.println("Erro: Usuário já está cadastrado no sistema.");
        }
    }

    public void cadastrarAdministrador(String nome, String cpf, int idade, String email, String senha, Controlador controlador){
        Administrador admin = new Administrador(nome, cpf, idade, email, senha, controlador);
        administradores.add(admin);

        System.out.println("Administrador cadastrado com sucesso.");
    }


    public void adicionarReserva(Pessoa pessoa, int id, LocalDateTime dataInicio, LocalDateTime dataFim, double preco, boolean statusPagamento) {
        if(pessoa instanceof Usuario) {

            dataInicio = LocalDateTime.of(2025, 1, 20, 10, 0); // 20 de Janeiro de 2025, 10:00 AM
            dataFim = LocalDateTime.of(2025, 1, 22, 10, 0); // 22 de Janeiro de 2025, 10:00 AM

            int idReserva = reservas.size() + 1;

            long dias = Duration.between(dataInicio, dataFim).toDays();
            Carro carro = buscarCarroPorId(id);
            carro.setDisponibilidade(false);


            preco = carro.getPreco() * dias;
            Reserva reserva = new Reserva(idReserva, dataInicio, dataFim, preco, statusPagamento);

            reservas.add(reserva);


            System.out.println("Reserva adicionada com sucesso. ID: " + idReserva);
            System.out.println("Modelo do carro: " + carro.getModelo());
            System.out.println("Marca do carro: " + carro.getMarca());
            System.out.println("Cor do carro: " + carro.getCor());
            System.out.println("Preco: " + reserva.getPreco());
        }
    }
}