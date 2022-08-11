package com.pilotProject.ogrenciSistemi.service;

import com.pilotProject.ogrenciSistemi.model.Ogrenci;

import java.util.List;

public interface OgrenciService {

    public Ogrenci ogrenciKaydet(Ogrenci ogrenci);
    public List<Ogrenci> ogrencileriYazdir();
}
