package com.pilotProject.ogrenciSistemi.repository;

import com.pilotProject.ogrenciSistemi.model.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgrenciRepository  extends JpaRepository <Ogrenci, Integer> {
}
