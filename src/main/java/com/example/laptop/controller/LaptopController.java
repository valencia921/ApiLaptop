package com.example.laptop.controller;

import com.example.laptop.entidades.Laptop;
import com.example.laptop.respositorio.LaptopRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    private LaptopRepo laptopRepo;

    public LaptopController(LaptopRepo laptopRepo) { this.laptopRepo = laptopRepo;

    }

    @GetMapping("/api/laptops")
    public List<Laptop> laptops(){return  laptopRepo.findAll();}

    @PostMapping("/api/crearLaptop")
    public Laptop create (@RequestBody Laptop laptop){
        return laptopRepo.save(laptop);
    }
}
