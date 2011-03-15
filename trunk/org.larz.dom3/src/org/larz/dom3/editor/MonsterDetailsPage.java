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
package org.larz.dom3.editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.EnumMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IDocumentEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.larz.dom3.db.Database;
import org.larz.dom3.db.MonsterDB;
import org.larz.dom3.dm.dm.DmFactory;
import org.larz.dom3.dm.dm.Monster;
import org.larz.dom3.dm.dm.MonsterInst1;
import org.larz.dom3.dm.dm.MonsterInst2;
import org.larz.dom3.dm.dm.MonsterInst3;
import org.larz.dom3.dm.dm.MonsterInst4;
import org.larz.dom3.dm.dm.MonsterInst5;
import org.larz.dom3.dm.dm.MonsterMods;
import org.larz.dom3.dm.dm.SelectMonsterById;
import org.larz.dom3.dm.dm.SelectMonsterByName;
import org.larz.dom3.dm.ui.editor.DmXtextEditor;
import org.larz.dom3.dm.ui.internal.DmActivator;
import org.larz.dom3.image.ImageConverter;
import org.larz.dom3.image.ImageLoader;

public class MonsterDetailsPage implements IDetailsPage {
	private IManagedForm mform;
	private Monster input;
	private XtextEditor doc;
	private TableViewer viewer;

	private Text name;
	private Text descr;
	private Button descCheck;
	private Label sprite1Label;
	private Label sprite2Label;

	enum Inst {
		NAME (Messages.getString("MonsterDetailsSection.mod.name"), ""),
		DESCR (Messages.getString("MonsterDetailsSection.mod.descr"), ""),
		SPR1 (Messages.getString("MonsterDetailsSection.mod.spr1"), ""),
		SPR2 (Messages.getString("MonsterDetailsSection.mod.spr2"), ""),
		SPECIALLOOK (Messages.getString("MonsterDetailsSection.mod.speciallook"), "10"),
		AP (Messages.getString("MonsterDetailsSection.mod.ap"), "10"),
		MAPMOVE (Messages.getString("MonsterDetailsSection.mod.mapmove"), "10"),
		HP (Messages.getString("MonsterDetailsSection.mod.hp"), "10"),
		PROT (Messages.getString("MonsterDetailsSection.mod.prot"), "10"),
		SIZE (Messages.getString("MonsterDetailsSection.mod.size"), "10"),
		RESSIZE (Messages.getString("MonsterDetailsSection.mod.ressize"), "10"),
		STR (Messages.getString("MonsterDetailsSection.mod.str"), "10"),
		ENC (Messages.getString("MonsterDetailsSection.mod.enc"), "10"),
		ATT (Messages.getString("MonsterDetailsSection.mod.att"), "10"),
		DEF (Messages.getString("MonsterDetailsSection.mod.def"), "10"),
		PREC (Messages.getString("MonsterDetailsSection.mod.prec"), "10"),
		MR (Messages.getString("MonsterDetailsSection.mod.mr"), "10"),
		MOR (Messages.getString("MonsterDetailsSection.mod.mor"), "10"),
		GCOST (Messages.getString("MonsterDetailsSection.mod.gcost"), "10"),
		RCOST (Messages.getString("MonsterDetailsSection.mod.rcost"), "10"),
		PATHCOST (Messages.getString("MonsterDetailsSection.mod.pathcost"), "10"),
		STARTDOM (Messages.getString("MonsterDetailsSection.mod.startdom"), "10"),
		EYES (Messages.getString("MonsterDetailsSection.mod.eyes"), "10"),
		COPYSTATS (Messages.getString("MonsterDetailsSection.mod.copystats"), "10"),
		COPYSPR (Messages.getString("MonsterDetailsSection.mod.copyspr"), "10"),
		RESTRICTEDGOD (Messages.getString("MonsterDetailsSection.mod.restrictedgod"), "10"),
		SHATTEREDSOUL (Messages.getString("MonsterDetailsSection.mod.shatteredsoul"), "10"),
		COLDRES (Messages.getString("MonsterDetailsSection.mod.coldres"), "10"),
		FIRERES (Messages.getString("MonsterDetailsSection.mod.fireres"), "10"),
		POISONRES (Messages.getString("MonsterDetailsSection.mod.poisonres"), "10"),
		SHOCKRES (Messages.getString("MonsterDetailsSection.mod.shockres"), "10"),
		DARKVISION (Messages.getString("MonsterDetailsSection.mod.darkvision"), "10"),
		STEALTHY (Messages.getString("MonsterDetailsSection.mod.stealthy"), "10"),
		SEDUCE (Messages.getString("MonsterDetailsSection.mod.seduce"), "10"),
		SUCCUBUS (Messages.getString("MonsterDetailsSection.mod.succubus"), "10"),
		BECKON (Messages.getString("MonsterDetailsSection.mod.beckon"), "10"),
		STARTAGE (Messages.getString("MonsterDetailsSection.mod.startage"), "10"),
		MAXAGE (Messages.getString("MonsterDetailsSection.mod.maxage"), "10"),
		OLDER (Messages.getString("MonsterDetailsSection.mod.older"), "10"),
		HEALER (Messages.getString("MonsterDetailsSection.mod.healer"), "10"),
		STARTAFF (Messages.getString("MonsterDetailsSection.mod.startaff"), "10"),
		SUPPLYBONUS (Messages.getString("MonsterDetailsSection.mod.supplybonus"), "10"),
		UWDAMAGE (Messages.getString("MonsterDetailsSection.mod.uwdamage"), "10"),
		COLDPOWER (Messages.getString("MonsterDetailsSection.mod.coldpower"), "10"),
		FIREPOWER (Messages.getString("MonsterDetailsSection.mod.firepower"), "10"),
		STORMPOWER (Messages.getString("MonsterDetailsSection.mod.stormpower"), "10"),
		DARKPOWER (Messages.getString("MonsterDetailsSection.mod.darkpower"), "10"),
		SPRINGPOWER (Messages.getString("MonsterDetailsSection.mod.springpower"), "10"),
		SUMMERPOWER (Messages.getString("MonsterDetailsSection.mod.summerpower"), "10"),
		FALLPOWER (Messages.getString("MonsterDetailsSection.mod.fallpower"), "10"),
		WINTERPOWER (Messages.getString("MonsterDetailsSection.mod.winterpower"), "10"),
		AMBIDEXTROUS (Messages.getString("MonsterDetailsSection.mod.ambidextrous"), "10"),
		BANEFIRESHIELD (Messages.getString("MonsterDetailsSection.mod.banefireshield"), "10"),
		BERSERK (Messages.getString("MonsterDetailsSection.mod.berserk"), "10"),
		STANDARD (Messages.getString("MonsterDetailsSection.mod.standard"), "10"),
		ANIMALAWE (Messages.getString("MonsterDetailsSection.mod.animalawe"), "10"),
		AWE (Messages.getString("MonsterDetailsSection.mod.awe"), "10"),
		FEAR (Messages.getString("MonsterDetailsSection.mod.fear"), "10"),
		REGENERATION (Messages.getString("MonsterDetailsSection.mod.regeneration"), "10"),
		REINVIGORATION (Messages.getString("MonsterDetailsSection.mod.reinvigoration"), "10"),
		FIRESHIELD (Messages.getString("MonsterDetailsSection.mod.fireshield"), "10"),
		HEAT (Messages.getString("MonsterDetailsSection.mod.heat"), "10"),
		COLD (Messages.getString("MonsterDetailsSection.mod.cold"), "10"),
		ICEPROT (Messages.getString("MonsterDetailsSection.mod.iceprot"), "10"),
		POISONCLOUD (Messages.getString("MonsterDetailsSection.mod.poisoncloud"), "10"),
		DISEASECLOUD (Messages.getString("MonsterDetailsSection.mod.diseasecloud"), "10"),
		BLOODVENGEANCE (Messages.getString("MonsterDetailsSection.mod.bloodvengeance"), "10"),
		CASTLEDEF (Messages.getString("MonsterDetailsSection.mod.castledef"), "10"),
		SIEGEBONUS (Messages.getString("MonsterDetailsSection.mod.siegebonus"), "10"),
		PATROLBONUS (Messages.getString("MonsterDetailsSection.mod.patrolbonus"), "10"),
		PILLAGEBONUS (Messages.getString("MonsterDetailsSection.mod.pillagebonus"), "10"),
		RESEARCHBONUS (Messages.getString("MonsterDetailsSection.mod.researchbonus"), "10"),
		FORGEBONUS (Messages.getString("MonsterDetailsSection.mod.forgebonus"), "10"),
		DOUSE (Messages.getString("MonsterDetailsSection.mod.douse"), "10"),
		NOBADEVENTS (Messages.getString("MonsterDetailsSection.mod.nobadevents"), "10"),
		INCUNREST (Messages.getString("MonsterDetailsSection.mod.incunrest"), "10"),
		SPREADDOM (Messages.getString("MonsterDetailsSection.mod.spreaddom"), "10"),
		LEPER (Messages.getString("MonsterDetailsSection.mod.leper"), "10"),
		POPKILL (Messages.getString("MonsterDetailsSection.mod.popkill"), "10"),
		HERETIC (Messages.getString("MonsterDetailsSection.mod.heretic"), "10"),
		ITEMSLOTS (Messages.getString("MonsterDetailsSection.mod.itemslots"), "10"),
		NAMETYPE (Messages.getString("MonsterDetailsSection.mod.nametype"), "10"),
		MAGICSKILL (Messages.getString("MonsterDetailsSection.mod.magicskill"), "10", "10"),
		CUSTOMMAGIC (Messages.getString("MonsterDetailsSection.mod.custommagic"), "10", "10"),
		MAGICBOOST (Messages.getString("MonsterDetailsSection.mod.magicboost"), "10", "10"),
		GEMPROD (Messages.getString("MonsterDetailsSection.mod.gemprod"), "10", "10"),
		CLEAR (Messages.getString("MonsterDetailsSection.mod.clear")),
		CLEARMAGIC (Messages.getString("MonsterDetailsSection.mod.clearmagic")),
		CLEARSPEC (Messages.getString("MonsterDetailsSection.mod.clearspec")),
		FEMALE (Messages.getString("MonsterDetailsSection.mod.female")),
		MOUNTED (Messages.getString("MonsterDetailsSection.mod.mounted")),
		HOLY (Messages.getString("MonsterDetailsSection.mod.holy")),
		ANIMAL (Messages.getString("MonsterDetailsSection.mod.animal")),
		UNDEAD (Messages.getString("MonsterDetailsSection.mod.undead")),
		DEMON (Messages.getString("MonsterDetailsSection.mod.demon")),
		MAGICBEING (Messages.getString("MonsterDetailsSection.mod.magicbeing")),
		STONEBEING (Messages.getString("MonsterDetailsSection.mod.stonebeing")),
		INANIMATE (Messages.getString("MonsterDetailsSection.mod.inanimate")),
		COLDBLOOD (Messages.getString("MonsterDetailsSection.mod.coldblood")),
		IMMORTAL (Messages.getString("MonsterDetailsSection.mod.immortal")),
		BLIND (Messages.getString("MonsterDetailsSection.mod.blind")),
		UNIQUE (Messages.getString("MonsterDetailsSection.mod.unique")),
		IMMOBILE (Messages.getString("MonsterDetailsSection.mod.immobile")),
		AQUATIC (Messages.getString("MonsterDetailsSection.mod.aquatic")),
		AMPHIBIAN (Messages.getString("MonsterDetailsSection.mod.amphibian")),
		POORAMPHIBIAN (Messages.getString("MonsterDetailsSection.mod.pooramphibian")),
		FLYING (Messages.getString("MonsterDetailsSection.mod.flying")),
		STORMIMMUNE (Messages.getString("MonsterDetailsSection.mod.stormimmune")),
		SAILING (Messages.getString("MonsterDetailsSection.mod.sailing")),
		FORESTSURVIVAL (Messages.getString("MonsterDetailsSection.mod.forestsurvival")),
		MOUNTAINSURVIVAL (Messages.getString("MonsterDetailsSection.mod.mountainsurvival")),
		SWAMPSURVIVAL (Messages.getString("MonsterDetailsSection.mod.swampsurvival")),
		WASTESURVIVAL (Messages.getString("MonsterDetailsSection.mod.wastesurvival")),
		ILLUSION (Messages.getString("MonsterDetailsSection.mod.illusion")),
		SPY (Messages.getString("MonsterDetailsSection.mod.spy")),
		ASSASSIN (Messages.getString("MonsterDetailsSection.mod.assassin")),
		HEAL (Messages.getString("MonsterDetailsSection.mod.heal")),
		NOHEAL (Messages.getString("MonsterDetailsSection.mod.noheal")),
		NEEDNOTEAT (Messages.getString("MonsterDetailsSection.mod.neednoteat")),
		ETHEREAL (Messages.getString("MonsterDetailsSection.mod.ethereal")),
		TRAMPLE (Messages.getString("MonsterDetailsSection.mod.trample")),
		ENTANGLE (Messages.getString("MonsterDetailsSection.mod.entangle")),
		EYELOSS (Messages.getString("MonsterDetailsSection.mod.eyeloss")),
		HORRORMARK (Messages.getString("MonsterDetailsSection.mod.horrormark")),
		POISONARMOR (Messages.getString("MonsterDetailsSection.mod.poisonarmor")),
		INQUISITOR (Messages.getString("MonsterDetailsSection.mod.inquisitor")),
		NOITEM (Messages.getString("MonsterDetailsSection.mod.noitem")),
		NOLEADER (Messages.getString("MonsterDetailsSection.mod.noleader")),
		POORLEADER (Messages.getString("MonsterDetailsSection.mod.poorleader")),
		OKLEADER (Messages.getString("MonsterDetailsSection.mod.okleader")),
		GOODLEADER (Messages.getString("MonsterDetailsSection.mod.goodleader")),
		EXPERTLEADER (Messages.getString("MonsterDetailsSection.mod.expertleader")),
		SUPERIORLEADER (Messages.getString("MonsterDetailsSection.mod.superiorleader")),
		NOMAGICLEADER (Messages.getString("MonsterDetailsSection.mod.nomagicleader")),
		POORMAGICLEADER (Messages.getString("MonsterDetailsSection.mod.poormagicleader")),
		OKMAGICLEADER (Messages.getString("MonsterDetailsSection.mod.okmagicleader")),
		GOODMAGICLEADER (Messages.getString("MonsterDetailsSection.mod.goodmagicleader")),
		EXPERTMAGICLEADER (Messages.getString("MonsterDetailsSection.mod.expertmagicleader")),
		SUPERIORMAGICLEADER (Messages.getString("MonsterDetailsSection.mod.superiormagicleader")),
		NOUNDEADLEADER (Messages.getString("MonsterDetailsSection.mod.noundeadleader")),
		POORUNDEADLEADER (Messages.getString("MonsterDetailsSection.mod.poorundeadleader")),
		OKUNDEADLEADER (Messages.getString("MonsterDetailsSection.mod.okundeadleader")),
		GOODUNDEADLEADER (Messages.getString("MonsterDetailsSection.mod.goodundeadleader")),
		EXPERTUNDEADLEADER (Messages.getString("MonsterDetailsSection.mod.expertundeadleader")),
		SUPERIORUNDEADLEADER (Messages.getString("MonsterDetailsSection.mod.superiorundeadleader")),
		WEAPON1 (Messages.getString("MonsterDetailsSection.mod.weapon"), "1"),
		WEAPON2 (Messages.getString("MonsterDetailsSection.mod.weapon"), "2"),
		WEAPON3 (Messages.getString("MonsterDetailsSection.mod.weapon"), "3"),
		WEAPON4 (Messages.getString("MonsterDetailsSection.mod.weapon"), "4"),
		ARMOR1 (Messages.getString("MonsterDetailsSection.mod.armor"), ""),
		ARMOR2 (Messages.getString("MonsterDetailsSection.mod.armor"), ""),
		ARMOR3 (Messages.getString("MonsterDetailsSection.mod.armor"), ""),
		ONEBATTLESPELL (Messages.getString("MonsterDetailsSection.mod.onebattlespell"), ""),
		FIRSTSHAPE (Messages.getString("MonsterDetailsSection.mod.firstshape"), ""),
		SECONDSHAPE (Messages.getString("MonsterDetailsSection.mod.secondshape"), ""),
		SECONDTMPSHAPE (Messages.getString("MonsterDetailsSection.mod.secondtmpshape"), ""),
		SHAPECHANGE (Messages.getString("MonsterDetailsSection.mod.shapechange"), ""),
		LANDSHAPE (Messages.getString("MonsterDetailsSection.mod.landshape"), ""),
		WATERSHAPE (Messages.getString("MonsterDetailsSection.mod.watershape"), ""),
		FORESTSHAPE (Messages.getString("MonsterDetailsSection.mod.forestshape"), ""),
		PLAINSHAPE (Messages.getString("MonsterDetailsSection.mod.plainshape"), ""),
		DOMSUMMON (Messages.getString("MonsterDetailsSection.mod.domsummon"), ""),
		DOMSUMMON2 (Messages.getString("MonsterDetailsSection.mod.domsummon2"), ""),
		DOMSUMMON20 (Messages.getString("MonsterDetailsSection.mod.domsummon20"), ""),
		MAKEMONSTER1 (Messages.getString("MonsterDetailsSection.mod.makemonster1"), ""),
		MAKEMONSTER2 (Messages.getString("MonsterDetailsSection.mod.makemonster2"), ""),
		MAKEMONSTER3 (Messages.getString("MonsterDetailsSection.mod.makemonster3"), ""),
		MAKEMONSTER4 (Messages.getString("MonsterDetailsSection.mod.makemonster4"), ""),
		MAKEMONSTER5 (Messages.getString("MonsterDetailsSection.mod.makemonster5"), ""),
		SUMMON1 (Messages.getString("MonsterDetailsSection.mod.summon1"), ""),
		SUMMON5 (Messages.getString("MonsterDetailsSection.mod.summon5"), "");
		
