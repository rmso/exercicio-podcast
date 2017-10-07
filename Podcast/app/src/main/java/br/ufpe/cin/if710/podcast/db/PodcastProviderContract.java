package br.ufpe.cin.if710.podcast.db;

import android.content.ContentResolver;
import android.net.Uri;

/**
 * Created by leopoldomt on 9/19/17.
 */

public class PodcastProviderContract {

    public static final String _ID = "_id";
    public static final String EPISODE_TITLE = "title";
    public static final String EPISODE_DATE = "pubDate";
    public static final String EPISODE_LINK = "link";
    public static final String EPISODE_DESC = "description";
    public static final String EPISODE_DOWNLOAD_LINK = "downloadLink";
    public static final String EPISODE_FILE_URI = "downloadUri";
    public static final String EPISODE_TABLE = "episodes";

    public final static String[] ALL_COLUMNS = {
            _ID, EPISODE_TITLE, EPISODE_DATE, EPISODE_LINK, EPISODE_DESC, EPISODE_DOWNLOAD_LINK, EPISODE_FILE_URI};

    private static final Uri BASE_LIST_URI = Uri.parse("content://br.ufpe.cin.if710.podcast.feed/");
    //URI para tabela
    public static final Uri EPISODE_LIST_URI = Uri.withAppendedPath(BASE_LIST_URI, EPISODE_TABLE);

    // Mime type para colecao de itens
    public static final String CONTENT_DIR_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/PodcastProvider.data.text";

    // Mime type para um item especifico
    public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/PodcastProvider.data.text";

}