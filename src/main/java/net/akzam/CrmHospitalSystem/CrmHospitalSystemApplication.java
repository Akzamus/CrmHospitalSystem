package net.akzam.CrmHospitalSystem;

import net.akzam.CrmHospitalSystem.models.Doctor;
import net.akzam.CrmHospitalSystem.models.User;
import net.akzam.CrmHospitalSystem.models.enums.Role;
import net.akzam.CrmHospitalSystem.models.enums.Status;
import net.akzam.CrmHospitalSystem.repositories.DoctorsRepository;
import net.akzam.CrmHospitalSystem.repositories.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@SpringBootApplication
public class CrmHospitalSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrmHospitalSystemApplication.class, args);
	}
}
