package com.dao;

import com.entity.AccountEntity;

import java.util.List;
import java.util.Map;

public interface IAccount {
    List<AccountEntity> selectUsers();
    void insertUsers(AccountEntity accountEntity );
    void  delete(AccountEntity  accountEntity );
    List<AccountEntity>findById();
    List<AccountEntity> findBySum( int sum);


}
