package com.example.recyclerview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Model.Song;
import com.example.recyclerview.ModelAdapter.SongAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.recyclerview);
        RecyclerView recyclerView = findViewById(R.id.rv_songs);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this
        , LinearLayoutManager.VERTICAL, false);


        List<Song> mSongs = new ArrayList<>();
        mSongs.add(new Song ("60696", "NẾU EM CÒN TỒN TẠI",  "Khi anh bắt đầu 1 tình yêu Là lúc anh tự thay",  "Trịnh Đình Quang"));
        mSongs.add(new Song(  "60701",  "NGỐC",  "Có rất nhiều những câu chuyện Em dấu riêng mình em biết",  "Khắc Việt"));
        mSongs.add(new Song( "60658",  "HÃY TIN ANH LẦN NỮA",  "Dẫu cho ta đã sai khi ở bên nhau Cô yêu thương",  "Thiên Dũng"));
        mSongs.add(new Song ( "60610",  "CHUỖI NGÀY VẮNG EM",  "Từ khi em bước ra đi cõi lòng anh ngập tràng bao",  "Duy Cường"));
        mSongs.add(new Song( "60656",  "KHI NGƯỜI MÌNH YÊU KHÓC",  "Nước mắt en đang rơi trên những ngón tay Nước mắt em",  "Phạm Mạnh Quỳnh"));
        mSongs.add(new Song( "60685",  "MO",  "Anh mơ gặp em anh nơ được ôm anh mơ được gần",  "Trịnh Thăng Bình"));
        mSongs.add(new Song( "60752",  "TÌNH YÊU CHẤP VÁ",  "Muốn đi xa nơi yêu thương mình từng có Đế không nghe", "Mr. Siro"));
        mSongs.add(new Song( "68608",  "CHỜ NGÀY MƯA TAN",  "1 ngày mưa và en khuất xa nơi anh bóng dáng cứ",  "Trung Đức"));
        mSongs.add(new Song ( "60603",  "CÂU HỎI EM CHƯA TRẢ LỜI",  "Cần nơi en 1 lời giải thích thật lòng Đừng lặng im",  "Yuki Huy Nam"));
        mSongs.add(new Song ( "68720",  "QUA ĐI LẶNG LẼ",  "Đôi khi đến với nhau yêu thương chẳng được lâu nhưng khi",  "Phan Mạnh Quỳnh"));
        mSongs.add(new Song( "60856",  "QUÊN ANH LÀ ĐIỀU EM KHÔNG THỂ REMIX",  "Cần thên bao lâu để en quên đi niền đâu Cần thêm",  "Thiện Ngôn"));
        SongAdapter songAdapter = new SongAdapter(this, mSongs);
        recyclerView.setAdapter(songAdapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}