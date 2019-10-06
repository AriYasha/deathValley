package com.controller;


import com.dao.IAccount;
import com.dao.IUser;
import com.dao.UserRealizationDAO;
import com.entity.AccountEntity;
import com.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ServletInAction {

    @Autowired
    IAccount account;

    @Autowired
    IUser user;

    @GetMapping(value = "/richest")
    public String richestUser() {
        System.out.println("hello");
        UserRealizationDAO userRealizationDAO= new UserRealizationDAO();
        UserEntity userEntity=userRealizationDAO.findById(1);
        System.out.println(userEntity.getNameUser());
        List<AccountEntity> accountEntityList= new ArrayList<AccountEntity>();
       //accountEntityList = account.findById();
        for (AccountEntity accountEntity: accountEntityList){
            System.out.println(accountEntity.getIdUser()+ accountEntity.getAccount());
    }

        return "index";
    }

}
