package kyrylo.semendiaiev.mynotes;

import androidx.cardview.widget.CardView;

import kyrylo.semendiaiev.mynotes.Models.Notes;

public interface NotesClickListener {

    void onClick (Notes notes);
    void onLongClick (Notes notes, CardView cardView);



}
