package me.enginestein.wikifinder.di

import me.enginestein.wikifinder.viewmodel.WikiViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        WikiViewModel()
    }
}