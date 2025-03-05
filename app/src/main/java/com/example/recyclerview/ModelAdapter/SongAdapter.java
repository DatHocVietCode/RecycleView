package com.example.recyclerview.ModelAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Model.Song;
import com.example.recyclerview.R;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {
    private static final String TAG = "SongAdapter";
    private Context mContext;
    private List<Song> mSongs;
    private LayoutInflater mLayoutInflater;

    public SongAdapter(Context mContext, List<Song> mSongs) {
        this.mContext = mContext;
        this.mSongs = mSongs;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public SongAdapter.SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.row, parent, false);
        return new SongViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.SongViewHolder holder, int position) {
        Song song = mSongs.get(position);
        holder.tvCode.setText(song.getmCode());
        holder.tvTitle.setText(song.getmTitle());
        holder.tvLyric.setText(song.getmLyric());
        holder.tvArtists.setText(song.getmArtist());
    }

    @Override
    public int getItemCount() {
        return mSongs.size();
    }

    class SongViewHolder extends RecyclerView.ViewHolder
    {
        private TextView tvCode;
        private TextView tvTitle;
        private TextView tvLyric;
        private TextView tvArtists;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvCode = (TextView) itemView.findViewById(R.id.tv_code);
            this.tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            this.tvArtists = (TextView) itemView.findViewById(R.id.tv_artist);
            this.tvLyric = (TextView) itemView.findViewById(R.id.tv_lyric);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Song clickedSong = mSongs.get(getAdapterPosition());
                    Toast.makeText(mContext, clickedSong.getmTitle(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
