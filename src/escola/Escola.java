
package escola;
import java.util.ArrayList;
import java.util.List;

public class Escola {
    
    private String Nome;
    private List<Turma> Array= new ArrayList<Turma>();

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public List<Turma> getArray() {
        return Array;
    }

    public void setArray(List<Turma> Array) {
        this.Array = Array;
    }
    
    public void exibirTurma(){
        
    }
    
}
