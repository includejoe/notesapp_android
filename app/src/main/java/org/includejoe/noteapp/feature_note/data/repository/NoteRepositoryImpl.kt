package org.includejoe.noteapp.feature_note.data.repository

import kotlinx.coroutines.flow.Flow
import org.includejoe.noteapp.feature_note.data.data_source.NoteDao
import org.includejoe.noteapp.feature_note.domain.model.Note
import org.includejoe.noteapp.feature_note.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNotesById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}