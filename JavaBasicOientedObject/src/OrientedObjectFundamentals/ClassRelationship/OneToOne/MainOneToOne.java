/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.ClassRelationship.OneToOne;

/**
 *
 * @author maumneto
 */
public class MainOneToOne {
    public static void main(String[] args) {
        Course oop = new Course("Oriented Object Programming", 01);
        Professor mauricio = new Professor("Maurício Neto", 123, oop);
        oop.setProfessor(mauricio);
        System.out.println("A disciplina " + oop.getCourseName() + " possui como docente o professor " + oop.getProfessorName());
    }
}
