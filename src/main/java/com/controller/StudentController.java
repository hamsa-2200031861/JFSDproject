package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.model.Student;
import com.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public String registerStudent(@ModelAttribute Student student) {
        studentService.registerStudent(student);
        return "redirect:/login"; // Redirect to login after registration
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Student student) {
        Student existingStudent = studentService.findStudentByEmail(student.getEmail());
        if (existingStudent != null && existingStudent.getPassword().equals(student.getPassword())) {
            return "redirect:/"; // Redirect to home if login is successful
        }
        return "redirect:/login"; // Redirect back to login on failure
    }
}
