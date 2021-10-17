package com.artemissoftware.irisnotes.feature_source.domain.use_case

import com.artemissoftware.irisnotes.feature_source.domain.model.Note
import com.artemissoftware.irisnotes.feature_source.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}