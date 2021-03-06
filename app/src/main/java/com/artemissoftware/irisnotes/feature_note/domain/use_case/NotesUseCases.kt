package com.artemissoftware.irisnotes.feature_note.domain.use_case

data class NotesUseCases(
    val getNotes: GetNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
    val addNote: AddNoteUseCase,
    val getNote: GetNoteUseCase
)
