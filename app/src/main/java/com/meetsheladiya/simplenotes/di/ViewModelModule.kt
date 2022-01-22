package com.meetsheladiya.simplenotes.di

import androidx.lifecycle.ViewModel
import com.meetsheladiya.simplenotes.ui.NoteViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    // Method #1
    @Binds
    @IntoMap
    @ViewModelKey(NoteViewModel::class)
    abstract fun bindMainViewModel(notesViewModel: NoteViewModel): ViewModel
}
