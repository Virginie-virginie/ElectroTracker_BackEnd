package com.inti.service.interfaces;
import java.util.List;
import com.inti.entities.Eolien;
public interface IEolienService {
    
public void delete(Eolien eolien);
    
    public Eolien saveEolien(Eolien eolien);
    
    public Eolien findOne(Integer id_eolien);
    
    public List<Eolien> findAll();
}