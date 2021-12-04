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

package com.meisolsson.githubsdk.model.request.git;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.meisolsson.githubsdk.model.git.GitTreeEntry;
import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.List;

@AutoValue
public abstract class CreateGitTree implements Parcelable {

    @NonNull
    public abstract List<GitTreeEntry> tree();

    @Json(name = "base_tree")
    @Nullable
    public abstract String baseTree();

    public static JsonAdapter<CreateGitTree> jsonAdapter(Moshi moshi) {
        return new AutoValue_CreateGitTree.MoshiJsonAdapter(moshi);
    }

    public static Builder builder() {
        return new AutoValue_CreateGitTree.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder tree(@NonNull List<GitTreeEntry> tree);

        public abstract Builder baseTree(String baseTree);

        public abstract CreateGitTree build();
    }
}
