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
public class Team {

    private String teamName;
    private List<Player> listPlayer;

    public Player addPlayer(Player player) {
        player = new Player(player.getId(), player.getName(), player.getTeamName());
        return player;
    }

    public Team(String teamName, List<Player> listPlayer) {
        this.teamName = teamName;
        this.listPlayer = listPlayer;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getListPlayer() {
        return listPlayer;
    }

    public void setListPlayer(List<Player> listPlayer) {
        this.listPlayer = listPlayer;
    }

}
