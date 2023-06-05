package ma.enset.jpahibernatespringdata.services;

import ma.enset.jpahibernatespringdata.entities.Role;
import ma.enset.jpahibernatespringdata.entities.User;

public interface UserService {
    User addNewUser(User user);

    Role addNewRole(Role role);

    User findUserByUserName(String username);

    Role findRoleByRoleName(String roleName);

    void addRoleToUser(String username, String roleName);

    User authenticate(String username, String password);

}
