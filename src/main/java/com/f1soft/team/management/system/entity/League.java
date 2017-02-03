package com.f1soft.team.management.system.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author sunita.joshi
 */
@Entity
@Table(name = "league")
public class League implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long leagueId;

    @Column(name = "createdById")
    private Long createdById;

    @NotEmpty
    @Column(name = "leagueName")
    private String leagueName;

    @NotEmpty
    @Column(name = "countryName")
    private String countryName;

    @NotEmpty
    @Column(name = "leagueManager")
    private String leagueManager;

    public Long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    public Long getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Long createdById) {
        this.createdById = createdById;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLeagueManager() {
        return leagueManager;
    }

    public void setLeagueManager(String leagueManager) {
        this.leagueManager = leagueManager;
    }

}
