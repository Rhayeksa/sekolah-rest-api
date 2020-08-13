package com.sekolah.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "siswa")
public class SiswaModel extends DateAudit<Long> {

    @Column(name = "nisn", nullable = false)
    private String nisn;

    @Column(name = "nama", nullable = false)
    private String nama;

    @Column(name = "kelas", nullable = false)
    private String kelas;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "hp", nullable = false)
    private String hp;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "alamat", nullable = false)
    private String alamat;

    public SiswaModel() {
    }

    public SiswaModel(String nisn, String nama, String kelas, String gender, String hp, String email, String alamat) {
        this.nisn = nisn;
        this.nama = nama;
        this.kelas = kelas;
        this.gender = gender;
        this.hp = hp;
        this.email = email;
        this.alamat = alamat;
    }

    public String getNisn() {
        return this.nisn;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
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

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHp() {
        return this.hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}