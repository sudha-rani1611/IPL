package com.nt.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@Slf4j
public class Player {
    @Id
    @SequenceGenerator(name="player_gen",sequenceName="player_seq",initialValue=1001,allocationSize=1)
    @GeneratedValue(generator="player_gen" ,strategy=GenerationType.SEQUENCE)
	private Integer player_id;
    
    @NonNull
    @Column
	private String player_name;
    
    @ManyToOne(targetEntity=IPLTeam.class,cascade=CascadeType.ALL , fetch= FetchType.LAZY)
    @JoinColumn(name= "team_id",referencedColumnName="team_id")
	private IPLTeam team;
    	
	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", player_name=" + player_name +"]";
	} 
}
