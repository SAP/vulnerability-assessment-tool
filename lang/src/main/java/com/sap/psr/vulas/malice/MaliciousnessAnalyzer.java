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
package com.sap.psr.vulas.malice;

import java.io.File;
import java.io.InputStream;

/**
 * <p>MaliciousnessAnalyzer interface.</p>
 *
 */
public interface MaliciousnessAnalyzer {

    /**
     * Checks whether the given {@link File} is malicious or not. A value of 0 means it is not malicious, a value of 1 means that it is malicious, and every value in between expresses the confidence (or probability) of the file being malicious.
     *
     * @param _file a {@link java.io.File} object.
     * @return a {@link com.sap.psr.vulas.malice.MaliciousnessAnalysisResult} object.
     */
    public MaliciousnessAnalysisResult isMalicious(File _file);

    /**
     * Checks whether the given {@link File} is malicious or not. A value of 0 means it is not malicious, a value of 1 means that it is malicious, and every value in between expresses the confidence (or probability) of the file being malicious.
     *
     * @param _is a {@link java.io.InputStream} object.
     * @param _log a boolean.
     * @return a {@link com.sap.psr.vulas.malice.MaliciousnessAnalysisResult} object.
     */
    public MaliciousnessAnalysisResult isMalicious(InputStream _is, boolean _log);
}
