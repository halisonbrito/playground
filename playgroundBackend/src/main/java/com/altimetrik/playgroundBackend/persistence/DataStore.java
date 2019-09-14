package com.altimetrik.playgroundBackend.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.altimetrik.playgroundBackend.pojos.Project;
import com.altimetrik.playgroundBackend.util.ProjectComparator;

public class DataStore {
	
	private static TreeSet<Project> projects = new TreeSet<Project>(new ProjectComparator());
	//private static List<Project> projects = new ArrayList<Project>();
	public static void addData(Project project) {
		projects.add(project);
	}
	
	public static List<Project> search( List<String> skills ) {
		
		return projects.stream()
				.sorted(new ProjectComparator())
				.filter( proj -> proj.getSkills().stream()
						.anyMatch( skill->skills.contains(skill) ) )
				
				.collect(Collectors.toList());
		
	}
	
}
