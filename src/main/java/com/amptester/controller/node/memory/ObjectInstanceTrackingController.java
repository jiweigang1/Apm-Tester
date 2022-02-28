package com.amptester.controller.node.memory;

import com.bean.SmallObject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/object/")
public class ObjectInstanceTrackingController {
    /**
     * 测试小对象创建,一次请求创建1000个
     * 触发mgc
     * @return
     */
    @RequestMapping("/objectInstanceTracking")
    public String  objectInstanceTracking(){
        SmallObject s;
        for(int i = 0 ; i< 1000; i++ ){
            s =  new SmallObject();
        }
        return "objectInstanceTracking-ok";
    }
}
