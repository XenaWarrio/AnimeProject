package com.example.borutoappexample.di

import android.content.Context
import androidx.room.Room
import com.example.borutoappexample.data.local.BorutoDatabase
import com.example.borutoappexample.util.Constant.BORUT0_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, BorutoDatabase::class.java, BORUT0_DATABASE).build()
}