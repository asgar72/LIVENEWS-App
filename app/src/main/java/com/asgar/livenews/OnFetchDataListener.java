package com.asgar.livenews;

import com.asgar.livenews.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse>{

    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
