public class Caminhao extends Veiculo {
    private int numeroEixos;

    public Caminhao(String placa, double capacidade, int numeroEixos) {
        super(placa, capacidade);
        this.numeroEixos = numeroEixos;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }
}