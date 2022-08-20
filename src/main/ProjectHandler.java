/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import FileHandler.FileHandler;
import java.util.ArrayList;
import java.util.Scanner;
import projeto.Membro;
import projeto.Projeto;

/**
 *
 * @author nathan.faria
 */
public class ProjectHandler {
    public void createProject(){
        Scanner read = new Scanner(System.in);
        Projeto projeto = new Projeto();
        System.out.print("Whats the name of the project: ");
        projeto.setName(read.nextLine());
        System.out.print("How many members ?: ");
        int mm = read.nextInt();
        ArrayList<Object> members = new ArrayList<Object>();
        Membro member = new Membro();
        for(int i =0;i<mm;i++){
            System.out.print("Type the first name of the member "+(i+1)+":");
            member.setFirstName(read.nextLine());
            System.out.print("Type the last name of the member "+(i+1)+":");
            member.setLastName(read.nextLine());
            members.add(member);
        }
        ArrayList<Object> projetos = new ArrayList<Object>();
        FileHandler file = new FileHandler();
        file.writer(projetos, "projetos.txt");
    }
    public void searchProject(String name){
        FileHandler file = new FileHandler();
        ArrayList<Object> list = new ArrayList<Object>();
        list = file.reader("projetos.txt");
        boolean found = false;
        for(int i =0;i<list.size();i++){
            Projeto projeto = new Projeto();
            projeto = (Projeto) list.get(i);
            if(name == projeto.getName()){
                System.out.println(projeto);
                found = true;
            }else{
                found = false;
            }
        }
        if(!found){
            System.out.println("Project not found");
        }
    }
    
}
