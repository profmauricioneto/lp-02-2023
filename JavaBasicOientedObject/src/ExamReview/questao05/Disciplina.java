
package ExamReview.questao05;

/**
 *
 * @author maumneto
 */
public class Disciplina {
    public String nome_disciplina;
    public int codigo;
    public Professor professor;
    
    public Disciplina(String nome_disciplina, int codigo) {
        this.nome_disciplina = nome_disciplina;
        this.codigo = codigo;
    }
    
    public String getNomeDisciplina() {
        return nome_disciplina;
    }
    
    public void addProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String showProfessorNome() {
        return professor.nome_professor;
    }
}
