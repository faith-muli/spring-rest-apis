package com.user.repository;

import com.user.domain.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by faith on 8/24/16.
 */
@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

}
