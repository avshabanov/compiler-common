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

package com.alexshabanov.compiler.common.diagnostics.source;

/**
 * Represents position in the source code.
 *
 * @author Alexander Shabanov
 */
public final class SourcePosition {
    private final int row;
    private final int column;

    public SourcePosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof SourcePosition)) {
            return false;
        }

        final SourcePosition that = (SourcePosition) o;

        return column == that.column && row == that.row;

    }

    @Override
    public int hashCode() {
        return row * 31 + column;
    }

    @Override
    public String toString() {
        return "[" + row + ',' + column + ']';
    }
}
