package ma.enset.jpahibernatespringdata.repositories;

import ma.enset.jpahibernatespringdata.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String userName);
}
