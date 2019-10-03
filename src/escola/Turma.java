
package escola;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    
    private String nomeTurma;
    private List<Alunos> Array= new ArrayList<>();

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public List<Alunos> getArray() {
        return Array;
    }

    public void setArray(List<Alunos> Array) {
        this.Array = Array;
    }
    
    public void exibirAlunos(){
        
    }
    
    
}
