package org.devfleet.dotlan.impl;

import org.devfleet.dotlan.DotlanSolarSystem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface Dotlan {
    @GET("/route/{dotlanQuery}")
    Call<List<DotlanSolarSystem>> getRoute(
            @Path("dotlanQuery") final String query);

    @GET("/jump/{shipSpec}/{dotlanQuery}")
    Call<List<DotlanSolarSystem>> getJumps(
            @Path("shipSpec") final String spec,
            @Path("dotlanQuery") final String query);
}
