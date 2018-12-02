package com.example.ibrah.bakingappproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

interface RecipesApiService {

    @GET("topher/2017/May/59121517_baking/baking.json")
    Call<List<Recipe>> getRecipes();
}
