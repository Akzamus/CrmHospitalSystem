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

	@Bean
	@Transactional
	CommandLineRunner run(UsersRepository usersRepository, DoctorsRepository doctorsRepository) {
		return args -> {
//			User user = new User();
//			user.setUsername("username");
//			user.setPassword("password");
//			user.setRole(Role.ROLE_DOCTOR);
//			user.setStatus(Status.ONLINE);
//			usersRepository.save(user);
//			User user = usersRepository.findById(1l).get();
//			Doctor doctor = new Doctor();
//			doctor.setDateOfBirth(new Date());
//			doctor.setFirstName("firstName");
//			doctor.setLastName("lastName");
//			doctor.setType("Type");
//			doctorsRepository.save(doctor);
//			Doctor doctor = doctorsRepository.findById(1l).get();
//			user.setDoctor(doctor);
//			System.out.println(user);
//			System.out.println(doctor.getId());
//			System.out.println(user.getDoctor());

//			Person person = new Person();
//			person.setLastName("Last name");
//			person.setFirstName("First name");
//			person.setDateOfBirth(new Date());
//			peopleRepository.save(person);
//			System.out.println(user);
//			Person person = user.getPerson();
//			Doctor doctor = (Doctor)person;
//			System.out.println(doctor.toString());
//			Person person = peopleRepository.findById(1l).get();
//			System.out.println(person);
//			user.setPerson(person);
//			System.out.println(user);
//			System.out.println(person);
//			usersRepository.save(user);
//			User newUser = usersRepository.findById(1l).get();
//			System.out.println(newUser);
//			Person person = newUser.getPerson();
//			Doctor newDoctor = (Doctor)person;
//			System.out.println(newDoctor);
		};
	}
}
