public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;


    public Caneta(String m, String c, float p) {
        this.setmodelo(m);
        this.setCor(c);
        this.setponta(p);


    }

    public String getCor(){
        return cor;
    }
    public void setCor(String c){
        cor = c;
    }
    public String getmodelo(){
        return this.modelo;
    }
    public void setmodelo(String m){
        this.modelo = m;
    }

    public float getponta(){
        return this.ponta;
    }
    public void setponta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + getmodelo());
        System.out.println("Ponta: " + getponta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
