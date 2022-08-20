/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import fileHandler.FileHandler;
import java.util.ArrayList;
import java.util.Scanner;
import projeto.Membro;
import projeto.Projeto;

/**
 *
 * @author nathan.faria
 */
public class Main {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        ProjectHandler pro = new ProjectHandler();
        int c = 0;
        while(c != 5){
            System.out.println("1 - Create a project\n2 - Search project\n3 - Edit project");
            System.out.println("4 - Delete project\n5 - Exit");
            c = Integer.parseInt(read.nextLine());
            if(c == 1){
                pro.createProject();
            }else if(c == 2){
                System.out.print("Whats the name of the project: ");
                String name = read.nextLine();
                pro.searchProject(name);
            }else if(c == 3){
                
            }else if(c == 4){
                
            }
            
        }
        
    }
    
}
