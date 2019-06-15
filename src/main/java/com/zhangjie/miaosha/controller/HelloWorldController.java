package com.zhangjie.miaosha.controller;

import com.zhangjie.miaosha.VO.ResultVO;
import com.zhangjie.miaosha.dataobject.User;
import com.zhangjie.miaosha.redis.UserKey;
import com.zhangjie.miaosha.service.HelloService;
import com.zhangjie.miaosha.service.RedisService;
import com.zhangjie.miaosha.service.UserService;
import com.zhangjie.miaosha.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

/**
 * controller
 * @author jason
 */
@Controller
@RequestMapping("hello")
public class HelloWorldController {

    @Autowired
    UserService userService;

    @Autowired
    private HelloService helloService;

    @Autowired
    private RedisService redisService;

    @GetMapping("world")
    @ResponseBody
    public String helloWorld(@PathParam("name") String name){
        return helloService.sayHello(name);
    }

    @RequestMapping("demo")
    public String miaosha(Model model){
        model.addAttribute("name","zhangjie");
        return "hello";
    }
    @RequestMapping("/db/get")
    @ResponseBody
    public ResultVO<User> dbGet() {
        User user = userService.getById(1);
        return ResultVOUtil.success(user);
    }

    @RequestMapping("/db/tx")
    @ResponseBody
    public ResultVO<Boolean> dbTx() {
        userService.tx();
        return ResultVOUtil.success(true);
    }
    @RequestMapping("/redis/get")
    @ResponseBody
    public ResultVO<User> redisGet() {
        User user  = redisService.get(UserKey.getById, ""+1, User.class);
        return ResultVOUtil.success(user);
    }

    @RequestMapping("/redis/set")
    @ResponseBody
    public ResultVO<Boolean> redisSet() {
        User user  = new User();
        user.setId(1);
        user.setName("1111");
        redisService.set(UserKey.getById, ""+1, user);//UserKey:id1
        return ResultVOUtil.success(true);
    }
}
