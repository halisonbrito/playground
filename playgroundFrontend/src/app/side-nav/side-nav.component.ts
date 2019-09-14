import { Component, OnInit } from '@angular/core';
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Router } from '@angular/router';

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.css']
})
export class SideNavComponent implements OnInit{

  showContent: boolean;
  window: object;


  constructor(private router: Router) {}

  ngOnInit() {
    this.window = window;
  }

  logoff(){
    this.router.navigateByUrl('/');
  }

}
