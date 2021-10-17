package com.artemissoftware.irisnotes.feature_source.data.repository

import com.artemissoftware.irisnotes.feature_source.data.data_source.NoteDao
import com.artemissoftware.irisnotes.feature_source.domain.model.Note
import com.artemissoftware.irisnotes.feature_source.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}