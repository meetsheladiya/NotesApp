package com.meetsheladiya.simplenotes.di

import android.app.Application
import androidx.room.Room
import com.meetsheladiya.simplenotes.persistence.NoteDao
import com.meetsheladiya.simplenotes.persistence.NoteDatabase
import com.meetsheladiya.simplenotes.repository.NoteRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


//Provide all the app level dependency here
@Module
class AppModule {


    // Method #1
    @Singleton
    @Provides
    fun providesAppDatabase(app:Application):NoteDatabase{
        return Room.databaseBuilder(app,NoteDatabase::class.java,"note_database").build()
    }

    // Method #2
    @Singleton
    @Provides
    fun providesNoteDao(db: NoteDatabase): NoteDao {
        return db.noteDao()
    }

    // Method #3
    @Provides
    fun providesRepository(noteDao: NoteDao):NoteRepository{
        return NoteRepository(noteDao)
    }
}