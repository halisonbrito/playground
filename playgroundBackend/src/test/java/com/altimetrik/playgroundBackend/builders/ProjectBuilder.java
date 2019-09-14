package com.altimetrik.playgroundBackend.builders;

import com.altimetrik.playgroundBackend.pojos.Project;

public class ProjectBuilder {
	
	private Project project = new Project();
	
    public  ProjectBuilder add(String name,Integer year,String candidate) {
    	
    	
    	project.setName(name);
    	project.setYear(year);
    	project.setCandidate(candidate);
    	
    	return this;
    }
	
    public ProjectBuilder addSkill(String name) {
    	project.getSkills().add(name);
    	
    	return this;
    }
    
	public Project build(){
		return project;
	}

}
