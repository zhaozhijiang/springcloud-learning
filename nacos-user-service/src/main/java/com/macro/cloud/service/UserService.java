package com.macro.cloud.service;

import com.macro.cloud.domain.User;

import java.util.List;

/**
 * @author 月夜的星空
 * @date 2022/8/7 9:41
 */
public interface UserService {
    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
