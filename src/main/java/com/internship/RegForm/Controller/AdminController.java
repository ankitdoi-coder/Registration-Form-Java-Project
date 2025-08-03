package com.internship.RegForm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.internship.RegForm.Model.Applicant;
import com.internship.RegForm.Services.ApplicantService;

@Controller
public class AdminController {

    @Autowired
    private ApplicantService service;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("applicant", new Applicant()); // lowercase 'applicant' used here
        return "home";
    }

    @PostMapping("/saveApplicant")
    public String saveApplicant(@ModelAttribute Applicant applicant) {
        service.save(applicant); // 👈 Save to DB
        return "redirect:/"; // 👈 Redirect to list page
    }

    

    @GetMapping("/admin")
    public String applicantList(Model model) {
        List<Applicant> applicants = service.getAllApplicants();

        System.out.println("📚 Total applicants fetched: " + applicants.size());
        for (Applicant a : applicants) {
            System.out.println("📷 Applicant Id: " + a.getId() + ", Name: " + a.getName());
        }

        model.addAttribute("applicants", applicants); // Thymeleaf will use ${applicants}
        return "admin";
    }
}
