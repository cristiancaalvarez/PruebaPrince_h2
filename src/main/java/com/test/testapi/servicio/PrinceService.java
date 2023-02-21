package com.test.testapi.servicio;

import com.test.testapi.entity.Prince;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface PrinceService {
    public Iterable<Prince> findAll();

    public List<Prince> listas (String fecha, Long priceList);
}
