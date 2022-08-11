package com.pilotProject.ogrenciSistemi.service;

import com.pilotProject.ogrenciSistemi.model.Ogrenci;
import com.pilotProject.ogrenciSistemi.repository.OgrenciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OgrenciServiceImp implements OgrenciService {

    @Autowired
    private OgrenciRepository ogrenciRepository;

    @Override
    public Ogrenci ogrenciKaydet(Ogrenci ogrenci) {
        return ogrenciRepository.save(ogrenci);
    }

    @Override
    public List<Ogrenci> ogrencileriYazdir() {
        return ogrenciRepository.findAll();
    }
}
