package org.example.restclient.controller;

import lombok.AllArgsConstructor;
import org.example.restclient.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/species-statistic")
@AllArgsConstructor
public class StatisticsController {

    private final CharacterService characterService;

    @GetMapping(params = "species")
    public int getCount(@RequestParam String species){
        return characterService.getCount(species);
    }
}
