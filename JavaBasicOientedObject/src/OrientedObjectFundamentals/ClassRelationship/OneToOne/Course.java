/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.ClassRelationship.OneToOne;

/**
 *
 * @author maumneto
 */
public class Course {
    public String course_name;
    public int id_course;
    public Professor professor;
    
    public Course(String course_name, int id_course) {
        this.course_name = course_name;
        this.id_course = id_course;
    }
    
    public String getCourseName() {
        return course_name;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String getProfessorName() {
        return professor.name;
    }
}
