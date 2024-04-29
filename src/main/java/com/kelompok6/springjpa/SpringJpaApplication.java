package com.kelompok6.springjpa;

import com.kelompok6.springjpa.model.Mahasiswa;
import com.kelompok6.springjpa.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication {

	@Autowired
	MahasiswaService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return (args) -> {
			service.add(new Mahasiswa("RYU KURNIANTO PUTRA", "211011450106"));
			service.add(new Mahasiswa(  "WAHYU REZA HABIBI", "211011450144"));
			service.add(new Mahasiswa(  "WAHYU RAMADHAN", "211011450533"));
			service.add(new Mahasiswa(  "TIRA", "211011450105"));
			service.add(new Mahasiswa(  "RIZAL WAHYUDIN", "181011450048"));
		};
	}

}
