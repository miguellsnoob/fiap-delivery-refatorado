public class Principal {
    public static void main(String[] args) {

        Veiculo caminhao = new Caminhao("ABC1234", 500.0, 6);

        Pacote pacote = new Pacote("BR999", 10.5);

        Rota rota = new Rota(pacote, caminhao);
        rota.iniciarEntrega();

        Veiculo moto = new Moto("XYZ9999", 50.0, true);
        Rota rota2 = new Rota(pacote, moto);
        rota2.iniciarEntrega();
    }
}