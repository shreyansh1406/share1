import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../service/authentication.service';
import { Employee, HttpClientService } from '../service/httpclient.service';

@Component({
  selector: 'app-ufront',
  templateUrl: './ufront.component.html',
  styleUrls: ['./ufront.component.css']
})
export class UfrontComponent implements OnInit {

  employees:Employee[];
    
   
  constructor(
    private httpClientService:HttpClientService,
    private loginService:AuthenticationService
  ) { }

  ngOnInit() {
     this.httpClientService.getEmployees().subscribe(
      response =>this.handleSuccessfulResponse(response),
     );
  }

handleSuccessfulResponse(response)
{
    this.employees=response;
}

}
