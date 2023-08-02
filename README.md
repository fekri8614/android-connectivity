# android-connectivity
Wi-Fi connection samples


### `NetworkConnection.kt`:
This class observes user connectivity and returns the result as live data.

**To use:**
* *Add `ACCESS_NETWORK_STATE` to the `Manifest.xml` file.*

      <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

* *Use it in the Activity or Fragment requiring the Internet Connection.*

      val networkConnection = NetworkConnection(applicationContext)
      networkConnection.observe(this) { isConnected ->
            if (isConnected) {
                // Internet is Connected!
            } else {
                // Internet is not Connected!
            }
        }

      
