package app.autoload.com;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;

/**
 * creator huangyong
 * createTime 2018/12/27 下午4:42
 * path app.autoload.com
 * description:
 */
public class TestHolder extends ViewHolder {


    public TextView testTv;

    public TestHolder(View itemView) {
        super(itemView);
        testTv = itemView.findViewById(R.id.test_tv);
    }
}
