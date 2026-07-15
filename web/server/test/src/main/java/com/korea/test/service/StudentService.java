package com.korea.test.service;

import org.springframework.stereotype.Service;

import com.korea.test.dto.StudentDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    
    // 요청하신 변수명과 선언 형식 반영
    List<StudentDTO> list = new ArrayList<>();
    
    private Integer sequence = 1;
    
    public StudentService() {
        // 빌더 패턴을 이용한 기본 수강생 두 명 저장
        list.add(
            StudentDTO.builder()
                .id(1)
                .name("홍길동")
                .course("Java 웹 개발")
                .email("hong@gmail.com")
                .build()
        );
        
        list.add(
            StudentDTO.builder()
                .id(2)
                .name("이순신")
                .course("Python AI")
                .email("lee@gmail.com")
                .build()
        );
    }

    public List<StudentDTO> getStudents() {
        return list;
    }

    public StudentDTO addStudent(StudentDTO studentDTO) {
		StudentDTO newStudent = StudentDTO.builder()
									.id(sequence++)
									.name(studentDTO.getName())
									.course(studentDTO.getCourse())
									.email(studentDTO.getEmail())
									.build();
		list.add(newStudent);
		
		return newStudent;
	}
}
