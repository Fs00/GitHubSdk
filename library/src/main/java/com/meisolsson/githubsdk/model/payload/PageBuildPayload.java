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

package com.meisolsson.githubsdk.model.payload;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

import com.meisolsson.githubsdk.model.PageBuild;
import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

@AutoValue
public abstract class PageBuildPayload extends GitHubPayload<PageBuildPayload.Builder> implements Parcelable {

    @Nullable
    @Json(name = "build")
    public abstract PageBuild theBuild(); //The name can't be build since the builder doesn't like it

    public abstract Builder toBuilder();

    public static JsonAdapter<PageBuildPayload> jsonAdapter(Moshi moshi) {
        return new AutoValue_PageBuildPayload.MoshiJsonAdapter(moshi);
    }

    public static PageBuildPayload createFromParcel(Parcel in) {
        return AutoValue_PageBuildPayload.CREATOR.createFromParcel(in);
    }

    public static Builder builder() {
        return new AutoValue_PageBuildPayload.Builder();
    }


    @AutoValue.Builder
    public abstract static class Builder extends GitHubPayload.Builder<PageBuildPayload, Builder> {
        public abstract Builder theBuild(PageBuild build);

        public abstract PageBuildPayload build();
    }
}
