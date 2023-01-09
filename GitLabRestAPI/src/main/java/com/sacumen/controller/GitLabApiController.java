package com.sacumen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacumen.model.Project;
import com.sacumen.model.User;
import com.sacumen.service.GitlabServiceI;

@RestController
@RequestMapping("/GitLabApiController")
public class GitLabApiController {

	@Autowired
	private GitlabServiceI service;

	@GetMapping("/welcome")
	public String getData() {
		return "Welcome ";
	}

	@GetMapping("/users")
	public ResponseEntity<?> getUsers() {
		List<User> users = null;
		try {
			users = service.getUsers();
		} catch (Exception e) {
			e.printStackTrace();
			return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(users, HttpStatus.OK);
	}

	@GetMapping("/projects")
	public ResponseEntity<?> getProjects() {
		List<Project> projects = null;
		try {
			projects = service.getProjects();
		} catch (Exception e) {
			e.printStackTrace();
			return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(projects, HttpStatus.OK);
	}

	@GetMapping("/projects/{id}")
	public String geptProjectsById(@PathVariable int id) {
		String byId = service.getProjectById(id);
		return byId;
	}

}
