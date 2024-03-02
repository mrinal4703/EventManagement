package com.example.eventmanagement.Faculty;
import jakarta.persistence.*;

@Entity
@Table(name="faculty")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Faculty(Integer id, String name, String email, Long phone_no, String designation, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone_no = phone_no;
        this.designation = designation;
        this.department = department;
    }

    private String name;
    private String email;
    private Long phone_no;
    private String designation;
    private String department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(Long phone_no) {
        this.phone_no = phone_no;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Faculty() {
    }
}
