package com.user.repository;

import com.user.domain.User;
import com.user.service.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by faith on 8/23/16.
 */
@Repository
public interface UserRepository extends JpaRepository <User,Long>{
    List<User> findByEmailIgnoreCase(String email);
    List<User> findUserByNameOrEmail(String name, String email);
}
