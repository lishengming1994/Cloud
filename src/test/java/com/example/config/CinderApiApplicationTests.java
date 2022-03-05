package com.example.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootTest
class CinderApiApplicationTests {
    /*该对象是SpringBoot创建的可以对数据进行操作*/
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    /**
     * 查询所有
     */
    void contextLoads() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from volume;");
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }
}
