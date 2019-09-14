package com.altimetrik.playgroundBackend.util;

import java.util.Comparator;

import com.altimetrik.playgroundBackend.pojos.Project;

public class ProjectComparator implements Comparator<Project>{

	@Override
	public int compare(Project o1, Project o2) {
		
		if(o1.getYear() > o2.getYear()) {
			return -1;
		}else if(o1.getYear() < o2.getYear()) {
			return 1;
		}
		return 0;
	}

}
