package Test.demo.service;

import Test.demo.model.Users;
import Test.demo.repository.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    @Autowired
    private IUsersRepository userRepository;


    public Users createUser(Users users) {
        return userRepository.save(users);
    }

    public Optional<Users> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<Users> getAllUsers() {
        List<Users> users = (List<Users>) userRepository.findAll();
        return users;
    }


}
