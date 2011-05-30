lexer grammar InternalDm;
@header {
package org.larz.dom3.dm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T10 : '#modname' ;
T11 : '#description' ;
T12 : '#icon' ;
T13 : '#version' ;
T14 : '#domversion' ;
T15 : '#poppergold' ;
T16 : '#resourcemult' ;
T17 : '#supplymult' ;
T18 : '#unresthalfinc' ;
T19 : '#unresthalfres' ;
T20 : '#eventisrare' ;
T21 : '#turmoilincome' ;
T22 : '#turmoilevents' ;
T23 : '#deathincome' ;
T24 : '#deathsupply' ;
T25 : '#deathdeath' ;
T26 : '#slothincome' ;
T27 : '#slothresources' ;
T28 : '#coldincome' ;
T29 : '#coldsupply' ;
T30 : '#misfortune' ;
T31 : '#luckevents' ;
T32 : '#researchscale' ;
T33 : '#end' ;
T34 : '#selectarmor' ;
T35 : '#newarmor' ;
T36 : '#name' ;
T37 : '#type' ;
T38 : '#prot' ;
T39 : '#def' ;
T40 : '#enc' ;
T41 : '#rcost' ;
T42 : '#selectweapon' ;
T43 : '#newweapon' ;
T44 : '#dmg' ;
T45 : '#nratt' ;
T46 : '#att' ;
T47 : '#len' ;
T48 : '#range' ;
T49 : '#ammo' ;
T50 : '#sound' ;
T51 : '#aoe' ;
T52 : '#secondaryeffect' ;
T53 : '#secondaryeffectalways' ;
T54 : '#explspr' ;
T55 : '#flyspr' ;
T56 : '#twohanded' ;
T57 : '#armorpiercing' ;
T58 : '#armornegating' ;
T59 : '#magic' ;
T60 : '#dt_normal' ;
T61 : '#dt_stun' ;
T62 : '#dt_paralyze' ;
T63 : '#dt_poison' ;
T64 : '#dt_cap' ;
T65 : '#dt_demon' ;
T66 : '#dt_demononly' ;
T67 : '#dt_holy' ;
T68 : '#dt_magic' ;
T69 : '#dt_small' ;
T70 : '#dt_large' ;
T71 : '#dt_constructonly' ;
T72 : '#dt_raise' ;
T73 : '#mind' ;
T74 : '#cold' ;
T75 : '#fire' ;
T76 : '#shock' ;
T77 : '#poison' ;
T78 : '#bonus' ;
T79 : '#charge' ;
T80 : '#flail' ;
T81 : '#nostr' ;
T82 : '#nostrength' ;
T83 : '#mrnegates' ;
T84 : '#mrnegateseasily' ;
T85 : '#selectmonster' ;
T86 : '#newmonster' ;
T87 : '#spr1' ;
T88 : '#spr2' ;
T89 : '#descr' ;
T90 : '#armor' ;
T91 : '#speciallook' ;
T92 : '#ap' ;
T93 : '#mapmove' ;
T94 : '#hp' ;
T95 : '#size' ;
T96 : '#ressize' ;
T97 : '#str' ;
T98 : '#prec' ;
T99 : '#mr' ;
T100 : '#mor' ;
T101 : '#gcost' ;
T102 : '#pathcost' ;
T103 : '#startdom' ;
T104 : '#eyes' ;
T105 : '#copystats' ;
T106 : '#copyspr' ;
T107 : '#restrictedgod' ;
T108 : '#shatteredsoul' ;
T109 : '#coldres' ;
T110 : '#coldresist' ;
T111 : '#fireres' ;
T112 : '#fireresist' ;
T113 : '#poisonres' ;
T114 : '#shockres' ;
T115 : '#darkvision' ;
T116 : '#seduce' ;
T117 : '#succubus' ;
T118 : '#beckon' ;
T119 : '#startage' ;
T120 : '#maxage' ;
T121 : '#older' ;
T122 : '#healer' ;
T123 : '#startaff' ;
T124 : '#supplybonus' ;
T125 : '#uwdamage' ;
T126 : '#coldpower' ;
T127 : '#firepower' ;
T128 : '#stormpower' ;
T129 : '#darkpower' ;
T130 : '#springpower' ;
T131 : '#summerpower' ;
T132 : '#fallpower' ;
T133 : '#winterpower' ;
T134 : '#ambidextrous' ;
T135 : '#banefireshield' ;
T136 : '#berserk' ;
T137 : '#standard' ;
T138 : '#animalawe' ;
T139 : '#awe' ;
T140 : '#fear' ;
T141 : '#regeneration' ;
T142 : '#reinvigoration' ;
T143 : '#fireshield' ;
T144 : '#iceprot' ;
T145 : '#poisoncloud' ;
T146 : '#diseasecloud' ;
T147 : '#bloodvengeance' ;
T148 : '#castledef' ;
T149 : '#siegebonus' ;
T150 : '#patrolbonus' ;
T151 : '#pillagebonus' ;
T152 : '#researchbonus' ;
T153 : '#forgebonus' ;
T154 : '#douse' ;
T155 : '#nobadevents' ;
T156 : '#incunrest' ;
T157 : '#spreaddom' ;
T158 : '#leper' ;
T159 : '#popkill' ;
T160 : '#heretic' ;
T161 : '#itemslots' ;
T162 : '#nametype' ;
T163 : '#magicskill' ;
T164 : '#custommagic' ;
T165 : '#magicboost' ;
T166 : '#gemprod' ;
T167 : '#clear' ;
T168 : '#clearmagic' ;
T169 : '#clearspec' ;
T170 : '#female' ;
T171 : '#mounted' ;
T172 : '#holy' ;
T173 : '#animal' ;
T174 : '#undead' ;
T175 : '#demon' ;
T176 : '#magicbeing' ;
T177 : '#stonebeing' ;
T178 : '#inanimate' ;
T179 : '#coldblood' ;
T180 : '#coldblooded' ;
T181 : '#immortal' ;
T182 : '#blind' ;
T183 : '#unique' ;
T184 : '#immobile' ;
T185 : '#aquatic' ;
T186 : '#amphibian' ;
T187 : '#pooramphibian' ;
T188 : '#flying' ;
T189 : '#stormimmune' ;
T190 : '#sailing' ;
T191 : '#forestsurvival' ;
T192 : '#mountainsurvival' ;
T193 : '#swampsurvival' ;
T194 : '#wastesurvival' ;
T195 : '#illusion' ;
T196 : '#spy' ;
T197 : '#assassin' ;
T198 : '#heal' ;
T199 : '#noheal' ;
T200 : '#neednoteat' ;
T201 : '#ethereal' ;
T202 : '#trample' ;
T203 : '#entangle' ;
T204 : '#eyeloss' ;
T205 : '#horrormark' ;
T206 : '#poisonarmor' ;
T207 : '#inquisitor' ;
T208 : '#noitem' ;
T209 : '#noleader' ;
T210 : '#poorleader' ;
T211 : '#okleader' ;
T212 : '#goodleader' ;
T213 : '#expertleader' ;
T214 : '#superiorleader' ;
T215 : '#nomagicleader' ;
T216 : '#poormagicleader' ;
T217 : '#okmagicleader' ;
T218 : '#goodmagicleader' ;
T219 : '#expertmagicleader' ;
T220 : '#superiormagicleader' ;
T221 : '#noundeadleader' ;
T222 : '#poorundeadleader' ;
T223 : '#okundeadleader' ;
T224 : '#goodundeadleader' ;
T225 : '#expertundeadleader' ;
T226 : '#superiorundeadleader' ;
T227 : '#weapon' ;
T228 : '#onebattlespell' ;
T229 : '#firstshape' ;
T230 : '#secondshape' ;
T231 : '#secondtmpshape' ;
T232 : '#shapechange' ;
T233 : '#landshape' ;
T234 : '#watershape' ;
T235 : '#forestshape' ;
T236 : '#plainshape' ;
T237 : '#domsummon' ;
T238 : '#domsummon2' ;
T239 : '#domsummon20' ;
T240 : '#makemonster1' ;
T241 : '#makemonster2' ;
T242 : '#makemonster3' ;
T243 : '#makemonster4' ;
T244 : '#makemonster5' ;
T245 : '#summon1' ;
T246 : '#summon5' ;
T247 : '#stealthy' ;
T248 : '#heat' ;
T249 : '#selectspell' ;
T250 : '#newspell' ;
T251 : '#school' ;
T252 : '#researchlevel' ;
T253 : '#damage' ;
T254 : '#effect' ;
T255 : '#fatiguecost' ;
T256 : '#flightspr' ;
T257 : '#nreff' ;
T258 : '#precision' ;
T259 : '#spec' ;
T260 : '#restricted' ;
T261 : '#path' ;
T262 : '#pathlevel' ;
T263 : '#copyspell' ;
T264 : '#nextspell' ;
T265 : '#selectitem' ;
T266 : '#newitem' ;
T267 : '#constlevel' ;
T268 : '#mainpath' ;
T269 : '#mainlevel' ;
T270 : '#secondarypath' ;
T271 : '#secondarylevel' ;
T272 : '#selectnametype' ;
T273 : '#addname' ;
T274 : '#selectsite' ;
T275 : '#newsite' ;
T276 : '#level' ;
T277 : '#rarity' ;
T278 : '#loc' ;
T279 : '#homemon' ;
T280 : '#homecom' ;
T281 : '#mon' ;
T282 : '#com' ;
T283 : '#gold' ;
T284 : '#res' ;
T285 : '#incscale' ;
T286 : '#decscale' ;
T287 : '#gems' ;
T288 : '#selectnation' ;
T289 : '#indepflag' ;
T290 : '#epithet' ;
T291 : '#summary' ;
T292 : '#brief' ;
T293 : '#flag' ;
T294 : '#mapbackground' ;
T295 : '#startsite' ;
T296 : '#era' ;
T297 : '#labcost' ;
T298 : '#templecost' ;
T299 : '#templepic' ;
T300 : '#startunitnbrs1' ;
T301 : '#startunitnbrs2' ;
T302 : '#hero1' ;
T303 : '#hero2' ;
T304 : '#hero3' ;
T305 : '#hero4' ;
T306 : '#hero5' ;
T307 : '#hero6' ;
T308 : '#multihero1' ;
T309 : '#multihero2' ;
T310 : '#defmult1' ;
T311 : '#defmult1b' ;
T312 : '#defmult2' ;
T313 : '#defmult2b' ;
T314 : '#idealcold' ;
T315 : '#castleprod' ;
T316 : '#domkill' ;
T317 : '#domunrest' ;
T318 : '#startfort' ;
T319 : '#defaultfort' ;
T320 : '#farmfort' ;
T321 : '#mountainfort' ;
T322 : '#forestfort' ;
T323 : '#swampfort' ;
T324 : '#uwfort' ;
T325 : '#deepfort' ;
T326 : '#clearnation' ;
T327 : '#clearrec' ;
T328 : '#clearsites' ;
T329 : '#uwnation' ;
T330 : '#bloodnation' ;
T331 : '#nopreach' ;
T332 : '#dyingdom' ;
T333 : '#sacrificedom' ;
T334 : '#nodeathsupply' ;
T335 : '#autoundead' ;
T336 : '#zombiereanim' ;
T337 : '#horsereanim' ;
T338 : '#wightreanim' ;
T339 : '#manikinreanim' ;
T340 : '#tombwyrmreanim' ;
T341 : '#startcom' ;
T342 : '#startscout' ;
T343 : '#startunittype1' ;
T344 : '#startunittype2' ;
T345 : '#addrecunit' ;
T346 : '#addreccom' ;
T347 : '#uwunit1' ;
T348 : '#uwunit2' ;
T349 : '#uwunit3' ;
T350 : '#uwunit4' ;
T351 : '#uwunit5' ;
T352 : '#uwcom1' ;
T353 : '#uwcom2' ;
T354 : '#uwcom3' ;
T355 : '#uwcom4' ;
T356 : '#uwcom5' ;
T357 : '#defcom1' ;
T358 : '#defcom2' ;
T359 : '#defunit1' ;
T360 : '#defunit1b' ;
T361 : '#defunit2' ;
T362 : '#defunit2b' ;
T363 : '#color' ;
T364 : '.' ;

// $ANTLR src "../org.larz.dom3.dm/src-gen/org/larz/dom3/dm/parser/antlr/internal/InternalDm.g" 13970
RULE_INT : '-'? ('0'..'9')+;

// $ANTLR src "../org.larz.dom3.dm/src-gen/org/larz/dom3/dm/parser/antlr/internal/InternalDm.g" 13972
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.larz.dom3.dm/src-gen/org/larz/dom3/dm/parser/antlr/internal/InternalDm.g" 13974
RULE_FREE_FORM_COMMENT : ('a'..'z'|'A'..'Z'|'0'..'9'|'('|')'|'['|']'|',')+;

// $ANTLR src "../org.larz.dom3.dm/src-gen/org/larz/dom3/dm/parser/antlr/internal/InternalDm.g" 13976
RULE_ML_COMMENT : (RULE_SL_COMMENT|(' '* '\t'* ('\r'|'\n'))+) ~(('#'|'\r'|'\n')) ~(('\r'|'\n'))*;

// $ANTLR src "../org.larz.dom3.dm/src-gen/org/larz/dom3/dm/parser/antlr/internal/InternalDm.g" 13978
RULE_SL_COMMENT : ('-' ~('0'..'9') ~(('\n'|'\r'))* ('\r'|'\n')?|'//' ~(('\n'|'\r'))* ('\r'|'\n')?);

// $ANTLR src "../org.larz.dom3.dm/src-gen/org/larz/dom3/dm/parser/antlr/internal/InternalDm.g" 13980
RULE_WS : (' '|'\t'|'\r'|'\n')+;


