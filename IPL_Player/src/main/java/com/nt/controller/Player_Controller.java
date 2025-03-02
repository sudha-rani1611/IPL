package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Player;
import com.nt.exceptions.PlayerNotFoundException;
import com.nt.service.PlayerService;

@RestController
@RequestMapping("/player-api")
@RefreshScope
public class Player_Controller {
    
	@Autowired
	private PlayerService service;
	//save player
	@PostMapping("/save")
	public ResponseEntity<String> savePlayer(@RequestBody Player p)
	{
		String msg = service.addPlayer(p);
		return new ResponseEntity(msg,HttpStatus.OK);
	}
	
	@GetMapping("/findbyid/{id}")
	public ResponseEntity<String> findPlayer(@PathVariable int id) throws PlayerNotFoundException
	{
		String msg = service.findPlayer(id);
		return new ResponseEntity(msg,HttpStatus.OK);
	}
	
	@PutMapping("update")
	public ResponseEntity<String> updatePlayer(@RequestBody Player p) throws PlayerNotFoundException
	{
		String msg = service.updatePlayer(p);
		return new ResponseEntity(msg,HttpStatus.OK);	
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deletePlayer(@PathVariable int id)
	{
		service.deletePlayer(id);
		return null;
	}
}
