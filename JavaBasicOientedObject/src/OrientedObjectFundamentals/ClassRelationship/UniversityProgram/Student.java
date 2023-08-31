/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.ClassRelationship.UniversityProgram;

/**
 *
 * @author maumneto
 */
public class Student {
    public String studentName;
    public String enrollment;
    public Course course;
    
    public Student(String studentName, String enrollment, Course course) {
        this.studentName = studentName;
        this.enrollment = enrollment;
        this.course = course;
    }
}
