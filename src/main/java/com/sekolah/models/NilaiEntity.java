package com.sekolah.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nilai")
public class NilaiEntity extends DateAudit<Long> {

    @Column(name = "nilai")
    private Double nilai;

    @ManyToOne
    @JoinColumn(name = "id_mata_pelajaran", nullable = false)
    private MataPelajaranEntity mataPelajaranModel;

    @ManyToOne
    @JoinColumn(name = "id_guru", nullable = false)
    private GuruEntity guruModel;

    @ManyToOne
    @JoinColumn(name = "id_siswa", nullable = false)
    private SiswaEntity siswaModel;

    public NilaiEntity() {
    }

    public NilaiEntity(Double nilai, MataPelajaranEntity mataPelajaranModel, GuruEntity guruModel,
            SiswaEntity siswaModel) {
        this.nilai = nilai;
        this.mataPelajaranModel = mataPelajaranModel;
        this.guruModel = guruModel;
        this.siswaModel = siswaModel;
    }

    public Double getNilai() {
        return this.nilai;
    }

    public void setNilai(Double nilai) {
        this.nilai = nilai;
    }

    public MataPelajaranEntity getMataPelajaranModel() {
        return this.mataPelajaranModel;
    }

    public void setMataPelajaranModel(MataPelajaranEntity mataPelajaranModel) {
        this.mataPelajaranModel = mataPelajaranModel;
    }

    public GuruEntity getGuruModel() {
        return this.guruModel;
    }

    public void setGuruModel(GuruEntity guruModel) {
        this.guruModel = guruModel;
    }

    public SiswaEntity getSiswaModel() {
        return this.siswaModel;
    }

    public void setSiswaModel(SiswaEntity siswaModel) {
        this.siswaModel = siswaModel;
    }

}