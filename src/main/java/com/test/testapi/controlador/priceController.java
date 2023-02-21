package com.test.testapi.controlador;

import com.test.testapi.entity.Prince;
import com.test.testapi.entity.ResposePrince;
import com.test.testapi.servicio.PrinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@RestController
@RequestMapping("/prince")
public class priceController {

    @Autowired
    private PrinceService princeService;

    @GetMapping
    public List<Prince> readAll(){
        List<Prince> princes = StreamSupport.stream(princeService.findAll()
                        .spliterator(), false)
                .collect(Collectors.toList());

        return princes;
    }

    @GetMapping("/buscar/fecha/{fecha}/priceList/{priceList}")
    public ResponseEntity<?> listar (@PathVariable String fecha, @PathVariable Long priceList){
        return  ResponseEntity.ok().body(princeService.listas(fecha, priceList));
    }

}
