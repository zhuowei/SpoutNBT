/*
 * This file is part of SpoutNBT (http://www.spout.org/).
 *
 * SpoutNBT is licensed under the SpoutDev License Version 1.
 *
 * SpoutNBT is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * SpoutNBT is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.nbt;

/**
 * The {@code TAG_Byte} tag.
 * @author Graham Edgecombe
 */
public final class ByteTag extends Tag {
	/**
	 * The value.
	 */
	private final byte value;
	
	/**
	 * Creates the tag.<br>
	 * Boolean true is stored as 1 and boolean false is stored as 0.
	 * @param name The name.
	 * @param value The value.
	 */
	public ByteTag(String name, boolean value) {
		super(name);
		this.value = (byte)(value ? 1 : 0);
	}

	/**
	 * Creates the tag.
	 * @param name The name.
	 * @param value The value.
	 */
	public ByteTag(String name, byte value) {
		super(name);
		this.value = value;
	}

	@Override
	public Byte getValue() {
		return value;
	}
	
	public boolean getBooleanValue() {
		return value != 0;
	}

	@Override
	public String toString() {
		String name = getName();
		String append = "";
		if (name != null && !name.equals("")) {
			append = "(\"" + this.getName() + "\")";
		}
		return "TAG_Byte" + append + ": " + value;
	}

	public ByteTag clone() {
		return new ByteTag(getName(), value);
	}
}
