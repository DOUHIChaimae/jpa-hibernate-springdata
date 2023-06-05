package ma.enset.jpahibernatespringdata.repositories;

import ma.enset.jpahibernatespringdata.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor findByName(String name);

}
