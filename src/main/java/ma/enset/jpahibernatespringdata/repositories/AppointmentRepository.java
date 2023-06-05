package ma.enset.jpahibernatespringdata.repositories;

import ma.enset.jpahibernatespringdata.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
