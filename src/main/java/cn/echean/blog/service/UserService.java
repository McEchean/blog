package cn.echean.blog.service;

import cn.echean.blog.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 * @author 98382
 */
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean checkUser(String username, String userpwd) {
        return userRepository.getUserByUsernameAndPassword(username, userpwd) != null;
    }
}
