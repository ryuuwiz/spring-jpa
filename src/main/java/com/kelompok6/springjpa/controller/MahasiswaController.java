package com.kelompok6.springjpa.controller;

import com.kelompok6.springjpa.model.Mahasiswa;
import com.kelompok6.springjpa.service.MahasiswaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MahasiswaController {
    @Autowired
    MahasiswaService service;

    @GetMapping("/mhs")
    public ResponseEntity<List<Mahasiswa>> allMahasiswa() {
            return new ResponseEntity<>(service.all(), HttpStatus.OK);
    }

    @GetMapping("/mhs/{id}")
    public ResponseEntity<Mahasiswa> getMahasiswaByNIM(@PathVariable("id") long id) {
        Optional<Mahasiswa> mhs = service.find(id);

        if (mhs.isPresent()) {
            return new ResponseEntity<>(mhs.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
