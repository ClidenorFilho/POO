public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Caneta c1 = new Caneta("Bic Cristal", "Vermelha", 1.5f);
        c1.setmodelo("BIC CRISTAL");
        c1.setponta(0.5f);
        c1.status();
    }
}