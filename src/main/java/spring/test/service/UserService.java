package spring.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import spring.test.repository.UserRepository;

import java.util.List;


@org.springframework.stereotype.Service
public class UserService<User> {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save((spring.test.model.User) user);
    }

    public User getUserById(String userId) {
        return (User) userRepository.findbyId(userId);
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public void deleteUserById(String userId) {
        userRepository.deletebyId(userId);
    }
}
