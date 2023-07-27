package info.fekri.connsamp.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import info.fekri.connsamp.doamin.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}