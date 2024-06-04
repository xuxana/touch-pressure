import { WebPlugin } from '@capacitor/core';

import type { TouchPressurePlugin } from './definitions';

export class TouchPressureWeb extends WebPlugin implements TouchPressurePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async startListening(): Promise<void> {
    console.warn('startListening is not implemented on web');
  }

  async stopListening(): Promise<void> {
    console.warn('stopListening is not implemented on web');
  }

  async is3DTouchAvailable(): Promise<{ available: boolean }> {
    return { available: false };
  }

  async isPressureSensitiveAvailable(): Promise<{ available: boolean }> {
    return { available: false };
  }
}
