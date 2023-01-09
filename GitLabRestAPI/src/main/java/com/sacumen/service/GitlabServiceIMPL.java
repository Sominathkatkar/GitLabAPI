package com.sacumen.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sacumen.model.Project;
import com.sacumen.model.User;

@Service
public class GitlabServiceIMPL implements GitlabServiceI {

	@Override
	public List<User> getUsers() {
		String uri = "https://gitlab.com/api/v4/users";
		String authToken = "glpat-4-sUVqyTNUa93P7xYUEv";
		List<User> list = null;
		try {
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Bearer " + authToken);
			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			User[] users = restTemplate.exchange(uri, HttpMethod.GET, entity, User[].class).getBody();
			// Object[] users = restTemplate.getForObject(uri, Object[].class);
			list = Arrays.asList(users);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public List<Project> getProjects() {
		String uri = "https://gitlab.com/api/v4/projects";
		List<Project> projectslist = null;
		try {
			RestTemplate restTemplate1 = new RestTemplate();
			Project[] projects = restTemplate1.getForObject(uri, Project[].class);
			projectslist = Arrays.asList(projects);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return projectslist;

	}

	@Override
	public String getProjectById(int id) {
		String uri = "https://gitlab.com/api/v4/projects/" + id;
		System.out.println("uri:" + uri);
		RestTemplate resttemplate = new RestTemplate();
		String project = resttemplate.getForObject(uri, String.class);
		return project;
	}

}
