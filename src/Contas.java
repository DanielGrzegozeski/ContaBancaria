public class Contas {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca("Daniel", 00212576, 1284, 30);

        ContaEspecial contaEspecial = new ContaEspecial("Jorge", 1556554, 3000, 1000);

        float valorSaquePoupanca = 455;
        contaPoupanca.saque(valorSaquePoupanca);

        float valorSaqueEspecial = 1500;
        contaEspecial.saque(valorSaqueEspecial);

        float valorDepositoPoupanca = 200;
        contaPoupanca.deposito(valorDepositoPoupanca);

        float valorDepositoEspecial = 1000;
        contaEspecial.deposito(valorDepositoEspecial);


        System.out.println("Dados Conta Poupança:");
        System.out.println("Cliente: " + contaPoupanca.getCliente());
        System.out.println("Nº Conta: " + contaPoupanca.getNumConta());
        System.out.println("Saldo: " + contaPoupanca.getSaldo());
        System.out.println("Tempo de Rendimento: " + contaPoupanca.gettempoDeRenda());

        System.out.println();

        System.out.println("Dados Conta Especial:");
        System.out.println("Cliente: " + contaEspecial.getCliente());
        System.out.println("Nº Conta: " + contaEspecial.getNumConta());
        System.out.println("Saldo: " + contaEspecial.getSaldo());
        System.out.println("Limite: " + contaEspecial.getLimite());
    }
}