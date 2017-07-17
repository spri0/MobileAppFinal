package edu.gsu.httpcs.mobileappfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ListView list = (ListView) findViewById(R.id.listView1);
        customadapter ca = new customadapter();
        list.setAdapter(ca);

    }

    class customadapter extends BaseAdapter {

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return images.length;
        }

        @Override
        public Object getItem(int arg0) {
            // TODO Auto-generated method stub

            return null;
        }

        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public View getView(final int position, View convertview, ViewGroup arg2) {
            // TODO Auto-generated method stub
            LayoutInflater inflater = getLayoutInflater();
            convertview = inflater.inflate(R.layout.custom, null);
            TextView tv = (TextView) convertview.findViewById(R.id.textView1);
            TextView tv1 = (TextView) convertview.findViewById(R.id.textView2);
            ImageView image = (ImageView) convertview
                    .findViewById(R.id.imageView1);
            tv.setText(names[position]);
            tv1.setText(locations[position]);
            image.setImageResource(images[position]);

            return convertview;
        }

    }

    String[] names = { "Ryu", "Ken", "Chun-Li", "Dhalsim", "Wolverine", "Cyclops", "Spiderman", "Juggernaut" };
    String[] locations = { "Street Fighter", "Street Fighter", "Street Fighter", "Street Fighter",
            "X-Men", "X-Men", "Spiderman", "Brotherhood" };
    int[] images = { R.drawable.ryu1, R.drawable.ken1, R.drawable.chunli1,
            R.drawable.dhalsim1, R.drawable.wolverine1, R.drawable.cyclops1, R.drawable.spiderman1, R.drawable.juggernaut1 };
}

