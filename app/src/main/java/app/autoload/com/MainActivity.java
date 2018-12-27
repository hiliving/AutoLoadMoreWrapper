package app.autoload.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import app.autoload.wrapper.LoadMoreAdapter;
import app.autoload.wrapper.LoadMoreWrapper;

public class MainActivity extends AppCompatActivity {

    private RecyclerView testList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testList = findViewById(R.id.testList);
        final ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add("测试数据");
        }
        final TestRecycleviewAdapter adapter = new TestRecycleviewAdapter(data);
        testList.setLayoutManager(new LinearLayoutManager(this));
        testList.setAdapter(adapter);

        LoadMoreWrapper.with(adapter)
                .setLoadMoreEnabled(true)
                .setListener(new LoadMoreAdapter.OnLoadMoreListener() {
                    @Override
                    public void onLoadMore(LoadMoreAdapter.Enabled enabled) {
                        testList.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                data.addAll(data);
                                adapter.notifyDataSetChanged();
                            }
                        }, 1000);
                    }
                })
                .into(testList);

    }
}
