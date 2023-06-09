package com.natiqhaciyef.clot_mobile.data.di

import android.content.Context
import androidx.room.Room
import com.natiqhaciyef.clot_mobile.data.roomdb.AppDatabase
import com.natiqhaciyef.clot_mobile.data.roomdb.dao.ProductDao
import com.natiqhaciyef.clot_mobile.data.roomdb.dao.UserDao
import com.natiqhaciyef.clot_mobile.data.source.ProductDataSource
import com.natiqhaciyef.clot_mobile.data.source.UserDataSource
import com.natiqhaciyef.clot_mobile.domain.local.ProductRepository
import com.natiqhaciyef.clot_mobile.domain.local.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppLocalModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) = Room
            .databaseBuilder(context, AppDatabase::class.java, "app_database")
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @Singleton
    fun provideUserDao(database: AppDatabase) = database.getUserDao()

    @Provides
    @Singleton
    fun provideProductDao(database: AppDatabase) = database.getProduct()

    @Provides
    @Singleton
    fun provideUserDataSource(dao: UserDao) = UserDataSource(dao)

    @Provides
    @Singleton
    fun provideUserRepository(uds: UserDataSource) = UserRepository(uds)

    @Provides
    @Singleton
    fun provideProductDataSource(dao: ProductDao) = ProductDataSource(dao)

    @Provides
    @Singleton
    fun provideProductRepository(ds: ProductDataSource) = ProductRepository(ds)
}