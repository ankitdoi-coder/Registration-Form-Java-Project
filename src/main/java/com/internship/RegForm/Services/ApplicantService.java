package com.internship.RegForm.Services;

import java.util.List;
import com.internship.RegForm.Model.Applicant;

public interface ApplicantService {
    List<Applicant> getAllApplicants();
    void save(Applicant applicant); 
}
