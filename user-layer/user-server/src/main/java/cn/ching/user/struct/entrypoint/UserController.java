package cn.ching.user.struct.entrypoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: laxzhang
 * @email: laxzhang@outlook.com
 * @description:
 **/
@RestController("/user")
public class UserController {

    @RequestMapping("/index")
    public String index(@RequestParam String msg){
        return msg;
    }
}
