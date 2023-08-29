/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.ClassRelationship.ManyToMany;

/**
 *
 * @author maumneto
 */
public class TestMain {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio", 01);
        Professor tiago = new Professor("Tiago", 02);
        Professor euristenho = new Professor("Euristenho", 03);
        
        Course poo = new Course("POO", 123);
        Course apis = new Course("APIS", 321);
        
        poo.addProfessor(euristenho);
        poo.addProfessor(mauricio);
        mauricio.addCourse(poo);
        euristenho.addCourse(poo);
        
        apis.addProfessor(euristenho);
        apis.addProfessor(tiago);
        euristenho.addCourse(apis);
        tiago.addCourse(apis);
        
        System.out.println("Disciplinas Mauricio");
        mauricio.showCoursesName();
        System.out.println("Disciplinas Tiago");
        tiago.showCoursesName();
        System.out.println("Disciplinas Euristenho");
        euristenho.showCoursesName();
        


    }
}
