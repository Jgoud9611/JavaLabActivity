package com.schoolmgnt.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolmgnt.dto.StudentDTO;
import com.schoolmgnt.dto.TeacherDTO;
import com.schoolmgnt.entity.Student;
import com.schoolmgnt.entity.Teacher;
import com.schoolmgnt.repositories.StudentRepository;
import com.schoolmgnt.repositories.TeacherReporsitory;
import com.schoolmgnt.service.TeacherService;

@Service
public class TeacherServiceImp implements TeacherService 
{
	@Autowired
	TeacherReporsitory teacherRepo;
	@Autowired
	StudentRepository studentRepo;
	
	
									//Inserting the Student Details in Student Table.
	@Override
	public Teacher insertData(TeacherDTO teacherDTO) 
	{
		//Teacher teach = new Teacher();
		//Student stud=new Student();
		
		Teacher teacher=Teacher.builder().teacherName(teacherDTO.getTeacherName())
										 .Email(teacherDTO.getEmail())
										 .phoneNumber(teacherDTO.getPhoneNumber())
										 .subject(teacherDTO.getSubject())
										 .address(teacherDTO.getAddress())
										 .student(teacherDTO.getStudent())
										 //.student(teach.getStudent())
										 .build();
		
//		Integer studentId = stud.getStudentId();
//		Student student=studentRepo.findById(studentId).get();
//						teacher.setStudent(student);
		 			
		return  teacherRepo.save(teacher);
	}
	

									//Retrieve the Student Details by given StudentID.
	@Override
	public Teacher getDetailsById(int teacherId)
	{
		return teacherRepo.findById(teacherId).get();
	}

	
									//Delete the Teacher Details By given ID
	@Override
	public Teacher deleteTeacherDetails(int teacherId)
	{
		teacherRepo.deleteById(teacherId);
		return null;
		
		
	}
									//Update the Teacher Details by given ID.
	@Override
	public Teacher updateTeacherDetails(Teacher params, int teacherId) 
	{
		Teacher teach=teacherRepo.findById(teacherId).get();
				teach.setTeacherName  (params.getTeacherName());
				teach.setPhoneNumber  (params.getPhoneNumber());
				teach.setSubject	  (params.getSubject());
				teach.setEmail 		  (params.getEmail());
				teach.setAddress	  (params.getAddress());
		
		return teacherRepo.save(teach);
	}

}
