import { WebPlugin } from '@capacitor/core';

import type { TouchPressurePlugin } from './definitions';

export class TouchPressureWeb extends WebPlugin implements TouchPressurePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
