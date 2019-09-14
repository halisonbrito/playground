import { Component, OnInit } from '@angular/core';
import { ProjectService } from '../services/project.service';
import { SelectorMatcher } from '@angular/compiler';

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.css']
})
export class ProjectListComponent implements OnInit {

  displayedColumns: string[] = [ 'name','year','skills','candidate'];
   dataSource:any ;

   skill1:boolean;
   skill2:boolean;
   skill3:boolean;
   skill4:boolean;
   
   skills:Array<String> = new Array<String>();

  constructor(private service:ProjectService) { }

  ngOnInit() {
  }

  private load(){
    if(this.skill1){
      this.skills.push('Java');
    }
    if(this.skill2){
      this.skills.push('Oracle');
    } 
    if(this.skill3){
      this.skills.push('Javascript');

    }

    console.log(this.skill4);
    if(this.skill4){
      this.skills.push('C#');
    }

  }
  public search(){
    
    this.load();
    console.log("test" + this.skills)
    this.service.loadData(this.skills).subscribe(
      data => this.dataSource = data,
      error => window.alert (error.error.errorMessage) 
    );

    //window.alert(error.errorMessage)
    this.skills = new Array<String>();
  }

}

export interface PeriodicElement {
  year: number;
  skills: string[];
  name: string;
}


const ELEMENT_DATA: PeriodicElement[] = [
  {year:2000, skills: ['A','B'],name: 'Hydrogen'}
];
