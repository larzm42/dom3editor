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

	public static MonsterDB getMonster(int id) {
		MonsterDB monster = new MonsterDB();
		try {
			Connection con = getConnection();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM \"BaseU\" where \"id#\"="+id);
			monster = getMonsterDB(rs);
			statement.close();
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return monster;
	}

	public static MonsterDB getMonster(String name) {
		MonsterDB monster = new MonsterDB();
		try {
			Connection con = getConnection();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM \"BaseU\" where \"unitname\" = '"+name+"'");
			monster = getMonsterDB(rs);
			statement.close();
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return monster;
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
	
	private static MonsterDB getMonsterDB(ResultSet rs) throws SQLException {
		MonsterDB monster = new MonsterDB();
		if (rs.next()) {
			monster.name = rs.getString("unitname");
			//monster.spr1 = rs.getString("spr1");
			//monster.spr2 = rs.getString("spr2");
			//monster.descr = rs.getString("descr");
			monster.armor1 = rs.getString("helmet");
			monster.armor2 = rs.getString("armor");
			monster.armor3 = rs.getString("shield");
			//monster.speciallook = rs.getInt("speciallook");
			monster.ap = rs.getInt("ap");
			monster.mapmove = rs.getInt("map");
			monster.hp = rs.getInt("hp");
			monster.prot = rs.getInt("prot");
			monster.size = rs.getInt("sz");
			monster.ressize = rs.getInt("resz");
			monster.str = rs.getInt("str");
			monster.enc = rs.getInt("enc");
			monster.att = rs.getInt("att");
			monster.def = rs.getInt("def");
			monster.prec = rs.getInt("prec");
			monster.mr = rs.getInt("mr");
			monster.mor = rs.getInt("mor");
			monster.gcost = rs.getInt("gold");
			monster.rcost = rs.getInt("rsrc");
			monster.pathcost = rs.getInt("path");
			monster.startdom = rs.getInt("dom");
			//monster.eyes = rs.getInt("eyes");
			//monster.copystats = rs.getInt("copystats");
			//monster.copyspr = rs.getInt("copyspr");
			//monster.restrictedgod = rs.getInt("restrictedgod");
			monster.shatteredsoul = rs.getInt("soulsh");
			monster.coldres = rs.getInt("rescold");
			monster.fireres = rs.getInt("resfire");
			monster.poisonres = rs.getInt("respois");
			monster.shockres = rs.getInt("resshck");
			monster.darkvision = rs.getInt("dv");
			monster.stealthy = rs.getInt("stealth");
			monster.seduce = rs.getInt("seduce");
			monster.succubus = rs.getInt("succubus");
			//monster.beckon = rs.getInt("beckon");
			monster.startage = rs.getInt("agestrt");
			monster.maxage = rs.getInt("ageold");
			//monster.older = rs.getInt("older");
			monster.healer = rs.getInt("heal");
			//monster.startaff = rs.getInt("startaff");
			monster.supplybonus = rs.getInt("sup");
			//monster.uwdamage = rs.getInt("uwdamage");
			monster.coldpower = rs.getInt("pwcold");
			monster.firepower = rs.getInt("pwfire");
			monster.stormpower = rs.getInt("pwstrm");
			monster.darkpower = rs.getInt("pwdark");
			//monster.springpower = rs.getInt("springpower");
			//monster.summerpower = rs.getInt("summerpower");
			//monster.fallpower = rs.getInt("fallpower");
			//monster.winterpower = rs.getInt("winterpower");
			monster.ambidextrous = rs.getInt("adx");
			monster.banefireshield = rs.getInt("bfshld");
			monster.berserk = rs.getInt("brsrk");
			monster.standard = rs.getInt("std");
			monster.animalawe = rs.getInt("aawe");
			monster.awe = rs.getInt("awe");
			monster.fear = rs.getInt("fear");
			monster.regeneration = rs.getInt("regen");
			monster.reinvigoration = rs.getInt("inv");
			monster.fireshield = rs.getInt("fshld");
			monster.heat = rs.getInt("heat");
			//monster.cold = rs.getInt("cold");
			monster.iceprot = rs.getInt("ice");
//			monster.poisoncloud = rs.getInt("poisoncloud");
//			monster.diseasecloud = rs.getInt("diseasecloud");
//			monster.bloodvengeance = rs.getInt("bloodvengeance");
//			monster.castledef = rs.getInt("castledef");
//			monster.siegebonus = rs.getInt("siegebonus");
//			monster.patrolbonus = rs.getInt("patrolbonus");
//			monster.pillagebonus = rs.getInt("pillagebonus");
//			monster.researchbonus = rs.getInt("researchbonus");
//			monster.forgebonus = rs.getInt("forgebonus");
//			monster.douse = rs.getInt("douse");
//			monster.nobadevents = rs.getInt("nobadevents");
//			monster.incunrest = rs.getInt("incunrest");
//			monster.spreaddom = rs.getInt("spreaddom");
//			monster.leper = rs.getInt("leper");
//			monster.popkill = rs.getInt("popkill");
			monster.heretic = rs.getInt("her");
			int hand = rs.getInt("hand");
			int head = rs.getInt("head");
			int body = rs.getInt("body");
			int foot = rs.getInt("foot");
			int misc = rs.getInt("misc");
			int slots = 0;
			int handmask = 0;
			int headmask = 0;
			int bodymask = 0;
			int footmask = 0;
			int miscmask = 0;
			if (hand == 1) {
				handmask = 0x2;
			} else if (hand == 2) {
				handmask = 0x4;
			} else if (hand == 3) {
				handmask = 0x8;
			}
			if (head == 1) {
				headmask = 0x10;
			} else if (head == 2) {
				headmask = 0x20;
			}
			if (body == 1) {
				bodymask = 0x40;
			}
			if (foot == 1) {
				footmask = 0x80;
			}
			if (misc == 1) {
				miscmask = 0x200;
			} else if (misc == 2) {
				miscmask = 0x400;
			} else if (misc == 3) {
				miscmask = 0x800;
			} else if (misc == 4) {
				miscmask = 0x1000;
			}
			slots |= handmask;
			slots |= headmask;
			slots |= bodymask;
			slots |= footmask;
			slots |= miscmask;
			monster.itemslots = slots;
//			monster.nametype = rs.getInt("nametype");
//			monster.magicskill = rs.getInt("magicskill") == 1;
//			monster.custommagic = rs.getInt("custommagic") == 1;
//			monster.magicboost = rs.getInt("magicboost") == 1;
//			monster.gemprod = rs.getInt("gemprod") == 1;
//			monster.clear = rs.getInt("clear") == 1;
//			monster.clearmagic = rs.getInt("clearmagic") == 1;
//			monster.clearspec = rs.getInt("clearspec") == 1;
			monster.female = rs.getInt("female") == 1;
			monster.mounted = rs.getInt("mount") == 1;
			monster.holy = rs.getInt("holy") == 1;
//			monster.animal = rs.getInt("animal") == 1;
//			monster.undead = rs.getInt("undead") == 1;
//			monster.demon = rs.getInt("demon") == 1;
//			monster.magicbeing = rs.getInt("magicbeing") == 1;
//			monster.stonebeing = rs.getInt("stonebeing") == 1;
//			monster.inanimate = rs.getInt("inanimate") == 1;
//			monster.coldblood = rs.getInt("coldblood") == 1;
//			monster.immortal = rs.getInt("immortal") == 1;
//			monster.blind = rs.getInt("blind") == 1;
			monster.unique = rs.getInt("unique") == 1;
//			monster.immobile = rs.getInt("immobile") == 1;
//			monster.aquatic = rs.getInt("aquatic") == 1;
//			monster.amphibian = rs.getInt("amphibian") == 1;
//			monster.pooramphibian = rs.getInt("pooramphibian") == 1;
//			monster.flying = rs.getInt("flying") == 1;
//			monster.stormimmune = rs.getInt("stormimmune") == 1;
//			monster.sailing = rs.getInt("sailing") == 1;
//			monster.forestsurvival = rs.getInt("forestsurvival") == 1;
//			monster.mountainsurvival = rs.getInt("mountainsurvival") == 1;
//			monster.swampsurvival = rs.getInt("swampsurvival") == 1;
//			monster.wastesurvival = rs.getInt("wastesurvival") == 1;
//			monster.illusion = rs.getInt("illusion") == 1;
//			monster.spy = rs.getInt("spy") == 1;
//			monster.assassin = rs.getInt("assassin") == 1;
//			monster.heal = rs.getInt("heal") == 1;
//			monster.noheal = rs.getInt("noheal") == 1;
//			monster.neednoteat = rs.getInt("neednoteat") == 1;
//			monster.ethereal = rs.getInt("ethereal") == 1;
//			monster.trample = rs.getInt("trample") == 1;
//			monster.entangle = rs.getInt("entangle") == 1;
//			monster.eyeloss = rs.getInt("eyeloss") == 1;
//			monster.horrormark = rs.getInt("horrormark") == 1;
//			monster.poisonarmor = rs.getInt("poisonarmor") == 1;
			monster.inquisitor = rs.getInt("inq") == 1;
//			monster.noitem = rs.getInt("noitem") == 1;
//			monster.noleader = rs.getInt("noleader") == 1;
//			monster.poorleader = rs.getInt("poorleader") == 1;
//			monster.okleader = rs.getInt("okleader") == 1;
//			monster.goodleader = rs.getInt("goodleader") == 1;
//			monster.expertleader = rs.getInt("expertleader") == 1;
//			monster.superiorleader = rs.getInt("superiorleader") == 1;
//			monster.nomagicleader = rs.getInt("nomagicleader") == 1;
//			monster.poormagicleader = rs.getInt("poormagicleader") == 1;
//			monster.okmagicleader = rs.getInt("okmagicleader") == 1;
//			monster.goodmagicleader = rs.getInt("goodmagicleader") == 1;
//			monster.expertmagicleader = rs.getInt("expertmagicleader") == 1;
//			monster.superiormagicleader = rs.getInt("superiormagicleader") == 1;
//			monster.noundeadleader = rs.getInt("noundeadleader") == 1;
//			monster.poorundeadleader = rs.getInt("poorundeadleader") == 1;
//			monster.okundeadleader = rs.getInt("okundeadleader") == 1;
//			monster.goodundeadleader = rs.getInt("goodundeadleader") == 1;
//			monster.expertundeadleader = rs.getInt("expertundeadleader") == 1;
//			monster.superiorundeadleader = rs.getInt("superiorundeadleader") == 1;
			monster.weapon1 = rs.getString("wpn1");
			monster.weapon2 = rs.getString("wpn2");
			monster.weapon3 = rs.getString("wpn3");
			monster.weapon4 = rs.getString("wpn4");
//			monster.onebattlespell = rs.getString("onebattlespell");
//			monster.firstshape = rs.getString("firstshape");
//			monster.secondshape = rs.getString("secondshape");
//			monster.secondtmpshape = rs.getString("secondtmpshape");
//			monster.shapechange = rs.getString("shapechange");
//			monster.landshape = rs.getString("landshape");
//			monster.watershape = rs.getString("watershape");
//			monster.forestshape = rs.getString("forestshape");
//			monster.plainshape = rs.getString("plainshape");
//			monster.domsummon = rs.getString("domsummon");
//			monster.domsummon2 = rs.getString("domsummon2");
//			monster.domsummon20 = rs.getString("domsummon20");
//			monster.makemonster1 = rs.getString("makemonster1");
//			monster.makemonster2 = rs.getString("makemonster2");
//			monster.makemonster3 = rs.getString("makemonster3");
//			monster.makemonster4 = rs.getString("makemonster4");
//			monster.makemonster5 = rs.getString("makemonster5");
//			monster.summon1 = rs.getString("summon1");
//			monster.summon5 = rs.getString("summon5");
		}
		return monster;
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
