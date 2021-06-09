package com.cc.kk.service;

import com.cc.kk.entity.Memory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MemoryService {

    private final JdbcTemplate jdbcTemplate;

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public MemoryService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Memory getMemories(){

        String sql = "select id,content,title,imageUrl from memory";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);

        log.info(list.toArray().toString());


        return null;
    }
}
