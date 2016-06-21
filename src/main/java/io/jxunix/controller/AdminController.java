package io.jxunix.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jxunix.domain.Admin;
import io.jxunix.mapper.AdminMapper;

@RestController
public class AdminController {

    @Autowired
    private AdminMapper adminMapper;
    
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
    
    @RequestMapping("/restAdmin")
    public Admin loginAsAdmin(@RequestParam(value="adminId", required=false) String adminId, @RequestParam(value="password", required=false) String password) {
       Admin admin = adminMapper.selectByPrimaryKey(adminId);
       logger.debug("数据库中id={} 的管理员: {}", adminId, admin);
       return admin;
    }
}
