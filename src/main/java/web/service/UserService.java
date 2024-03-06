package web.service;

import web.model.User;
import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getUserList();

    User getUserById(Long id);

    void updateUserById(Long id, String firstName, String lastName, String country);

    void deleteUserById(Long id);
}
