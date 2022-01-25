package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.service.ClassroomService;
import edu.mum.cs.cs425.studentmgmt.service.StudentService;
import edu.mum.cs.cs425.studentmgmt.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentMgmtAppApplication implements CommandLineRunner {

	private StudentService studentService;
	private TranscriptService transcriptService;
	@Autowired
	private ClassroomService classroomService;
    @Autowired
	public StudentMgmtAppApplication(StudentService studentService, TranscriptService transcriptService) {
		this.studentService = studentService;
		this.transcriptService = transcriptService;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentMgmtAppApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		Transcript t=new Transcript("ComPro");
		Transcript t1=new Transcript("MSC Computer Science");
         transcriptService.save(t);
		Classroom c1=new Classroom("McLaughlin building","M105");
		classroomService.save(c1);


     	Student student1=new Student("000-61-0001","Abdessamad","","Jadid",4, LocalDate.of(2019,5,24),t,c1);
    	studentService.saveStudent(student1);
		System.out.println("See you!!");
	}
}
