package com.fmarton.cardsagainsthumanity_phone;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    BluetoothAdapter mBluetoothAdapter;
    Button joinButton;

    final int REQUEST_ENABLE_BT = 1;

    //Entry Point

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joinButton = (Button) findViewById(R.id.joinButton);
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        joinButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (!mBluetoothAdapter.isEnabled()) {
                    // We need to enable the Bluetooth, so we ask the user
                    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    // REQUEST_ENABLE_BT es un valor entero que vale 1
                    startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
                }
            }
        });
    }

    public void findBluetoothDevices(View view) {
    }
}
