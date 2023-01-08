package com.example.laptop.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private Integer ram;
    private Integer disco;
    private Integer peso;
    private Boolean accesorios;

    public Laptop() {
    }

    public Laptop(Long id,String marca, Integer ram, Integer disco, Integer peso, Boolean accesorios) {
        this.id = id;
        this.marca = marca;
        this.ram = ram;
        this.disco = disco;
        this.peso = peso;
        this.accesorios = accesorios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getDisco() {
        return disco;
    }

    public void setDisco(Integer disco) {
        this.disco = disco;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Boolean getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Boolean accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", ram=" + ram +
                ", disco=" + disco +
                ", peso=" + peso +
                ", accesorios=" + accesorios +
                '}';
    }
}
