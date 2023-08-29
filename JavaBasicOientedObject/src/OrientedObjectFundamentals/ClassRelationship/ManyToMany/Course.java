/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.ClassRelationship.ManyToMany;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Course {
    public String name;
    public int id_course;
    public List<Professor> professors;
    
    public Course(String name, int id_course) {
        this.name = name;
        this.id_course = id_course;
        this.professors = new ArrayList<>();
    }
    
    public int getCourseId() {
        return id_course;
    }
    
    public String getCourseName() {
        return name;
    }
    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }
    public void showProfessorsName() {
        for(Professor p: professors) {
            System.out.println(p.getProfessorName());
        }
    }
}
