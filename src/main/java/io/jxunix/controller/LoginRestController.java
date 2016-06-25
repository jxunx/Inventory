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
public class LoginRestController {

    @Autowired
    private AdminMapper adminMapper;

    private static final Logger logger = LoggerFactory.getLogger(LoginRestController.class);

    @RequestMapping("/login")
    public Admin loginAsAdmin(@RequestParam(value = "adminId", required = false) String adminId,
            @RequestParam(value = "password", required = false) String password) {
        logger.debug("Request parameters: adminId={}, password={}", adminId, password);
        Admin admin = adminMapper.selectByPrimaryKey(adminId);
        logger.debug("数据库中 id={} 的管理员: {}", adminId, admin);
        if (admin != null && admin.getPassword().equals(password)) {
            logger.debug("{} 登录成功", adminId);
            return admin;
        } else {
            logger.debug("{} 登录失败", adminId);
            return null;
        }
    }
    
    @RequestMapping("/logout")
    public String logout(@RequestParam String adminId) {
        logger.debug("Request parameters: adminId={}", adminId);
        return adminId;
    }
    
}
