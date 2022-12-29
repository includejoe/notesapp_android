package org.includejoe.noteapp.feature_note.presentation.notes

import org.includejoe.noteapp.feature_note.domain.model.Note
import org.includejoe.noteapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class Delete(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
