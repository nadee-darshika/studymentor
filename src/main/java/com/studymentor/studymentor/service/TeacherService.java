package com.studymentor.studymentor.service;

import com.studymentor.studymentor.entity.Teacher;
import com.studymentor.studymentor.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;


    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacherById(Long id){
        return teacherRepository.findById(id);
    }

    public Teacher addTeacher(Teacher teacher){

        return teacherRepository.save(teacher);
    }

    public Teacher updateTeacher(Long id, Teacher teacher){
        if(teacherRepository.existsById(id)){
            teacher.setId(id);
            return teacherRepository.save(teacher);
        }
        else{
            return null;
        }
    }

    public void deleteTeacher(Long id){
        teacherRepository.deleteById(id);
    }
}
