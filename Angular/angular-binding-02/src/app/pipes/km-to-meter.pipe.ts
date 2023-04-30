import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'kmToMeter'
})
export class KmToMeterPipe implements PipeTransform {

  transform(value: number): number {
    return value*1000;
  }

}
