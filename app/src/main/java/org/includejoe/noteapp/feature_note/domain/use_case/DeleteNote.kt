package org.includejoe.noteapp.feature_note.domain.use_case

import org.includejoe.noteapp.feature_note.domain.model.Note
import org.includejoe.noteapp.feature_note.domain.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}