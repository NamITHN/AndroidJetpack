package com.namnt.roomlivedatamodelapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteAdapter extends ListAdapter<Note,NoteAdapter.NodeViewHolder> {



    protected NoteAdapter() {
        super(DIFF_CALLBACK);
    }
    private static final  DiffUtil.ItemCallback DIFF_CALLBACK = new DiffUtil.ItemCallback<Note>() {
        @Override
        public boolean areItemsTheSame(@NonNull Note oldItem, @NonNull Note newItem) {
            return oldItem.getId()==newItem.getId();
        }

        @Override
        public boolean areContentsTheSame(@NonNull Note oldItem, @NonNull Note newItem) {
            return oldItem.getTitle().equals(newItem.getTitle())
                    ||oldItem.getDescription().equals(newItem.getDescription())
                    ||oldItem.getPriority() == newItem.getPriority();
        }

    };
    Note getItemAt(int position){
        return getItem(position);
    }

    @NonNull
    @Override
    public NodeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NodeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NodeViewHolder holder, int position) {
        Note note = getItem(position);
        holder.txtTitle.setText(note.getTitle());
        holder.txtDescription.setText(note.getDescription());
        holder.txtPriority.setText(String.valueOf(note.getPriority()));
    }



    class NodeViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtPriority, txtDescription;

        public NodeViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtPriority = itemView.findViewById(R.id.txt_priority);
            txtDescription = itemView.findViewById(R.id.txt_description);
        }
    }
}
