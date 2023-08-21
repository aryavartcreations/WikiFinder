package me.enginestein.wikifinder

import android.app.Application
import me.enginestein.wikifinder.di.networkModule
import me.enginestein.wikifinder.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class WikiApp :Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@WikiApp)
            modules(listOf(networkModule,viewModelModule))
        }

    }
}