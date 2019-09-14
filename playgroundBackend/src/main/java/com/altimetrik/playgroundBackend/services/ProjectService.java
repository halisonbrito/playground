package com.altimetrik.playgroundBackend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.altimetrik.playgroundBackend.persistence.DataStore;
import com.altimetrik.playgroundBackend.pojos.Project;
import com.altimetrik.playgroundBackend.util.GeneralException;

@Service
public class ProjectService {
	
	
	public List<Project> search( List<String> skills ) throws GeneralException{
		
		if( skills.size() > 3 ) {
			throw new GeneralException("Must be maximum 3");
		}else {
			return DataStore.search(skills);	
		}
		
	}
	
	public void save(Project project) {
		
		DataStore.addData(project);
	}

}
