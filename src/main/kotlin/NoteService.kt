object NoteService {
    var notes = mutableListOf<Note>()
    private var increasedId = 0


    fun clear() {
        notes = emptyList<Note>().toMutableList()
        increasedId = 0
    }

    fun add(
        title: String,
        text: String,
        privacy: Int,
        commentPrivacy: Int,
        privacyView: String,
        privacyComment: String
    ): Int {
        increasedId++
        notes.add(Note(id = increasedId, 1, title = title, text = text))
        return notes[increasedId].id

    }

    fun edit(noteId: Int, title: String, text: String, commentPrivacy: Int, privacyView: String, privacyComment: String): Boolean{
       var result = false

        for (note in notes) {
           if (note.id == noteId) {
               note.title = title
               note.text = text
               result = true
           }
       }
        return result
    }
}