package com.wt.aspect.dao;

import com.wt.aspect.aspect.TargetDataSource;
import com.wt.aspect.pojo.HeroPojo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TestDao {

    @TargetDataSource("DB")
    List<HeroPojo> getHero();
}
