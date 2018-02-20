package com.junsu.estimotetest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.estimote.cloud_plugin.common.EstimoteCloudCredentials
import com.estimote.proximity_sdk.proximity.ProximityObserverBuilder

class MainActivity : AppCompatActivity() {

    val cloudCredentials by lazy {
        EstimoteCloudCredentials(YOUR_APP_ID_HERE, YOUR_APP_TOKEN_HERE)
    }
    val proximityObserver by lazy {
        ProximityObserverBuilder(applicationContext, cloudCredentials)
                .withBalancedPowerMode()
                .withOnErrorAction { /* handle errors here */ }
                .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
