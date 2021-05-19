import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AuthenticationService } from '../service/authentication.service';
import { Disease, HttpClientService, PatientDiagnosis } from '../service/httpclient.service';

@Component({
  selector: 'app-perioform',
  templateUrl: './perioform.component.html',
  styleUrls: ['./perioform.component.css']
})
export class PerioformComponent implements OnInit {
  diag: PatientDiagnosis = new PatientDiagnosis(0,"","","","","","",0,"");
  diseases:Disease;
  id:Number;
  name:String;

  constructor(
    private httpClientService:HttpClientService,private activatedRoute:ActivatedRoute,
    private loginService:AuthenticationService,
  ) { }

  ngOnInit() {
    this.activatedRoute.params.subscribe(params=>{
      this.id=params['id'];
      this.name=params['name']
    });
    this.httpClientService.getDiseases().subscribe(
     response =>this.handleSuccessfulResponse(response),
    );
   
 }


handleSuccessfulResponse(response)
{
   this.diseases=response;
   
}
  createpatd(): void {
    this.httpClientService.createpatd(this.diag)
        .subscribe( data => { alert("Saved Successfully.");
        });

  };

  setChangeHandler(event:any)
  {
    this.diag.disease=event.target.value;
  }

}
