import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'template-form';
  items=["First","Second"];
  value=100;

  addItem(item:any){
    this.items.push(item);
  }
}
