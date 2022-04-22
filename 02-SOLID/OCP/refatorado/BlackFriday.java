public class BlackFriday implements TabelaDePreco {
    @Override
    public double descontoPara(double valor) {
        if (valor > 1000) return 0.10;
        if (valor > 3000) return 0.05;
        return 0;
    }
}
