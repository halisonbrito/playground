import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
  })
export class ProjectService{

    private url:string = 'http://localhost:8080/api/project';

    constructor(private httpClient:HttpClient){

    }

    public loadData(skills){
        return this.httpClient.get(this.url,{ params: { "skills": skills } });
    }

    public save(project){
        this.httpClient.post(this.url,project).subscribe(
            data => console.log('success', data),
            error => console.log('oops', error)
          );;
    }

}