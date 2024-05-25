package banco;

import banco.exceptions.ContaInexistenteExceptions;
import banco.exceptions.valorDepositoExceptions;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Banco UCBank = new Banco();

        UCBank.abrirConta("conta 1");
        try {
            UCBank.depositar("conta 2", 10.0);
        } 
        catch (ContaInexistenteExceptions e) {
            System.out.println(e);
        }
        catch(valorDepositoExceptions e ) {
            System.out.println(e);
        }
        catch(Exception e) {
            System.out.println("Algo deu errado. Tente novamente.");
        }
        
    }
}
