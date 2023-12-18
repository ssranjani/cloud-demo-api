package com.demo.cloudapi.controller;

import com.demo.cloudapi.dto.GiftDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/gifts")
//@CrossOrigin(origins = "http://localhost:4200/")
public class DemoController {
    @GetMapping("")
    public ResponseEntity<Integer> getGiftsCount(){
        return ResponseEntity.ok(4);
    }
    @PostMapping("")
    public ResponseEntity<String> addGifts(@RequestBody GiftDTO gift){
        return ResponseEntity.ok("OK");
    }
}
