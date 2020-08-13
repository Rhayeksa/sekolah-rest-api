package com.sekolah.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "guru")
public class GuruModel extends DateAudit<Long> {

    @Column(name = "nign", nullable = false)
    private String nign;

    @Column(name = "nama", nullable = false)
    private String nama;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "hp", nullable = false)
    private String hp;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "alamat", nullable = false)
    private String alamat;

    public GuruModel() {
    }

    public GuruModel(String nign, String nama, String gender, String hp, String email, String alamat) {
        this.nign = nign;
        this.nama = nama;
        this.gender = gender;
        this.hp = hp;
        this.email = email;
        this.alamat = alamat;
    }

    public String getNign() {
        return this.nign;
    }

    public void setNign(String nign) {
        this.nign = nign;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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