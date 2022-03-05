package de.luebeck.plantool.controllers;

import de.luebeck.plantool.entities.Course;
import de.luebeck.plantool.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("/createcourse")
    public String showCreateCourseForm(Course course){
        return "add-course";
    }

    @GetMapping("/courses")
    public String showCourseList(Model model){
        model.addAttribute("courses", courseRepository.findAll());
        return "add-course";
    }
    public String goToCreateCourse(Course course, BindingResult result, Model model){
        if(result.hasErrors()){
            return "createCourse";
        }
        courseRepository.save(course);
        return "redirect:/create";
    }
}
