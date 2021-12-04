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

import androidx.annotation.Nullable;

import com.squareup.moshi.Json;

public abstract class PositionalCommentBase extends GitHubCommentBase {

    @Nullable
    public abstract Integer position();

    @Nullable
    public abstract Integer line();

    @Nullable
    public abstract String path();

    @Json(name = "commit_id")
    @Nullable
    public abstract String commitId();

    public abstract static class Builder<B extends Builder<B>>
            extends GitHubCommentBase.Builder<B> {
        public abstract B position(Integer position);

        public abstract B line(Integer line);

        public abstract B path(String path);

        public abstract B commitId(String commitId);
    }
}
