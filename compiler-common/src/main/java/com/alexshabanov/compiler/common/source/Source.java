/*
 * Copyright 2013 Alexander Shabanov - http://alexshabanov.com.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alexshabanov.compiler.common.source;

/**
 * Provides convenient access to certain program source.
 *
 * @author Alexander Shabanov
 */
public interface Source {
    /**
     * Sets overflow size when reading the buffer.
     * The read-with-overflow is required for lexer.
     * </p>
     * After specifying overflow size the returned buffer will be greater than actual length of input by the specified
     * overflow size.
     * </p>
     * Overflow size is useful when lexer introduces a special End-of-Input symbol, which eliminates the need
     * to introduce multiple end-of-buffer tests.
     *
     * @param size Overflow size, can not be negative.
     */
    void setOverflowSize(int size);

    /**
     * Returns buffer available for read.
     * The only writable bytes are in the "overflow" bounds.
     *
     * @return Readable character buffer.
     */
    char[] getBuffer();

    /**
     * Returns length of the buffer without overflow.
     *
     * @return Readable buffer length.
     */
    int length();

    /**
     * Gets the associated source name.
     *
     * @return Associated name of the source.
     */
    String getSourceName();
}
