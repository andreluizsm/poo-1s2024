package banco;

import java.util.ArrayList;

import banco.exceptions.ContaInexistenteExceptions;
import banco.exceptions.valorDepositoExceptions;

public class Banco {
    
    private ArrayList<ContaCorrente> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void abrirConta(String nomeConta){
        ContaCorrente conta = new ContaCorrente(nomeConta);
        this.contas.add(conta);
    }

    public void depositar(String nomeConta, Double valor) throws Exception{
       
        if(valor <= 0){
            throw new valorDepositoExceptions();
        }
       
        ContaCorrente contaDeposito = null;
        for (ContaCorrente conta : contas) {
            if(conta.getNomeConta().equals(nomeConta)){
                contaDeposito = conta;
                conta.setSaldo(conta.getSaldo() + valor);
            }            
        }
        if (contaDeposito == null) {
            throw new ContaInexistenteExceptions();
        }
    }


}
