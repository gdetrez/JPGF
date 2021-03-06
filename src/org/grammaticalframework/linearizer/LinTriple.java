/* LinTriple.java
 * Copyright (C) 2010 Grégoire Détrez, Ramona Enache
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.grammaticalframework.linearizer;

import java.util.Vector;


public class LinTriple {
    private int fId;
    private CncType cncType;
    private Vector<Vector<BracketedTokn>> linTable;

    public LinTriple(int _fId, CncType _cncType,
                     Vector<Vector<BracketedTokn>> _linTable) {
        fId = _fId; cncType = _cncType; linTable = _linTable;
    }

    public int getFId() {return fId;}
    public CncType getCncType() {return cncType;}
    public Vector<Vector<BracketedTokn>> getLinTable() {return linTable;}
    public String toString() {
        String rez = "id : "+fId+ " cncType : ("+cncType.toString()+
            ") bracketedToken :["+linTable.toString();
        rez+="]";
        return rez;
    }
}
