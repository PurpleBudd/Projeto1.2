
package escola;


public class Principal {

    public static void main(String[] args) {
    Escola e = new Escola();
    
    e.setNome("Escola do Gordolfo");
    
    Turma t1 = new Turma();
    Turma t2 = new Turma();
    
    t1.setNomeTurma("Candidos");
    t2.setNomeTurma("Criolus");
    
    Alunos a1 = new Alunos();
    Alunos a2 = new Alunos();
    Alunos a3 = new Alunos();
    Alunos a4 = new Alunos();
    Alunos a5 = new Alunos();
    
    a1.setCodAluno(1);
    a1.setNome("vanderlei");
   
    a2.setCodAluno(2);
    a2.setNome("Lula");
    
    a3.setCodAluno(3);
    a3.setNome("Adamastor");
    
    a4.setCodAluno(4);
    a4.setNome("Silvio");
    
    a5.setCodAluno(5);
    a5.setNome("Airton");
    
        System.out.println("COD ALUNO: "+a1.getCodAluno());
        System.out.println("Nome Aluno: "+a1.getNome());
        System.out.println("Nota Aluno: 4 reprovado");
        System.out.println(" ");
        System.out.println("COD ALUNO: "+a2.getCodAluno());
        System.out.println("Nome Aluno: "+a2.getNome());
        System.out.println("Nota Aluno: 5 Aptovado");
        System.out.println(" ");
        System.out.println("COD ALUNO: "+a3.getCodAluno());
        System.out.println("Nome Aluno: "+a3.getNome());
        System.out.println("Nota Aluno: 3 reprovado");
        System.out.println(" ");
        System.out.println("COD ALUNO: "+a4.getCodAluno());
        System.out.println("Nome Aluno: "+a4.getNome());
        System.out.println("Nota Aluno: 9 aprovado");
        System.out.println(" ");
        System.out.println("COD ALUNO: "+a5.getCodAluno());
        System.out.println("Nome Aluno: "+a5.getNome());
        System.out.println("Nota Aluno: 1 reprovado com sucesso");
        
  
    }
    
}
