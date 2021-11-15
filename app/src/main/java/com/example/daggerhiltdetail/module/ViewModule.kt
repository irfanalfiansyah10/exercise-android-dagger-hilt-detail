package com.example.daggerhiltdetail.module

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewComponent

/**
 * Live til View closed
 */
@Module
@InstallIn(ViewComponent::class)
object ViewModule {
}