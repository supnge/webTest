package com.easygo.Service;

import java.sql.SQLException;

public interface AccountService {
    void transfer(String from, String to, int amount) throws Exception;
}
