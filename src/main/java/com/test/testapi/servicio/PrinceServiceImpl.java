package com.test.testapi.servicio;

import com.test.testapi.entity.Prince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class PrinceServiceImpl implements PrinceService{

    @Autowired
    private com.test.testapi.repositorio.princeRepository princeRepository;

    @Override
    public Iterable<Prince> findAll() { return princeRepository.findAll(); }

    @Override
    public List<Prince> listas(String fecha, Long priceList){
        return princeRepository.listas(fecha,priceList);
    }
}
