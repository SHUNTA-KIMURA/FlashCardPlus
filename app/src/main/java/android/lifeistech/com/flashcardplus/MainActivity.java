package android.lifeistech.com.flashcardplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Card> mCards;
    CardAdapter mCardAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView=(ListView)findViewById(R.id.listView);
        mCards=new ArrayList<Card>();

        mCards.add(new Card(R.drawable.pictman_sing,getString(R.string.sing_title),getString(R.string.sing_content),
                getString(R.string.sing_meaning)));
        mCards.add(new Card(R.drawable.pictman_speech,getString(R.string.speech_title),getString(R.string.speech_content),
                getString(R.string.speech＿meaning)));

        mCardAdapter=new CardAdapter(this,R.layout.card,mCards);
        mListView.setAdapter(mCardAdapter);
    }
}
