package ru.zubrilinartem.shoppinglist.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import ru.zubrilinartem.shoppinglist.entities.NoteItem

@Dao
interface Dao {

    @Query("SELECT * FROM note_list")
    fun getAllNotes(): Flow<List<NoteItem>>
    @Insert
    suspend fun insertNote(note: NoteItem)
}