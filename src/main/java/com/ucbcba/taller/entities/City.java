package com.ucbcba.taller.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String nombre;

    public Integer getId(){return id;}

    public String getNombre(){return nombre;}

    public void setId(Integer id){this.id=id;}

    public void setNombre(String nombre){this.nombre=nombre;}

}
