package com.nt.service;

import com.nt.entity.IPLTeam;
import com.nt.exceptions.TeamNotFoundException;

public interface IPLTeam_IService {

	public String saveTeam(IPLTeam team);
	
	public String findTeam(int id) throws TeamNotFoundException;
	
	public String updateTeam(IPLTeam team);
	
	public String deleteTeam(int id);
}
