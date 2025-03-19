package com.SEProject.service;

import com.SEProject.model.User;
import com.SEProject.model.Coin;
import com.SEProject.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchList(Long userId) throws Exception;
    Watchlist createWatchlist(User user);
    Watchlist findById(Long id) throws Exception;

    Coin addItemtoWatchList(Coin coin, User user) throws Exception;



}
