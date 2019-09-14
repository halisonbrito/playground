import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { ProjectListComponent } from './project-list/project-list.component';
import { ProjectCreateComponent } from './project-create/project-create.component';

const routes: Routes = [{
    path: 'list', component: ProjectListComponent},
    {path: 'create', component: ProjectCreateComponent}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class RoutingModule { }