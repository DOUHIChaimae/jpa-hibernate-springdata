package ma.enset.jpahibernatespringdata.repositories;

import ma.enset.jpahibernatespringdata.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}

