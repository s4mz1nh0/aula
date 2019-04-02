
public class TestaPessoa {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        p.peso = 50;
        p.altura = 175;
        
        double i = p.imc();
        
        System.out.println("IMC: " + i);
        
    }

}
