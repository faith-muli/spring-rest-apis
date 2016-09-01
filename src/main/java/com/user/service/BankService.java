package com.user.service;

import com.user.domain.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by faith on 8/24/16.
 */

public interface BankService {

    Bank createBank (Bank bank);
    Bank findByBankId (long id);
    List<Bank>findAll();

}
