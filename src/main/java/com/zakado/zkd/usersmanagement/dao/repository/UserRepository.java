package com.zakado.zkd.usersmanagement.dao.repository;

import com.zakado.zkd.usersmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);
}
