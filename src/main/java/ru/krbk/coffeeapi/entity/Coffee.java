package ru.krbk.coffeeapi.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Coffee {
    @Id
    private String id;
    private String name;

    public Coffee(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Coffee(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public Coffee() {
        this.id = UUID.randomUUID().toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
