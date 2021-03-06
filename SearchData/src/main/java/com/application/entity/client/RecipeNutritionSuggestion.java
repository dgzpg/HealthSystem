package com.application.entity.client;

import lombok.Data;

import java.util.List;

/** @author PG */
@Data
public class RecipeNutritionSuggestion {
  private String nutritions;
  private String suggestions;
  private List<RecipeItemClient> itemClients;

  public RecipeNutritionSuggestion(String nutritions, String suggestions) {
    this.nutritions = nutritions;
    this.suggestions = suggestions;
  }
}
