import { registerPlugin } from '@capacitor/core';

import type { TouchPressurePlugin } from './definitions';

const TouchPressure = registerPlugin<TouchPressurePlugin>('TouchPressure', {
  web: () => import('./web').then(m => new m.TouchPressureWeb()),
});

export * from './definitions';
export { TouchPressure };
