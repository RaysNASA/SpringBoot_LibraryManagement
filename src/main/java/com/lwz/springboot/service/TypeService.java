package com.lwz.springboot.service;

import com.lwz.springboot.entity.Type;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//RootConfig配置完@EnableTransactionManagement后在此处启用事务
@Transactional
public interface TypeService {
    //启用只读，
    @Transactional(readOnly = true)
    List<Type> findAllTypes();
}
