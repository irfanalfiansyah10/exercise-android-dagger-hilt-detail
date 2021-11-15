package com.example.daggerhiltdetail.module

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ServiceComponent

/**
 * Live til Service closed
 */
@Module
@InstallIn(ServiceComponent::class)
object ServiceModule {
}