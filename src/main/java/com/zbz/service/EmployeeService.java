package com.zbz.service;

import com.zbz.bean.Employee;
import com.zbz.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.stereotype.Service;

/**
 * @author: ag
 * @date: 2019/3/14 10:28
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
    /**注入redis缓存管理器*/
    @Qualifier("empCacheManager")
    @Autowired
    RedisCacheManager deptCacheManager;
    /**查*/
    @Cacheable(cacheNames = "emp",cacheManager = "empCacheManager")
    public Employee getEmployee(Integer id) {
        System.out.println("从数据库获取数据开始......");
        Employee employee = employeeMapper.getEmployeeById(id);
        System.out.println("从数据库获取数据结束......");
        return employee;
    }

}
