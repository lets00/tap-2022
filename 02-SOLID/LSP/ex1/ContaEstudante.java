public class ContaEstudante extends ContaComum {
    public void rende() {
        throw new ContaNaoRendeException();
    }
}
