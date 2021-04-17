import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { HttpClient } from '@angular/common/http'

@Component({
  selector: 'app-registtro',
  templateUrl: './registtro.page.html',
  styleUrls: ['./registtro.page.scss'],
})
export class RegisttroPage {
  lostPass = this.formBuilder.group({
    name: '',
    sname1: '',
    sname2: '',
    bdate: '',
    email: '',
    tlf: '',
    pass: ''
  })//Definimos los datos del formulario, angular tiene una forma de verificarlos automaticamente.

  constructor(private formBuilder: FormBuilder, private http: HttpClient) { }

  onSubmit(): void {
    //TODO comprobar que los datos introducidos son correctos, la seguridad viene en el servidor.

    this.http.post<any>('http://localhost:80/users/addNewUser', {mail: this.lostPass.value})
      .subscribe( data => {data.v ? console.log("Usuario Registrado") : console.log(N"o ha sido posible crear la cuenta")})
  }

}
