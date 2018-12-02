package com.example.ibrah.bakingappproject;

public interface RecipesApiCallback<T> {
    void onResponse(T result);

    void onCancel();
}
