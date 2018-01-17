package com.company.project.base.service;

import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Service 层 基础接口，其他Service 接口 请继承该接口
 */
public interface Service<T> {
    void save(T model);
    void save(List<T> models);
    void deleteById(Integer id);
    void deleteByIds(String ids);//批量刪除 eg：ids -> “1,2,3,4”
    void update(T model);
    T    findById(Integer id);
    T    findBy(String fieldName, Object value) throws Exception; //通过Model中某个成员变量名称（非数据表中column的名称）查找,value需符合unique约束
    List<T> findByIds(String ids);//通过多个ID查找//eg：ids -> “1,2,3,4”
    List<T> findByCondition(Condition condition);
    List<T> findAll();
}
