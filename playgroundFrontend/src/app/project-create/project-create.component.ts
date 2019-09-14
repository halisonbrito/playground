import { Component, OnInit, Input } from '@angular/core';
import { projection } from '@angular/core/src/render3';
import { MatCheckbox } from '@angular/material';
import { ProjectService } from '../services/project.service';

@Component({
  selector: 'app-project-create',
  templateUrl: './project-create.component.html',
  styleUrls: ['./project-create.component.css']
})
export class ProjectCreateComponent implements OnInit {

  proj = {
    name: '',
    skills:[],
    year: '',
    candidate: ''
  };

  skill1:boolean;
  skill2:boolean;
  skill3:boolean;
  skill4:boolean;

  constructor(private service:ProjectService) { }

  ngOnInit() {
  }

  public onSubmit(){
    
    console.log(this.proj);

    if(this.skill1){
      this.proj.skills.push('Java');
    }
    if(this.skill2){
      this.proj.skills.push('Oracle');
    }
    if(this.skill3){
      this.proj.skills.push('Javascript');

    }
    if(this.skill4){
      this.proj.skills.push('C#');
    }

    this.service.save(this.proj);

    window.alert("Success Saved!")

  }

}
