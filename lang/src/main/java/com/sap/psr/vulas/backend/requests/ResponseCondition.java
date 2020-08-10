/**
 * This file is part of Eclipse Steady.
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
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.sap.psr.vulas.backend.requests;

import java.io.Serializable;

import com.sap.psr.vulas.backend.HttpResponse;

/**
 * <p>ResponseCondition interface.</p>
 *
 */
public interface ResponseCondition extends Serializable {

    /**
     * Returns true of the {@link HttpResponse} meets the condition, false otherwise.
     *
     * @param _response a {@link com.sap.psr.vulas.backend.HttpResponse} object.
     * @return a boolean.
     */
    public boolean meetsCondition(HttpResponse _response);
}
