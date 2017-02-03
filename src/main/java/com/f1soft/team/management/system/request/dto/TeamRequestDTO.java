
package com.f1soft.team.management.system.request.dto;

import java.io.Serializable;

/**
 *
 * @author sunita.joshi
 */
public class TeamRequestDTO implements Serializable{
    private Long teamId;
    private Long createdById;
    private String teamName;
    private String playerName;
    private String teamManager;

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Long getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Long createdById) {
        this.createdById = createdById;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeamManager() {
        return teamManager;
    }

    public void setTeamManager(String teamManager) {
        this.teamManager = teamManager;
    }
    
    
    
}
