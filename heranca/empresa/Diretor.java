package heranca.empresa;

public class Diretor extends Funcionario{
    
    private String nome;
    private Integer cpf;
    private Integer telefone;
    private Double salario;
    private Integer quantidadeGerenciado;

    private Diretor (){}

    public Diretor(String nome, Integer cpf, Integer telefone, Double salario, Integer quantidadeGerenciado) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.quantidadeGerenciado = quantidadeGerenciado;
    }


    public Integer getQuantidadeGerenciado() {
        return this.quantidadeGerenciado;
    }

    public void setQuantidadeGerenciado(Integer quantidadeGerenciado) {
        this.quantidadeGerenciado = quantidadeGerenciado;
    }


    public Double getBonificacao(){
        return this.salario * 0.35;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", salario='" + getSalario() + "'" +
            ", quantidadeGerenciado='" + getQuantidadeGerenciado() + "'" +
            ", Bonificação='" + getBonificacao() + "'" +
            "}";
    }

}
