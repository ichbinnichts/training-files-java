/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import java.io.Serializable;

/**
 *
 * @author nathan.faria
 */
public class Membro implements Serializable{
    private String firstName;
    private String lastName;
    private String email;
    private Task task;

    public Membro() {
    }

    public Membro(String firstName, String lastName, String email, Task task) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
