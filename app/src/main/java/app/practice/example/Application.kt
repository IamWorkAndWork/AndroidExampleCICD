package app.practice.example

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        AppCenter.start(
            this, "457f9415-f782-4f23-921a-405cab74a1a9",
            Analytics::class.java, Crashes::class.java
        )
    }
}
