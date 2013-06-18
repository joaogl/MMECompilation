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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import me.joaogl.compilation.Main;

public class EventRead {
	static Properties properties = new Properties();
	static String path;
	private static FileConfiguration ChatConfig;
	private static File ChatConf;

	public static void saveConfiguration(final String key, final String value) {
		new Thread(new Runnable() {
			public void run() {
				if (Files.Linux) path = Files.Linuxdir + "/Event.xml";
				if (!Files.Linux) path = Files.windowsdir + "/Event.xml";
				try {
					File file = new File(path);
					boolean exist = file.exists();
					if (!exist) file.createNewFile();
					OutputStream write = new FileOutputStream(path);
					properties.setProperty(key, value);
					properties.storeToXML(write, "Data: ");
				} catch (Exception e) {
					Main.logger.info("[FILE - Event] - An Error as occurred");
					Main.logger.info("[FILE - Event] - Save Error:" + e);
				}
			}
		}).start();
	}

	public static void delConfiguration() {
		new Thread(new Runnable() {
			public void run() {
				if (Files.Linux) path = Files.Linuxdir + "/Event.xml";
				if (!Files.Linux) path = Files.windowsdir + "/Event.xml";
				try {
					File file = new File(path);
					if (file.exists()) {
						file.delete();
					}
				} catch (Exception e) {
					Main.logger.info("[FILE - Event] - An Error as occurred");
					Main.logger.info("[FILE - Event] - Delete Error:" + e);
				}
			}
		}).start();
	}

	public static String loadConfiguration(final String data) {
		String result = null;
		if (Files.Linux) path = Files.Linuxdir + "/Event.xml";
		if (!Files.Linux) path = Files.windowsdir + "/Event.xml";
		try {
			InputStream read = new FileInputStream(path);
			properties.loadFromXML(read);
			result = properties.getProperty(data);
			read.close();
		} catch (FileNotFoundException e) {
			saveConfiguration(data, "none");
			loadConfiguration(data);
		} catch (IOException e) {
			Main.logger.info("[FILE - Event] - An Error as occurred");
			Main.logger.info("[FILE - Event] - Load Error:" + e);
		}
		return result;
	}

	public static void test() {
		if (ChatConf == null) {
			ChatConf = new File(getDataFolder(), "Chat/Chat.yml");
		}
		ChatConfig = YamlConfiguration.loadConfiguration(ChatConf);
		if (ChatConf == null || ChatConfig == null) {
		}
		try {
			ChatConfig.save(ChatConf);
		} catch (IOException e) {
			System.out.println("ERROR SAVEING CHAT CONFIG");
		}
	}
}