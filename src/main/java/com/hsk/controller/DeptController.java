package com.hsk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前端控制器，springmvc注入
 * 用来根据前台的请求地址不同而调用不同的业务处理器
 * 此类属于mvc模式中的c：controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

}
