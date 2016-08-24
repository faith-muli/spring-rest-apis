package com.user.controller;

import com.user.domain.Bank;
import com.user.domain.User;
import com.user.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by faith on 8/24/16.
 */

@RestController
@RequestMapping(value = "bank")
public class BankController {

    @Autowired
    BankService bankService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Bank> findAll(){

        return  bankService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Bank createBank(@RequestBody Bank bank){
        return bankService.createBank(bank);

        }

    @RequestMapping(value = "{id}")
    public  Bank findBankById(@PathVariable long id){
        return  bankService.findByBankId(id);
    }
}
