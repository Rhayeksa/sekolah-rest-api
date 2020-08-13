package com.sekolah.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nilai")
public class NilaiModel extends DateAudit<Long> {

    @Column(name = "nilai")
    private Double nilai;

    @ManyToOne
    @JoinColumn(name = "id_mata_pelajaran", nullable = false)
    private MataPelajaranModel mataPelajaranModel;

    @ManyToOne
    @JoinColumn(name = "id_guru", nullable = false)
    private GuruModel guruModel;

    @ManyToOne
    @JoinColumn(name = "id_siswa", nullable = false)
    private SiswaModel siswaModel;

    public NilaiModel() {
    }

    public NilaiModel(Double nilai, MataPelajaranModel mataPelajaranModel, GuruModel guruModel, SiswaModel siswaModel) {
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

    public MataPelajaranModel getMataPelajaranModel() {
        return this.mataPelajaranModel;
    }

    public void setMataPelajaranModel(MataPelajaranModel mataPelajaranModel) {
        this.mataPelajaranModel = mataPelajaranModel;
    }

    public GuruModel getGuruModel() {
        return this.guruModel;
    }

    public void setGuruModel(GuruModel guruModel) {
        this.guruModel = guruModel;
    }

    public SiswaModel getSiswaModel() {
        return this.siswaModel;
    }

    public void setSiswaModel(SiswaModel siswaModel) {
        this.siswaModel = siswaModel;
    }

}