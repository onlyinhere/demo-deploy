package com.example.demodeploy.echo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DumyController {
    @Autowired
    private DumyService dumyService;

    @GetMapping("/dumy")
    public List<DumyDto> dumy() {
        return dumyService.getAllDumy();
    }
}