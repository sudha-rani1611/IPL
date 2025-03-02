package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.IPLTeam;

@Repository
public interface IPLTeamRepository extends JpaRepository<IPLTeam,Integer>{

}
