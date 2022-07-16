package net.akzam.CrmHospitalSystem.repositories;

import net.akzam.CrmHospitalSystem.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsRepository extends JpaRepository<Patient, Long> {
}
