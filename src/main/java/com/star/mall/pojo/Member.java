package com.star.mall.pojo;

import lombok.Data;

/**
 * @author: star
 * @Date: 2021/7/10
 * @version: 1.0
 */

/**
 * 注册用户表
 */
@Data
public class Member {
    /**
     * 用户 ID
     */
    private int userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 电子邮件
     */
    private String mail;
    /**
     * 状态
     */
    private String status;
    /**
     * 列表选择
     */
    private String listOption;
}
