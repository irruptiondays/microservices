package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by TValentine on 10/6/15.
 */
@RestController
public class LuckyWorldController {
    @Value("${lucky-word}") String luckyWord;

    @RequestMapping("/lucky-word")
    public String showLuckyWord() {
        return "The Lucky word is " + luckyWord;
    }

}
