package com.sekolah.dao;

import com.sekolah.models.SiswaEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SiswaDao extends JpaRepository<SiswaEntity, Long> {

}