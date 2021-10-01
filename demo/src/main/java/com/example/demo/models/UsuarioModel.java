package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "pokemon")
public class UsuarioModel {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(unique = true, nullable = false)
	 private Long id;

    private String numero;
    private String name;
    private String type_1;
    private String type_2;
    private String total;
    private String hp;
    private String attack;
    private String defense;
    private String sp_Atk;
    private String sp_Def;
    private String speed;
    private String generation;
    private String legendary;
   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType_1() {
        return type_1;
    }

    public void setType_1(String type_1) {
        this.type_1 = type_1;
    }

    public String getType_2() {
        return type_2;
    }

    public void setType_2(String type_2) {
        this.type_2 = type_2;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getHP() {
        return hp;
    }

    public void setHP(String hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getSP_Atk() {
        return sp_Atk;
    }

    public void setSP_Atk(String sp_Atk) {
        this.sp_Atk = sp_Atk;
    }

    public String getSP_Def() {
        return sp_Def;
    }

    public void setSP_Def(String sp_Def) {
        this.sp_Def = sp_Def;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getLegendary() {
        return legendary;
    }

    public void setLegendary(String legendary) {
        this.legendary = legendary;
    }

}