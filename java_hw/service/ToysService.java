package org.example.java_hw.service;

import org.example.java_hw.model.Toys;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToysService implements DataService{
    private  List<Toys> toysList = new ArrayList<>();
    private  List<Toys> prizeToys = new ArrayList<>();
    private Random rand = new Random();
    private double totalWeight = 0;
    @Override
    public void addToys(Integer id, String nameToy, Integer count, Integer weight) {
        Toys toys = new Toys(id, nameToy, count, weight);
        toysList.add(toys);
    }

    @Override
    public List<Toys> read() {
        return toysList;
    }

    @Override
    public void setToyWeight(String name, Integer weight) {
        for (Toys toy : toysList) {
            if (toy.getNameToy().equals(name)) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    @Override
    public List<Toys> choiceToy() {
        for (Toys toy : toysList) {
            totalWeight += toy.getWeight();
        }
        double randomNumber = rand.nextDouble() * totalWeight;
        for (Toys toy : toysList) {
            if (randomNumber < toy.getWeight() && toy.getCount() > 0) {
                prizeToys.add(toy);
                toy.setCount(toy.getCount()-1);
                break;
            }
            randomNumber -= toy.getWeight();
        }
        return prizeToys;
    }

    @Override
    public void getPrizeToy() throws IOException {
        if (prizeToys.size() > 0) {
            Toys prizeToy = prizeToys.remove(0);
            FileWriter writer = new FileWriter("prize_toys.txt", true);
            writer.write("выдана игрушка " + prizeToy.getId() + "," + prizeToy.getNameToy() + "\n");
            writer.close();
        }
    }

}
