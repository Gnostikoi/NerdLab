package nerdlab.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guideapplication.R;

import java.util.ArrayList;
import java.util.List;

import model.Atys;

/**
 * Created by chizhang on 15/4/20.
 */
public class AtyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Atys> atylist;

    public AtyAdapter(Context context,ArrayList<Atys> atylist) {
        this.context=context;
        this.atylist=atylist;
    }
    @Override
    public int getCount() {
        return atylist.size();
    }

    @Override
    public Atys getItem(int i) {
        return atylist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view= LayoutInflater.from(context).inflate(R.layout.aty_list_item,null);
        }
        ImageView ivFace= (ImageView) view.findViewById(R.id.ivFace);
        ImageView ivPic= (ImageView) view.findViewById(R.id.ivPic);

        TextView tvName= (TextView) view.findViewById(R.id.tvName);
        TextView tvTime= (TextView) view.findViewById(R.id.tvTime);
        TextView tvTitle= (TextView) view.findViewById(R.id.tvTitle);
        TextView tvContent= (TextView) view.findViewById(R.id.tvContent);

        Button btnlike= (Button) view.findViewById(R.id.btnLike);
        Button btnjoin= (Button) view.findViewById(R.id.btnJoin);
        Button btncomment= (Button) view.findViewById(R.id.btnComment);

        Atys atys=atylist.get(i);
        tvName.setText(atys.getUser_name());
        tvTime.setText(atys.getPubtime());
        tvTitle.setText(atys.getTitle());
        tvContent.setText(atys.getContent());


        return view;
    }
}
