package com.example.sid.android.di

import android.content.Context
import android.content.SharedPreferences
import com.example.sid.android.R
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InterviewModule {

    @Provides
    @Singleton
    internal fun provideSharedPreferences(app: Context): SharedPreferences {
        return app.getSharedPreferences(
            app.getString(R.string.preference_file_key),
            Context.MODE_PRIVATE
        )
    }
}
