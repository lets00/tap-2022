public class Loggi implements ServicoDeEntrega {
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 20;
        }
        return 40;
    }
}
