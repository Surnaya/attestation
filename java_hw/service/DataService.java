package org.example.java_hw.service;

import org.example.java_hw.model.Toys;

import java.io.IOException;
import java.util.List;

public interface DataService {
    void addToys(Integer id, String nameToy, Integer count, Integer weight);
    List<Toys> read();
    void setToyWeight(String name, Integer weight);
    List<Toys> choiceToy();
    void getPrizeToy() throws IOException;
}
