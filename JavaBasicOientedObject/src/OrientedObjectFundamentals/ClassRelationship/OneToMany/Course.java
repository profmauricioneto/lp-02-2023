/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.ClassRelationship.OneToMany;

/**
 *
 * @author maumneto
 */
public class Course {
    public String course_name;
    public int id_course;
    public Professor professor;
    
    public Course(String course_name, int id_course, Professor professor) {
        this.course_name = course_name;
        this.id_course = id_course;
        this.professor = professor;
    }
    
    public String getCourseName() {
        return course_name;
    }
    
    public int getIdCourse() {
        return id_course;
    }
}
