package com.example.newcodercommunity.Service;

import com.example.newcodercommunity.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
// @Scope("prototype") 每次都初始化一个新的bean
@Scope("prototype")
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("实例化AlphaService");
    }

    // 注解@PostConstruct 表示其在构造器之后执行
    @PostConstruct
    public void init() {
        System.out.println("初始化AlphaService");
    }

    // 在对象销毁之前执行
    @PreDestroy
    public void destroy() {
        System.out.println("销毁AlphaService");
    }

    public String find() {
        return alphaDao.select();
    }

}
