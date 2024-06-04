package com.yoxpreso.plugins.touchpressure;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "TouchPressure")
public class TouchPressurePlugin extends Plugin {

    private TouchPressure implementation = new TouchPressure();
    private boolean pressureSupported = false;

    @Override
    public void load() {
        super.load();

        // Detects if device support touch pressure
        View view = getActivity().getWindow().getDecorView().getRootView();
        view.setOnTouchListener(new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    float pressure = event.getPressure();
                    float maxPressure = event.getDevice().getMotionRange(MotionEvent.AXIS_PRESSURE).getMax();
                    pressureSupported = maxPressure > 1.0;
                    return true;
                }
                return false;
            }
        });
    }

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @SuppressLint("ClickableViewAccessibility")
    @PluginMethod
        public void startListening(PluginCall call) {
            getBridge().getWebView().setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction() == MotionEvent.ACTION_MOVE) {
                        float pressure = event.getPressure();
                        JSObject jsObject = new JSObject();
                        jsObject.put("pressure", pressure);
                        notifyListeners("pressureChanged", jsObject);
                    }
                    return true;
                }
            });
            call.resolve();
        }



         @PluginMethod
          public void stopListening(PluginCall call) {
            getBridge().getWebView().setOnTouchListener(null);
            call.resolve();
          }

        @PluginMethod
        public void isPressureSensitiveAvailable(PluginCall call) {
            JSObject ret = new JSObject();
            ret.put("available", pressureSupported);
            call.resolve(ret);
        }



}
