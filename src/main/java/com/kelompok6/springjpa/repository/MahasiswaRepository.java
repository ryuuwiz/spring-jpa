package com.kelompok6.springjpa.repository;

import com.kelompok6.springjpa.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long> {
}
