public class ContaPoupanca extends ContaBancaria {
    private int tempoDeRenda;

    public ContaPoupanca(String cliente, int num_conta, float saldo, int tempoDeRenda) {
        super(cliente, num_conta, saldo);
        this.tempoDeRenda = tempoDeRenda;
    }

    public int gettempoDeRenda() {
        return tempoDeRenda;
    }

    public void novoSaldo(float taxaRendimento) {
        float rendimento = saldo * taxaRendimento * tempoDeRenda / 365;
        saldo += rendimento;
        System.out.println("Novo saldo da conta poupança: " + saldo);
    }
}