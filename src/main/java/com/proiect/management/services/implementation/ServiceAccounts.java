package com.proiect.management.services.implementation;

import com.proiect.management.dataAccess.factory.Factory;
import com.proiect.management.domains.Account;
import com.proiect.management.dtos.AccountDto;
import com.proiect.management.services.contracts.IServiceAccounts;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceAccounts implements IServiceAccounts {
    @Autowired
    private Factory factory;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<AccountDto> GetAll() {

        var list = factory.accountsRepository.findAll();

        var returnedList = new ArrayList<AccountDto>();

        for (var elem : list) {
            returnedList.add(mapper.map(elem, AccountDto.class));
        }

        return returnedList;
    }

    @Override
    public AccountDto Insert(AccountDto value) {

        var account = mapper.map(value, Account.class);

        var accountDto  = mapper.map(factory.accountsRepository.save(account), AccountDto.class);

        return accountDto;
    }

    @Override
    public AccountDto Update(AccountDto value) {

        var account = mapper.map(value, Account.class);

        var accountDto  = mapper.map(factory.accountsRepository.save(account), AccountDto.class);

        return accountDto;
    }

    @Override
    public AccountDto SearchById(int id) {

        var accountDto  = mapper.map(factory.accountsRepository.findById(id), AccountDto.class);

        return  accountDto;
    }

    @Override
    public boolean Delete(AccountDto value) {
        try{

            var account = mapper.map(value, Account.class);

            factory.accountsRepository.delete(account);

            return  true;

        }catch (Exception e){
            return  false;
        }
    }

    @Override
    public AccountDto SearchByUserName(String userName) {
        return null;
    }

    @Override
    public AccountDto SearchByEmail(String email) {
        return null;
    }
}
