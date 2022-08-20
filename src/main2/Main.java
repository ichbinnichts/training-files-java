/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main2;

import fileHandler.FileHandler;
import java.util.ArrayList;
import projeto.Projeto;
import projeto.Membro;

/**
 *
 * @author nathan.faria
 */
public class Main {
    public static void main(String[] args){
        FileHandler file = new FileHandler();
        file.createDir("Projetos");
        Projeto projeto = new Projeto();
        projeto.setName("Test2");
        ArrayList<Object> membros = new ArrayList<Object>();
        Membro membro1 = new Membro();
        membro1.setFirstName("John");
        membro1.setLastName("Smith");
        Membro membro2 = new Membro();
        membro2.setFirstName("Alex");
        membro2.setLastName("Murray");
        membros.add(membro1);
        membros.add(membro2);
        projeto.setMembros(membros);
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(projeto);
        String name = projeto.getName();
        file.writer(list, ("Projetos/"+name+".txt"));
        
        
    }
}
