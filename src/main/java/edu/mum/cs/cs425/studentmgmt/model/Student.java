package edu.mum.cs.cs425.studentmgmt.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String studentNumber;
    @Column(nullable = false)
    private String firstName;
    private String middleName;
    @Column(nullable = false)
    private String lastName;
    private double cgpa;
    private LocalDate dateOfEnrollement;

    @OneToOne

    private Transcript transcipt;
    @OneToOne
    private Classroom classroom;

    public Student(String studentNumber,String firstName,String middleName,String lastName,double cgpa, LocalDate dateOfEnrollement,Transcript transcipt,Classroom classroom){
        this.studentNumber=studentNumber;
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.cgpa=cgpa;
        this.dateOfEnrollement=dateOfEnrollement;
        this.transcipt=transcipt;
        this.classroom=classroom;

    }

}
