package android.suryadevs.com.meetmyfamily;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Harshal Suryawanshi on 10-02-2016.
 */
public class FamilyAdapter extends ArrayAdapter<RowContent> {
    private final Activity context;
    private final List<RowContent> objects;

    public FamilyAdapter(Activity context, List<RowContent> objects) {
        super(context, R.layout.item_layout, objects);
        this.context = context;
        this.objects = objects;
    }

    static class ViewHolder {           //holds references to the relevant views
        public ImageView imageView;     //image of the family member
        public TextView textView1;      //name of the family member
        public TextView textView2;      //relationship with me
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder = new ViewHolder();
        // rowView getting created for the first time
        if (rowView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.item_layout, null);
            // configure view holder
            viewHolder.imageView = (ImageView) rowView.findViewById(R.id.imageView);
            viewHolder.textView1 = (TextView) rowView.findViewById(R.id.textView);
            viewHolder.textView2 = (TextView) rowView.findViewById(R.id.textView2);
            rowView.setTag(viewHolder);
        }

        // for rowView created already
        viewHolder = (ViewHolder) rowView.getTag();

        RowContent rc = objects.get(position);      //get the object from the list

        if (rc != null){
            viewHolder.imageView.setImageResource(rc.getImageID()); //getting imagedId from object
            viewHolder.textView1.setText(rc.getName());             //getting name from object
            viewHolder.textView2.setText(rc.getRelation());
        }

        return rowView;
    }
}
