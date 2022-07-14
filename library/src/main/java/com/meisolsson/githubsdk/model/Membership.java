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

import android.os.Parcelable;
import androidx.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

@AutoValue
public abstract class Membership implements Parcelable {

    @Nullable
    public abstract String url();

    @Nullable
    public abstract String state();

    @Nullable
    public abstract String role();

    @Json(name = "organization_url")
    @Nullable
    public abstract String organizationUrl();

    @Nullable
    public abstract User organization();

    @Nullable
    public abstract User user();

    public static JsonAdapter<Membership> jsonAdapter(Moshi moshi) {
        return new AutoValue_Membership.MoshiJsonAdapter(moshi);
    }
}
