package com.bw.controller;

import com.bw.entity.Friend;
import com.bw.respory.FriendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/7/11.
 */
@Controller
public class FriendController {

    //在controller中创建respory的实例
    @Autowired
    private FriendMapper friendMapper;


    @RequestMapping("add")
    public String addFriends(){
        return  "add";
    }

    /**
     * 添加好友
     */
    @RequestMapping("savefriend")
    public String savefriend(Friend friend){
        System.out.println("=========添加好友============");
        System.out.println(friend);
        friendMapper.save(friend);
        return  "success";
    }

}
