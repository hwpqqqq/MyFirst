package qqq.android.com.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.github.clans.fab.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv=(RecyclerView)findViewById(R.id.rv);
        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);
        FloatingActionButton fab1=(FloatingActionButton)findViewById(R.id.fab1);
        FloatingActionButton fab2=(FloatingActionButton)findViewById(R.id.fab2);
        ArrayList<String> strings = new ArrayList<>();
        for(int i=0;i<50;i++){
            strings.add("这是第"+i+"条");
        }
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new BaseQuickAdapter(R.layout.rv_item, strings) {
            @Override
            protected void convert(BaseViewHolder helper, Object item) {
                helper.setText(R.id.tv,item.toString());
            }
        });
        fab.setOnClickListener(new FabClickListener());
        fab1.setOnClickListener(new FabClickListener());
        fab2.setOnClickListener(new FabClickListener());

    }
}
