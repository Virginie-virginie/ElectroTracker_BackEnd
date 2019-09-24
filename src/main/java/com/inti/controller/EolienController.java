package com.inti.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.inti.entities.Eolien;
import com.inti.service.impl.EolienService;
@RestController
@RequestMapping("/eolien")
@CrossOrigin(origins = "http://localhost:4200")
public class EolienController {
    @Autowired
    EolienService eolienService;
    
    @GetMapping(value = "allEolien")
    public List<Eolien> findAll(){
        List<Eolien> eo = eolienService.findAll();
        return eo;
    }
    
    @GetMapping(value = "findById/{id}")
    public Eolien findById(@PathVariable Integer id_eolien) {
        if (eolienService.findOne(id_eolien) == null) {
            return null;
        } else
            return eolienService.findOne(id_eolien);
    }
    
    @PostMapping(value = "addEolien")
    public Eolien addNewEolien(@RequestBody Eolien eolien) {
        return eolienService.saveEolien(eolien);
    }
    
    @DeleteMapping(value = "delete/{id}")
    public void deleteEolien(@PathVariable int id) {
        if (eolienService.findOne(id) != null) {
            eolienService.delete(eolienService.findOne(id));
        }
        }
    
}