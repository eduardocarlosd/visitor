package visitor;


public class TraineeQualityAssurance implements Funcionario {

    private String nome;
    private String ferramentas;
    private String tiposTeste;

    public TraineeQualityAssurance(String nome, String ferramentas, String tiposTeste) {
        this.nome = nome;
        this.ferramentas = ferramentas;
        this.tiposTeste = tiposTeste;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(String ferramentas) {
        this.ferramentas = ferramentas;
    }

    public String getTiposTeste() {
        return tiposTeste;
    }

    public void setTiposTeste(String tiposTeste) {
        this.tiposTeste = tiposTeste;
    }

    public String aceitar(Visitor visitor){return visitor.exibirRelatorioQA(this);}
}
