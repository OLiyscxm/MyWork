package com.zym.boot.model.demo.mapper;

import com.zym.boot.model.demo.pojo.Lost;
import com.zym.boot.model.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @MyFunction
 */
@Mapper
public interface MainMapper {
    //@Select("select * from lost_and_found")
    public List<Lost> selectAll();

    //delete from lost_and_found where lost_id=#{lostId}
    public void delete(Integer lostId);

    public void insert(Lost lost);

    public User select(User user);

    public void signInsert(User user);
}
