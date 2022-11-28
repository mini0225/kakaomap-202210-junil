package com.kakao.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller /*controller 할때 항상 해야함*/

public class PageLoadTestController {

    @RequestMapping(value = "/t1", method = RequestMethod.GET) /*테스트 확인.*/
    public String test1() {
        System.out.println("t1요청 들어옴?");
        return "test1";
    }

    @RequestMapping(value = "/t2", method = RequestMethod.GET)
    public String test2() {
        System.out.println("t2요청 들어옴?");
        return "test1";
    }

    @RequestMapping(value = "/test/page", method = RequestMethod.GET)
    public String test3() {
        System.out.println("test2 page");
        return "test/test2";
    }

    @RequestMapping(value = "/map", method = RequestMethod.GET)
    public String kakaoMap() {
        return "map";
    }
}
