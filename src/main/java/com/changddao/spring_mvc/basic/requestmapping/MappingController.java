package com.changddao.spring_mvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class MappingController {
    @RequestMapping(value = "/hello-basic", method = RequestMethod.GET)
    public String helloBasic() {
        log.info("helloBasic");
        return "OK";
    }

    /*
    * 편리한 축약 에노테이션
    * @GetMapping
    * @PostMapping
    * @PutMapping
    * @DeleteMapping
    * @PatchMapping
    * */

    /*PathVariable 사용
    * 변수명이 같으면 생략 가능
    * @PathVariable("userId") String userId -> @PathVariable userId*/
    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String userId){
        log.info("mappingPath userId={}",userId);
        return "ok";
    }
    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable("userId")String userId, @PathVariable("orderId") Long orderId) {
        log.info("mappingPath = userId ={}, orderId ={}",userId, orderId);
        return "ok";
    }

}
