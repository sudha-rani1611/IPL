package com.nt.service;

import com.nt.entity.Player;
import com.nt.exceptions.PlayerNotFoundException;

public interface IPlayerService {

	public String addPlayer(Player p);
	
	public String removePlayer(int id);
	
	public String updatePlayer(Player p) throws PlayerNotFoundException;
	
	public String deletePlayer(int id);
	
	public String findPlayer(int id) throws PlayerNotFoundException;
}
