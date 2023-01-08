package com.example.laptop.respositorio;

import com.example.laptop.entidades.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Long> {
}
