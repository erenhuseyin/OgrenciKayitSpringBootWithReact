package com.pilotProject.ogrenciSistemi.controller;

import com.pilotProject.ogrenciSistemi.model.Ogrenci;
import com.pilotProject.ogrenciSistemi.service.OgrenciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Configuration
@RestController
@CrossOrigin
@RequestMapping("/ogrenci")
public class OgrenciController {

    @Autowired
    private OgrenciService ogrenciService;

    @PostMapping("/ekle")
    public String ekle(@RequestBody Ogrenci ogrenci){
        ogrenciService.ogrenciKaydet(ogrenci);
        return "Yeni öğrenci kaydedildi";
    }

    @GetMapping("/yazdir")
    public List<Ogrenci> ogrencileriYazdir(){
        return ogrenciService.ogrencileriYazdir();
    }
}
