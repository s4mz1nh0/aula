
public class TestaConta {

    public static void main(String[] args) {

        //Criando um objeto
        Conta c1 = new Conta();
        c1.saldo = 9999;
        c1.titular = "Lara Caroline";
        c1.agencia = "1264";
        c1.numero = "5432";
        
        System.out.println("Saldo de c1: " + c1.saldo );
        
        Conta c2 = new Conta();
        c2.saldo = 500;
        c2.titular = "Luciano Souza";
        c2.agencia = "007";
        c2.numero = "999";
        
    }

}
