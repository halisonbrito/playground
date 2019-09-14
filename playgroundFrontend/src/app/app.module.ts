import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {  FormsModule } from '@angular/forms';
import { MatToolbarModule, MatButtonModule, MatSidenavModule, MatGridListModule, MatIconModule, MatInputModule, MatListModule, MatFormFieldModule, MatPaginatorModule,MatTableModule, MatDialog, MatDialogModule } from '@angular/material';
import { AppComponent } from './app.component';
import { ProjectCreateComponent } from './project-create/project-create.component';
import { ProjectListComponent } from './project-list/project-list.component';
import { RoutingModule } from './routing.module';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { SideNavComponent } from './side-nav/side-nav.component';


@NgModule({
  declarations: [
    AppComponent,
    ProjectCreateComponent,
    ProjectListComponent,
    SideNavComponent
  ],
  imports: [
      BrowserModule,
      FormsModule,
      MatSidenavModule,
      HttpClientModule,
      MatFormFieldModule,
      MatTableModule,
      MatInputModule,
      MatToolbarModule,
      MatListModule,
      MatIconModule,
      RoutingModule,
      BrowserAnimationsModule,
      MatDialogModule
      
    ] ,
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
