package com.altimetrik.playgroundBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.playgroundBackend.pojos.Project;
import com.altimetrik.playgroundBackend.services.ProjectService;
import com.altimetrik.playgroundBackend.util.GeneralException;

@RestController("/api/project")
@CrossOrigin(origins = { "http://localhost:4200"}, maxAge = 6000)
public class ProjectController {
	
	@Autowired
	
	private ProjectService projectService;
	
	@GetMapping
	public List<Project> list(@RequestParam("skills") List<String> list) throws GeneralException {
		return projectService.search(list);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody Project project){
		System.out.println("test "+ project.getName());	
		projectService.save(project);
	}
	
	
}
