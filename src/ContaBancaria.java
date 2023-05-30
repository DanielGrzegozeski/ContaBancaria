public class ContaBancaria {
    public String cliente;
    public int numeroConta;
    public float saldo;

    public ContaBancaria(String cliente, int numeroConta, float saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void saque(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso R$" + valor);
        }
    }
    public void deposito(float valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso R$" +valor);
    }

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public int getNumConta() {
        return numeroConta;
    }
    public void setNumConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}