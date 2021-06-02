/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loclt;

import java.util.List;

/**
 *
 * @author WIN
 */
public class School {

    private String name;
    private List<Team> listTeam;

    public School(String name, List<Team> listTeam) {
        this.name = name;
        this.listTeam = listTeam;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Team> getListTeam() {
        return listTeam;
    }

    public void setListTeam(List<Team> listTeam) {
        this.listTeam = listTeam;
    }

    

}
