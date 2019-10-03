
package escola;


public class Alunos {
    private int codAluno;
    private String Nome;
    private int Nota1;
    private int Nota2;
    private int Nota3;
    private int Nota4;

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNota1() {
        return Nota1;
    }

    public void setNota1(int Nota1) {
        this.Nota1 = Nota1;
    }

    public int getNota2() {
        return Nota2;
    }

    public void setNota2(int Nota2) {
        this.Nota2 = Nota2;
    }

    public int getNota3() {
        return Nota3;
    }

    public void setNota3(int Nota3) {
        this.Nota3 = Nota3;
    }

    public int getNota4() {
        return Nota4;
    }

    public void setNota4(int Nota4) {
        this.Nota4 = Nota4;
    }
    
    private String exibirSituaçao(String exibirSituaçao){
      int NotaFinal;
      
      NotaFinal = (this.Nota1+this.Nota2+this.Nota3+this.Nota4)/4;
    
       if(NotaFinal >=5){
           return(" Sua Nota Foi: "+NotaFinal+". Aluno Aprovado");
       }
      else{
           return(" Sua Nota Foi: "+NotaFinal+"Aluno Reprovado");
       }
    }
}
