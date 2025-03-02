package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Player;
import com.nt.exceptions.PlayerNotFoundException;
import com.nt.repository.PlayerRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PlayerService  implements IPlayerService{

	@Autowired
	private PlayerRepository repo;
	
	@Override
	public String addPlayer(Player p) {
		return null;
	}

	@Override
	public String removePlayer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updatePlayer(Player p) throws PlayerNotFoundException {
		Optional opt = repo.findById(p.getPlayer_id());
		if(opt.isPresent())
		{
			repo.save(p);
			return "Updated Successfully "; 
		}
		else
	         throw new PlayerNotFoundException("Invalid Id");
	}

	@Override
	public String deletePlayer(int id) {
		if(repo.findById(id).isPresent())
		{
			repo.deleteById(id);
			return "deleted Successfully";
		}
		else
			return "Player Not Found";
	}

	@Override
	public String findPlayer(int id) throws PlayerNotFoundException {
		Optional<Player> opt =repo.findById(id);
		if(opt.isPresent())
		{
			return "Player Details: "+opt.get();
		}
		else
		{
			   throw new PlayerNotFoundException("Invalid Id");
		}
	}

}
