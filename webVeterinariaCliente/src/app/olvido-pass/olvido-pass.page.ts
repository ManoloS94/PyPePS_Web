import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { HttpClient } from '@angular/common/http'


@Component({
  selector: 'app-olvido-pass',
  templateUrl: './olvido-pass.page.html',
  styleUrls: ['./olvido-pass.page.scss'],
})
export class OlvidoPassPage {
  lostPass = this.formBuilder.group({
    email: ''
  })

  constructor(private formBuilder: FormBuilder, private http: HttpClient) { }

  onSubmit(): void {

    this.http.post<any>('http://localhost:80/users/reset', {mail: this.lostPass.value})
      .subscribe( data => {console.log("Se ha enviado un correo para recuperar la contraseña")})
  }

}
