import android.os.Looper
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

/**
 * This means events flowing to the main thread do not
 * have to wait for vsync, decreasing the likelihood of frame drops.
 * https://twitter.com/jakewharton/status/1170437658776133636?s=12
 */
private fun initRxAndroidScheduler() {
    RxAndroidPlugins.setInitMainThreadSchedulerHandler {
        AndroidSchedulers.from(Looper.getMainLooper(), true)
    }
}


/*
 * Debug class
 */

import timber.log.Timber

private fun initTimber() {
    Timber.plant(Timber.DebugTree())
}