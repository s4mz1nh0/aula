public class Conta {
    
    //Criando os atributos
    double saldo;
    String numero;
    String titular;
    String agencia;
    
    void depositar(double valor){
        this.saldo += valor;
    }
    
    
    boolean sacar(double valor){
        
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        
        return false;
    }
boolean transferir(double valor,Conta destino){
if(this.sacar(valor)){
    destino.depositar(valor);
return true;
}
return false;
}
} 
