package org.example.java_hw.controller;

import org.example.java_hw.model.Toys;
import org.example.java_hw.service.ToysService;
import org.example.java_hw.view.ToysView;

import java.io.IOException;
import java.util.List;

public class Controller {
    private final ToysService toysService = new ToysService();
    private  final ToysView toysView = new ToysView();

    public void  createNewToy(Integer id, String nameToy, Integer count, Integer weight){
        toysService.addToys(id, nameToy, count, weight);
    }
    public void changeWeight(String name, Integer weight){
        toysService.setToyWeight(name, weight);
    }
    public List<Toys> startGame(){
        return toysService.choiceToy();
    }
    public void getAndWriteToy() {
        try{
            toysService.getPrizeToy();
        } catch (IOException e){
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }
    public void getToysList(){
        List<Toys> toysList = toysService.read();
        for (Toys toy : toysList) {
            toysView.printConsole(toy);
        }
        System.out.println("___________________________________________________");
    }
}
