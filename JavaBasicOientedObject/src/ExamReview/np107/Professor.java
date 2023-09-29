/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamReview.np107;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Professor {
    public String nomeProfessor;
    public int id;
    public List<Disciplina> disciplinas;
    
    public Professor(String nomeProfessor, int id) {
        this.nomeProfessor = nomeProfessor;
        this.id = id;
        disciplinas = new ArrayList<>();
    }
    
    public void addDisciplina(Disciplina d) {
        disciplinas.add(d);
    }
    
    public void mostrarNomeDisciplinas() {
        for(Disciplina d: disciplinas) {
            System.out.println(d.nomeDisciplina);
        }
    }
}
