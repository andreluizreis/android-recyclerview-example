package io.github.andreluizreis.recyclerviewexample;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * My Adapter Class
 */
public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.ViewHolder>{

    private String[] mDataSet;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter2(String[] myDataset) {
        mDataSet = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter2.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                    int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters here.
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTitleText.setText(mDataSet[position]);
        holder.mInfoText.setText(mDataSet[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

    ////////////////////////////////////////////////////////////////
    //                        INNER CLASS
    ////////////////////////////////////////////////////////////////

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder

    /**
     * View Holder Class
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTitleText;
        public TextView mInfoText;

        /**
         * View Holder
         * @param v
         */
        public ViewHolder(View v) {
            super(v);
            mTitleText = (TextView) v.findViewById(R.id.title_text);
            mInfoText = (TextView) v.findViewById(R.id.info_text);
        }
    }

}
