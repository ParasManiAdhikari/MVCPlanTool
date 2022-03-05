package de.luebeck.plantool.controllers;

import de.luebeck.plantool.entities.Module;
import de.luebeck.plantool.repositories.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.time.LocalDateTime;

@Controller
public class ModuleController {

    private final ModuleRepository moduleRepository;

    @Autowired
    public ModuleController(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    @GetMapping("/createmodule")
    public String showCreateModuleForm(Module module){
        return "add-module";
    }

    @GetMapping("/modules")
    public String showModuleList(Model model) {
        model.addAttribute("modules", moduleRepository.findAll());
        return "modules";
    }

    @PostMapping("/modules/addmodule")
    public String createModule(@Valid Module module, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-module";
        }

        moduleRepository.save(module);
        return "redirect:/modules";
    }
    /*
    public Module createModule(String name, int number, String instructorName, String classroom, LocalDateTime periodStart,
                               LocalDateTime periodEnd, int courseId, int semester, String type, float credits, String departments, String degree_course, boolean status) {
        Module module = new Module();
        module.setName(name);
        module.setNumber(number);
        module.setClassroom(classroom);
        module.setPeriodStart(periodStart);
        module.setPeriodEnd(periodEnd);
        module.setCourseId(courseId);
        module.setSemester(semester);
        module.setType(type);
        module.setCredits(credits);
        module.setDepartment(departments);
        module.setDegreeCourse(degree_course);
        module.setStatus(status);
        return null;
    }*/

    public boolean delete(long module_id) {
        moduleRepository.findById(module_id);
        return false;
    }

    public void updateModule(long id,String name, int number, String instructorName, String classroom, LocalDateTime periodStart,
                             LocalDateTime periodEnd, int semester, String type, float credits, String departments, String degree_course, boolean status) {
        Module module = new Module();
        module.setName(name);
        module.setNumber(number);
        module.setClassroom(classroom);
        module.setPeriodStart(periodStart);
        module.setPeriodEnd(periodEnd);
        module.setSemester(semester);
        module.setType(type);
        module.setCredits(credits);
        module.setDepartment(departments);
        module.setDegree_course(degree_course);
        module.setStatus(status);
    }
}
