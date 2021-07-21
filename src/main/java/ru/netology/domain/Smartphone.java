package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

@Data
@EqualsAndHashCode(callSuper = true)
public class Smartphone extends Product {
    private String producer;

    public Smartphone() {

    }

    public Smartphone(int id, String name, int price, String producer) {
        super(id, name, price);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean matches(String search) {
        return super.matches(search) || producer.contains(search);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "producer='" + producer + '\'' +
                '}';
    }
}
