package com.example.borutoappexample.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.borutoappexample.util.Constant.HERO_REMOTE_KEY_DATABASE

@Entity(tableName = HERO_REMOTE_KEY_DATABASE)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false) val id: Int,
    val prevPage: Int?,
    val nextPage: Int?
)