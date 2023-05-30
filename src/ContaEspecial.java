public class ContaEspecial extends ContaBancaria {
    public float limite;
    public ContaEspecial(String cliente, int numeroConta, float saldo, float limite) {
        super(cliente, numeroConta, saldo);
        this.limite = limite;
    }
    public float getLimite() {
        return limite;
    }
    public void saldoLimite() {
        System.out.println("Seu saldo é de: " + saldo);
        System.out.println("Seu limite é de: " + limite);
    }
}