package net.ys.service;

import net.ys.bean.User;

public interface UserService {

    void save(User user);

    User findByName(String name);
}
