package com.example.fiodorko.delivery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class DeliveryListAdapter extends BaseAdapter{

    Context context;
    List<Delivery> deliveryList;

    public DeliveryListAdapter(Context mContext, List<Delivery> mDeliveryList) {
        context = mContext;
        deliveryList = mDeliveryList;
    }

    @Override
    public int getCount() {
        return deliveryList.size();
    }

    @Override
    public Object getItem(int position) {
        return deliveryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.delivery_detail_row, null);
        TextView recipient = (TextView)v.findViewById(R.id.recipient);
        TextView address = (TextView)v.findViewById(R.id.address);
        TextView date = (TextView)v.findViewById(R.id.date);
        TextView phone = (TextView)v.findViewById(R.id.phone);

        recipient.setText("Adresát: " + deliveryList.get(position).getRecipient());
        address.setText("Adresa: " + deliveryList.get(position).getAddress());
        date.setText("Dátum: " + deliveryList.get(position).getDate());
        phone.setText("Telefónny kontakt: " + deliveryList.get(position).getPhone() + " ID" + deliveryList.get(position).getId());

        v.setTag(deliveryList.get(position).getId());


        return v;
    }
}