public class Conta {
    //atributos
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldo;
    public boolean statusConta;

    public void status(){
        System.out.println("----------------------------------");
        System.out.println("Numero de Conta: " + getNumConta());
        System.out.println("Tipo Conta: " + getTipoConta());
        System.out.println("Dono de Conta: " + getDonoConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + isStatusConta());
        System.out.println("----------------------------------");
    }

// metodos especiais
    public Conta() {
        statusConta = false;
        saldo = 0;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    //metodos normais

    public void AbrirConta(String tipoConta) {
        this.setStatusConta(true);
        this.setTipoConta(tipoConta);
        if(getTipoConta().equals("CC")) {
            this.setSaldo(50);
        }
        else if(getTipoConta().equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");

    }
    public void FecharConta() {
        if(this.getSaldo() != 0) {
            System.out.println("Falha, verifique se sua conta está zerada ou se possui algum débito para pagar");

        }
        else {
            statusConta = false;
            System.out.println("Conta fechada com sucesso");
        }

    }
    public void depositar(float valor) {
        if(this.isStatusConta()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito efetuado com sucesso");
        }
        else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }

    }
    public void saque(float valor) {
        if(this.isStatusConta()) {
            if(this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque efetuado com sucesso");
            }
            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("Impossivel saque");
        }

    }
    public void PagarMensalidade() {
        int v = 0;
        if(this.getTipoConta().equals("CC")) {
            v = 12;
        }
        else if(this.getTipoConta().equals("CP")) {
            v = 20;
        }
        if(this.isStatusConta()) {
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso");
            }
            else{
                System.out.println("Saldo insuficiente");
            }
        }
        else{
            System.out.println("Impossivel pagar mensalidade");
        }
    }
}

