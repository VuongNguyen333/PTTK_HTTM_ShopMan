package com.example.pttk1.dao;

import com.example.pttk1.model.ThanhVien803;

public interface ThanhVien803DAO {
    String addUser(ThanhVien803 thanhVien803);
    ThanhVien803 checkRegister(String username);
}
