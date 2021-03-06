package com.eutopia.entity;

import lombok.Data;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;
import tk.mybatis.mapper.annotation.LogicDelete;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
public class Menu {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String menuDescription;

    private Integer sort;

    @ColumnType(column = "gmt_create", jdbcType = JdbcType.TIMESTAMP)
    private Date gmtCreate;

    @ColumnType(column = "gmt_modified", jdbcType = JdbcType.TIMESTAMP)
    private Date gmtModified;

    @Column(name = "is_deleted")
    @LogicDelete
    private Boolean deleted;
}
