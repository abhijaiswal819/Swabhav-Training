import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SaveupdateComponent } from './saveupdate/saveupdate.component';
import { StudentComponent } from './student/student.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path:"",component:LoginComponent},
  {path:"student",component:StudentComponent},
  {path:"saveupdate/:id",component:SaveupdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
