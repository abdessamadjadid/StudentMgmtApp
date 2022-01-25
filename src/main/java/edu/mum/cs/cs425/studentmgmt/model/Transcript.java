package edu.mum.cs.cs425.studentmgmt.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Transcript {
    @Id
    @GeneratedValue
    private Integer id;
    private String degreeTitle;



    public Transcript(String degreeTitle){

        this.degreeTitle=degreeTitle;
    }

}
