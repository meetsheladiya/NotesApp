package com.meetsheladiya.simplenotes.di


import com.meetsheladiya.simplenotes.ui.AddFragment
import com.meetsheladiya.simplenotes.ui.EditFragment
import com.meetsheladiya.simplenotes.ui.ListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


// declare all the fragments here , dependency of fragments are provided by this module

@Module
abstract class FragmentBuildersModule {

    // Method #1
    @ContributesAndroidInjector
    abstract fun contributeListFragment(): ListFragment

    // Method #2
    @ContributesAndroidInjector
    abstract fun contributeAddFragment(): AddFragment

    // Method #3
    @ContributesAndroidInjector
    abstract fun contributeEditFragment(): EditFragment
}