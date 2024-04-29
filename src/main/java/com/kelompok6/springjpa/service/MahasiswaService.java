package com.kelompok6.springjpa.service;

import com.kelompok6.springjpa.model.Mahasiswa;
import com.kelompok6.springjpa.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MahasiswaService {
    @Autowired
    private MahasiswaRepository repo;

    public List<Mahasiswa> all() {
        return repo.findAll();
    }

    public Mahasiswa add(Mahasiswa mhs) {
        return repo.save(mhs);
    }

    public Optional<Mahasiswa> find(long id) {
        return repo.findById(id);
    }
}
