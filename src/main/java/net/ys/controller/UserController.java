package net.ys.controller;

import net.ys.bean.User;
import net.ys.service.UserService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private MongoTemplate mongoTemplate;

    @GetMapping("/save")
    public User save() {
        User user = new User(2, "jack", 21);
        mongoTemplate.save(user);
        return user;
    }

    @GetMapping("/find")
    public List<User> find() {
        List<User> userList = mongoTemplate.findAll(User.class);
        return userList;
    }

    @GetMapping("/findByName")
    public User findByName(@RequestParam("name") String name) {
        User user = userService.findByName(name);
        return user;
    }
}
