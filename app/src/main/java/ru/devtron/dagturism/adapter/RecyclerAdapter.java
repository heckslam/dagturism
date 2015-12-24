package ru.devtron.dagturism.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ru.devtron.dagturism.R;
import ru.devtron.dagturism.model.ModelPlace;
import ru.devtron.dagturism.viewholder.RecyclerItemViewHolder;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerItemViewHolder> {
    private List<ModelPlace> itemList;


    private Context mContext;

    ViewPager viewPager;
    TextView titleTV;
    TextView cityTV;
    ImageGaleryRecyclerAdapter adapterImages;

    private int focusedItem = 0;

    public RecyclerAdapter(Context context, List<ModelPlace> itemList) {
        this.itemList = itemList;
        this.mContext = context;
    }


    @Override
    public RecyclerItemViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, null);

        viewPager = (ViewPager) v.findViewById(R.id.viewPagerForImages);
        titleTV = (TextView) v.findViewById(R.id.namePlace);
        cityTV = (TextView) v.findViewById(R.id.cityTextView);

        Typeface light = Typeface.createFromAsset(mContext.getAssets(), "fonts/Roboto-Light.ttf");
        Typeface medium = Typeface.createFromAsset(mContext.getAssets(), "fonts/Roboto-Medium.ttf");
        titleTV.setTypeface(medium);
        cityTV.setTypeface(light);


        RecyclerItemViewHolder holder = new RecyclerItemViewHolder(v);

        return holder;
    }


    


    @Override
    public void onBindViewHolder(final RecyclerItemViewHolder recyclerItemViewHolder, int position) {
        ModelPlace modelPlaces = itemList.get(position);
        recyclerItemViewHolder.itemView.setSelected(focusedItem == position);

        recyclerItemViewHolder.getLayoutPosition();


        try {
            recyclerItemViewHolder.id.setText(modelPlaces.getId());
            recyclerItemViewHolder.title.setText(modelPlaces.getTitle());
            recyclerItemViewHolder.city.setText(modelPlaces.getCity());

            List<String> images1 = modelPlaces.getImages();
            adapterImages = new ImageGaleryRecyclerAdapter(mContext, images1);

            recyclerItemViewHolder.pager.setAdapter(adapterImages);
            recyclerItemViewHolder.pager.setCurrentItem(ImageGaleryRecyclerAdapter.PAGER_PAGES_MIDDLE);



        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }




    public void clearAdapter () {
        itemList.clear();
    }

    @Override
    public int getItemCount() {
        return (null != itemList ? itemList.size() : 0 );
    }
}