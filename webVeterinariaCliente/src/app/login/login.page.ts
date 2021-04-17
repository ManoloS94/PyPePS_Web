import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { HttpClient } from '@angular/common/http'

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage {
  lostPass = this.formBuilder.group({
    name: '',
    email: ''
  })

  constructor(private formBuilder: FormBuilder, private http: HttpClient) { }

  onSubmit(): void {
    //TODO comprobar que los datos introducidos son correctos, la seguridad viene en el servidor.

    this.http.post<any>('http://localhost:80/users/login', {mail: this.lostPass.value})
      .subscribe( data => {data.v ? console.log("Sesión Iniciada") : console.log("No se ha podido iniciar sesion.")})
  }

}
