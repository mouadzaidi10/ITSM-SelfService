package com.cmp.user.Repository;

import com.cmp.user.model.UserPrincipale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserPrincipale,Integer> {
    public UserPrincipale findUserByNom(String nom);
}
