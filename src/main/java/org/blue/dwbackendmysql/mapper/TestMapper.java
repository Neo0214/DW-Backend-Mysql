package org.blue.dwbackendmysql.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.blue.dwbackendmysql.Entity.Test;

import java.util.List;

/*
 * @author Neo0214
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {
    @Select("select * from test")
    List<Test> getAllTest();
}
