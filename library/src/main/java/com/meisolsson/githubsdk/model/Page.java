/*
 * Copyright 2015 Henrik Olsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.meisolsson.githubsdk.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.lang.reflect.Type;
import java.util.List;

@AutoValue
public abstract class Page<V> {

    @Nullable
    public abstract Integer next();

    @Nullable
    public abstract Integer last();

    @Nullable
    public abstract Integer first();

    @Nullable
    public abstract Integer prev();

    @NonNull
    public abstract List<V> items();

    public static <V> JsonAdapter<Page<V>> jsonAdapter(Moshi moshi, Type[] type) {
        return new AutoValue_Page.MoshiJsonAdapter<>(moshi, type);
    }

    public static <V> Builder<V> builder() {
        return new AutoValue_Page.Builder<>();
    }


    @AutoValue.Builder
    public abstract static class Builder<V> {
        public abstract Builder<V> next(Integer next);

        public abstract Builder<V> last(Integer last);

        public abstract Builder<V> first(Integer first);

        public abstract Builder<V> prev(Integer prev);

        public abstract Builder<V> items(@NonNull List<V> items);

        public abstract Page<V> build();
    }
}
