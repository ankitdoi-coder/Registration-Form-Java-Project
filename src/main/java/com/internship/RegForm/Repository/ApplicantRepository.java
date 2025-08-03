package com.internship.RegForm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.internship.RegForm.Model.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {
}
