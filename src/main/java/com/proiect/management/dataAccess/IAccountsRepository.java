package com.proiect.management.dataAccess;

import com.proiect.management.domains.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountsRepository extends JpaRepository<Account, Integer> {

}
