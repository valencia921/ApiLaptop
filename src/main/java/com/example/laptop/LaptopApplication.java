package com.example.laptop;

import com.example.laptop.entidades.Laptop;
import com.example.laptop.respositorio.LaptopRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LaptopApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(LaptopApplication.class, args);
        LaptopRepo laptopRepo = applicationContext.getBean(LaptopRepo.class);

        Laptop laptop1 = new Laptop(null,"Acer",8,250,1,false);
        Laptop laptop2 = new Laptop(null,"Asus",16,500,3,true);

        laptopRepo.save(laptop1);
        laptopRepo.save(laptop2);

        System.out.println(laptopRepo.findAll());
    }

}
