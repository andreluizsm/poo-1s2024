package heranca.empresa;

import java.util.GregorianCalendar;

public class Gerente extends Funcionario{

    private String nome;
    private Integer telefone;
    private Integer cpf;
    private Double salario;
    private Integer quantidadeGerenciados;

    private Gerente(){}


    public Gerente(String nome, Integer telefone, Integer cpf, Double salario, Integer quantidadeGerenciados) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.salario = salario;
        this.quantidadeGerenciados = quantidadeGerenciados;
    }

    public Integer getQuantidadeGerenciados() {
        return this.quantidadeGerenciados;
    }

    public void setQuantidadeGerenciados(Integer quantidadeGerenciados) {
        this.quantidadeGerenciados = quantidadeGerenciados;
    }

    public Double getBonificacao(){
        return this.salario * 0.25;
    }
    


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", salario='" + getSalario() + "'" +
            ", quantidadeGerenciados='" + getQuantidadeGerenciados() + "'" +
            ", Bonificação='" + getBonificacao() + "'" +
            "}";
    }


}
