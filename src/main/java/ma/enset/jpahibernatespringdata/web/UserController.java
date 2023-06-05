package ma.enset.jpahibernatespringdata.web;

import ma.enset.jpahibernatespringdata.entities.User;
import ma.enset.jpahibernatespringdata.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users/{username}")
    public User showUsers(@PathVariable String username) {
        User user = userService.findUserByUserName(username);
        return user;
    }
}
