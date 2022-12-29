package org.includejoe.noteapp.feature_note.domain.use_case

import org.includejoe.noteapp.feature_note.domain.model.InvalidNoteException
import org.includejoe.noteapp.feature_note.domain.model.Note
import org.includejoe.noteapp.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("Note title cannot be empty")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("Note content cannot be empty")
        }
        repository.insertNote(note)
    }
}