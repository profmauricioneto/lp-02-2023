/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.ClassRelationship.OneToMany;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author maumneto
 */
public class Professor {
    public String name;
    public int id_professor;
    public List<Course> courses;
    
    public Professor(String name, int id_professor) {
        this.name = name;
        this.id_professor = id_professor;
        courses = new ArrayList<>();
    }
    
    public String getProfessorName() {
        return name;
    }
    
    public int getProfessorId() {
        return id_professor;
    }
    
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    
    public void getAllCoursesName() {
        System.out.println("Courses Name: ");
        for(Course c: courses) {
            System.out.println(c.getCourseName());
        }
    }
}
