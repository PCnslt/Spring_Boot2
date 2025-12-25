package com.telusko.app;

import com.telusko.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saving Laptop to the repository");
    }
}
