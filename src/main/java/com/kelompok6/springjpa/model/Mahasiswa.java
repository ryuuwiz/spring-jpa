package com.kelompok6.springjpa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mhs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nama")
    @NotBlank(message = "Nama harus diisi")
    private String nama;

    @Column(name = "nim")
    @NotBlank(message = "Nim harus diisi")
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
}
