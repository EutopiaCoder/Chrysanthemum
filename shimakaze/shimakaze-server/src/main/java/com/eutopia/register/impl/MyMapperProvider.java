package com.eutopia.register.impl;

import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

public class MyMapperProvider extends MapperTemplate {

    public MyMapperProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    public String selectAll(MappedStatement ms) {
        final Class<?> entityClass = getEntityClass(ms);
        setResultType(ms, entityClass);
        return SqlHelper.selectAllColumns(entityClass) +
                SqlHelper.fromTable(entityClass, tableName(entityClass)) +
                SqlHelper.orderByDefault(entityClass);
    }
}
