package org.example.java_hw.model;

public class Toys {
    Integer id;
    String nameToy;
    Integer count;
    Integer weight;

    public Toys(Integer id, String nameToy, Integer count, Integer weight) {
        this.id = id;
        this.nameToy = nameToy;
        this.count = count;
        this.weight = weight;
    }

    public Toys() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "id=" + id +
                ", nameToy='" + nameToy + '\'' +
                ", count=" + count +
                ", weight=" + weight +
                '}';
    }
}
