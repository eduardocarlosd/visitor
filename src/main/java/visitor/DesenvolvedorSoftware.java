package visitor;

public class DesenvolvedorSoftware implements Funcionario {

    private String nome;
    private String principalLinguagemFrontEnd;
    private String principalLinguagemBackEnd;

    public DesenvolvedorSoftware(String nome, String principalLinguagemFrontEnd, String principalLinguagemBackEnd) {
        this.nome = nome;
        this.principalLinguagemFrontEnd = principalLinguagemFrontEnd;
        this.principalLinguagemBackEnd = principalLinguagemBackEnd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnologiasFrontEnd() {
        return principalLinguagemFrontEnd;
    }

    public void setTecnologiasFrontEnd(String principalLinguagemFrontEnd) {
        this.principalLinguagemFrontEnd = principalLinguagemFrontEnd;
    }

    public String getTecnologiasBackEnd() {
        return principalLinguagemBackEnd;
    }

    public void setTecnologiasBackEnd(String principalLinguagemBackEnd) {
        this.principalLinguagemBackEnd = principalLinguagemBackEnd;
    }


    public String aceitar(Visitor visitor){ return visitor.exibirRelatorioDesenvolvimento(this);}
}
