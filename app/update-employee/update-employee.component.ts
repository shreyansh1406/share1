import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClientService, Login } from '../service/httpclient.service';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {
  
  // log:guard=new guard("","");
  log:Login=new Login("","");
  isDocLoggedIn:boolean=false;
  constructor(
    private httpClientService:HttpClientService,
    public activateroute:ActivatedRoute,
    private router:Router
  ) { 
  }

  ngOnInit(): void 
  {
    //  this.activateroute.params.subscribe(params => {
    //   this.Patients.patient_ID = params['id'];
    //   });
  }
  // updateEmployees():void
  // {
    
    
  //   this.httpClientService.updateEmployees(this.Patients)
  //   .subscribe(
  //     success => alert("Done"),
  //     error => alert(error)
  //   );
  // }


  checkLogin()
  {
    this.httpClientService.getDoc(this.log).subscribe(response=>
      {if (response!=null)
      {
        this.router.navigate(['']);
        this.isDocLoggedIn=true;
      }
      else
      {
        alert("Wrong Credentials");
        this.router.navigate(['/patupdate']);
      }
    }
      );
  }
}
