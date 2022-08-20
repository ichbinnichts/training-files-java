/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nathan.faria
 */
public class Projeto implements Serializable{
    private String name;
    private ArrayList<Object> membros;

    public Projeto(String name) {
        this.name = name;
    }

    public Projeto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Object> getMembros(){
        return this.membros;
    }

    public void setMembros(ArrayList<Object> membros) {
        this.membros = membros;
    }
    
}
