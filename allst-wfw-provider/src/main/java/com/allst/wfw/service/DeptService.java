package com.allst.wfw.service;

import com.allst.wfw.entity.Dept;

import java.util.List;

/**
 * Dept Serice接口层
 * @author YiYa
 * @since 2019-11-13 上午 12:31
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
