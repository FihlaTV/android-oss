package com.kickstarter.libs.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Patterns;

import java.util.Locale;

public final class StringUtils {
  private StringUtils() {}

  public static boolean isEmail(final @NonNull CharSequence str) {
    return Patterns.EMAIL_ADDRESS.matcher(str).matches();
  }

  public static boolean isEmpty(final @Nullable String str) {
    return str == null || str.trim().length() == 0;
  }

  public static boolean isPresent(final @Nullable String str) {
    return !isEmpty(str);
  }

  public static boolean isValidPassword(final @Nullable String str) {
    return !isEmpty(str) && str.length() > 5;
  }

  /**
   * Returns a string with only the first character capitalized.
   */
  public static @NonNull String sentenceCase(final @NonNull String str) {
    return str.length() <= 1
      ? str.toUpperCase(Locale.getDefault())
      : str.substring(0, 1).toUpperCase(Locale.getDefault()) + str.substring(1).toLowerCase(Locale.getDefault());
  }

  /**
   * Returns a string wrapped in parentheses.
   */
  public static @NonNull String wrapInParentheses(final @NonNull String str) {
    return "(" + str + ")";
  }
}
