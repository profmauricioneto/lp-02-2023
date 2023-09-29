/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamReview.np107;

/**
 *
 * @author maumneto
 */
public class Disciplina {
    public String nomeDisciplina;
    public int codigo;
    public Professor professor;
    
    public Disciplina(String nomeDisciplina, int codigo) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
    }
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    
    public void addProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String getNomeProfessor() {
        return professor.nomeProfessor;
    }
}
