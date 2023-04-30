import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {
  @Output() newItemEvent = new EventEmitter<string>();
  @Input() data=0;
  
  addNewItem(value: string){
    this.newItemEvent.emit(value);
  }
}
