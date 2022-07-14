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

package com.meisolsson.githubsdk.model.request.organization;

import android.os.Parcelable;
import androidx.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

@AutoValue
public abstract class EditOrganization implements Parcelable {

    @Json(name = "billing_email")
    @Nullable
    public abstract String billingEmail();

    @Nullable
    public abstract String company();

    @Nullable
    public abstract String email();

    @Nullable
    public abstract String location();

    @Nullable
    public abstract String name();

    @Nullable
    public abstract String description();

    public static JsonAdapter<EditOrganization> jsonAdapter(Moshi moshi) {
        return new AutoValue_EditOrganization.MoshiJsonAdapter(moshi);
    }

    public static Builder builder() {
        return new AutoValue_EditOrganization.Builder();
    }


    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder billingEmail(String billingEmail);

        public abstract Builder company(String company);

        public abstract Builder email(String email);

        public abstract Builder location(String location);

        public abstract Builder name(String name);

        public abstract Builder description(String description);

        public abstract EditOrganization build();
    }
}
