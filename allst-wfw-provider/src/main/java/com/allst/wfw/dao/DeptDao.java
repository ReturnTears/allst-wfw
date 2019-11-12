package com.allst.wfw.dao;

import com.allst.wfw.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Dept dao层
 * @author YiYa
 * @since 2019-11-13 上午 12:24
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
