public class Main {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca("Daniel", 00212576, 1284, 30);
        poupanca.novoSaldo(0.05f);

        ContaEspecial especial = new ContaEspecial("LuMolusco", 131313, 3000, 1000);
        especial.saldoLimite();
    }
}