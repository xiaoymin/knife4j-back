/*
 * Copyright © 2017-2022 Knife4j(xiaoymin@foxmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.github.xiaoymin.knife4j.core.enums;

/**
 * @since 
 * @auth <a href="xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2022/11/28 21:03
 */
public enum OAuth2TypeEnums {
    
    /**
     * OAuth2 - implicit
     */
    IMPLICIT,
    /**
     * OAuth2 - authorization_code
     */
    AUTHORIZATION_CODE,
    /**
     * OAuth2 - client_credentials
     */
    CLIENT_CREDENTIALS,
    /**
     * OAuth2 - password
     */
    PASSWORD
}
