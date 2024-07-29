package com.cmp.user.controller;

import com.cmp.user.Servise.UserService;
import com.cmp.user.model.UserPrincipale;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> save(@RequestBody UserPrincipale userPrincipale){
        if(userService.findbyNom(userPrincipale.getNom())==null){
            userService.saveUser(userPrincipale);
            return ResponseEntity.ok(userPrincipale);
        }else {
            return ResponseEntity.ok("this userPrincipale exist deja ");
        }

    }
    @GetMapping("/allusers")
    public  ResponseEntity<?> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }
    @PostMapping("/login")
    public  ResponseEntity<?> login(@RequestBody UserPrincipale userPrincipale){
        UserPrincipale userPrincipale1 =userService.findbyNom(userPrincipale.getNom());
        if (Objects.equals(userPrincipale.getNom(), userPrincipale1.getNom()) && Objects.equals(userPrincipale.getMdp(), userPrincipale1.getMdp())){
            return ResponseEntity.ok("Login Accepted");
        }else
            return ResponseEntity.ok("Login  Not accepted");
    }
}
