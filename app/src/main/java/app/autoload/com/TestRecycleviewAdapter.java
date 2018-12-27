package app.autoload.com;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import junit.framework.Test;

import java.util.ArrayList;

/**
 * creator huangyong
 * createTime 2018/12/27 下午4:42
 * path app.autoload.com
 * description:
 */
public class TestRecycleviewAdapter extends RecyclerView.Adapter<TestHolder> {

    private ArrayList<String> test;

    public TestRecycleviewAdapter(ArrayList<String> data) {
        this.test = data;
    }

    @NonNull
    @Override
    public TestHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_item, null);
        return new TestHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TestHolder holder, int position) {
        holder.testTv.setText(test.get(position)+position);
    }

    @Override
    public int getItemCount() {
        return test!=null?test.size():0;
    }
}
