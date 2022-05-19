package com.example.springdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "深圳市艾格斯贸易有限公司成立于2020年10月28日，注册地位于深圳市福田区福保街道益田社区益田路1005号益田村26栋1单元701，法定代表人为万月琴。经营范围包括一般经营项目是：网络技术、计算机、软件技术领域内的技术开发；技术转让；技术咨询；技术服务；计算机系统集成服务；计算机、软件及辅助设备、服装、日用品、工艺品（不含象牙及其制品）的销售；企业管理咨询；平面设计；网页设计；电子产品、通讯设备及周边产品的研发与销售；从事广告业务；国内贸易；货物及技术进出口。（法律、行政法规、国务院决定禁止的项目除外，限制的项目须取得许可后方可经营），许可经营项目是：第二类增值电信业务。";
    }
}