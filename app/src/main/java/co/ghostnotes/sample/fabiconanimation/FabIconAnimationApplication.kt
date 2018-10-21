package co.ghostnotes.sample.fabiconanimation

import android.app.Application
import timber.log.Timber

class FabIconAnimationApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}