package com.ydl.test;

import com.ydl.sms.entity.ConfigEntity;
import com.ydl.sms.service.ConfigService;
import com.ydl.sms.utils.DesensitizationUtil;
import com.ydl.sms.utils.SensitiveWordUtil;

import javax.ws.rs.GET;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SmsServerApplication.class)
public class Test {
    //@Autowired
    private ConfigService configService;

    //@org.junit.Test
    public void test1(){
        List<ConfigEntity> configEntities = configService.listForConnect();
        System.out.println(configEntities);
    }

    //@org.junit.Test
    public void test2(){
        List<ConfigEntity> configEntities = configService.listForNewConnect();
        System.out.println(configEntities);
    }
    @org.junit.Test
    //敏感词测试
    public  void test3(){
        List<String> list = new ArrayList<>();
        list.add("法轮");
        list.add("法轮功");
        list.add("冰毒");
        SensitiveWordUtil.initMap(list);
        String content = "我是一个好人,并不会卖冰毒，也不会操练法轮功，我真的不卖冰毒";
        Map<String,Integer> map =  SensitiveWordUtil.matchWords(content);
        System.out.println(map);
    }
    //正则测试
    @org.junit.Test
    public  void test4(){
        String str="12345678901";
        String s = DesensitizationUtil.mobileEncrypt(str);
        System.out.println(s);
    }
    }


