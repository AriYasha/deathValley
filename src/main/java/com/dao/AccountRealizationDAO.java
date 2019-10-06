package com.dao;

import com.entity.AccountEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("accountRealizationDAO")
@Transactional
public class AccountRealizationDAO implements IAccount {


    @Autowired
    private SessionFactory sessionFactory;


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public List<AccountEntity> selectUsers()

    {
        return null;
    }

    public void insertUsers(AccountEntity accountEntity) {

    }

    public void delete(AccountEntity accountEntity) {

    }

    public List<AccountEntity> findById() {

        Session session = sessionFactory.openSession();
       List <AccountEntity> accountEntity= new ArrayList<AccountEntity>();

        Query query = session.createQuery("SELECT idUser, SUM(account) AS total FROM AccountEntity GROUP BY idUser ORDER BY total ");

        //Query query1=session.createQuery("SELECT idUser  FROM AccountEntity where SUM(account) as total GROUP BY idUser ORDER BY total ");
       List results =query.list();

        return results;

    }

    public List<AccountEntity> findBySum(int sum) {
        return null;
    }
}
