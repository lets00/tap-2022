public class Calculadora {
    public static void main(String args[]) {
        Compra iphone = new Compra("iphone", 2999.99, "SAO PAULO");
        CalculadoraDePrecos cp = new CalculadoraDePrecos();
        double iphoneComDesconto = cp.calcula(iphone);
        System.out.println("Preço do Iphone:" + iphone.getValor() );
        System.out.println("Preço do Iphone com desconto:" +  
        iphoneComDesconto);
    }
}
