package com.example.newcodercommunity.dao;

import org.springframework.stereotype.Repository;
// 访问数据库需要增加@Repository注解
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{


    @Override
    public String select() {
        return "Hinernate";
    }
}
