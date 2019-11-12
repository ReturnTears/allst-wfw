package com.allst.wfw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 实体类必须序列化
 * @author YiYa
 * @since 2019-11-12 下午 11:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    /**
     * 主键
     */
    public Long deptno;
    /**
     * 部门名称
     */
    public String dname;
    /**
     * 数据来源
     */
    public String db_source;
}
