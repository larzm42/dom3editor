/* This file is part of dom3Editor.
 *
 * dom3Editor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * dom3Editor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with dom3Editor.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.larz.dom3.db;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.larz.dom3.Activator;

/**
 * @author lmoore
 *
 */
public class Database {
	public static List<IDNameDB> getAllArmor() {
		List<IDNameDB> list = new ArrayList<IDNameDB>();
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"id#\", \"armorname\" FROM \"BaseA\"");

			while (rs.next())
			{
				IDNameDB armor = new IDNameDB();
				armor.id = rs.getInt("id#");
				armor.name = rs.getString("armorname");
				list.add(armor);
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<IDNameDB> getAllWeapon() {
		List<IDNameDB> list = new ArrayList<IDNameDB>();
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"id#\", \"wpname\" FROM \"BaseW\"");

			while (rs.next())
			{
				IDNameDB armor = new IDNameDB();
				armor.id = rs.getInt("id#");
				armor.name = rs.getString("wpname");
				list.add(armor);
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<IDNameDB> getAllMonster() {
		List<IDNameDB> list = new ArrayList<IDNameDB>();
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"id#\", \"unitname\" FROM \"BaseU\"");

			while (rs.next())
			{
				IDNameDB armor = new IDNameDB();
				armor.id = rs.getInt("id#");
				armor.name = rs.getString("unitname");
				list.add(armor);
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<IDNameDB> getAllItem() {
		List<IDNameDB> list = new ArrayList<IDNameDB>();
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"id#\", \"name\" FROM \"BaseI\"");

			while (rs.next())
			{
				IDNameDB armor = new IDNameDB();
				armor.id = rs.getInt("id#");
				armor.name = rs.getString("name");
				list.add(armor);
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<IDNameDB> getAllSite() {
		List<IDNameDB> list = new ArrayList<IDNameDB>();
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"id#\", \"name\" FROM \"MagicSites\"");

			while (rs.next())
			{
				IDNameDB armor = new IDNameDB();
				armor.id = rs.getInt("id#");
				armor.name = rs.getString("name");
				list.add(armor);
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<IDNameDB> getAllNation() {
		List<IDNameDB> list = new ArrayList<IDNameDB>();
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"#id\", \"name\" FROM \"Nations\"");

			while (rs.next())
			{
				IDNameDB armor = new IDNameDB();
				armor.id = rs.getInt("#id");
				armor.name = rs.getString("name");
				list.add(armor);
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static ArmorDB getArmor(int id) {
		ArmorDB armor = new ArmorDB();
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM \"BaseA\" where \"id#\"="+id);
			armor = getArmorDB(rs);
			statement.close();
			con.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return armor;
	}
	
	public static ArmorDB getArmor(String name) {
		ArmorDB armor = new ArmorDB();
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM \"BaseA\" where \"armorname\" = '"+name+"'");
			armor = getArmorDB(rs);
			statement.close();
			con.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return armor;
	}

	private static ArmorDB getArmorDB(ResultSet rs) throws SQLException {
		ArmorDB armor = new ArmorDB();
		if (rs.next()) {	
			armor.name = rs.getString("armorname");
			armor.id = rs.getInt("id#");
			armor.def = rs.getInt("def");
			armor.enc = rs.getInt("enc");
			armor.prot = rs.getInt("prot");
			armor.res = rs.getInt("res");
			armor.type = rs.getInt("type");
		}
		return armor;

	}
	
	public static WeaponDB getWeapon(int id) {
		WeaponDB weapon = new WeaponDB();
		try {
			Connection con = getConnection();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM \"BaseW\" where \"id#\"="+id);
			weapon = getWeaponDB(rs);
			statement.close();
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return weapon;
	}

	public static WeaponDB getWeapon(String name) {
		WeaponDB weapon = new WeaponDB();
		try {
			Connection con = getConnection();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM \"BaseW\" where \"wpname\" = '"+name+"'");
			weapon = getWeaponDB(rs);
			statement.close();
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return weapon;
	}

	private static WeaponDB getWeaponDB(ResultSet rs) throws SQLException {
		WeaponDB weapon = new WeaponDB();
		if (rs.next()) {	
			weapon.name = rs.getString("wpname");
			weapon.dmg = rs.getInt("dmg");
			weapon.nratt = rs.getInt("#att");
			weapon.att = rs.getInt("att");
			weapon.def = rs.getInt("def");
			weapon.len = rs.getInt("lgt");
			weapon.range = rs.getInt("rng");
			weapon.ammo = rs.getInt("shots");
			weapon.rcost = rs.getInt("res");
			//weapon.sound = rs.getInt("");
			weapon.aoe = rs.getInt("aoe");
			weapon.secondaryeffect = rs.getInt("effect");
			weapon.secondaryeffectalways = rs.getInt("effectauto");
			//weapon.explspr = rs.getInt("");
			//weapon.flyspr1 = rs.getInt("");
			//weapon.flyspr2 = rs.getInt("");
			weapon.twohanded = rs.getInt("2h") == 1;
			weapon.armorpiercing = rs.getInt("ap") == 1;
			weapon.armornegating = rs.getInt("an") == 1;
			weapon.magic = rs.getInt("magic") == 1;
			weapon.dt_normal = rs.getInt("dt_normal") == 1;
			weapon.dt_stun = rs.getInt("dt_stun") == 1;
			weapon.dt_paralyze = rs.getInt("dt_paralyze") == 1;
			weapon.dt_poison = rs.getInt("dt_poison") == 1;
			weapon.dt_cap = rs.getInt("dt_cap") == 1;
			weapon.dt_demon = rs.getInt("dt_demon") == 1;
			//weapon.dt_demononly = rs.getInt("") == 1;
			weapon.dt_holy = rs.getInt("dt_holy") == 1;
			weapon.dt_magic = rs.getInt("dt_magic") == 1;
			weapon.dt_small = rs.getInt("dt_small") == 1;
			weapon.dt_large = rs.getInt("dt_large") == 1;
			weapon.dt_constructonly = rs.getInt("dt_constr") == 1;
			//weapon.dt_raise = rs.getInt("") == 1;
			weapon.mind = rs.getInt("nomind") == 1;
			weapon.cold = rs.getInt("cold") == 1;
			weapon.fire = rs.getInt("fire") == 1;
			weapon.shock = rs.getInt("shock") == 1;
			weapon.poison = rs.getInt("poison") == 1;
			weapon.bonus = rs.getInt("bonus") == 1;
			weapon.charge = rs.getInt("charge") == 1;
			weapon.flail = rs.getInt("flail") == 1;
			weapon.nostr = rs.getInt("nostr") == 1;
			weapon.mrnegates = rs.getInt("mres") == 1;
			//weapon.mrnegateseasily = rs.getInt("") == 1;
		}
		return weapon;
	}
	
	public static String getArmorName(int id) {
		String armorName = null;
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"armorname\" FROM \"BaseA\" where \"id#\"="+id);

			while (rs.next()) {			
				armorName = rs.getString("armorname");
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return armorName;
	}
	
	public static String getWeaponName(int id) {
		String armorName = null;
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"wpname\" FROM \"BaseW\" where \"id#\"="+id);

			while (rs.next()) {			
				armorName = rs.getString("wpname");
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return armorName;
	}
	
	public static String getMonsterName(int id) {
		String armorName = null;
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"unitname\" FROM \"BaseU\" where \"id#\"="+id);

			while (rs.next()) {			
				armorName = rs.getString("unitname");
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return armorName;
	}
	
	public static String getItemName(int id) {
		String armorName = null;
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"name\" FROM \"BaseI\" where \"id#\"="+id);

			while (rs.next()) {			
				armorName = rs.getString("name");
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return armorName;
	}
	
	public static String getNationName(int id) {
		String armorName = null;
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"name\", \"era\" FROM \"Nations\" where \"#id\"="+id);

			while (rs.next()) {			
				armorName = rs.getString("name");
				int era = rs.getInt("era");
				switch (era) {
				case 1:
					armorName = "EA " + armorName;
					break;
				case 2:
					armorName = "MA " + armorName;
					break;
				case 3:
					armorName = "LA " + armorName;
					break;
				default:
					armorName = "Era " + era + " " + armorName;
					break;
				}
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return armorName;
	}
	
	public static String getSiteName(int id) {
		String armorName = null;
		try {
			Connection con = getConnection();

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT \"name\" FROM \"MagicSites\" where \"id#\"="+id);

			while (rs.next()) {			
				armorName = rs.getString("name");
			}

			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return armorName;
	}
	
	private static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		Path path = new Path("$nl$/data/dom3db.data");
		URL url = FileLocator.find(Activator.getDefault().getBundle(), path, null);
		String dbPath = FileLocator.toFileURL(url).getPath();
		dbPath = dbPath.substring(0, dbPath.length()-5);

		Class.forName("org.hsqldb.jdbcDriver");
		return DriverManager.getConnection("jdbc:hsqldb:file:" + dbPath, "sa", "");
	}

}
