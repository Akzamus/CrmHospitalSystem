package net.akzam.CrmHospitalSystem.repositories;

import net.akzam.CrmHospitalSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
}
