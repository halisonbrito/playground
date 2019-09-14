package com.altimetrik.playgroundBackend;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.altimetrik.playgroundBackend.builders.ProjectBuilder;
import com.altimetrik.playgroundBackend.persistence.DataStore;
import com.altimetrik.playgroundBackend.pojos.Project;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlaygroundBackendApplicationTests {
	
	List<Project> projects = new ArrayList<Project>();

	@Before
	public void contextLoads() {
		
		DataStore.addData(new ProjectBuilder()
	              .add("test1", 2011,"John")
	              .addSkill("A")
	              .build());
		DataStore.addData(new ProjectBuilder()
	            .add("test2", 2010,"John")
	            .addSkill("A")
	            .addSkill("B")
	            .build());

	}
	
	@Test
	public void testSearchSkillsMatches() {
		List<String> skills = new ArrayList<String>();
		skills.add("A");
		skills.add("B");
		skills.add("C");
		
		List<Project> projects = DataStore.search(skills);
		
		Assert.assertSame("test1", projects.get(0).getName());
		
	}
	
	@Test
	public void testSearchSkillsNotMatch() {
		List<String> skills = new ArrayList<String>();
		skills.add("C");
		
		List<Project> projects = DataStore.search(skills);
		
		Assert.assertTrue(projects.size() == 0);
		
	}

}
