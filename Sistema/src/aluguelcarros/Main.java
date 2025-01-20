package aluguelcarros;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {



        Controlador c = new Controlador();
        Pessoa guest = new Pessoa(null, null, 0, null, null);

        Usuario u = new Usuario("JOnas 2", "45323", 32, "jonas2@gmail.com", "432424", c);
        Administrador admin1 = new Administrador("Jonas", "3453453467", 29, "jonas@gmail.com", "345345435", c);
        admin1.cadastrarCarroComoAdmin(admin1, "Vermelho", "Chevrolet" , "Prisma", 60, true);
        admin1.cadastrarCarroComoAdmin(admin1, "Branco", "Chevrolet" , "Prisma", 60.000, true);
        admin1.removerCarroComoAdmin(admin1, 2);


        c.cadastrarUsuario(guest, "Tigas da Silva", "234234", 23, "tigasdasilva@gmail.com", "3932939", c);

        int idBuscado = 1; 
        Carro carroSelecionado = c.buscarCarroPorId(idBuscado);
        System.out.println(carroSelecionado.getCor());

        u.realizarReservaUser(u, 1, LocalDateTime.now(), LocalDateTime.now(), 40, true);






    }
}

