package br.com.fiap.apishpere.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        return repository.findAll();
    }

    public User create(User user){
        return repository.save(user);
    }

}