		private String label;
		private String defaultValue;
		private String defaultValue2;
		
		Inst(String label, String defaultValue) {
			this.label = label;
			this.defaultValue = defaultValue;
		}
		
		Inst(String label, String defaultValue, String defaultValue2) {
			this.label = label;
			this.defaultValue = defaultValue;
			this.defaultValue2 = defaultValue2;
		}
		
		Inst(String label) {
			this.label = label;
		}
	}
	
	interface InstFields {}
	
	class Inst1Fields implements InstFields {
		private Button check;
		private Text value;
	}
	
	class Inst2Fields implements InstFields {
		private Button check;
		private Text value;
		private Label defaultLabel;
	}
	
	class Inst3Fields implements InstFields {
		private Button check;
		private Text value1;
		private Text value2;
		private Label defaultLabel1;
		private Label defaultLabel2;
	}
	
	class Inst4Fields implements InstFields {
		private Button check;
		private Label defaultLabel;
	}

	class Inst5Fields implements InstFields {
		private Button check;
		private Text value;
	}
	
	EnumMap<Inst, InstFields> instMap = new EnumMap<Inst, InstFields>(Inst.class);
	
	public MonsterDetailsPage(XtextEditor doc, TableViewer viewer) {
		this.doc = doc;
		this.viewer = viewer;
		instMap.put(Inst.SPR1, new Inst1Fields());
		instMap.put(Inst.SPR2, new Inst1Fields());
		instMap.put(Inst.ARMOR1, new Inst1Fields());
		instMap.put(Inst.ARMOR2, new Inst1Fields());
		instMap.put(Inst.ARMOR3, new Inst1Fields());
		instMap.put(Inst.SPECIALLOOK, new Inst2Fields());
		instMap.put(Inst.AP, new Inst2Fields());
		instMap.put(Inst.MAPMOVE, new Inst2Fields());
		instMap.put(Inst.HP, new Inst2Fields());
		instMap.put(Inst.PROT, new Inst2Fields());
		instMap.put(Inst.SIZE, new Inst2Fields());
		instMap.put(Inst.RESSIZE, new Inst2Fields());
		instMap.put(Inst.STR, new Inst2Fields());
		instMap.put(Inst.ENC, new Inst2Fields());
		instMap.put(Inst.ATT, new Inst2Fields());
		instMap.put(Inst.DEF, new Inst2Fields());
		instMap.put(Inst.PREC, new Inst2Fields());
		instMap.put(Inst.MR, new Inst2Fields());
		instMap.put(Inst.MOR, new Inst2Fields());
		instMap.put(Inst.GCOST, new Inst2Fields());
		instMap.put(Inst.RCOST, new Inst2Fields());
		instMap.put(Inst.PATHCOST, new Inst2Fields());
		instMap.put(Inst.STARTDOM, new Inst2Fields());
		instMap.put(Inst.EYES, new Inst2Fields());
		instMap.put(Inst.COPYSTATS, new Inst2Fields());
		instMap.put(Inst.COPYSPR, new Inst2Fields());
		instMap.put(Inst.RESTRICTEDGOD, new Inst2Fields());
		instMap.put(Inst.SHATTEREDSOUL, new Inst2Fields());
		instMap.put(Inst.COLDRES, new Inst2Fields());
		instMap.put(Inst.FIRERES, new Inst2Fields());
		instMap.put(Inst.POISONRES, new Inst2Fields());
		instMap.put(Inst.SHOCKRES, new Inst2Fields());
		instMap.put(Inst.DARKVISION, new Inst2Fields());
		instMap.put(Inst.STEALTHY, new Inst2Fields());
		instMap.put(Inst.SEDUCE, new Inst2Fields());
		instMap.put(Inst.SUCCUBUS, new Inst2Fields());
		instMap.put(Inst.BECKON, new Inst2Fields());
		instMap.put(Inst.STARTAGE, new Inst2Fields());
		instMap.put(Inst.MAXAGE, new Inst2Fields());
		instMap.put(Inst.OLDER, new Inst2Fields());
		instMap.put(Inst.HEALER, new Inst2Fields());
		instMap.put(Inst.STARTAFF, new Inst2Fields());
		instMap.put(Inst.SUPPLYBONUS, new Inst2Fields());
		instMap.put(Inst.UWDAMAGE, new Inst2Fields());
		instMap.put(Inst.COLDPOWER, new Inst2Fields());
		instMap.put(Inst.FIREPOWER, new Inst2Fields());
		instMap.put(Inst.STORMPOWER, new Inst2Fields());
		instMap.put(Inst.DARKPOWER, new Inst2Fields());
		instMap.put(Inst.SPRINGPOWER, new Inst2Fields());
		instMap.put(Inst.SUMMERPOWER, new Inst2Fields());
		instMap.put(Inst.FALLPOWER, new Inst2Fields());
		instMap.put(Inst.WINTERPOWER, new Inst2Fields());
		instMap.put(Inst.AMBIDEXTROUS, new Inst2Fields());
		instMap.put(Inst.BANEFIRESHIELD, new Inst2Fields());
		instMap.put(Inst.BERSERK, new Inst2Fields());
		instMap.put(Inst.STANDARD, new Inst2Fields());
		instMap.put(Inst.ANIMALAWE, new Inst2Fields());
		instMap.put(Inst.AWE, new Inst2Fields());
		instMap.put(Inst.FEAR, new Inst2Fields());
		instMap.put(Inst.REGENERATION, new Inst2Fields());
		instMap.put(Inst.REINVIGORATION, new Inst2Fields());
		instMap.put(Inst.FIRESHIELD, new Inst2Fields());
		instMap.put(Inst.HEAT, new Inst2Fields());
		instMap.put(Inst.COLD, new Inst2Fields());
		instMap.put(Inst.ICEPROT, new Inst2Fields());
		instMap.put(Inst.POISONCLOUD, new Inst2Fields());
		instMap.put(Inst.DISEASECLOUD, new Inst2Fields());
		instMap.put(Inst.BLOODVENGEANCE, new Inst2Fields());
		instMap.put(Inst.CASTLEDEF, new Inst2Fields());
		instMap.put(Inst.SIEGEBONUS, new Inst2Fields());
		instMap.put(Inst.PATROLBONUS, new Inst2Fields());
		instMap.put(Inst.PILLAGEBONUS, new Inst2Fields());
		instMap.put(Inst.RESEARCHBONUS, new Inst2Fields());
		instMap.put(Inst.FORGEBONUS, new Inst2Fields());
		instMap.put(Inst.DOUSE, new Inst2Fields());
		instMap.put(Inst.NOBADEVENTS, new Inst2Fields());
		instMap.put(Inst.INCUNREST, new Inst2Fields());
		instMap.put(Inst.SPREADDOM, new Inst2Fields());
		instMap.put(Inst.LEPER, new Inst2Fields());
		instMap.put(Inst.POPKILL, new Inst2Fields());
		instMap.put(Inst.HERETIC, new Inst2Fields());
		instMap.put(Inst.ITEMSLOTS, new Inst2Fields());
		instMap.put(Inst.NAMETYPE, new Inst2Fields());
		instMap.put(Inst.MAGICSKILL, new Inst3Fields());
		instMap.put(Inst.CUSTOMMAGIC, new Inst3Fields());
		instMap.put(Inst.MAGICBOOST, new Inst3Fields());
		instMap.put(Inst.GEMPROD, new Inst3Fields());
		instMap.put(Inst.CLEAR, new Inst4Fields());
		instMap.put(Inst.CLEARMAGIC, new Inst4Fields());
		instMap.put(Inst.CLEARSPEC, new Inst4Fields());
		instMap.put(Inst.FEMALE, new Inst4Fields());
		instMap.put(Inst.MOUNTED, new Inst4Fields());
		instMap.put(Inst.HOLY, new Inst4Fields());
		instMap.put(Inst.ANIMAL, new Inst4Fields());
		instMap.put(Inst.UNDEAD, new Inst4Fields());
		instMap.put(Inst.DEMON, new Inst4Fields());
		instMap.put(Inst.MAGICBEING, new Inst4Fields());
		instMap.put(Inst.STONEBEING, new Inst4Fields());
		instMap.put(Inst.INANIMATE, new Inst4Fields());
		instMap.put(Inst.COLDBLOOD, new Inst4Fields());
		instMap.put(Inst.IMMORTAL, new Inst4Fields());
		instMap.put(Inst.BLIND, new Inst4Fields());
		instMap.put(Inst.UNIQUE, new Inst4Fields());
		instMap.put(Inst.IMMOBILE, new Inst4Fields());
		instMap.put(Inst.AQUATIC, new Inst4Fields());
		instMap.put(Inst.AMPHIBIAN, new Inst4Fields());
		instMap.put(Inst.POORAMPHIBIAN, new Inst4Fields());
		instMap.put(Inst.FLYING, new Inst4Fields());
		instMap.put(Inst.STORMIMMUNE, new Inst4Fields());
		instMap.put(Inst.SAILING, new Inst4Fields());
		instMap.put(Inst.FORESTSURVIVAL, new Inst4Fields());
		instMap.put(Inst.MOUNTAINSURVIVAL, new Inst4Fields());
		instMap.put(Inst.SWAMPSURVIVAL, new Inst4Fields());
		instMap.put(Inst.WASTESURVIVAL, new Inst4Fields());
		instMap.put(Inst.ILLUSION, new Inst4Fields());
		instMap.put(Inst.SPY, new Inst4Fields());
		instMap.put(Inst.ASSASSIN, new Inst4Fields());
		instMap.put(Inst.HEAL, new Inst4Fields());
		instMap.put(Inst.NOHEAL, new Inst4Fields());
		instMap.put(Inst.NEEDNOTEAT, new Inst4Fields());
		instMap.put(Inst.ETHEREAL, new Inst4Fields());
		instMap.put(Inst.TRAMPLE, new Inst4Fields());
		instMap.put(Inst.ENTANGLE, new Inst4Fields());
		instMap.put(Inst.EYELOSS, new Inst4Fields());
		instMap.put(Inst.HORRORMARK, new Inst4Fields());
		instMap.put(Inst.POISONARMOR, new Inst4Fields());
		instMap.put(Inst.INQUISITOR, new Inst4Fields());
		instMap.put(Inst.NOITEM, new Inst4Fields());
		instMap.put(Inst.NOLEADER, new Inst4Fields());
		instMap.put(Inst.POORLEADER, new Inst4Fields());
		instMap.put(Inst.OKLEADER, new Inst4Fields());
		instMap.put(Inst.GOODLEADER, new Inst4Fields());
		instMap.put(Inst.EXPERTLEADER, new Inst4Fields());
		instMap.put(Inst.SUPERIORLEADER, new Inst4Fields());
		instMap.put(Inst.NOMAGICLEADER, new Inst4Fields());
		instMap.put(Inst.POORMAGICLEADER, new Inst4Fields());
		instMap.put(Inst.OKMAGICLEADER, new Inst4Fields());
		instMap.put(Inst.GOODMAGICLEADER, new Inst4Fields());
		instMap.put(Inst.EXPERTMAGICLEADER, new Inst4Fields());
		instMap.put(Inst.SUPERIORMAGICLEADER, new Inst4Fields());
		instMap.put(Inst.NOUNDEADLEADER, new Inst4Fields());
		instMap.put(Inst.POORUNDEADLEADER, new Inst4Fields());
		instMap.put(Inst.OKUNDEADLEADER, new Inst4Fields());
		instMap.put(Inst.GOODUNDEADLEADER, new Inst4Fields());
		instMap.put(Inst.EXPERTUNDEADLEADER, new Inst4Fields());
		instMap.put(Inst.SUPERIORUNDEADLEADER, new Inst4Fields());
		instMap.put(Inst.WEAPON1, new Inst5Fields());
		instMap.put(Inst.WEAPON2, new Inst5Fields());
		instMap.put(Inst.WEAPON3, new Inst5Fields());
		instMap.put(Inst.WEAPON4, new Inst5Fields());
		instMap.put(Inst.ONEBATTLESPELL, new Inst5Fields());
		instMap.put(Inst.FIRSTSHAPE, new Inst5Fields());
		instMap.put(Inst.SECONDSHAPE, new Inst5Fields());
		instMap.put(Inst.SECONDTMPSHAPE, new Inst5Fields());
		instMap.put(Inst.SHAPECHANGE, new Inst5Fields());
		instMap.put(Inst.LANDSHAPE, new Inst5Fields());
		instMap.put(Inst.WATERSHAPE, new Inst5Fields());
		instMap.put(Inst.FORESTSHAPE, new Inst5Fields());
		instMap.put(Inst.PLAINSHAPE, new Inst5Fields());
		instMap.put(Inst.DOMSUMMON, new Inst5Fields());
		instMap.put(Inst.DOMSUMMON2, new Inst5Fields());
		instMap.put(Inst.DOMSUMMON20, new Inst5Fields());
		instMap.put(Inst.MAKEMONSTER1, new Inst5Fields());
		instMap.put(Inst.MAKEMONSTER2, new Inst5Fields());
		instMap.put(Inst.MAKEMONSTER3, new Inst5Fields());
		instMap.put(Inst.MAKEMONSTER4, new Inst5Fields());
		instMap.put(Inst.MAKEMONSTER5, new Inst5Fields());
		instMap.put(Inst.SUMMON1, new Inst5Fields());
		instMap.put(Inst.SUMMON5, new Inst5Fields());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#initialize(org.eclipse.ui.forms.IManagedForm)
	 */
	public void initialize(IManagedForm mform) {
		this.mform = mform;
	}
	
	/**
	 * @return
	 */
	public Monster getInput() {
		return input;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	public void createContents(Composite parent) {
		TableWrapLayout layout = new TableWrapLayout();
		layout.topMargin = 5;
		layout.leftMargin = 5;
		layout.rightMargin = 2;
		layout.bottomMargin = 2;
		parent.setLayout(layout);

		final FormToolkit toolkit = mform.getToolkit();
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION|Section.TITLE_BAR);
		s1.marginWidth = 10;
		s1.setText(Messages.getString("MonsterDetailsSection.name"));
		TableWrapData td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
		td.grabHorizontal = true;
		s1.setLayoutData(td);
		
		final Composite client = toolkit.createComposite(parent);
		GridLayout glayout = new GridLayout();
		glayout.marginWidth = glayout.marginHeight = 0;
		glayout.numColumns = 2;
		glayout.makeColumnsEqualWidth = true;
		client.setLayout(glayout);
		
		final Composite nameComp = toolkit.createComposite(client);
		nameComp.setLayout(new GridLayout(2, false));
		GridData gd = new GridData(SWT.DEFAULT, SWT.FILL, false, false);
		gd.horizontalSpan = 2;
		nameComp.setLayoutData(gd);
		
		toolkit.createLabel(nameComp, Messages.getString("MonsterDetailsSection.mod.name")); //$NON-NLS-1$
		
		name = toolkit.createText(nameComp, null, SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
		name.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setMonstername(doc, input, name.getText());
			}			
		});
		name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setMonstername(doc, input, name.getText());
				}
			}
			
		});
		
		gd = new GridData(SWT.FILL, SWT.FILL, false, false);
		gd.widthHint = 500;
		name.setLayoutData(gd);
		
		descCheck = toolkit.createButton(nameComp, Messages.getString("MonsterDetailsSection.mod.descr"), SWT.CHECK);

		descr = toolkit.createText(nameComp, null, SWT.MULTI | SWT.BORDER | SWT.WRAP); //$NON-NLS-1$
		descr.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setMonsterdescr(doc, input, descr.getText());
			}			
		});
		descr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setMonsterdescr(doc, input, descr.getText());
				}
			}
			
		});
		descr.setLayoutData(new GridData(500, SWT.DEFAULT));
		descr.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				int currentHeight = descr.getSize().y;
				int preferredHeight = descr.computeSize(500, SWT.DEFAULT).y;
				if (currentHeight != preferredHeight) {
					GridData data = (GridData)descr.getLayoutData();
					data.heightHint = preferredHeight;
					client.pack();
				}
			}
		});
		descr.setEnabled(false);
		descr.setBackground(toolkit.getColors().getInactiveBackground());
		descCheck.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (descCheck.getSelection()) {
					addInst1(Inst.DESCR, doc, input, "");
					descr.setEnabled(true);
					descr.setBackground(toolkit.getColors().getBackground());
					descr.setText("");
				} else {
					removeInst2(Inst.DESCR, doc, input);
					descr.setEnabled(false);
					descr.setBackground(toolkit.getColors().getInactiveBackground());
					descr.setText("");
				}
			}
		});

		sprite1Label = new Label(nameComp, SWT.NONE);
		sprite2Label = new Label(nameComp, SWT.NONE);
		
		Composite leftColumn = toolkit.createComposite(client);
		glayout = new GridLayout(5, false);
		glayout.marginHeight = 0;
		glayout.marginWidth = 0;
		leftColumn.setLayout(glayout);
		leftColumn.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		Composite rightColumn = toolkit.createComposite(client);
		glayout = new GridLayout(5, false);
		glayout.marginHeight = 0;
		glayout.marginWidth = 0;
		rightColumn.setLayout(glayout);
		rightColumn.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		boolean isRight = false;
		for (final Map.Entry<Inst, InstFields> fields : instMap.entrySet()) {
			final Inst key = fields.getKey();
			final InstFields field = fields.getValue();
			final Button check = toolkit.createButton(isRight?rightColumn:leftColumn, key.label, SWT.CHECK);
			check.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (check.getSelection()) {
						if (field instanceof Inst1Fields) {
							addInst1(key, doc, input, key.defaultValue);
						} else if (field instanceof Inst2Fields) {
							addInst2(key, doc, input, key.defaultValue);
						} else if (field instanceof Inst3Fields) {
							addInst3(key, doc, input, key.defaultValue, key.defaultValue2);
						} else if (field instanceof Inst4Fields) {
							addInst4(key, doc, input);
						} else if (field instanceof Inst5Fields) {
							addInst5(key, doc, input, key.defaultValue);
						}
					} else {
						removeInst2(key, doc, input);
					}
				}

			});

			if (field instanceof Inst4Fields) {
				gd = new GridData(SWT.FILL, SWT.FILL, false, false);
				gd.horizontalSpan = 2;
				check.setLayoutData(gd);
			}

			Text myValue1 = null;
			Text myValue2 = null;
			if (field instanceof Inst1Fields ||	field instanceof Inst2Fields ||	field instanceof Inst3Fields ||	field instanceof Inst5Fields) {
				final Text value = toolkit.createText(isRight?rightColumn:leftColumn, "", SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
				myValue1 = value;
				
				if (field instanceof Inst2Fields ||	field instanceof Inst3Fields) {
					value.addVerifyListener(new VerifyListener() {
						
						@Override
						public void verifyText(VerifyEvent e) {
							if (Character.isLetter(e.character)) {
								e.doit = false;
							}
						}
					});
				}
				check.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						if (check.getSelection()) {
							value.setEnabled(true);
							value.setText(key.defaultValue);
						} else {
							value.setEnabled(false);
							value.setText("");
						}
					}

				});
				value.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (field instanceof Inst1Fields) {
							setInst1(key, doc, input, value.getText());
						} else if (field instanceof Inst2Fields) {
							setInst2(key, doc, input, value.getText());
						} else if (field instanceof Inst3Fields) {
							setInst3(key, doc, input, value.getText(), null);
						} else if (field instanceof Inst5Fields) {
							setInst5(key, doc, input, value.getText());
						}
					}			
				});
				value.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if (e.character == '\r') {
							if (field instanceof Inst1Fields) {
								setInst1(key, doc, input, value.getText());
							} else if (field instanceof Inst2Fields) {
								setInst2(key, doc, input, value.getText());
							} else if (field instanceof Inst3Fields) {
								setInst3(key, doc, input, value.getText(), null);
							} else if (field instanceof Inst5Fields) {
								setInst5(key, doc, input, value.getText());
							}
						}
					}
				});
				value.setEnabled(false);
				if (field instanceof Inst1Fields) {
					gd = new GridData(SWT.FILL, SWT.FILL, false, false);
					gd.widthHint = 160;
					gd.horizontalSpan = 4;
				} else if (field instanceof Inst2Fields ||	field instanceof Inst3Fields) {
					gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
					gd.widthHint = 30;
				} else if (field instanceof Inst5Fields) {
					gd = new GridData(SWT.FILL, SWT.FILL, false, false);
					gd.horizontalSpan = 4;
				}
				value.setLayoutData(gd);
				
			}
				
			Label defaultLabel1 = null;
			
			if (field instanceof Inst2Fields || field instanceof Inst3Fields|| field instanceof Inst4Fields) {
				defaultLabel1 = toolkit.createLabel(isRight?rightColumn:leftColumn, "");
				defaultLabel1.setEnabled(false);
			}
			if (field instanceof Inst2Fields) {
				gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
				gd.horizontalSpan = 3;
				defaultLabel1.setLayoutData(gd);
			} else if (field instanceof Inst4Fields) {
				createSpacer(toolkit, isRight?rightColumn:leftColumn, 2);
			}

			Label defaultLabel2 = null;
			if (field instanceof Inst3Fields) {
				final Text value = toolkit.createText(isRight?rightColumn:leftColumn, "", SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
				myValue2 = value;
				value.addVerifyListener(new VerifyListener() {
					
					@Override
					public void verifyText(VerifyEvent e) {
						if (Character.isLetter(e.character)) {
							e.doit = false;
						}
					}
				});
				check.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						if (check.getSelection()) {
							value.setEnabled(true);
							value.setText(key.defaultValue);
						} else {
							value.setEnabled(false);
							value.setText("");
						}
					}

				});
				value.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						setInst3(key, doc, input, null, value.getText());
					}			
				});
				value.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if (e.character == '\r') {
							setInst3(key, doc, input, null, value.getText());
						}
					}
				});
				value.setEnabled(false);
				gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
				gd.widthHint = 30;
				value.setLayoutData(gd);
				
				defaultLabel2 = toolkit.createLabel(isRight?rightColumn:leftColumn, "");
				defaultLabel2.setEnabled(false);
			}
			
			if (field instanceof Inst1Fields) {
				((Inst1Fields)field).check = check;
				((Inst1Fields)field).value = myValue1;
			} else if (field instanceof Inst2Fields) {
				((Inst2Fields)field).check = check;
				((Inst2Fields)field).value = myValue1;
				((Inst2Fields)field).defaultLabel = defaultLabel1;
			} else if (field instanceof Inst3Fields) {
				((Inst3Fields)field).check = check;
				((Inst3Fields)field).value1 = myValue1;
				((Inst3Fields)field).defaultLabel1 = defaultLabel1;
				((Inst3Fields)field).value2 = myValue2;
				((Inst3Fields)field).defaultLabel2 = defaultLabel2;
			} else if (field instanceof Inst4Fields) {
				((Inst4Fields)field).check = check;
				((Inst4Fields)field).defaultLabel = defaultLabel1;
			} else if (field instanceof Inst5Fields) {
				((Inst5Fields)field).check = check;
				((Inst5Fields)field).value = myValue1;
			}

			isRight = !isRight;
		}

		createSpacer(toolkit, isRight?rightColumn:leftColumn, 2);
	}
	
	private void createSpacer(FormToolkit toolkit, Composite parent, int span) {
		Label spacer = toolkit.createLabel(parent, ""); //$NON-NLS-1$
		GridData gd = new GridData();
		gd.horizontalSpan = span;
		spacer.setLayoutData(gd);
	}
	
	public void update() {
		if (input != null) {
			String sprite1 = null;
			String sprite2 = null;
			boolean fromZip1 = false;
			boolean fromZip2 = false;
			if (input instanceof SelectMonsterByName || input instanceof SelectMonsterById) {
				String str = getSelectMonstername(input);
				name.setText(str!= null?str:"");
				name.setEnabled(false);

				final Format format = new DecimalFormat("0000");
				int id = getSelectMonsterid(input);
				if (getInst1(Inst.SPR1, input) != null) {
					sprite1 = getInst1(Inst.SPR1, input);
				} else {
					sprite1 = format.format(id) + "_1.tga";
					fromZip1 = true;
				}

				if (getInst1(Inst.SPR2, input) != null) {
					sprite2 = getInst1(Inst.SPR2, input);
				} else {
					sprite2 = format.format(id) + "_2.tga";
					fromZip2 = true;
				}
				
			} else {
				String str = getInst1(Inst.NAME, input);
				name.setText(str!=null?str:"");
				
				if (getInst1(Inst.SPR1, input) != null) {
					sprite1 = getInst1(Inst.SPR1, input);
				}

				if (getInst1(Inst.SPR2, input) != null) {
					sprite2 = getInst1(Inst.SPR2, input);
				}
			}
			if (sprite1 != null) {
				final String finalName1 = sprite1;
				final boolean finalFromZip = fromZip1;
				ImageLoader loader1 = new ImageLoader() {
					@Override
					public InputStream getStream() throws IOException {
						if (finalFromZip) {
							return ImageLoader.class.getClassLoader().getResource(finalName1).openStream();							
						} else {
							String path = ((DmXtextEditor)doc).getPath();
							path = path.substring(0, path.lastIndexOf('/')+1);
							if (finalName1.startsWith("./")) {
								path += finalName1.substring(2);
							} else {
								path += finalName1;
							}
							
							return new FileInputStream(new File(path));
						}
					}
				};
				try {
					Image image1 = new Image(null, ImageConverter.convertToSWT(ImageConverter.cropImage(loader1.loadImage())));
					sprite1Label.setImage(image1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				sprite1Label.setImage(null);
			}
			if (sprite2 != null) {
				final String finalName2 = sprite2;
				final boolean finalFromZip = fromZip2;
				ImageLoader loader2 = new ImageLoader() {
					@Override
					public InputStream getStream() throws IOException {
						if (finalFromZip) {
							return ImageLoader.class.getClassLoader().getResource(finalName2).openStream();							
						} else {
							String path = ((DmXtextEditor)doc).getPath();
							path = path.substring(0, path.lastIndexOf('/')+1);
							if (finalName2.startsWith("./")) {
								path += finalName2.substring(2);
							} else {
								path += finalName2;
							}
							
							return new FileInputStream(new File(path));
						}
					}
				};
				try {
					Image image2 = new Image(null, ImageConverter.convertToSWT(ImageConverter.cropImage(loader2.loadImage())));
					sprite2Label.setImage(image2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				sprite2Label.setImage(null);
			}
			
			String description = getInst1(Inst.DESCR, input);
			final FormToolkit toolkit = mform.getToolkit();
			if (description != null) {
				descr.setText(description);
				descr.setEnabled(true);
				descr.setBackground(toolkit.getColors().getBackground());
				descCheck.setSelection(true);
			} else {
				descr.setText("");
				descr.setEnabled(false);
				descr.setBackground(toolkit.getColors().getInactiveBackground());
				descCheck.setSelection(false);
			}

		}
		for (Map.Entry<Inst, InstFields> fields : instMap.entrySet()) {
			String val1 = getInst1(fields.getKey(), input);
			if (val1 != null) {
				if (fields.getValue() instanceof Inst1Fields) {
					((Inst1Fields)fields.getValue()).value.setText(val1);
					((Inst1Fields)fields.getValue()).value.setEnabled(true);
					((Inst1Fields)fields.getValue()).check.setSelection(true);
				}
			} else {
				if (fields.getValue() instanceof Inst1Fields) {
					((Inst1Fields)fields.getValue()).value.setText("");
					((Inst1Fields)fields.getValue()).value.setEnabled(false);
					((Inst1Fields)fields.getValue()).check.setSelection(false);
				}
			}
			Integer val = getInst2(fields.getKey(), input);
			if (val != null) {
				if (fields.getValue() instanceof Inst2Fields) {
					((Inst2Fields)fields.getValue()).value.setText(val.toString());
					((Inst2Fields)fields.getValue()).value.setEnabled(true);
					((Inst2Fields)fields.getValue()).check.setSelection(true);
				}
			} else {
				if (fields.getValue() instanceof Inst2Fields) {
					((Inst2Fields)fields.getValue()).value.setText("");
					((Inst2Fields)fields.getValue()).value.setEnabled(false);
					((Inst2Fields)fields.getValue()).check.setSelection(false);
				}
			}
			Integer[] vals = getInst3(fields.getKey(), input);
			if (vals != null) {
				if (fields.getValue() instanceof Inst3Fields) {
					((Inst3Fields)fields.getValue()).value1.setText(vals[0].toString());
					((Inst3Fields)fields.getValue()).value1.setEnabled(true);
					((Inst3Fields)fields.getValue()).value2.setText(vals[1].toString());
					((Inst3Fields)fields.getValue()).value2.setEnabled(true);
					((Inst3Fields)fields.getValue()).check.setSelection(true);
				}
			} else {
				if (fields.getValue() instanceof Inst3Fields) {
					((Inst3Fields)fields.getValue()).value1.setText("");
					((Inst3Fields)fields.getValue()).value1.setEnabled(false);
					((Inst3Fields)fields.getValue()).value2.setText("");
					((Inst3Fields)fields.getValue()).value2.setEnabled(false);
					((Inst3Fields)fields.getValue()).check.setSelection(false);
				}
			}
			Boolean isVal = getInst4(fields.getKey(), input);
			if (isVal != null) {
				if (fields.getValue() instanceof Inst4Fields) {
					((Inst4Fields)fields.getValue()).check.setSelection(isVal);
				}
			}
			Object val5 = getInst5(fields.getKey(), input);
			if (val5 != null) {
				if (fields.getValue() instanceof Inst5Fields) {
					((Inst5Fields)fields.getValue()).value.setText(val5.toString());
					((Inst5Fields)fields.getValue()).value.setEnabled(true);
					((Inst5Fields)fields.getValue()).check.setSelection(true);
				}
			} else {
				if (fields.getValue() instanceof Inst5Fields) {
					((Inst5Fields)fields.getValue()).value.setText("");
					((Inst5Fields)fields.getValue()).value.setEnabled(false);
					((Inst5Fields)fields.getValue()).check.setSelection(false);
				}
			}
			if (input instanceof SelectMonsterByName || input instanceof SelectMonsterById) {
				MonsterDB monsterDB;
				if (input instanceof SelectMonsterById) {
					monsterDB = Database.getMonster(((SelectMonsterById)input).getValue());
				} else {
					monsterDB = Database.getMonster(((SelectMonsterByName)input).getValue());
				}
				switch (fields.getKey()) {
				case SPECIALLOOK:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.speciallook != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.speciallook) : "");
					break;
				case AP:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.ap != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.ap) : "");
					break;
				case MAPMOVE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.mapmove != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.mapmove) : "");
					break;
				case HP:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.hp != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.hp) : "");
					break;
				case PROT:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.prot != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.prot) : "");
					break;
				case SIZE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.size != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.size) : "");
					break;
				case RESSIZE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.ressize != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.ressize) : "");
					break;
				case STR:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.str != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.str) : "");
					break;
				case ENC:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.enc != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.enc) : "");
					break;
				case ATT:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.att != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.att) : "");
					break;
				case DEF:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.def != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.def) : "");
					break;
				case PREC:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.prec != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.prec) : "");
					break;
				case MR:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.mr != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.mr) : "");
					break;
				case MOR:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.mor != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.mor) : "");
					break;
				case GCOST:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.gcost != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.gcost) : "");
					break;
				case RCOST:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.rcost != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.rcost) : "");
					break;
				case PATHCOST:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.pathcost != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.pathcost) : "");
					break;
				case STARTDOM:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.startdom != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.startdom) : "");
					break;
				case EYES:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.eyes != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.eyes) : "");
					break;
				case COPYSTATS:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.copystats != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.copystats) : "");
					break;
				case COPYSPR:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.copyspr != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.copyspr) : "");
					break;
				case RESTRICTEDGOD:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.restrictedgod != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.restrictedgod) : "");
					break;
				case SHATTEREDSOUL:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.shatteredsoul != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.shatteredsoul) : "");
					break;
				case COLDRES:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.coldres != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.coldres) : "");
					break;
				case FIRERES:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.fireres != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.fireres) : "");
					break;
				case POISONRES:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.poisonres != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.poisonres) : "");
					break;
				case SHOCKRES:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.shockres != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.shockres) : "");
					break;
				case DARKVISION:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.darkvision != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.darkvision) : "");
					break;
				case STEALTHY:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.stealthy != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.stealthy) : "");
					break;
				case SEDUCE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.seduce != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.seduce) : "");
					break;
				case SUCCUBUS:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.succubus != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.succubus) : "");
					break;
				case BECKON:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.beckon != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.beckon) : "");
					break;
				case STARTAGE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.startage != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.startage) : "");
					break;
				case MAXAGE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.maxage != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.maxage) : "");
					break;
				case OLDER:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.older != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.older) : "");
					break;
				case HEALER:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.healer != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.healer) : "");
					break;
				case STARTAFF:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.startaff != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.startaff) : "");
					break;
				case SUPPLYBONUS:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.supplybonus != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.supplybonus) : "");
					break;
				case UWDAMAGE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.uwdamage != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.uwdamage) : "");
					break;
				case COLDPOWER:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.coldpower != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.coldpower) : "");
					break;
				case FIREPOWER:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.firepower != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.firepower) : "");
					break;
				case STORMPOWER:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.stormpower != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.stormpower) : "");
					break;
				case DARKPOWER:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.darkpower != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.darkpower) : "");
					break;
				case SPRINGPOWER:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.springpower != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.springpower) : "");
					break;
				case SUMMERPOWER:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.summerpower != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.summerpower) : "");
					break;
				case FALLPOWER:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.fallpower != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.fallpower) : "");
					break;
				case WINTERPOWER:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.winterpower != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.winterpower) : "");
					break;
				case AMBIDEXTROUS:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.ambidextrous != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.ambidextrous) : "");
					break;
				case BANEFIRESHIELD:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.banefireshield != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.banefireshield) : "");
					break;
				case BERSERK:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.berserk != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.berserk) : "");
					break;
				case STANDARD:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.standard != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.standard) : "");
					break;
				case ANIMALAWE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.animalawe != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.animalawe) : "");
					break;
				case AWE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.awe != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.awe) : "");
					break;
				case FEAR:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.fear != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.fear) : "");
					break;
				case REGENERATION:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.regeneration != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.regeneration) : "");
					break;
				case REINVIGORATION:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.reinvigoration != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.reinvigoration) : "");
					break;
				case FIRESHIELD:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.fireshield != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.fireshield) : "");
					break;
				case HEAT:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.heat != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.heat) : "");
					break;
				case COLD:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.cold != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.cold) : "");
					break;
				case ICEPROT:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.iceprot != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.iceprot) : "");
					break;
				case POISONCLOUD:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.poisoncloud != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.poisoncloud) : "");
					break;
				case DISEASECLOUD:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.diseasecloud != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.diseasecloud) : "");
					break;
				case BLOODVENGEANCE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.bloodvengeance != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.bloodvengeance) : "");
					break;
				case CASTLEDEF:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.castledef != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.castledef) : "");
					break;
				case SIEGEBONUS:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.siegebonus != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.siegebonus) : "");
					break;
				case PATROLBONUS:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.patrolbonus != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.patrolbonus) : "");
					break;
				case PILLAGEBONUS:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.pillagebonus != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.pillagebonus) : "");
					break;
				case RESEARCHBONUS:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.researchbonus != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.researchbonus) : "");
					break;
				case FORGEBONUS:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.forgebonus != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.forgebonus) : "");
					break;
				case DOUSE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.douse != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.douse) : "");
					break;
				case NOBADEVENTS:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.nobadevents != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.nobadevents) : "");
					break;
				case INCUNREST:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.incunrest != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.incunrest) : "");
					break;
				case SPREADDOM:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.spreaddom != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.spreaddom) : "");
					break;
				case LEPER:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.leper != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.leper) : "");
					break;
				case POPKILL:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.popkill != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.popkill) : "");
					break;
				case HERETIC:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.heretic != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.heretic) : "");
					break;
				case ITEMSLOTS:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.itemslots != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.itemslots) : "");
					break;
				case NAMETYPE:
					((Inst2Fields)fields.getValue()).defaultLabel.setText(monsterDB.nametype != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.nametype) : "");
					break;
				case MAGICSKILL:
					((Inst3Fields)fields.getValue()).defaultLabel1.setText(monsterDB.magicskill1 != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.magicskill1) : "");
					((Inst3Fields)fields.getValue()).defaultLabel2.setText(monsterDB.magicskill2 != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.magicskill2) : "");
					break;
				case CUSTOMMAGIC:
					((Inst3Fields)fields.getValue()).defaultLabel1.setText(monsterDB.custommagic1 != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.custommagic1) : "");
					((Inst3Fields)fields.getValue()).defaultLabel2.setText(monsterDB.custommagic2 != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.custommagic2) : "");
					break;
				case MAGICBOOST:
					((Inst3Fields)fields.getValue()).defaultLabel1.setText(monsterDB.magicboost1 != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.magicboost1) : "");
					((Inst3Fields)fields.getValue()).defaultLabel2.setText(monsterDB.magicboost2 != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.magicboost2) : "");
					break;
				case GEMPROD:
					((Inst3Fields)fields.getValue()).defaultLabel1.setText(monsterDB.gemprod1 != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.gemprod1) : "");
					((Inst3Fields)fields.getValue()).defaultLabel2.setText(monsterDB.gemprod2 != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.gemprod2) : "");
					break;
				case CLEAR:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.clear != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.clear) : "");
					break;
				case CLEARMAGIC:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.clearmagic != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.clearmagic) : "");
					break;
				case CLEARSPEC:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.clearspec != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.clearspec) : "");
					break;
				case FEMALE:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.female != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.female) : "");
					break;
				case MOUNTED:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.mounted != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.mounted) : "");
					break;
				case HOLY:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.holy != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.holy) : "");
					break;
				case ANIMAL:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.animal != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.animal) : "");
					break;
				case UNDEAD:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.undead != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.undead) : "");
					break;
				case DEMON:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.demon != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.demon) : "");
					break;
				case MAGICBEING:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.magicbeing != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.magicbeing) : "");
					break;
				case STONEBEING:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.stonebeing != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.stonebeing) : "");
					break;
				case INANIMATE:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.inanimate != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.inanimate) : "");
					break;
				case COLDBLOOD:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.coldblood != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.coldblood) : "");
					break;
				case IMMORTAL:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.immortal != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.immortal) : "");
					break;
				case BLIND:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.blind != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.blind) : "");
					break;
				case UNIQUE:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.unique != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.unique) : "");
					break;
				case IMMOBILE:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.immobile != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.immobile) : "");
					break;
				case AQUATIC:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.aquatic != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.aquatic) : "");
					break;
				case AMPHIBIAN:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.amphibian != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.amphibian) : "");
					break;
				case POORAMPHIBIAN:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.pooramphibian != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.pooramphibian) : "");
					break;
				case FLYING:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.flying != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.flying) : "");
					break;
				case STORMIMMUNE:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.stormimmune != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.stormimmune) : "");
					break;
				case SAILING:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.sailing != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.sailing) : "");
					break;
				case FORESTSURVIVAL:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.forestsurvival != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.forestsurvival) : "");
					break;
				case MOUNTAINSURVIVAL:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.mountainsurvival != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.mountainsurvival) : "");
					break;
				case SWAMPSURVIVAL:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.swampsurvival != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.swampsurvival) : "");
					break;
				case WASTESURVIVAL:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.wastesurvival != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.wastesurvival) : "");
					break;
				case ILLUSION:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.illusion != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.illusion) : "");
					break;
				case SPY:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.spy != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.spy) : "");
					break;
				case ASSASSIN:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.assassin != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.assassin) : "");
					break;
				case HEAL:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.heal != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.heal) : "");
					break;
				case NOHEAL:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.noheal != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.noheal) : "");
					break;
				case NEEDNOTEAT:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.neednoteat != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.neednoteat) : "");
					break;
				case ETHEREAL:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.ethereal != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.ethereal) : "");
					break;
				case TRAMPLE:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.trample != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.trample) : "");
					break;
				case ENTANGLE:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.entangle != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.entangle) : "");
					break;
				case EYELOSS:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.eyeloss != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.eyeloss) : "");
					break;
				case HORRORMARK:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.horrormark != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.horrormark) : "");
					break;
				case POISONARMOR:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.poisonarmor != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.poisonarmor) : "");
					break;
				case INQUISITOR:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.inquisitor != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.inquisitor) : "");
					break;
				case NOITEM:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.noitem != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.noitem) : "");
					break;
				case NOLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.noleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.noleader) : "");
					break;
				case POORLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.poorleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.poorleader) : "");
					break;
				case OKLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.okleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.okleader) : "");
					break;
				case GOODLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.goodleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.goodleader) : "");
					break;
				case EXPERTLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.expertleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.expertleader) : "");
					break;
				case SUPERIORLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.superiorleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.superiorleader) : "");
					break;
				case NOMAGICLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.nomagicleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.nomagicleader) : "");
					break;
				case POORMAGICLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.poormagicleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.poormagicleader) : "");
					break;
				case OKMAGICLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.okmagicleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.okmagicleader) : "");
					break;
				case GOODMAGICLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.goodmagicleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.goodmagicleader) : "");
					break;
				case EXPERTMAGICLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.expertmagicleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.expertmagicleader) : "");
					break;
				case SUPERIORMAGICLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.superiormagicleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.superiormagicleader) : "");
					break;
				case NOUNDEADLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.noundeadleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.noundeadleader) : "");
					break;
				case POORUNDEADLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.poorundeadleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.poorundeadleader) : "");
					break;
				case OKUNDEADLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.okundeadleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.okundeadleader) : "");
					break;
				case GOODUNDEADLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.goodundeadleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.goodundeadleader) : "");
					break;
				case EXPERTUNDEADLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.expertundeadleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.expertundeadleader) : "");
					break;
				case SUPERIORUNDEADLEADER:
					((Inst4Fields)fields.getValue()).defaultLabel.setText(monsterDB.superiorundeadleader != null ? Messages.format("DetailsPage.DefaultLabel.fmt", monsterDB.superiorundeadleader) : "");
					break;
				}
			}
		}
	}
	
	private String getSelectMonstername(Monster monster) {
		if (monster instanceof SelectMonsterByName) {
			return ((SelectMonsterByName)monster).getValue();
		} else {
			int id = ((SelectMonsterById)monster).getValue();
			return Database.getMonsterName(id);
		}
	}
	
	private int getSelectMonsterid(Monster monster) {
		if (monster instanceof SelectMonsterByName) {
			return Database.getMonster(((SelectMonsterByName) monster).getValue()).id;
		} else {
			return ((SelectMonsterById)monster).getValue();
		}
	}
	
	private void setMonstername(final XtextEditor editor, final Monster armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				EList<MonsterMods> mods = armorToEdit.getMods();
				boolean nameSet = false;
				for (MonsterMods mod : mods) {
					if (mod instanceof MonsterInst1) {
						if (((MonsterInst1)mod).isName()) {
							((MonsterInst1)mod).setValue(newName);
							nameSet = true;
						}
					}
				}
				if (!nameSet) {
					MonsterInst1 nameInst = DmFactory.eINSTANCE.createMonsterInst1();
					nameInst.setName(true);
					nameInst.setValue(newName);
					mods.add(nameInst);
				}
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void setMonsterdescr(final XtextEditor editor, final Monster armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				EList<MonsterMods> mods = armorToEdit.getMods();
				boolean nameSet = false;
				for (MonsterMods mod : mods) {
					if (mod instanceof MonsterInst1) {
						if (((MonsterInst1)mod).isDescr()) {
							((MonsterInst1)mod).setValue(newName);
							nameSet = true;
						}
					}
				}
				if (!nameSet) {
					MonsterInst1 nameInst = DmFactory.eINSTANCE.createMonsterInst1();
					nameInst.setDescr(true);
					nameInst.setValue(newName);
					mods.add(nameInst);
				}
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private String getInst1(Inst inst2, Monster armor) {
		EList<MonsterMods> list = armor.getMods();
		int armorCount = 0;
		for (MonsterMods mod : list) {
			if (mod instanceof MonsterInst1) {
				switch (inst2) {
				case NAME:
					if (((MonsterInst1)mod).isName()){
						return ((MonsterInst1)mod).getValue();
					}
					break;
				case SPR1:
					if (((MonsterInst1)mod).isSpr1()){
						return ((MonsterInst1)mod).getValue();
					}
					break;
				case SPR2:
					if (((MonsterInst1)mod).isSpr2()){
						return ((MonsterInst1)mod).getValue();
					}
					break;
				case DESCR:
					if (((MonsterInst1)mod).isDescr()){
						return ((MonsterInst1)mod).getValue();
					}
					break;
				case ARMOR1:
					if (((MonsterInst1)mod).isArmor()){
						armorCount++;
						if (armorCount == 1) {
							return ((MonsterInst1)mod).getValue();
						}
					}
					break;
				case ARMOR2:
					if (((MonsterInst1)mod).isArmor()){
						armorCount++;
						if (armorCount == 2) {
							return ((MonsterInst1)mod).getValue();
						}
					}
					break;
				case ARMOR3:
					if (((MonsterInst1)mod).isArmor()){
						armorCount++;
						if (armorCount==3) {
							return ((MonsterInst1)mod).getValue();
						}
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Integer getInst2(Inst inst2, Monster armor) {
		EList<MonsterMods> list = armor.getMods();
		for (MonsterMods mod : list) {
			if (mod instanceof MonsterInst2) {
				switch (inst2) {
				case SPECIALLOOK:
					if (((MonsterInst2)mod).isSpeciallook()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case AP:
					if (((MonsterInst2)mod).isAp()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case MAPMOVE:
					if (((MonsterInst2)mod).isMapmove()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case HP:
					if (((MonsterInst2)mod).isHp()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case PROT:
					if (((MonsterInst2)mod).isProt()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case SIZE:
					if (((MonsterInst2)mod).isSize()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case RESSIZE:
					if (((MonsterInst2)mod).isRessize()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case STR:
					if (((MonsterInst2)mod).isStr()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case ENC:
					if (((MonsterInst2)mod).isEnc()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case ATT:
					if (((MonsterInst2)mod).isAtt()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case DEF:
					if (((MonsterInst2)mod).isDef()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case PREC:
					if (((MonsterInst2)mod).isPrec()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case MR:
					if (((MonsterInst2)mod).isMr()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case MOR:
					if (((MonsterInst2)mod).isMor()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case GCOST:
					if (((MonsterInst2)mod).isGcost()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case RCOST:
					if (((MonsterInst2)mod).isRcost()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case PATHCOST:
					if (((MonsterInst2)mod).isPathcost()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case STARTDOM:
					if (((MonsterInst2)mod).isStartdom()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case EYES:
					if (((MonsterInst2)mod).isEyes()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case COPYSTATS:
					if (((MonsterInst2)mod).isCopystats()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case COPYSPR:
					if (((MonsterInst2)mod).isCopyspr()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case RESTRICTEDGOD:
					if (((MonsterInst2)mod).isRestrictedgod()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case SHATTEREDSOUL:
					if (((MonsterInst2)mod).isShatteredsoul()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case COLDRES:
					if (((MonsterInst2)mod).isColdres()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case FIRERES:
					if (((MonsterInst2)mod).isFireres()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case POISONRES:
					if (((MonsterInst2)mod).isPoisonres()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case SHOCKRES:
					if (((MonsterInst2)mod).isShockres()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case DARKVISION:
					if (((MonsterInst2)mod).isDarkvision()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case STEALTHY:
					if (((MonsterInst2)mod).isStealthy()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case SEDUCE:
					if (((MonsterInst2)mod).isSeduce()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case SUCCUBUS:
					if (((MonsterInst2)mod).isSuccubus()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case BECKON:
					if (((MonsterInst2)mod).isBeckon()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case STARTAGE:
					if (((MonsterInst2)mod).isStartage()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case MAXAGE:
					if (((MonsterInst2)mod).isMaxage()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case OLDER:
					if (((MonsterInst2)mod).isOlder()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case HEALER:
					if (((MonsterInst2)mod).isHealer()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case STARTAFF:
					if (((MonsterInst2)mod).isStartaff()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case SUPPLYBONUS:
					if (((MonsterInst2)mod).isSupplybonus()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case UWDAMAGE:
					if (((MonsterInst2)mod).isUwdamage()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case COLDPOWER:
					if (((MonsterInst2)mod).isColdpower()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case FIREPOWER:
					if (((MonsterInst2)mod).isFirepower()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case STORMPOWER:
					if (((MonsterInst2)mod).isStormpower()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case DARKPOWER:
					if (((MonsterInst2)mod).isDarkpower()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case SPRINGPOWER:
					if (((MonsterInst2)mod).isSpringpower()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case SUMMERPOWER:
					if (((MonsterInst2)mod).isSummerpower()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case FALLPOWER:
					if (((MonsterInst2)mod).isFallpower()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case WINTERPOWER:
					if (((MonsterInst2)mod).isWinterpower()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case AMBIDEXTROUS:
					if (((MonsterInst2)mod).isAmbidextrous()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case BANEFIRESHIELD:
					if (((MonsterInst2)mod).isBanefireshield()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case BERSERK:
					if (((MonsterInst2)mod).isBerserk()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case STANDARD:
					if (((MonsterInst2)mod).isStandard()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case ANIMALAWE:
					if (((MonsterInst2)mod).isAnimalawe()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case AWE:
					if (((MonsterInst2)mod).isAwe()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case FEAR:
					if (((MonsterInst2)mod).isFear()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case REGENERATION:
					if (((MonsterInst2)mod).isRegeneration()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case REINVIGORATION:
					if (((MonsterInst2)mod).isReinvigoration()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case FIRESHIELD:
					if (((MonsterInst2)mod).isFireshield()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case HEAT:
					if (((MonsterInst2)mod).isHeat()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case COLD:
					if (((MonsterInst2)mod).isCold()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case ICEPROT:
					if (((MonsterInst2)mod).isIceprot()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case POISONCLOUD:
					if (((MonsterInst2)mod).isPoisoncloud()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case DISEASECLOUD:
					if (((MonsterInst2)mod).isDiseasecloud()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case BLOODVENGEANCE:
					if (((MonsterInst2)mod).isBloodvengeance()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case CASTLEDEF:
					if (((MonsterInst2)mod).isCastledef()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case SIEGEBONUS:
					if (((MonsterInst2)mod).isSiegebonus()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case PATROLBONUS:
					if (((MonsterInst2)mod).isPatrolbonus()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case PILLAGEBONUS:
					if (((MonsterInst2)mod).isPillagebonus()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case RESEARCHBONUS:
					if (((MonsterInst2)mod).isResearchbonus()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case FORGEBONUS:
					if (((MonsterInst2)mod).isForgebonus()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case DOUSE:
					if (((MonsterInst2)mod).isDouse()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case NOBADEVENTS:
					if (((MonsterInst2)mod).isNobadevents()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case INCUNREST:
					if (((MonsterInst2)mod).isIncunrest()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case SPREADDOM:
					if (((MonsterInst2)mod).isSpreaddom()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case LEPER:
					if (((MonsterInst2)mod).isLeper()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case POPKILL:
					if (((MonsterInst2)mod).isPopkill()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case HERETIC:
					if (((MonsterInst2)mod).isHeretic()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case ITEMSLOTS:
					if (((MonsterInst2)mod).isItemslots()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				case NAMETYPE:
					if (((MonsterInst2)mod).isNametype()){
						return Integer.valueOf(((MonsterInst2)mod).getValue());
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Integer[] getInst3(Inst inst3, Monster armor) {
		EList<MonsterMods> list = armor.getMods();
		for (MonsterMods mod : list) {
			if (mod instanceof MonsterInst3) {
				switch (inst3) {
				case MAGICSKILL:
					if (((MonsterInst3)mod).isMagicskill()) {
						return new Integer[]{Integer.valueOf(((MonsterInst3)mod).getValue1()), Integer.valueOf(((MonsterInst3)mod).getValue2())};
					}
					break;
				case CUSTOMMAGIC:
					if (((MonsterInst3)mod).isCustommagic()) {
						return new Integer[]{Integer.valueOf(((MonsterInst3)mod).getValue1()), Integer.valueOf(((MonsterInst3)mod).getValue2())};
					}
					break;
				case MAGICBOOST:
					if (((MonsterInst3)mod).isMagicboost()) {
						return new Integer[]{Integer.valueOf(((MonsterInst3)mod).getValue1()), Integer.valueOf(((MonsterInst3)mod).getValue2())};
					}
					break;
				case GEMPROD:
					if (((MonsterInst3)mod).isGemprod()) {
						return new Integer[]{Integer.valueOf(((MonsterInst3)mod).getValue1()), Integer.valueOf(((MonsterInst3)mod).getValue2())};
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Boolean getInst4(Inst inst4, Monster armor) {
		EList<MonsterMods> list = armor.getMods();
		for (MonsterMods mod : list) {
			if (mod instanceof MonsterInst4) {
				switch (inst4) {
				case CLEAR:
					if (((MonsterInst4)mod).isClear()){
						return Boolean.TRUE;
					}
					break;
				case CLEARMAGIC:
					if (((MonsterInst4)mod).isClearmagic()){
						return Boolean.TRUE;
					}
					break;
				case CLEARSPEC:
					if (((MonsterInst4)mod).isClearspec()){
						return Boolean.TRUE;
					}
					break;
				case FEMALE:
					if (((MonsterInst4)mod).isFemale()){
						return Boolean.TRUE;
					}
					break;
				case MOUNTED:
					if (((MonsterInst4)mod).isMounted()){
						return Boolean.TRUE;
					}
					break;
				case HOLY:
					if (((MonsterInst4)mod).isHoly()){
						return Boolean.TRUE;
					}
					break;
				case ANIMAL:
					if (((MonsterInst4)mod).isAnimal()){
						return Boolean.TRUE;
					}
					break;
				case UNDEAD:
					if (((MonsterInst4)mod).isUndead()){
						return Boolean.TRUE;
					}
					break;
				case DEMON:
					if (((MonsterInst4)mod).isDemon()){
						return Boolean.TRUE;
					}
					break;
				case MAGICBEING:
					if (((MonsterInst4)mod).isMagicbeing()){
						return Boolean.TRUE;
					}
					break;
				case STONEBEING:
					if (((MonsterInst4)mod).isStonebeing()){
						return Boolean.TRUE;
					}
					break;
				case INANIMATE:
					if (((MonsterInst4)mod).isInanimate()){
						return Boolean.TRUE;
					}
					break;
				case COLDBLOOD:
					if (((MonsterInst4)mod).isColdblood()){
						return Boolean.TRUE;
					}
					break;
				case IMMORTAL:
					if (((MonsterInst4)mod).isImmortal()){
						return Boolean.TRUE;
					}
					break;
				case BLIND:
					if (((MonsterInst4)mod).isBlind()){
						return Boolean.TRUE;
					}
					break;
				case UNIQUE:
					if (((MonsterInst4)mod).isUnique()){
						return Boolean.TRUE;
					}
					break;
				case IMMOBILE:
					if (((MonsterInst4)mod).isImmobile()){
						return Boolean.TRUE;
					}
					break;
				case AQUATIC:
					if (((MonsterInst4)mod).isAquatic()){
						return Boolean.TRUE;
					}
					break;
				case AMPHIBIAN:
					if (((MonsterInst4)mod).isAmphibian()){
						return Boolean.TRUE;
					}
					break;
				case POORAMPHIBIAN:
					if (((MonsterInst4)mod).isPooramphibian()){
						return Boolean.TRUE;
					}
					break;
				case FLYING:
					if (((MonsterInst4)mod).isFlying()){
						return Boolean.TRUE;
					}
					break;
				case STORMIMMUNE:
					if (((MonsterInst4)mod).isStormimmune()){
						return Boolean.TRUE;
					}
					break;
				case SAILING:
					if (((MonsterInst4)mod).isSailing()){
						return Boolean.TRUE;
					}
					break;
				case FORESTSURVIVAL:
					if (((MonsterInst4)mod).isForestsurvival()){
						return Boolean.TRUE;
					}
					break;
				case MOUNTAINSURVIVAL:
					if (((MonsterInst4)mod).isMountainsurvival()){
						return Boolean.TRUE;
					}
					break;
				case SWAMPSURVIVAL:
					if (((MonsterInst4)mod).isSwampsurvival()){
						return Boolean.TRUE;
					}
					break;
				case WASTESURVIVAL:
					if (((MonsterInst4)mod).isWastesurvival()){
						return Boolean.TRUE;
					}
					break;
				case ILLUSION:
					if (((MonsterInst4)mod).isIllusion()){
						return Boolean.TRUE;
					}
					break;
				case SPY:
					if (((MonsterInst4)mod).isSpy()){
						return Boolean.TRUE;
					}
					break;
				case ASSASSIN:
					if (((MonsterInst4)mod).isAssassin()){
						return Boolean.TRUE;
					}
					break;
				case HEAL:
					if (((MonsterInst4)mod).isHeal()){
						return Boolean.TRUE;
					}
					break;
				case NOHEAL:
					if (((MonsterInst4)mod).isNoheal()){
						return Boolean.TRUE;
					}
					break;
				case NEEDNOTEAT:
					if (((MonsterInst4)mod).isNeednoteat()){
						return Boolean.TRUE;
					}
					break;
				case ETHEREAL:
					if (((MonsterInst4)mod).isEthereal()){
						return Boolean.TRUE;
					}
					break;
				case TRAMPLE:
					if (((MonsterInst4)mod).isTrample()){
						return Boolean.TRUE;
					}
					break;
				case ENTANGLE:
					if (((MonsterInst4)mod).isEntangle()){
						return Boolean.TRUE;
					}
					break;
				case EYELOSS:
					if (((MonsterInst4)mod).isEyeloss()){
						return Boolean.TRUE;
					}
					break;
				case HORRORMARK:
					if (((MonsterInst4)mod).isHorrormark()){
						return Boolean.TRUE;
					}
					break;
				case POISONARMOR:
					if (((MonsterInst4)mod).isPoisonarmor()){
						return Boolean.TRUE;
					}
					break;
				case INQUISITOR:
					if (((MonsterInst4)mod).isInquisitor()){
						return Boolean.TRUE;
					}
					break;
				case NOITEM:
					if (((MonsterInst4)mod).isNoitem()){
						return Boolean.TRUE;
					}
					break;
				case NOLEADER:
					if (((MonsterInst4)mod).isNoleader()){
						return Boolean.TRUE;
					}
					break;
				case POORLEADER:
					if (((MonsterInst4)mod).isPoorleader()){
						return Boolean.TRUE;
					}
					break;
				case OKLEADER:
					if (((MonsterInst4)mod).isOkleader()){
						return Boolean.TRUE;
					}
					break;
				case GOODLEADER:
					if (((MonsterInst4)mod).isGoodleader()){
						return Boolean.TRUE;
					}
					break;
				case EXPERTLEADER:
					if (((MonsterInst4)mod).isExpertleader()){
						return Boolean.TRUE;
					}
					break;
				case SUPERIORLEADER:
					if (((MonsterInst4)mod).isSuperiorleader()){
						return Boolean.TRUE;
					}
					break;
				case NOMAGICLEADER:
					if (((MonsterInst4)mod).isNomagicleader()){
						return Boolean.TRUE;
					}
					break;
				case POORMAGICLEADER:
					if (((MonsterInst4)mod).isPoormagicleader()){
						return Boolean.TRUE;
					}
					break;
				case OKMAGICLEADER:
					if (((MonsterInst4)mod).isOkmagicleader()){
						return Boolean.TRUE;
					}
					break;
				case GOODMAGICLEADER:
					if (((MonsterInst4)mod).isGoodmagicleader()){
						return Boolean.TRUE;
					}
					break;
				case EXPERTMAGICLEADER:
					if (((MonsterInst4)mod).isExpertmagicleader()){
						return Boolean.TRUE;
					}
					break;
				case SUPERIORMAGICLEADER:
					if (((MonsterInst4)mod).isSuperiormagicleader()){
						return Boolean.TRUE;
					}
					break;
				case NOUNDEADLEADER:
					if (((MonsterInst4)mod).isNoundeadleader()){
						return Boolean.TRUE;
					}
					break;
				case POORUNDEADLEADER:
					if (((MonsterInst4)mod).isPoorundeadleader()){
						return Boolean.TRUE;
					}
					break;
				case OKUNDEADLEADER:
					if (((MonsterInst4)mod).isOkundeadleader()){
						return Boolean.TRUE;
					}
					break;
				case GOODUNDEADLEADER:
					if (((MonsterInst4)mod).isGoodundeadleader()){
						return Boolean.TRUE;
					}
					break;
				case EXPERTUNDEADLEADER:
					if (((MonsterInst4)mod).isExpertundeadleader()){
						return Boolean.TRUE;
					}
					break;
				case SUPERIORUNDEADLEADER:
					if (((MonsterInst4)mod).isSuperiorundeadleader()){
						return Boolean.TRUE;
					}
					break;
				}
			}
		}
		return Boolean.FALSE;
	}
	
	private Object getInst5(Inst inst2, Monster armor) {
		EList<MonsterMods> list = armor.getMods();
		int weaponCount = 0;
		for (MonsterMods mod : list) {
			if (mod instanceof MonsterInst5) {
				switch (inst2) {
				case WEAPON1:
					if (((MonsterInst5)mod).isWeapon()){
						weaponCount ++;
						if (weaponCount == 1) {
							String strVal = ((MonsterInst5)mod).getValue1();
							Integer intVal = ((MonsterInst5)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case WEAPON2:
					if (((MonsterInst5)mod).isWeapon()){
						weaponCount ++;
						if (weaponCount == 2) {
							String strVal = ((MonsterInst5)mod).getValue1();
							Integer intVal = ((MonsterInst5)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case WEAPON3:
					if (((MonsterInst5)mod).isWeapon()){
						weaponCount ++;
						if (weaponCount == 3) {
							String strVal = ((MonsterInst5)mod).getValue1();
							Integer intVal = ((MonsterInst5)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case WEAPON4:
					if (((MonsterInst5)mod).isWeapon()){
						weaponCount ++;
						if (weaponCount == 4) {
							String strVal = ((MonsterInst5)mod).getValue1();
							Integer intVal = ((MonsterInst5)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ONEBATTLESPELL:
					if (((MonsterInst5)mod).isOnebattlespell()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case FIRSTSHAPE:
					if (((MonsterInst5)mod).isFirstshape()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case SECONDSHAPE:
					if (((MonsterInst5)mod).isSecondshape()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case SECONDTMPSHAPE:
					if (((MonsterInst5)mod).isSecondtmpshape()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case SHAPECHANGE:
					if (((MonsterInst5)mod).isShapechange()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case LANDSHAPE:
					if (((MonsterInst5)mod).isLandshape()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case WATERSHAPE:
					if (((MonsterInst5)mod).isWatershape()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case FORESTSHAPE:
					if (((MonsterInst5)mod).isForestshape()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case PLAINSHAPE:
					if (((MonsterInst5)mod).isPlainshape()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case DOMSUMMON:
					if (((MonsterInst5)mod).isDomsummon()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case DOMSUMMON2:
					if (((MonsterInst5)mod).isDomsummon2()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case DOMSUMMON20:
					if (((MonsterInst5)mod).isDomsummon20()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case MAKEMONSTER1:
					if (((MonsterInst5)mod).isMakemonster1()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case MAKEMONSTER2:
					if (((MonsterInst5)mod).isMakemonster2()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case MAKEMONSTER3:
					if (((MonsterInst5)mod).isMakemonster3()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case MAKEMONSTER4:
					if (((MonsterInst5)mod).isMakemonster4()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case MAKEMONSTER5:
					if (((MonsterInst5)mod).isMakemonster5()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case SUMMON1:
					if (((MonsterInst5)mod).isSummon1()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case SUMMON5:
					if (((MonsterInst5)mod).isSummon5()){
						String strVal = ((MonsterInst5)mod).getValue1();
						Integer intVal = ((MonsterInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				}
			}
		}
		return null;
	}
	
	private void setInst1(final Inst inst2, final XtextEditor editor, final Monster armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				int armorCount = 0;
				EList<MonsterMods> mods = armorToEdit.getMods();				
				for (MonsterMods mod : mods) {
					if (mod instanceof MonsterInst1) {
						switch (inst2) {
						case SPR1:
							if (((MonsterInst1)mod).isSpr1()) {
								((MonsterInst1)mod).setValue(newName);
							}
							break;
						case SPR2:
							if (((MonsterInst1)mod).isSpr2()) {
								((MonsterInst1)mod).setValue(newName);
							}
							break;
//						case DESCR:
//							if (((MonsterInst1)mod).isDescr()) {
//								((MonsterInst1)mod).setValue(newName);
//							}
//							break;
						case ARMOR1:
							if (((MonsterInst1)mod).isArmor()) {
								armorCount++;
								if (armorCount == 1) {
									((MonsterInst1)mod).setValue(newName);
								}
							}
							break;
						case ARMOR2:
							if (((MonsterInst1)mod).isArmor()) {
								armorCount++;
								if (armorCount == 2) {
									((MonsterInst1)mod).setValue(newName);
								}
							}
							break;
						case ARMOR3:
							if (((MonsterInst1)mod).isArmor()) {
								armorCount++;
								if (armorCount == 3) {
									((MonsterInst1)mod).setValue(newName);
								}
							}
							break;
						}
					}
				}

			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void setInst2(final Inst inst2, final XtextEditor editor, final Monster armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				EList<MonsterMods> mods = armorToEdit.getMods();
				for (MonsterMods mod : mods) {
					if (mod instanceof MonsterInst2) {
						switch (inst2) {
						case SPECIALLOOK:
							if (((MonsterInst2)mod).isSpeciallook()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case AP:
							if (((MonsterInst2)mod).isAp()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case MAPMOVE:
							if (((MonsterInst2)mod).isMapmove()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case HP:
							if (((MonsterInst2)mod).isHp()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case PROT:
							if (((MonsterInst2)mod).isProt()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SIZE:
							if (((MonsterInst2)mod).isSize()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case RESSIZE:
							if (((MonsterInst2)mod).isRessize()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case STR:
							if (((MonsterInst2)mod).isStr()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case ENC:
							if (((MonsterInst2)mod).isEnc()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case ATT:
							if (((MonsterInst2)mod).isAtt()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DEF:
							if (((MonsterInst2)mod).isDef()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case PREC:
							if (((MonsterInst2)mod).isPrec()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case MR:
							if (((MonsterInst2)mod).isMr()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case MOR:
							if (((MonsterInst2)mod).isMor()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case GCOST:
							if (((MonsterInst2)mod).isGcost()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case RCOST:
							if (((MonsterInst2)mod).isRcost()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case PATHCOST:
							if (((MonsterInst2)mod).isPathcost()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case STARTDOM:
							if (((MonsterInst2)mod).isStartdom()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case EYES:
							if (((MonsterInst2)mod).isEyes()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case COPYSTATS:
							if (((MonsterInst2)mod).isCopystats()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case COPYSPR:
							if (((MonsterInst2)mod).isCopyspr()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case RESTRICTEDGOD:
							if (((MonsterInst2)mod).isRestrictedgod()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SHATTEREDSOUL:
							if (((MonsterInst2)mod).isShatteredsoul()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case COLDRES:
							if (((MonsterInst2)mod).isColdres()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case FIRERES:
							if (((MonsterInst2)mod).isFireres()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case POISONRES:
							if (((MonsterInst2)mod).isPoisonres()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SHOCKRES:
							if (((MonsterInst2)mod).isShockres()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DARKVISION:
							if (((MonsterInst2)mod).isDarkvision()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case STEALTHY:
							if (((MonsterInst2)mod).isStealthy()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SEDUCE:
							if (((MonsterInst2)mod).isSeduce()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SUCCUBUS:
							if (((MonsterInst2)mod).isSuccubus()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case BECKON:
							if (((MonsterInst2)mod).isBeckon()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case STARTAGE:
							if (((MonsterInst2)mod).isStartage()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case MAXAGE:
							if (((MonsterInst2)mod).isMaxage()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case OLDER:
							if (((MonsterInst2)mod).isOlder()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case HEALER:
							if (((MonsterInst2)mod).isHealer()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case STARTAFF:
							if (((MonsterInst2)mod).isStartaff()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SUPPLYBONUS:
							if (((MonsterInst2)mod).isSupplybonus()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case UWDAMAGE:
							if (((MonsterInst2)mod).isUwdamage()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case COLDPOWER:
							if (((MonsterInst2)mod).isColdpower()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case FIREPOWER:
							if (((MonsterInst2)mod).isFirepower()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case STORMPOWER:
							if (((MonsterInst2)mod).isStormpower()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DARKPOWER:
							if (((MonsterInst2)mod).isDarkpower()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SPRINGPOWER:
							if (((MonsterInst2)mod).isSpringpower()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SUMMERPOWER:
							if (((MonsterInst2)mod).isSummerpower()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case FALLPOWER:
							if (((MonsterInst2)mod).isFallpower()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case WINTERPOWER:
							if (((MonsterInst2)mod).isWinterpower()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case AMBIDEXTROUS:
							if (((MonsterInst2)mod).isAmbidextrous()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case BANEFIRESHIELD:
							if (((MonsterInst2)mod).isBanefireshield()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case BERSERK:
							if (((MonsterInst2)mod).isBerserk()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case STANDARD:
							if (((MonsterInst2)mod).isStandard()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case ANIMALAWE:
							if (((MonsterInst2)mod).isAnimalawe()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case AWE:
							if (((MonsterInst2)mod).isAwe()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case FEAR:
							if (((MonsterInst2)mod).isFear()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case REGENERATION:
							if (((MonsterInst2)mod).isRegeneration()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case REINVIGORATION:
							if (((MonsterInst2)mod).isReinvigoration()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case FIRESHIELD:
							if (((MonsterInst2)mod).isFireshield()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case HEAT:
							if (((MonsterInst2)mod).isHeat()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case COLD:
							if (((MonsterInst2)mod).isCold()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case ICEPROT:
							if (((MonsterInst2)mod).isIceprot()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case POISONCLOUD:
							if (((MonsterInst2)mod).isPoisoncloud()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DISEASECLOUD:
							if (((MonsterInst2)mod).isDiseasecloud()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case BLOODVENGEANCE:
							if (((MonsterInst2)mod).isBloodvengeance()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case CASTLEDEF:
							if (((MonsterInst2)mod).isCastledef()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SIEGEBONUS:
							if (((MonsterInst2)mod).isSiegebonus()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case PATROLBONUS:
							if (((MonsterInst2)mod).isPatrolbonus()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case PILLAGEBONUS:
							if (((MonsterInst2)mod).isPillagebonus()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case RESEARCHBONUS:
							if (((MonsterInst2)mod).isResearchbonus()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case FORGEBONUS:
							if (((MonsterInst2)mod).isForgebonus()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DOUSE:
							if (((MonsterInst2)mod).isDouse()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case NOBADEVENTS:
							if (((MonsterInst2)mod).isNobadevents()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case INCUNREST:
							if (((MonsterInst2)mod).isIncunrest()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SPREADDOM:
							if (((MonsterInst2)mod).isSpreaddom()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case LEPER:
							if (((MonsterInst2)mod).isLeper()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case POPKILL:
							if (((MonsterInst2)mod).isPopkill()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case HERETIC:
							if (((MonsterInst2)mod).isHeretic()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case ITEMSLOTS:
							if (((MonsterInst2)mod).isItemslots()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case NAMETYPE:
							if (((MonsterInst2)mod).isNametype()){
								((MonsterInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						}
					}
				}

			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void setInst3(final Inst inst3, final XtextEditor editor, final Monster armor, final String value1, final String value2) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				EList<MonsterMods> mods = armorToEdit.getMods();
				for (MonsterMods mod : mods) {
					if (mod instanceof MonsterInst3) {
						switch (inst3) {
						case MAGICSKILL:
							if (((MonsterInst3)mod).isMagicskill()) {
								if (value1 != null) {
									((MonsterInst3)mod).setValue1(Integer.parseInt(value1));
								}
								if (value2 != null) {
									((MonsterInst3)mod).setValue2(Integer.parseInt(value2));
								}
							}
							break;
						case CUSTOMMAGIC:
							if (((MonsterInst3)mod).isCustommagic()) {
								if (value1 != null) {
									((MonsterInst3)mod).setValue1(Integer.parseInt(value1));
								}
								if (value2 != null) {
									((MonsterInst3)mod).setValue2(Integer.parseInt(value2));
								}
							}
							break;
						case MAGICBOOST:
							if (((MonsterInst3)mod).isMagicboost()) {
								if (value1 != null) {
									((MonsterInst3)mod).setValue1(Integer.parseInt(value1));
								}
								if (value2 != null) {
									((MonsterInst3)mod).setValue2(Integer.parseInt(value2));
								}
							}
							break;
						case GEMPROD:
							if (((MonsterInst3)mod).isGemprod()) {
								if (value1 != null) {
									((MonsterInst3)mod).setValue1(Integer.parseInt(value1));
								}
								if (value2 != null) {
									((MonsterInst3)mod).setValue2(Integer.parseInt(value2));
								}
							}
							break;
						}
					}
				}

			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void setInst5(final Inst inst2, final XtextEditor editor, final Monster armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				int weaponCount = 0;
				EList<MonsterMods> mods = armorToEdit.getMods();
				for (MonsterMods mod : mods) {
					if (mod instanceof MonsterInst5) {
						Integer newValue = null;
						try {
							newValue = Integer.valueOf(newName);
						} catch (NumberFormatException e) {
							// is not a number
						}

						switch (inst2) {
						case WEAPON1:
							if (((MonsterInst5)mod).isWeapon()){
								weaponCount++;
								if (weaponCount == 1) {
									if (newValue != null) {
										((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
									} else {
										((MonsterInst5)mod).setValue1(newName);
									}
								}
							}
							break;
						case WEAPON2:
							if (((MonsterInst5)mod).isWeapon()){
								weaponCount++;
								if (weaponCount == 2) {
									if (newValue != null) {
										((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
									} else {
										((MonsterInst5)mod).setValue1(newName);
									}
								}
							}
							break;
						case WEAPON3:
							if (((MonsterInst5)mod).isWeapon()){
								weaponCount++;
								if (weaponCount == 3) {
									if (newValue != null) {
										((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
									} else {
										((MonsterInst5)mod).setValue1(newName);
									}
								}
							}
							break;
						case WEAPON4:
							if (((MonsterInst5)mod).isWeapon()){
								weaponCount++;
								if (weaponCount == 4) {
									if (newValue != null) {
										((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
									} else {
										((MonsterInst5)mod).setValue1(newName);
									}
								}
							}
							break;
						case ONEBATTLESPELL:
							if (((MonsterInst5)mod).isOnebattlespell()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case FIRSTSHAPE:
							if (((MonsterInst5)mod).isFirstshape()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case SECONDSHAPE:
							if (((MonsterInst5)mod).isSecondshape()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case SECONDTMPSHAPE:
							if (((MonsterInst5)mod).isSecondtmpshape()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case SHAPECHANGE:
							if (((MonsterInst5)mod).isShapechange()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case LANDSHAPE:
							if (((MonsterInst5)mod).isLandshape()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case WATERSHAPE:
							if (((MonsterInst5)mod).isWatershape()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case FORESTSHAPE:
							if (((MonsterInst5)mod).isForestshape()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case PLAINSHAPE:
							if (((MonsterInst5)mod).isPlainshape()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case DOMSUMMON:
							if (((MonsterInst5)mod).isDomsummon()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case DOMSUMMON2:
							if (((MonsterInst5)mod).isDomsummon2()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case DOMSUMMON20:
							if (((MonsterInst5)mod).isDomsummon20()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case MAKEMONSTER1:
							if (((MonsterInst5)mod).isMakemonster1()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case MAKEMONSTER2:
							if (((MonsterInst5)mod).isMakemonster2()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case MAKEMONSTER3:
							if (((MonsterInst5)mod).isMakemonster3()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case MAKEMONSTER4:
							if (((MonsterInst5)mod).isMakemonster4()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case MAKEMONSTER5:
							if (((MonsterInst5)mod).isMakemonster5()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case SUMMON1:
							if (((MonsterInst5)mod).isSummon1()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						case SUMMON5:
							if (((MonsterInst5)mod).isSummon5()){
								if (newValue != null) {
									((MonsterInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((MonsterInst5)mod).setValue1(newName);
								}
							}
							break;
						}
					}
				}

			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void addInst1(final Inst inst, final XtextEditor editor, final Monster armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				EList<MonsterMods> mods = armorToEdit.getMods();
				MonsterInst1 type = DmFactory.eINSTANCE.createMonsterInst1();
				switch (inst) {
				case SPR1:
					type.setSpr1(true);
					break;
				case SPR2:
					type.setSpr2(true);
					break;
				case DESCR:
					type.setDescr(true);
					break;
				case ARMOR1:
					type.setArmor(true);
					break;
				case ARMOR2:
					type.setArmor(true);
					break;
				case ARMOR3:
					type.setArmor(true);
					break;
				}
				type.setValue(newName);
				mods.add(type);
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst2(final Inst inst, final XtextEditor editor, final Monster armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				EList<MonsterMods> mods = armorToEdit.getMods();
				MonsterInst2 type = DmFactory.eINSTANCE.createMonsterInst2();
				switch (inst) {
				case SPECIALLOOK:
					type.setSpeciallook(true);
					break;
				case AP:
					type.setAp(true);
					break;
				case MAPMOVE:
					type.setMapmove(true);
					break;
				case HP:
					type.setHp(true);
					break;
				case PROT:
					type.setProt(true);
					break;
				case SIZE:
					type.setSize(true);
					break;
				case RESSIZE:
					type.setRessize(true);
					break;
				case STR:
					type.setStr(true);
					break;
				case ENC:
					type.setEnc(true);
					break;
				case ATT:
					type.setAtt(true);
					break;
				case DEF:
					type.setDef(true);
					break;
				case PREC:
					type.setPrec(true);
					break;
				case MR:
					type.setMr(true);
					break;
				case MOR:
					type.setMor(true);
					break;
				case GCOST:
					type.setGcost(true);
					break;
				case RCOST:
					type.setRcost(true);
					break;
				case PATHCOST:
					type.setPathcost(true);
					break;
				case STARTDOM:
					type.setStartdom(true);
					break;
				case EYES:
					type.setEyes(true);
					break;
				case COPYSTATS:
					type.setCopystats(true);
					break;
				case COPYSPR:
					type.setCopyspr(true);
					break;
				case RESTRICTEDGOD:
					type.setRestrictedgod(true);
					break;
				case SHATTEREDSOUL:
					type.setShatteredsoul(true);
					break;
				case COLDRES:
					type.setColdres(true);
					break;
				case FIRERES:
					type.setFireres(true);
					break;
				case POISONRES:
					type.setPoisonres(true);
					break;
				case SHOCKRES:
					type.setShockres(true);
					break;
				case DARKVISION:
					type.setDarkvision(true);
					break;
				case STEALTHY:
					type.setStealthy(true);
					break;
				case SEDUCE:
					type.setSeduce(true);
					break;
				case SUCCUBUS:
					type.setSuccubus(true);
					break;
				case BECKON:
					type.setBeckon(true);
					break;
				case STARTAGE:
					type.setStartage(true);
					break;
				case MAXAGE:
					type.setMaxage(true);
					break;
				case OLDER:
					type.setOlder(true);
					break;
				case HEALER:
					type.setHealer(true);
					break;
				case STARTAFF:
					type.setStartaff(true);
					break;
				case SUPPLYBONUS:
					type.setSupplybonus(true);
					break;
				case UWDAMAGE:
					type.setUwdamage(true);
					break;
				case COLDPOWER:
					type.setColdpower(true);
					break;
				case FIREPOWER:
					type.setFirepower(true);
					break;
				case STORMPOWER:
					type.setStormpower(true);
					break;
				case DARKPOWER:
					type.setDarkpower(true);
					break;
				case SPRINGPOWER:
					type.setSpringpower(true);
					break;
				case SUMMERPOWER:
					type.setSummerpower(true);
					break;
				case FALLPOWER:
					type.setFallpower(true);
					break;
				case WINTERPOWER:
					type.setWinterpower(true);
					break;
				case AMBIDEXTROUS:
					type.setAmbidextrous(true);
					break;
				case BANEFIRESHIELD:
					type.setBanefireshield(true);
					break;
				case BERSERK:
					type.setBerserk(true);
					break;
				case STANDARD:
					type.setStandard(true);
					break;
				case ANIMALAWE:
					type.setAnimalawe(true);
					break;
				case AWE:
					type.setAwe(true);
					break;
				case FEAR:
					type.setFear(true);
					break;
				case REGENERATION:
					type.setRegeneration(true);
					break;
				case REINVIGORATION:
					type.setReinvigoration(true);
					break;
				case FIRESHIELD:
					type.setFireshield(true);
					break;
				case HEAT:
					type.setHeat(true);
					break;
				case COLD:
					type.setCold(true);
					break;
				case ICEPROT:
					type.setIceprot(true);
					break;
				case POISONCLOUD:
					type.setPoisoncloud(true);
					break;
				case DISEASECLOUD:
					type.setDiseasecloud(true);
					break;
				case BLOODVENGEANCE:
					type.setBloodvengeance(true);
					break;
				case CASTLEDEF:
					type.setCastledef(true);
					break;
				case SIEGEBONUS:
					type.setSiegebonus(true);
					break;
				case PATROLBONUS:
					type.setPatrolbonus(true);
					break;
				case PILLAGEBONUS:
					type.setPillagebonus(true);
					break;
				case RESEARCHBONUS:
					type.setResearchbonus(true);
					break;
				case FORGEBONUS:
					type.setForgebonus(true);
					break;
				case DOUSE:
					type.setDouse(true);
					break;
				case NOBADEVENTS:
					type.setNobadevents(true);
					break;
				case INCUNREST:
					type.setIncunrest(true);
					break;
				case SPREADDOM:
					type.setSpreaddom(true);
					break;
				case LEPER:
					type.setLeper(true);
					break;
				case POPKILL:
					type.setPopkill(true);
					break;
				case HERETIC:
					type.setHeretic(true);
					break;
				case ITEMSLOTS:
					type.setItemslots(true);
					break;
				case NAMETYPE:
					type.setNametype(true);
					break;				
				}
				type.setValue(Integer.valueOf(newName));
				mods.add(type);
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst3(final Inst inst, final XtextEditor editor, final Monster armor, final String newName1, final String newName2) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				EList<MonsterMods> mods = armorToEdit.getMods();
				MonsterInst3 type = DmFactory.eINSTANCE.createMonsterInst3();
				switch (inst) {
				case MAGICSKILL:
					type.setMagicskill(true);
					break;
				case CUSTOMMAGIC:
					type.setCustommagic(true);
					break;
				case MAGICBOOST:
					type.setMagicboost(true);
					break;
				case GEMPROD:
					type.setGemprod(true);
					break;
				}
				type.setValue1(Integer.valueOf(newName1));
				type.setValue2(Integer.valueOf(newName2));
				mods.add(type);
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst4(final Inst inst, final XtextEditor editor, final Monster armor) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				EList<MonsterMods> mods = armorToEdit.getMods();
				MonsterInst4 type = DmFactory.eINSTANCE.createMonsterInst4();
				switch (inst) {
				case CLEAR:
					type.setClear(true);
					break;
				case CLEARMAGIC:
					type.setClearmagic(true);
					break;
				case CLEARSPEC:
					type.setClearspec(true);
					break;
				case FEMALE:
					type.setFemale(true);
					break;
				case MOUNTED:
					type.setMounted(true);
					break;
				case HOLY:
					type.setHoly(true);
					break;
				case ANIMAL:
					type.setAnimal(true);
					break;
				case UNDEAD:
					type.setUndead(true);
					break;
				case DEMON:
					type.setDemon(true);
					break;
				case MAGICBEING:
					type.setMagicbeing(true);
					break;
				case STONEBEING:
					type.setStonebeing(true);
					break;
				case INANIMATE:
					type.setInanimate(true);
					break;
				case COLDBLOOD:
					type.setColdblood(true);
					break;
				case IMMORTAL:
					type.setImmortal(true);
					break;
				case BLIND:
					type.setBlind(true);
					break;
				case UNIQUE:
					type.setUnique(true);
					break;
				case IMMOBILE:
					type.setImmobile(true);
					break;
				case AQUATIC:
					type.setAquatic(true);
					break;
				case AMPHIBIAN:
					type.setAmphibian(true);
					break;
				case POORAMPHIBIAN:
					type.setPooramphibian(true);
					break;
				case FLYING:
					type.setFlying(true);
					break;
				case STORMIMMUNE:
					type.setStormimmune(true);
					break;
				case SAILING:
					type.setSailing(true);
					break;
				case FORESTSURVIVAL:
					type.setForestsurvival(true);
					break;
				case MOUNTAINSURVIVAL:
					type.setMountainsurvival(true);
					break;
				case SWAMPSURVIVAL:
					type.setSwampsurvival(true);
					break;
				case WASTESURVIVAL:
					type.setWastesurvival(true);
					break;
				case ILLUSION:
					type.setIllusion(true);
					break;
				case SPY:
					type.setSpy(true);
					break;
				case ASSASSIN:
					type.setAssassin(true);
					break;
				case HEAL:
					type.setHeal(true);
					break;
				case NOHEAL:
					type.setNoheal(true);
					break;
				case NEEDNOTEAT:
					type.setNeednoteat(true);
					break;
				case ETHEREAL:
					type.setEthereal(true);
					break;
				case TRAMPLE:
					type.setTrample(true);
					break;
				case ENTANGLE:
					type.setEntangle(true);
					break;
				case EYELOSS:
					type.setEyeloss(true);
					break;
				case HORRORMARK:
					type.setHorrormark(true);
					break;
				case POISONARMOR:
					type.setPoisonarmor(true);
					break;
				case INQUISITOR:
					type.setInquisitor(true);
					break;
				case NOITEM:
					type.setNoitem(true);
					break;
				case NOLEADER:
					type.setNoleader(true);
					break;
				case POORLEADER:
					type.setPoorleader(true);
					break;
				case OKLEADER:
					type.setOkleader(true);
					break;
				case GOODLEADER:
					type.setGoodleader(true);
					break;
				case EXPERTLEADER:
					type.setExpertleader(true);
					break;
				case SUPERIORLEADER:
					type.setSuperiorleader(true);
					break;
				case NOMAGICLEADER:
					type.setNomagicleader(true);
					break;
				case POORMAGICLEADER:
					type.setPoormagicleader(true);
					break;
				case OKMAGICLEADER:
					type.setOkmagicleader(true);
					break;
				case GOODMAGICLEADER:
					type.setGoodmagicleader(true);
					break;
				case EXPERTMAGICLEADER:
					type.setExpertmagicleader(true);
					break;
				case SUPERIORMAGICLEADER:
					type.setSuperiormagicleader(true);
					break;
				case NOUNDEADLEADER:
					type.setNoundeadleader(true);
					break;
				case POORUNDEADLEADER:
					type.setPoorundeadleader(true);
					break;
				case OKUNDEADLEADER:
					type.setOkundeadleader(true);
					break;
				case GOODUNDEADLEADER:
					type.setGoodundeadleader(true);
					break;
				case EXPERTUNDEADLEADER:
					type.setExpertundeadleader(true);
					break;
				case SUPERIORUNDEADLEADER:
					type.setSuperiorundeadleader(true);
					break;				}
				mods.add(type);
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst5(final Inst inst, final XtextEditor editor, final Monster armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				EList<MonsterMods> mods = armorToEdit.getMods();
				MonsterInst5 type = DmFactory.eINSTANCE.createMonsterInst5();
				switch (inst) {
				case WEAPON1:
					type.setWeapon(true);
					break;
				case WEAPON2:
					type.setWeapon(true);
					break;
				case WEAPON3:
					type.setWeapon(true);
					break;
				case WEAPON4:
					type.setWeapon(true);
					break;
				case ONEBATTLESPELL:
					type.setOnebattlespell(true);
					break;
				case FIRSTSHAPE:
					type.setFirstshape(true);
					break;
				case SECONDSHAPE:
					type.setSecondshape(true);
					break;
				case SECONDTMPSHAPE:
					type.setSecondtmpshape(true);
					break;
				case SHAPECHANGE:
					type.setShapechange(true);
					break;
				case LANDSHAPE:
					type.setLandshape(true);
					break;
				case WATERSHAPE:
					type.setWatershape(true);
					break;
				case FORESTSHAPE:
					type.setForestshape(true);
					break;
				case PLAINSHAPE:
					type.setPlainshape(true);
					break;
				case DOMSUMMON:
					type.setDomsummon(true);
					break;
				case DOMSUMMON2:
					type.setDomsummon2(true);
					break;
				case DOMSUMMON20:
					type.setDomsummon20(true);
					break;
				case MAKEMONSTER1:
					type.setMakemonster1(true);
					break;
				case MAKEMONSTER2:
					type.setMakemonster2(true);
					break;
				case MAKEMONSTER3:
					type.setMakemonster3(true);
					break;
				case MAKEMONSTER4:
					type.setMakemonster4(true);
					break;
				case MAKEMONSTER5:
					type.setMakemonster5(true);
					break;
				case SUMMON1:
					type.setSummon1(true);
					break;
				}
				Integer newValue = null;
				try {
					newValue = Integer.valueOf(newName);
				} catch (NumberFormatException e) {
					// is not a number
				}
				if (newValue != null) {
					type.setValue2(Integer.valueOf(newName));
				} else {
					type.setValue1(newName);
				}
				mods.add(type);
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void removeInst2(final Inst inst2, final XtextEditor editor, final Monster armor) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Monster armorToEdit = input;
				MonsterMods modToRemove = null;
				int armorCount = 0;
				int weaponCount = 0;
				EList<MonsterMods> mods = armorToEdit.getMods();
				for (MonsterMods mod : mods) {
					if (mod instanceof MonsterInst1) {
						switch (inst2) {
						case SPR1:
							if (((MonsterInst1)mod).isSpr1()){
								modToRemove = mod;
							}
							break;
						case SPR2:
							if (((MonsterInst1)mod).isSpr2()){
								modToRemove = mod;
							}
							break;
						case DESCR:
							if (((MonsterInst1)mod).isDescr()){
								modToRemove = mod;
							}
							break;
						case ARMOR1:
							if (((MonsterInst1)mod).isArmor()){
								armorCount++;
								if (armorCount == 1) {
									modToRemove = mod;
								}
							}
							break;						
						case ARMOR2:
							if (((MonsterInst1)mod).isArmor()){
								armorCount++;
								if (armorCount == 2) {
									modToRemove = mod;
								}
							}
							break;						
						case ARMOR3:
							if (((MonsterInst1)mod).isArmor()){
								armorCount++;
								if (armorCount == 3) {
									modToRemove = mod;
								}
							}
							break;						
						}
					}
					if (mod instanceof MonsterInst2) {
						switch (inst2) {
						case SPECIALLOOK:
							if (((MonsterInst2)mod).isSpeciallook()){
								modToRemove = mod;
							}
							break;
						case AP:
							if (((MonsterInst2)mod).isAp()){
								modToRemove = mod;
							}
							break;
						case MAPMOVE:
							if (((MonsterInst2)mod).isMapmove()){
								modToRemove = mod;
							}
							break;
						case HP:
							if (((MonsterInst2)mod).isHp()){
								modToRemove = mod;
							}
							break;
						case PROT:
							if (((MonsterInst2)mod).isProt()){
								modToRemove = mod;
							}
							break;
						case SIZE:
							if (((MonsterInst2)mod).isSize()){
								modToRemove = mod;
							}
							break;
						case RESSIZE:
							if (((MonsterInst2)mod).isRessize()){
								modToRemove = mod;
							}
							break;
						case STR:
							if (((MonsterInst2)mod).isStr()){
								modToRemove = mod;
							}
							break;
						case ENC:
							if (((MonsterInst2)mod).isEnc()){
								modToRemove = mod;
							}
							break;
						case ATT:
							if (((MonsterInst2)mod).isAtt()){
								modToRemove = mod;
							}
							break;
						case DEF:
							if (((MonsterInst2)mod).isDef()){
								modToRemove = mod;
							}
							break;
						case PREC:
							if (((MonsterInst2)mod).isPrec()){
								modToRemove = mod;
							}
							break;
						case MR:
							if (((MonsterInst2)mod).isMr()){
								modToRemove = mod;
							}
							break;
						case MOR:
							if (((MonsterInst2)mod).isMor()){
								modToRemove = mod;
							}
							break;
						case GCOST:
							if (((MonsterInst2)mod).isGcost()){
								modToRemove = mod;
							}
							break;
						case RCOST:
							if (((MonsterInst2)mod).isRcost()){
								modToRemove = mod;
							}
							break;
						case PATHCOST:
							if (((MonsterInst2)mod).isPathcost()){
								modToRemove = mod;
							}
							break;
						case STARTDOM:
							if (((MonsterInst2)mod).isStartdom()){
								modToRemove = mod;
							}
							break;
						case EYES:
							if (((MonsterInst2)mod).isEyes()){
								modToRemove = mod;
							}
							break;
						case COPYSTATS:
							if (((MonsterInst2)mod).isCopystats()){
								modToRemove = mod;
							}
							break;
						case COPYSPR:
							if (((MonsterInst2)mod).isCopyspr()){
								modToRemove = mod;
							}
							break;
						case RESTRICTEDGOD:
							if (((MonsterInst2)mod).isRestrictedgod()){
								modToRemove = mod;
							}
							break;
						case SHATTEREDSOUL:
							if (((MonsterInst2)mod).isShatteredsoul()){
								modToRemove = mod;
							}
							break;
						case COLDRES:
							if (((MonsterInst2)mod).isColdres()){
								modToRemove = mod;
							}
							break;
						case FIRERES:
							if (((MonsterInst2)mod).isFireres()){
								modToRemove = mod;
							}
							break;
						case POISONRES:
							if (((MonsterInst2)mod).isPoisonres()){
								modToRemove = mod;
							}
							break;
						case SHOCKRES:
							if (((MonsterInst2)mod).isShockres()){
								modToRemove = mod;
							}
							break;
						case DARKVISION:
							if (((MonsterInst2)mod).isDarkvision()){
								modToRemove = mod;
							}
							break;
						case STEALTHY:
							if (((MonsterInst2)mod).isStealthy()){
								modToRemove = mod;
							}
							break;
						case SEDUCE:
							if (((MonsterInst2)mod).isSeduce()){
								modToRemove = mod;
							}
							break;
						case SUCCUBUS:
							if (((MonsterInst2)mod).isSuccubus()){
								modToRemove = mod;
							}
							break;
						case BECKON:
							if (((MonsterInst2)mod).isBeckon()){
								modToRemove = mod;
							}
							break;
						case STARTAGE:
							if (((MonsterInst2)mod).isStartage()){
								modToRemove = mod;
							}
							break;
						case MAXAGE:
							if (((MonsterInst2)mod).isMaxage()){
								modToRemove = mod;
							}
							break;
						case OLDER:
							if (((MonsterInst2)mod).isOlder()){
								modToRemove = mod;
							}
							break;
						case HEALER:
							if (((MonsterInst2)mod).isHealer()){
								modToRemove = mod;
							}
							break;
						case STARTAFF:
							if (((MonsterInst2)mod).isStartaff()){
								modToRemove = mod;
							}
							break;
						case SUPPLYBONUS:
							if (((MonsterInst2)mod).isSupplybonus()){
								modToRemove = mod;
							}
							break;
						case UWDAMAGE:
							if (((MonsterInst2)mod).isUwdamage()){
								modToRemove = mod;
							}
							break;
						case COLDPOWER:
							if (((MonsterInst2)mod).isColdpower()){
								modToRemove = mod;
							}
							break;
						case FIREPOWER:
							if (((MonsterInst2)mod).isFirepower()){
								modToRemove = mod;
							}
							break;
						case STORMPOWER:
							if (((MonsterInst2)mod).isStormpower()){
								modToRemove = mod;
							}
							break;
						case DARKPOWER:
							if (((MonsterInst2)mod).isDarkpower()){
								modToRemove = mod;
							}
							break;
						case SPRINGPOWER:
							if (((MonsterInst2)mod).isSpringpower()){
								modToRemove = mod;
							}
							break;
						case SUMMERPOWER:
							if (((MonsterInst2)mod).isSummerpower()){
								modToRemove = mod;
							}
							break;
						case FALLPOWER:
							if (((MonsterInst2)mod).isFallpower()){
								modToRemove = mod;
							}
							break;
						case WINTERPOWER:
							if (((MonsterInst2)mod).isWinterpower()){
								modToRemove = mod;
							}
							break;
						case AMBIDEXTROUS:
							if (((MonsterInst2)mod).isAmbidextrous()){
								modToRemove = mod;
							}
							break;
						case BANEFIRESHIELD:
							if (((MonsterInst2)mod).isBanefireshield()){
								modToRemove = mod;
							}
							break;
						case BERSERK:
							if (((MonsterInst2)mod).isBerserk()){
								modToRemove = mod;
							}
							break;
						case STANDARD:
							if (((MonsterInst2)mod).isStandard()){
								modToRemove = mod;
							}
							break;
						case ANIMALAWE:
							if (((MonsterInst2)mod).isAnimalawe()){
								modToRemove = mod;
							}
							break;
						case AWE:
							if (((MonsterInst2)mod).isAwe()){
								modToRemove = mod;
							}
							break;
						case FEAR:
							if (((MonsterInst2)mod).isFear()){
								modToRemove = mod;
							}
							break;
						case REGENERATION:
							if (((MonsterInst2)mod).isRegeneration()){
								modToRemove = mod;
							}
							break;
						case REINVIGORATION:
							if (((MonsterInst2)mod).isReinvigoration()){
								modToRemove = mod;
							}
							break;
						case FIRESHIELD:
							if (((MonsterInst2)mod).isFireshield()){
								modToRemove = mod;
							}
							break;
						case HEAT:
							if (((MonsterInst2)mod).isHeat()){
								modToRemove = mod;
							}
							break;
						case COLD:
							if (((MonsterInst2)mod).isCold()){
								modToRemove = mod;
							}
							break;
						case ICEPROT:
							if (((MonsterInst2)mod).isIceprot()){
								modToRemove = mod;
							}
							break;
						case POISONCLOUD:
							if (((MonsterInst2)mod).isPoisoncloud()){
								modToRemove = mod;
							}
							break;
						case DISEASECLOUD:
							if (((MonsterInst2)mod).isDiseasecloud()){
								modToRemove = mod;
							}
							break;
						case BLOODVENGEANCE:
							if (((MonsterInst2)mod).isBloodvengeance()){
								modToRemove = mod;
							}
							break;
						case CASTLEDEF:
							if (((MonsterInst2)mod).isCastledef()){
								modToRemove = mod;
							}
							break;
						case SIEGEBONUS:
							if (((MonsterInst2)mod).isSiegebonus()){
								modToRemove = mod;
							}
							break;
						case PATROLBONUS:
							if (((MonsterInst2)mod).isPatrolbonus()){
								modToRemove = mod;
							}
							break;
						case PILLAGEBONUS:
							if (((MonsterInst2)mod).isPillagebonus()){
								modToRemove = mod;
							}
							break;
						case RESEARCHBONUS:
							if (((MonsterInst2)mod).isResearchbonus()){
								modToRemove = mod;
							}
							break;
						case FORGEBONUS:
							if (((MonsterInst2)mod).isForgebonus()){
								modToRemove = mod;
							}
							break;
						case DOUSE:
							if (((MonsterInst2)mod).isDouse()){
								modToRemove = mod;
							}
							break;
						case NOBADEVENTS:
							if (((MonsterInst2)mod).isNobadevents()){
								modToRemove = mod;
							}
							break;
						case INCUNREST:
							if (((MonsterInst2)mod).isIncunrest()){
								modToRemove = mod;
							}
							break;
						case SPREADDOM:
							if (((MonsterInst2)mod).isSpreaddom()){
								modToRemove = mod;
							}
							break;
						case LEPER:
							if (((MonsterInst2)mod).isLeper()){
								modToRemove = mod;
							}
							break;
						case POPKILL:
							if (((MonsterInst2)mod).isPopkill()){
								modToRemove = mod;
							}
							break;
						case HERETIC:
							if (((MonsterInst2)mod).isHeretic()){
								modToRemove = mod;
							}
							break;
						case ITEMSLOTS:
							if (((MonsterInst2)mod).isItemslots()){
								modToRemove = mod;
							}
							break;
						case NAMETYPE:
							if (((MonsterInst2)mod).isNametype()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof MonsterInst3) {
						switch (inst2) {
						case MAGICSKILL:
							if (((MonsterInst3)mod).isMagicskill()){
								modToRemove = mod;
							}
							break;
						case CUSTOMMAGIC:
							if (((MonsterInst3)mod).isCustommagic()){
								modToRemove = mod;
							}
							break;
						case MAGICBOOST:
							if (((MonsterInst3)mod).isMagicboost()){
								modToRemove = mod;
							}
							break;
						case GEMPROD:
							if (((MonsterInst3)mod).isGemprod()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof MonsterInst4) {
						switch (inst2) {
						case CLEAR:
							if (((MonsterInst4)mod).isClear()){
								modToRemove = mod;
							}
							break;
						case CLEARMAGIC:
							if (((MonsterInst4)mod).isClearmagic()){
								modToRemove = mod;
							}
							break;
						case CLEARSPEC:
							if (((MonsterInst4)mod).isClearspec()){
								modToRemove = mod;
							}
							break;
						case FEMALE:
							if (((MonsterInst4)mod).isFemale()){
								modToRemove = mod;
							}
							break;
						case MOUNTED:
							if (((MonsterInst4)mod).isMounted()){
								modToRemove = mod;
							}
							break;
						case HOLY:
							if (((MonsterInst4)mod).isHoly()){
								modToRemove = mod;
							}
							break;
						case ANIMAL:
							if (((MonsterInst4)mod).isAnimal()){
								modToRemove = mod;
							}
							break;
						case UNDEAD:
							if (((MonsterInst4)mod).isUndead()){
								modToRemove = mod;
							}
							break;
						case DEMON:
							if (((MonsterInst4)mod).isDemon()){
								modToRemove = mod;
							}
							break;
						case MAGICBEING:
							if (((MonsterInst4)mod).isMagicbeing()){
								modToRemove = mod;
							}
							break;
						case STONEBEING:
							if (((MonsterInst4)mod).isStonebeing()){
								modToRemove = mod;
							}
							break;
						case INANIMATE:
							if (((MonsterInst4)mod).isInanimate()){
								modToRemove = mod;
							}
							break;
						case COLDBLOOD:
							if (((MonsterInst4)mod).isColdblood()){
								modToRemove = mod;
							}
							break;
						case IMMORTAL:
							if (((MonsterInst4)mod).isImmortal()){
								modToRemove = mod;
							}
							break;
						case BLIND:
							if (((MonsterInst4)mod).isBlind()){
								modToRemove = mod;
							}
							break;
						case UNIQUE:
							if (((MonsterInst4)mod).isUnique()){
								modToRemove = mod;
							}
							break;
						case IMMOBILE:
							if (((MonsterInst4)mod).isImmobile()){
								modToRemove = mod;
							}
							break;
						case AQUATIC:
							if (((MonsterInst4)mod).isAquatic()){
								modToRemove = mod;
							}
							break;
						case AMPHIBIAN:
							if (((MonsterInst4)mod).isAmphibian()){
								modToRemove = mod;
							}
							break;
						case POORAMPHIBIAN:
							if (((MonsterInst4)mod).isPooramphibian()){
								modToRemove = mod;
							}
							break;
						case FLYING:
							if (((MonsterInst4)mod).isFlying()){
								modToRemove = mod;
							}
							break;
						case STORMIMMUNE:
							if (((MonsterInst4)mod).isStormimmune()){
								modToRemove = mod;
							}
							break;
						case SAILING:
							if (((MonsterInst4)mod).isSailing()){
								modToRemove = mod;
							}
							break;
						case FORESTSURVIVAL:
							if (((MonsterInst4)mod).isForestsurvival()){
								modToRemove = mod;
							}
							break;
						case MOUNTAINSURVIVAL:
							if (((MonsterInst4)mod).isMountainsurvival()){
								modToRemove = mod;
							}
							break;
						case SWAMPSURVIVAL:
							if (((MonsterInst4)mod).isSwampsurvival()){
								modToRemove = mod;
							}
							break;
						case WASTESURVIVAL:
							if (((MonsterInst4)mod).isWastesurvival()){
								modToRemove = mod;
							}
							break;
						case ILLUSION:
							if (((MonsterInst4)mod).isIllusion()){
								modToRemove = mod;
							}
							break;
						case SPY:
							if (((MonsterInst4)mod).isSpy()){
								modToRemove = mod;
							}
							break;
						case ASSASSIN:
							if (((MonsterInst4)mod).isAssassin()){
								modToRemove = mod;
							}
							break;
						case HEAL:
							if (((MonsterInst4)mod).isHeal()){
								modToRemove = mod;
							}
							break;
						case NOHEAL:
							if (((MonsterInst4)mod).isNoheal()){
								modToRemove = mod;
							}
							break;
						case NEEDNOTEAT:
							if (((MonsterInst4)mod).isNeednoteat()){
								modToRemove = mod;
							}
							break;
						case ETHEREAL:
							if (((MonsterInst4)mod).isEthereal()){
								modToRemove = mod;
							}
							break;
						case TRAMPLE:
							if (((MonsterInst4)mod).isTrample()){
								modToRemove = mod;
							}
							break;
						case ENTANGLE:
							if (((MonsterInst4)mod).isEntangle()){
								modToRemove = mod;
							}
							break;
						case EYELOSS:
							if (((MonsterInst4)mod).isEyeloss()){
								modToRemove = mod;
							}
							break;
						case HORRORMARK:
							if (((MonsterInst4)mod).isHorrormark()){
								modToRemove = mod;
							}
							break;
						case POISONARMOR:
							if (((MonsterInst4)mod).isPoisonarmor()){
								modToRemove = mod;
							}
							break;
						case INQUISITOR:
							if (((MonsterInst4)mod).isInquisitor()){
								modToRemove = mod;
							}
							break;
						case NOITEM:
							if (((MonsterInst4)mod).isNoitem()){
								modToRemove = mod;
							}
							break;
						case NOLEADER:
							if (((MonsterInst4)mod).isNoleader()){
								modToRemove = mod;
							}
							break;
						case POORLEADER:
							if (((MonsterInst4)mod).isPoorleader()){
								modToRemove = mod;
							}
							break;
						case OKLEADER:
							if (((MonsterInst4)mod).isOkleader()){
								modToRemove = mod;
							}
							break;
						case GOODLEADER:
							if (((MonsterInst4)mod).isGoodleader()){
								modToRemove = mod;
							}
							break;
						case EXPERTLEADER:
							if (((MonsterInst4)mod).isExpertleader()){
								modToRemove = mod;
							}
							break;
						case SUPERIORLEADER:
							if (((MonsterInst4)mod).isSuperiorleader()){
								modToRemove = mod;
							}
							break;
						case NOMAGICLEADER:
							if (((MonsterInst4)mod).isNomagicleader()){
								modToRemove = mod;
							}
							break;
						case POORMAGICLEADER:
							if (((MonsterInst4)mod).isPoormagicleader()){
								modToRemove = mod;
							}
							break;
						case OKMAGICLEADER:
							if (((MonsterInst4)mod).isOkmagicleader()){
								modToRemove = mod;
							}
							break;
						case GOODMAGICLEADER:
							if (((MonsterInst4)mod).isGoodmagicleader()){
								modToRemove = mod;
							}
							break;
						case EXPERTMAGICLEADER:
							if (((MonsterInst4)mod).isExpertmagicleader()){
								modToRemove = mod;
							}
							break;
						case SUPERIORMAGICLEADER:
							if (((MonsterInst4)mod).isSuperiormagicleader()){
								modToRemove = mod;
							}
							break;
						case NOUNDEADLEADER:
							if (((MonsterInst4)mod).isNoundeadleader()){
								modToRemove = mod;
							}
							break;
						case POORUNDEADLEADER:
							if (((MonsterInst4)mod).isPoorundeadleader()){
								modToRemove = mod;
							}
							break;
						case OKUNDEADLEADER:
							if (((MonsterInst4)mod).isOkundeadleader()){
								modToRemove = mod;
							}
							break;
						case GOODUNDEADLEADER:
							if (((MonsterInst4)mod).isGoodundeadleader()){
								modToRemove = mod;
							}
							break;
						case EXPERTUNDEADLEADER:
							if (((MonsterInst4)mod).isExpertundeadleader()){
								modToRemove = mod;
							}
							break;
						case SUPERIORUNDEADLEADER:
							if (((MonsterInst4)mod).isSuperiorundeadleader()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof MonsterInst5) {
						switch (inst2) {
						case WEAPON1:
							if (((MonsterInst5)mod).isWeapon()){
								weaponCount++;
								if (weaponCount == 1) {
									modToRemove = mod;
								}
							}
							break;
						case WEAPON2:
							if (((MonsterInst5)mod).isWeapon()){
								weaponCount++;
								if (weaponCount == 2) {
									modToRemove = mod;
								}
							}
							break;
						case WEAPON3:
							if (((MonsterInst5)mod).isWeapon()){
								weaponCount++;
								if (weaponCount == 3) {
									modToRemove = mod;
								}
							}
							break;
						case WEAPON4:
							if (((MonsterInst5)mod).isWeapon()){
								weaponCount++;
								if (weaponCount == 4) {
									modToRemove = mod;
								}
							}
							break;
						case ONEBATTLESPELL:
							if (((MonsterInst5)mod).isOnebattlespell()){
								modToRemove = mod;
							}
							break;
						case FIRSTSHAPE:
							if (((MonsterInst5)mod).isFirstshape()){
								modToRemove = mod;
							}
							break;
						case SECONDSHAPE:
							if (((MonsterInst5)mod).isSecondshape()){
								modToRemove = mod;
							}
							break;
						case SECONDTMPSHAPE:
							if (((MonsterInst5)mod).isSecondtmpshape()){
								modToRemove = mod;
							}
							break;
						case SHAPECHANGE:
							if (((MonsterInst5)mod).isShapechange()){
								modToRemove = mod;
							}
							break;
						case LANDSHAPE:
							if (((MonsterInst5)mod).isLandshape()){
								modToRemove = mod;
							}
							break;
						case WATERSHAPE:
							if (((MonsterInst5)mod).isWatershape()){
								modToRemove = mod;
							}
							break;
						case FORESTSHAPE:
							if (((MonsterInst5)mod).isForestshape()){
								modToRemove = mod;
							}
							break;
						case PLAINSHAPE:
							if (((MonsterInst5)mod).isPlainshape()){
								modToRemove = mod;
							}
							break;
						case DOMSUMMON:
							if (((MonsterInst5)mod).isDomsummon()){
								modToRemove = mod;
							}
							break;
						case DOMSUMMON2:
							if (((MonsterInst5)mod).isDomsummon2()){
								modToRemove = mod;
							}
							break;
						case DOMSUMMON20:
							if (((MonsterInst5)mod).isDomsummon20()){
								modToRemove = mod;
							}
							break;
						case MAKEMONSTER1:
							if (((MonsterInst5)mod).isMakemonster1()){
								modToRemove = mod;
							}
							break;
						case MAKEMONSTER2:
							if (((MonsterInst5)mod).isMakemonster2()){
								modToRemove = mod;
							}
							break;
						case MAKEMONSTER3:
							if (((MonsterInst5)mod).isMakemonster3()){
								modToRemove = mod;
							}
							break;
						case MAKEMONSTER4:
							if (((MonsterInst5)mod).isMakemonster4()){
								modToRemove = mod;
							}
							break;
						case MAKEMONSTER5:
							if (((MonsterInst5)mod).isMakemonster5()){
								modToRemove = mod;
							}
							break;
						case SUMMON1:
							if (((MonsterInst5)mod).isSummon1()){
								modToRemove = mod;
							}
							break;
						case SUMMON5:
							if (((MonsterInst5)mod).isSummon5()){
								modToRemove = mod;
							}
							break;
						}
					}
				}
				if (modToRemove != null) {
					mods.remove(modToRemove);
				}
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#inputChanged(org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void selectionChanged(IFormPart part, ISelection selection) {
		IStructuredSelection ssel = (IStructuredSelection)selection;
		if (ssel.size()==1) {
			input = (Monster)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
		update();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#commit()
	 */
	public void commit(boolean onSave) {
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#setFocus()
	 */
	public void setFocus() {
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#dispose()
	 */
	public void dispose() {
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#isDirty()
	 */
	public boolean isDirty() {
		return false;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#isStale()
	 */
	public boolean isStale() {
		return false;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#refresh()
	 */
	public void refresh() {
		update();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#setFormInput(java.lang.Object)
	 */
	public boolean setFormInput(Object input) {
		return false;
	}
}
