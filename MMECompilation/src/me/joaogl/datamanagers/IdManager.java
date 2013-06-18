/**
 * This file is part of MMECompilation.

    MMECompilation is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    MMECompilation is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with MMECompilation.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.joaogl.datamanagers;

public class IdManager {
	static String[] player = new String[100];
	static String[] event = new String[100];
	static String[] lang = new String[100];
	static Double[] parkx = new Double[100];
	static Double[] parky = new Double[100];
	static Double[] parkz = new Double[100];

	// ID's
	public static void setId(int id, String name) {
		player[id] = name;
	}

	public static void removeId(int id) {
		player[id] = null;
	}

	public static void removeId(String name) {
		for (int i = 0; i < player.length; i++)
			if (player[i] == name) player[i] = null;
	}

	public static int getId(String name) {
		for (int i = 0; i < player.length; i++)
			if (player[i] == name) return i;
		return 0;
	}

	public static String getNameFromId(int id) {
		return player[id];
	}

	public static int getFreeId() {
		for (int i = 0; i < player.length; i++)
			if (player[i] == null) return i;
		return 101;
	}

	// Languages
	public static void setLang(int id, String language) {
		lang[id] = language;
	}

	public static void saveLang(int id, String language) {
		LangProjectRead.saveConfiguration(getNameFromId(id), language);
		setLang(id, language);
	}

	public static String getLang(int id) {
		return lang[id];
	}

	public static void removeLang(String name) {
		for (int i = 0; i < lang.length; i++)
			if (lang[i] == name) lang[i] = null;
	}

	// Events
	public static void setEvent(int id, String key) {
		event[id] = key;
	}

	public static String getEvent(int id) {
		return event[id];
	}

	public static void removeEvent(String name) {
		for (int i = 0; i < event.length; i++)
			if (event[i] == name) event[i] = null;
	}

	public static void saveEvent(String name, String event) {
		EventRead.saveConfiguration(name, event);
	}

	public static void deleteEvent() {
		for (int i = 0; i < event.length; i++)
			event[i] = null;
		EventRead.delConfiguration();
	}

	// PigPark's
	public static Double getParkedX(int id) {
		return parkx[id];
	}

	public static void setParkedX(int id, Double x) {
		parkx[id] = x;
	}

	public static Double getParkedY(int id) {
		return parky[id];
	}

	public static void setParkedY(int id, Double y) {
		parky[id] = y;
	}

	public static Double getParkedZ(int id) {
		return parkz[id];
	}

	public static void setParkedZ(int id, Double z) {
		parkz[id] = z;
	}

	public static void deletePark(int id) {
		parkx[id] = null;
		parky[id] = null;
		parkz[id] = null;
	}

	// Players Listeners
	public static void playerJoin(String name, String lang, String event, Double pigparkx, Double pigparky, Double pigparkz) {
		int id = getFreeId();
		setId(id, name);
		setLang(id, lang);
		setEvent(id, event);
		setParkedX(id, pigparkx);
		setParkedY(id, pigparky);
		setParkedZ(id, pigparkz);
	}

	public static void playerLeft(String name) {
		saveEvent(name, event[getId(name)]);
		removeId(name);
		removeLang(name);
		removeEvent(name);
	}

}