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

import com.nt.entity.IPLTeam;
import com.nt.service.IPLTeam_IService;

@RefreshScope
@RestController
@RequestMapping("team-api")
public class IPLTeamRestController {

	@Autowired
	private IPLTeam_IService service;
	
	@PostMapping("saveteam")
	public ResponseEntity<String> registerTeam(@RequestBody IPLTeam team)
	{
		String msg = service.saveTeam(team);
		return new ResponseEntity(msg,HttpStatus.OK);
	}
	
	@GetMapping("/findteam/{id}")
	public ResponseEntity<String> getTeam(@PathVariable int id)
	{
		String msg = service.findTeam(id);
	    return new ResponseEntity(msg,HttpStatus.OK);
	}
		
	@PutMapping("/updateteam")
	public ResponseEntity<String> updateTeam(@RequestBody IPLTeam team)
	{
		String msg = service.updateTeam(team);
		return new ResponseEntity(msg,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteteam/{id}")
	public ResponseEntity<String> deleteTeam(@PathVariable int id)
	{
		String msg = service.deleteTeam(id);
	    return new ResponseEntity(msg,HttpStatus.OK);
	}
	
}
