package com.example.diceapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {

    @GetMapping("/diceapi")
    public Map<String, Integer> dice() {
        Map<String, Integer> result = new HashMap<>();
        result.put("result", new Random().nextInt(8) + 1); // 1～8の乱数
        return result;
    }
}
