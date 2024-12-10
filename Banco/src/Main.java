public class Main {
    public static void main(String[] args) {
        // Criar uma nova conta
        Conta minhaConta = new Conta();

        // Definir o dono da conta
        minhaConta.setDonoConta("João");

        // Abrir a conta como Conta Corrente
        minhaConta.AbrirConta("CC");

        // Exibir o status da conta
        minhaConta.status();

        // Depositar dinheiro na conta
        minhaConta.depositar(200);

        // Exibir o status após o depósito
        minhaConta.status();

        // Fazer um saque de R$ 100
        minhaConta.saque(100);

        // Exibir o status após o saque
        minhaConta.status();

        // Pagar a mensalidade da conta
        minhaConta.PagarMensalidade();

        // Exibir o status após o pagamento da mensalidade
        minhaConta.status();

        // Tentar fechar a conta com saldo diferente de zero
        minhaConta.FecharConta();

        // Realizar um saque após tentar fechar a conta
        minhaConta.saque(50);

        // Fechar a conta (depois de zerar o saldo)
        minhaConta.setSaldo(0);  // Zera o saldo
        minhaConta.FecharConta();

        // Exibir o status após o fechamento da conta
        minhaConta.status();
    }
}
