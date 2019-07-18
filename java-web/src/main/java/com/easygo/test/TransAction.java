package com.easygo.test;

import com.easygo.Service.AccountService;
import com.easygo.Service.impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class TransAction {
    @Test
    public void test1(){
        AccountService accountService = new AccountServiceImpl();
        try {
            accountService.transfer("aaaa", "bbb",89);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
