package com.cmp.user.Servise;

import com.cmp.user.Repository.UserRepository;
import com.cmp.user.model.UserPrincipale;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private  final UserRepository userRepository;
    public  void saveUser(UserPrincipale userPrincipale){
        userRepository.save(userPrincipale);
    }
    public List<UserPrincipale> findAll(){
        return userRepository.findAll();
    }
    public UserPrincipale findbyNom(String nom){
        return userRepository.findUserByNom(nom);
    }
}
