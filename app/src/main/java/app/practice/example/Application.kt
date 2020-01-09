package app.practice.example

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        AppCenter.start(
            this, "7f065491-d32e-49c8-a41a-9343902ff938",
            Analytics::class.java, Crashes::class.java
        )
    }
}