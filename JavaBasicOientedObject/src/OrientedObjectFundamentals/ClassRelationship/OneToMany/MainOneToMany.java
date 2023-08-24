/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.ClassRelationship.OneToMany;

/**
 *
 * @author maumneto
 */
public class MainOneToMany {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio Neto", 123);
        
        Course oop = new Course("Oriented Object Programming", 01, mauricio);
        Course pl1 = new Course("Programming Languages 1", 02, mauricio);
        Course lm1 = new Course("Logic Mathematic 1", 03, mauricio);
        
        mauricio.addCourse(oop);
        mauricio.addCourse(pl1);
        mauricio.addCourse(lm1);
        
        mauricio.getAllCoursesName();
    }
}
