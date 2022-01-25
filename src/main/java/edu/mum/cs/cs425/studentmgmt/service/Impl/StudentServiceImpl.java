package edu.mum.cs.cs425.studentmgmt.service.Impl;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.studentmgmt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
@Autowired
    private StudentRepository studentRepository;

//    public StudentServiceImpl(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student) ;
    }
}
