/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.ClassRelationship.UniversityProgram;

/**
 *
 * @author maumneto
 */
public class UniversityProgram {
    public static void main(String[] args) {
        University unichristus = new University("Unichristus", "Centro Universitário Christus");
        
        Course ads = new Course("ADS", 123, unichristus);
        Course si = new Course("SI", 124, unichristus);
        
        unichristus.addCourse(si);
        unichristus.addCourse(ads);
        
        Student mauricio = new Student("Mauricio", "Bla bla", ads);
        Student rafael = new Student("Rafael", "Bla bla", ads);
        Student joao = new Student("Joao", "Bla bla", si);
        Student lima = new Student("Lima", "Bla bla", si);
        
        ads.addStudent(mauricio);
        ads.addStudent(rafael);
        si.addStudent(joao);
        si.addStudent(lima);
        
        System.out.println("Total de Estudantes na Universidade " + unichristus.getNameUniversity() + ": " + unichristus.getTotalStudentsUniversity());
        
    }
}
