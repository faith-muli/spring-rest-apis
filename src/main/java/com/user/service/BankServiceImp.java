package com.user.service;

import com.user.domain.Bank;
import com.user.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by faith on 8/24/16.
 */
@Service
public class BankServiceImp implements BankService{

    @Autowired
    BankRepository bankRepository;

    @Override
    public Bank createBank(Bank bank) {
        return bankRepository.save(bank);
    }

    @Override
    public Bank findByBankId(long id) {
        return bankRepository.findOne(id);
    }

    @Override
    public List<Bank> findAll() {
        return null;
    }
}
