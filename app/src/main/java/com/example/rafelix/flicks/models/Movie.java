package com.example.rafelix.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

/**
 * Created by rafelix on 6/21/17.
 */

@Parcel
public class Movie {
    public String title;
    public String overview;
    public String posterPath;
    public String backdropPath;
    public Double voteAverage;

    public Movie() {}

    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {
        return null;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }


}
