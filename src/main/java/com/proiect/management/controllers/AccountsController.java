package com.proiect.management.controllers;

import com.proiect.management.dtos.AccountDto;
import com.proiect.management.services.implementation.ServiceAccounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountsController {

    @Autowired
    private ServiceAccounts serviceAccounts;


    @GetMapping(value = "/rest/Account")  // http://localhost:8080/rest/Account?id=0
    public AccountDto displayAccountDto(@RequestParam(value="id", defaultValue = "0") int code) {
        return this.serviceAccounts.SearchById(code);
    }

    @GetMapping(value = "/rest/Account/all")  // http://localhost:8080/rest/Account/all
    public List<AccountDto> displayAllAccount() {
        return serviceAccounts.GetAll();
    }

    @PostMapping(value = "/rest/Account/add")
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto inputAccountDto) {
        AccountDto AccountDto = this.serviceAccounts.Insert(inputAccountDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(AccountDto);
    }

    @PutMapping(value = "/rest/Account/update")
    public ResponseEntity<AccountDto> updateAccount(@RequestBody AccountDto inputAccountDto) {
        AccountDto AccountDto = this.serviceAccounts.Update(inputAccountDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(AccountDto);
    }

    @DeleteMapping(value = "/rest/Account/delete")
    public boolean deleteAccount(@RequestBody AccountDto inputAccountDto) {
        return this.serviceAccounts.Delete(inputAccountDto);
    }
    
}