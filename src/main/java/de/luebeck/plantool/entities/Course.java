package de.luebeck.plantool.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Es muss ein Name angegeben werden!")
    private String name;

    private String department;
    private String degree;
    private int no_semester;
    private String starting_semester;
    private String attendance_type;
    private boolean nc;

    public Course() {
    }

    public Course(@NotBlank(message = "Es muss ein Name angegeben werden!") String name) {
        this.name = name;
    }

    // ------------------------------------------------------------------------------------------------------
    //GETTER AND SETTERS
    public void setId(long id) {
        this.id = id;
    }

    @Id
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getNo_semester() {
        return no_semester;
    }

    public void setNo_semester(int no_semester) {
        this.no_semester = no_semester;
    }

    public String getStarting_semester() {
        return starting_semester;
    }

    public void setStarting_semester(String starting_semester) {
        this.starting_semester = starting_semester;
    }

    public String getAttendance_type() {
        return attendance_type;
    }

    public void setAttendance_type(String attendance_type) {
        this.attendance_type = attendance_type;
    }

    public boolean isNc() {
        return nc;
    }

    public void setNc(boolean nc) {
        this.nc = nc;
    }
}
