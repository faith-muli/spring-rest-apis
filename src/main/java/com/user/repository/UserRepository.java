package com.user.repository;

import com.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by faith on 8/23/16.
 */
@Repository
public interface UserRepository extends JpaRepository <User,Long>{

}
