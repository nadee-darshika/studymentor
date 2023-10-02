package com.studymentor.studymentor.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true,nullable = false)
    private String email;

    private String phoneNumber;

    private String address;

    private Date birthDate;

    private String userRole;


    @ManyToMany
    @JoinTable(
            name="student_course",
            joinColumns = @JoinColumn(name="student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;


    //Constructor
    public Student(){

    }

    public Student(String name,String email){
        this.name = name;
        this.email=email;
    }

    //Getters and Setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setUserRole(String userRole) {this.userRole=userRole;}
    public String getUserRole(String userRole) {return userRole;}

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public List<Course> getCourses(){
        return courses;
    }

    public void setCourses(List<Course> courses){
        this.courses = courses;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
