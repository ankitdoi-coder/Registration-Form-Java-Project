package com.internship.RegForm.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.RegForm.Model.Applicant;
import com.internship.RegForm.Repository.ApplicantRepository;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    private ApplicantRepository repo;

    @Override
    public List<Applicant> getAllApplicants() {
        return repo.findAll();
    }
     @Override
    public void save(Applicant applicant) {
        repo.save(applicant);
    }
}
