package com.example.daggerhiltdetail.module

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

/**
 * Live til Fragment closed
 */
@Module
@InstallIn(FragmentComponent::class)
object FragmentModule {
}