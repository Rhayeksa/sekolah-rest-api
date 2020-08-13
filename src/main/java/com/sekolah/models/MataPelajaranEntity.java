package com.sekolah.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mata_pelajaran")
public class MataPelajaranEntity extends DateAudit<Long> {

    @Column(name = "kode")
    private String kode;

    @Column(name = "nama")
    private String nama;

    @Column(name = "kelas")
    private String kelas;

    @Column(name = "banyak_bab")
    private Integer banyakBab;

    @Column(name = "deskripsi")
    private String deskripsi;

    public MataPelajaranEntity() {
    }

    public MataPelajaranEntity(String kode, String nama, String kelas, Integer banyakBab, String deskripsi) {
        this.kode = kode;
        this.nama = nama;
        this.kelas = kelas;
        this.banyakBab = banyakBab;
        this.deskripsi = deskripsi;
    }

    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return this.kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public Integer getBanyakBab() {
        return this.banyakBab;
    }

    public void setBanyakBab(Integer banyakBab) {
        this.banyakBab = banyakBab;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}