package khanhdang.ueh.edu.vn.photoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    private AdapterView.OnItemClickListener onitemclick = new AdapterView.OnItemClickListener(){

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getBaseContext(),ViewPhotoActivity.class);
            intent.putExtra("id",gridView.getAdapter().getItemId(position));
            startActivity(intent);

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhotoData.init(getApplicationContext());
        ArrayList<Photo> photoList=PhotoData.getPhotos();

        gridView = findViewById(R.id.gridview);
        PhotoAdapter adapter = new PhotoAdapter(photoList,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(onitemclick);
    }
}