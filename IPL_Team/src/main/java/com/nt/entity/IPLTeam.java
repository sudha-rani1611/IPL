package com.nt.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class IPLTeam {
    @Id
    @SequenceGenerator(name="teamgen",sequenceName="",initialValue=100,allocationSize=1)
	@GeneratedValue(generator="teamgen",strategy=GenerationType.SEQUENCE)
	private Integer team_id;
	
    @Column
    @NonNull
	private String team_name;
	
    @Column
    @NonNull
	private String area;
    
	@Override
	public String toString() {
		return "IPLTeam [team_id=" + team_id + ", team_name=" + team_name + ", area=" + area + "]";
	}
}
