package net.ys.service.impl;

import net.ys.bean.User;
import net.ys.dao.UserRepository;
import net.ys.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByName(String name) {
        return this.userRepository.findByName(name);
    }
}
