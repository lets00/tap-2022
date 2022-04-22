public class Calculadora {
    public static void main(String args[]) {
        Compra iphone = new Compra("iphone", 1000, "SAO PAULO");
        TabelaDePreco tabelaDePreco = new TabelaDePrecoPadrao();
        ServicoDeEntrega servicoDeEntrega = new Loggi();
        CalculadoraDePrecos cp = new CalculadoraDePrecos(tabelaDePreco,servicoDeEntrega);
        double iphoneComDesconto = cp.calcula(iphone);
        System.out.println("Preço do Iphone:" + iphone.getValor() );
        System.out.println("Preço do Iphone com desconto:" +  iphoneComDesconto);
    }
}
