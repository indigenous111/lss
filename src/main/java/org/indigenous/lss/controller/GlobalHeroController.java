package org.indigenous.lss.controller;

import org.indigenous.lss.service.GlobalHeroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/global/hero")
public class GlobalHeroController {

    private GlobalHeroService globalHeroService;

    @GetMapping("/types")
    public List<String> getHeroTypes() {
        return globalHeroService.getHeroTypes();
    }
}
