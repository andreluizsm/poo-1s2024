package heranca.empresa;

public class Engenheiro {
    
    private String nome;
    private Integer cpf;
    private Integer telefone;
    private String crea;
    private String projeto;
    private Double salario;

    private Engenheiro(){}

    public Engenheiro(String nome, Integer cpf, Integer telefone, String crea, String projeto, Double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.crea = crea;
        this.projeto = projeto;
        this.salario = salario;
    }
    

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getCrea() {
        return this.crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getProjeto() {
        return this.projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getBonificacao(){
        return this.salario * 0.15;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", crea='" + getCrea() + "'" +
            ", projeto='" + getProjeto() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao() + "'" +
            "}";
    }

}
