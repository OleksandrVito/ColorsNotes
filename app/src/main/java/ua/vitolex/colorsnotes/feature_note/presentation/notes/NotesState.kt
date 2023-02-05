package ua.vitolex.colorsnotes.feature_note.presentation.notes

import ua.vitolex.colorsnotes.feature_note.domain.model.Note
import ua.vitolex.colorsnotes.feature_note.domain.util.NoteOrder
import ua.vitolex.colorsnotes.feature_note.domain.util.OrderType

data class NotesState (
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)