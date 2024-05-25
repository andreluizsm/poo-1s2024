package banco.exceptions;

public class valorDepositoExceptions extends Exception{
    
    public valorDepositoExceptions(){
        super("Valor do deposito invalido. Informe um número positivo.");
    }

}
