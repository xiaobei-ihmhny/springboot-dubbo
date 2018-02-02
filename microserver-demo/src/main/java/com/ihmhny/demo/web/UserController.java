package com.ihmhny.demo.web;

import com.ihmhny.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author: xiaobei
 * @createTime: 2018-02-02 7:35
 * @since: JDK 1.8
 * @description: 测试springboot
 * 参考文章：http://blog.csdn.net/winter_chen001/article/details/78330253，特此声明！！！
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    //记录日志
//    private final Logger log = LoggerFactory.getLogger(UserController.class);

    //创建线程安全的Map
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    /**
     * 获取用户信息
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public List<User> getUserList() {
        List<User> userList = new ArrayList<>(users.values());
        return userList;
    }

    /**
     * 获取指定id的信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    /**
     * 保存用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/save/{id}", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute User user) {
        users.put(user.getId(),user);
        return "success";
    }

    /**
     * 修改用户
     * @param id
     * @param user
     * @return
     */
    @RequestMapping(value = "/modify/{id}", method = RequestMethod.POST)
    public String modifyUser(@PathVariable Long id, @ModelAttribute User user) {
        User u = users.get(id);
        u.setAge(user.getAge());
        u.setName(user.getName());
        users.put(id,u);
        return "success";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }

}
