package com.proiect.management.services.contracts;


import com.proiect.management.dtos.AccountDto;

public interface IServiceAccounts extends IService<AccountDto> {
        AccountDto SearchByUserName(String userName);
        AccountDto SearchByEmail(String email);
    }
