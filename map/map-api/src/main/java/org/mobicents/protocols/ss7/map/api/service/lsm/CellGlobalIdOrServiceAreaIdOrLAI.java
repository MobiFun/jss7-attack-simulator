/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual
 * contributors as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 * 
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free 
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package org.mobicents.protocols.ss7.map.api.service.lsm;

import org.mobicents.protocols.ss7.map.api.primitives.MAPPrimitive;

/**
 * CellGlobalIdOrServiceAreaIdOrLAI ::= CHOICE {
 *    cellGlobalIdOrServiceAreaIdFixedLength [0] CellGlobalIdOrServiceAreaIdFixedLength,
 *    laiFixedLength [1] LAIFixedLength}
 * 
 * @author amit bhayani
 *
 */
public interface CellGlobalIdOrServiceAreaIdOrLAI extends MAPPrimitive {
	
	/**
	 * CellGlobalIdOrServiceAreaIdFixedLength ::= OCTET STRING (SIZE (7))
     *		-- Refers to Cell Global Identification or Service Are Identification
     *		-- defined in 3GPP TS 23.003.
     *		-- The internal structure is defined as follows:
     *		-- octet 1 bits 4321 Mobile Country Code 1st digit
     *		-- bits 8765 Mobile Country Code 2nd digit
     *		-- octet 2 bits 4321 Mobile Country Code 3rd digit
     *		-- bits 8765 Mobile Network Code 3rd digit
     *		-- or filler (1111) for 2 digit MNCs
     *		-- octet 3 bits 4321 Mobile Network Code 1st digit
     *		-- bits 8765 Mobile Network Code 2nd digit
     *		-- octets 4 and 5 Location Area Code according to 3GPP TS 24.008
     *		-- octets 6 and 7 Cell Identity (CI) value or
     *		-- Service Area Code (SAC) value
     *		-- according to 3GPP TS 23.003
	 * 
	 * @return
	 */
	public byte[] getCellGlobalIdOrServiceAreaIdFixedLength();
	
	/**
	 * LAIFixedLength ::= OCTET STRING (SIZE (5))
     *		-- Refers to Location Area Identification defined in TS 3GPP TS 23.003 [17].
     *		-- The internal structure is defined as follows:
     *		-- octet 1 bits 4321 Mobile Country Code 1st digit
     *		-- bits 8765 Mobile Country Code 2nd digit
     *		-- octet 2 bits 4321 Mobile Country Code 3rd digit
     *		-- bits 8765 Mobile Network Code 3rd digit
     *		-- or filler (1111) for 2 digit MNCs
     *		-- octet 3 bits 4321 Mobile Network Code 1st digit
     *		-- bits 8765 Mobile Network Code 2nd digit
     *		-- octets 4 and 5 Location Area Code according to TS 3GPP TS 24.008
	 * 
	 * @return
	 */
	public byte[] getLAIFixedLength();

}