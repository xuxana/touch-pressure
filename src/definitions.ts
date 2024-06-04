export interface TouchPressurePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
