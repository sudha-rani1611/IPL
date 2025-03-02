package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.IPLTeam;
import com.nt.exceptions.TeamNotFoundException;
import com.nt.repository.IPLTeamRepository;

@Service
public class IPLTeam_Service implements IPLTeam_IService{

	@Autowired
	private IPLTeamRepository repo;
	
	@Override
	public String saveTeam(IPLTeam team) {
		IPLTeam t =repo.save(team);
		return "Team Registerd Sucessfully With Id : "+t.getTeam_id();
	}

	@Override
	public String findTeam(int id) throws TeamNotFoundException {
	    Optional<IPLTeam> opt = repo.findById(id);
	    if(opt.isPresent())
	    {
	    	return opt.get().toString();
	    }
	    else
	    {
	          throw new TeamNotFoundException("Team Doesn't Exists");	
	    }
	}

	@Override
	public String updateTeam(IPLTeam team) {
		if(repo.existsById(team.getTeam_id()))
		{
			repo.save(team);
			return "Updated Successfully";
		}
		else
		{
		    throw new TeamNotFoundException("Team Doesn't Exists");	
		}
	}

	@Override
	public String deleteTeam(int id) {
           repo.deleteById(id);
           if(repo.existsById(id))
           {
        	   return "Failed To Delete";
           }
           else
           {
        	  return "Team Deleted Successfully";   
           }
	}
}
