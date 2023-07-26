package com.zym.boot.model.demo.service;

import com.zym.boot.model.demo.mapper.MainMapper;
import com.zym.boot.model.demo.pojo.Lost;
import com.zym.boot.model.demo.pojo.User;
import jdk.internal.dynalink.support.LinkerServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @MyFunction
 */
@Service
public class MainService{
    @Autowired
    MainMapper mainMapper;
    public List<Lost> main(){
       return mainMapper.selectAll();
    }

    public void delete(Integer lostId){
        mainMapper.delete(lostId);
    }

    public void insert(Lost lost){
        mainMapper.insert(lost);
    }

    public User select(User user){
        return mainMapper.select(user);
    }

    public void signInsert(User user){
        mainMapper.signInsert(user);
    }
}
