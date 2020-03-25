package zjw.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc 实体类
 * @Author zjw
 * @Date 2020-03-25-14:23
 */
@RestController
@RequestMapping("/zjw/")
public class MyController {

    @GetMapping("getName")
    public String getName() {
        return "赵家伟";
    }

    @GetMapping("getFri")
    public String getFri(){
        return "郁露";
    }

}
