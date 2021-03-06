package com.example.android.software_engineering_305.application;

/**
 * Created by Andrew on 2/13/18.
 *
 * BluetoothAction takes the action generated by one of the Bluetooth command intents
 * and outputs a response to be checked by the onStartCommand in BluetoothService.
 */
public enum BluetoothAction
{
    connect ("example.android.software_engineering_305.application.connect"),
    disconnect ("example.android.software_engineering_305.application.disconnect"),
    write ("example.android.software_engineering_305.application.write"),
    read ("example.android.software_engineering_305.application.read");

    private final String mAction;

    BluetoothAction(String action) {
        mAction = action;
    }

    public static BluetoothAction getAction(String action) {
        switch (action)
        {
            case "example.android.software_engineering_305.application.connect":
                return connect;
            case "example.android.software_engineering_305.application.disconnect":
                return disconnect;
            case "example.android.software_engineering_305.application.write":
                return write;
            case "example.android.software_engineering_305.application.read":
                return read;
            default:
                return null;
        }
    }

    public String toString() {
        return this.mAction;
    }
}
