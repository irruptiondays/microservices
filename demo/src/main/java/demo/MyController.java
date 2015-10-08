package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by TValentine on 10/6/15.
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public String myString() {
        return "hello";
    }
}
