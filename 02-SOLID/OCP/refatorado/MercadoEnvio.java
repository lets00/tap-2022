public class MercadoEnvio implements ServicoDeEntrega{
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 10;
        }
        return 15;
    }
}
