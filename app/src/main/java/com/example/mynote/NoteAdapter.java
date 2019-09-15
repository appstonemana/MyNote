package com.example.mynote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteVh> {
    private Context context;
    List<Note> list;

    public NoteAdapter(MainActivity context, List<Note> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public NoteVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.cell_layout,parent,false);
        return (new NoteVh((view)));
    }

    @Override
    public void onBindViewHolder(@NonNull NoteVh holder, int position) {
        Note note=list.get(position);
        holder.mTvtitle.setText(note.getTitle());
        holder.mTvtext.setText(note.getText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NoteVh extends RecyclerView.ViewHolder {

        TextView mTvtitle,mTvtext;

        public NoteVh(@NonNull View itemView) {
            super(itemView);
            mTvtitle=itemView.findViewById(R.id.tv_title);
            mTvtext=itemView.findViewById(R.id.tv_text);
        }
    }
}
