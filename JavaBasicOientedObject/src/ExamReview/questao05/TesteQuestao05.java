package ExamReview.questao05;

/**
 *
 * @author maumneto
 */
public class TesteQuestao05 {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio Neto", 01);
        Disciplina poo = new Disciplina("Programação OO", 101);
        
        poo.addProfessor(mauricio);
        System.out.println("A disciplina "+ poo.getNomeDisciplina() + " tem como professor " + poo.showProfessorNome());
    }
}
