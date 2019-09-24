package com.inti.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inti.entities.Eolien;
import com.inti.repositories.EolienRepository;
import com.inti.service.interfaces.IEolienService;
@Service
public class EolienService implements IEolienService{
    
    @Autowired
    EolienRepository eolienRepository;
    @Override
    public void delete(Eolien eolien) {
        eolienRepository.delete(eolien);
        
    }
    @Override
    public Eolien saveEolien(Eolien eolien) {
        
        return eolienRepository.save(eolien);
    }
    @Override
    public Eolien findOne(Integer id_eolien) {
        // TODO Auto-generated method stub
        return eolienRepository.findById(id_eolien).orElse(null);
    }
    @Override
    public List<Eolien> findAll() {
        
        return eolienRepository.findAll();
    }
}