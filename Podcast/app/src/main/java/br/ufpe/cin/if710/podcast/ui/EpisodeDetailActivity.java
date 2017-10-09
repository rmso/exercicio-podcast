package br.ufpe.cin.if710.podcast.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import br.ufpe.cin.if710.podcast.R;
import br.ufpe.cin.if710.podcast.domain.ItemFeed;
import br.ufpe.cin.if710.podcast.ui.adapter.XmlFeedAdapter;

public class EpisodeDetailActivity extends Activity {

    TextView tv_title;
    TextView tv_link;
    TextView tv_date;
    TextView tv_description;

    int position;
    ItemFeed itemFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_detail);

        //TODO preencher com informações do episódio clicado na lista...

        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_link = (TextView) findViewById(R.id.tv_link);
        tv_date = (TextView) findViewById(R.id.tv_date);
        tv_description = (TextView) findViewById(R.id.tv_description);

        itemFeed =  (ItemFeed)getIntent().getSerializableExtra("itemFeed");
        tv_title.setText(itemFeed.getTitle());
        tv_link.setText(itemFeed.getLink());
        tv_date.setText(itemFeed.getPubDate());
        tv_description.setText(itemFeed.getDescription());
    }
}
