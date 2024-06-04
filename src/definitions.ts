declare module "@capacitor/core" {
  interface PluginRegistry {
    TouchPressure: TouchPressurePlugin;
  }
}

export interface TouchPressurePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  startListening(): Promise<void>;
  stopListening(): Promise<void>;
  is3DTouchAvailable(): Promise<{ available: boolean }>; // only for iOS
  isPressureSensitiveAvailable(): Promise<{ available: boolean }>; // only for Android
}
