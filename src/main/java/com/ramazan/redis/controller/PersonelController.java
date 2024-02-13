package com.ramazan.redis.controller;

import com.ramazan.redis.domain.Personel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/personel")
public class PersonelController {

    private static final String KEY = "PERSONEL";

    private final RedisTemplate<String, Object> redisTemplate;

    @Autowired
    public PersonelController(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostMapping("/savePersonel")
    public String savePersonel(@RequestBody Personel personel) {
        redisTemplate.opsForHash().put(KEY, personel.getPersonelName(), personel);
        redisTemplate.expire(KEY, 50, TimeUnit.MINUTES);
        return "Personel saved";
    }

    @GetMapping("/findPersonel/{name}")
    public Personel findPersonel(@PathVariable String name) {
        return (Personel) redisTemplate.opsForHash().get(KEY, name);
    }

    @PutMapping("/updatePersonel")
    public String updatePersonel(@RequestBody Personel personel) {
        redisTemplate.opsForHash().put(KEY, personel.getPersonelName(), personel);
        return "Personel updated";
    }

    @DeleteMapping("/deletePersonel/{name}")
    public String deletePersonel(@PathVariable String name) {
        redisTemplate.opsForHash().delete(KEY, name);
        return "Personel deleted";
    }
}