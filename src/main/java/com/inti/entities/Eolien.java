package com.inti.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Eolien {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int id_eolien;
    public float latitude;
    public float longitude;
    public String nom_eolien;
}