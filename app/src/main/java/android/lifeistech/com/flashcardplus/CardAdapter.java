package android.lifeistech.com.flashcardplus;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CardAdapter extends ArrayAdapter<Card> {
    List<Card> mCards;

    public CardAdapter(Context context,int ResourceId,List<Card> objects){
        super(context,ResourceId,objects);
        mCards=objects;
    }
    @Override
    public int getCount(){
        return mCards.size();
    }
    @Override
    public Card getItem(int position){
        return mCards.get(position);
    }

    public static class ViewHolder{

        ImageView iconImageView;
        TextView titleTextView;
        TextView likeTextView;
        TextView contentTextView;
        ImageView likeButton;

        public ViewHolder(View view){

            iconImageView=(ImageView)view.findViewById(R.id.icon);
            titleTextView=(TextView)view.findViewById(R.id.title_textView);
            likeTextView=(TextView)view.findViewById(R.id.like_textView);
            contentTextView=(TextView)view.findViewById(R.id.content);
            likeButton=(ImageView)view.findViewById(R.id.Like_button);
        }
    }

}

