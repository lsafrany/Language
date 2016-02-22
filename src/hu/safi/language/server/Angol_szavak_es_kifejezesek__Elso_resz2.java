package hu.safi.language.server;

import hu.safi.language.server.jdo.Item;
import hu.safi.language.server.jdo.SubTheme;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class Angol_szavak_es_kifejezesek__Elso_resz2 {

	public Angol_szavak_es_kifejezesek__Elso_resz2(PersistenceManager pm) {
		super();

		Query querySubTheme = pm.newQuery("select from " + SubTheme.class.getName());
		@SuppressWarnings("unchecked")
		List<SubTheme> subThemeList = (List<SubTheme>) pm.newQuery(querySubTheme).execute();
		if (!subThemeList.isEmpty()) {
			for (SubTheme s : subThemeList) {
				if (s.getName().equals("Első rész")) {

					Item item1 = new Item(s.getKey(), "járatszám", "fight number");
					Item item2 = new Item(s.getKey(), "bezsállókártya", "boarding card");
					Item item3 = new Item(s.getKey(), "apáca", "a nun");
					Item item4 = new Item(s.getKey(), "magányos, elhagyatott", "solitary");
					Item item5 = new Item(s.getKey(), "fogság, kényszerű elszigeteltség", "confinement");
/*					
					Item item6 = new Item(s.getKey(), "pulóver", "a pullover");
					Item item7 = new Item(s.getKey(), "ing", "a shirt");
					Item item8 = new Item(s.getKey(), "öltöny", "a suit");
					Item item9 = new Item(s.getKey(), "nadrág", "a pair of trousers");
					Item item10 = new Item(s.getKey(), "farmernadrág", "a pair of jeans");
					Item item11 = new Item(s.getKey(), "hatásos", "impressive");
					Item item12 = new Item(s.getKey(), "szobor", "a statue");
					Item item13 = new Item(s.getKey(), "példa nélkül álló, kiszámíthatatlan", "unprecendended");
					Item item14 = new Item(s.getKey(), "teljesítmény,tett, eredmény", "an achievement");
					Item item15 = new Item(s.getKey(), "jó hírű", "reputable");
					Item item16 = new Item(s.getKey(), "ugrás", "a leap");
					Item item17 = new Item(s.getKey(), "emberiség", "mankind");
					Item item18 = new Item(s.getKey(), "kétségtelenül", "surely");
					Item item19 = new Item(s.getKey(), "jólét, kényelem", "comfort");
					Item item20 = new Item(s.getKey(), "hasznot húz", "to benfit from");
					Item item21 = new Item(s.getKey(), "egyszerű", "humble");
					Item item22 = new Item(s.getKey(), "várokozá, remény", "expentancy");
					Item item23 = new Item(s.getKey(), "felemelkedni", "to ris");
					Item item24 = new Item(s.getKey(), "valójában", "in fact");
					Item item25 = new Item(s.getKey(), "túrista", "holidaymaker");
					Item item26 = new Item(s.getKey(), "tünet, jelenség", "a phenomenom");
					Item item27 = new Item(s.getKey(), "lakosság, népesség", "population");
					Item item28 = new Item(s.getKey(), "elüzletesít", "to commercialize");
					Item item29 = new Item(s.getKey(), "kapzsiság, mohóság", "greed");
					Item item30 = new Item(s.getKey(), "visszaélés", "abuse");
					Item item31 = new Item(s.getKey(), "fűszál", "a blad of grass");
					Item item32 = new Item(s.getKey(), "kiszolgál, ellát", "to serve");
					Item item33 = new Item(s.getKey(), "éhenhal", "to die of hunger");
					Item item34 = new Item(s.getKey(), "éhínség, éhség", "famine");
					Item item35 = new Item(s.getKey(), "megfázni", "to have a cold");
					Item item36 = new Item(s.getKey(), "kijönni valakivel", "to get on witth");
					Item item37 = new Item(s.getKey(), "vallás", "religion");
					Item item38 = new Item(s.getKey(), "imádni", "to worship");
					Item item39 = new Item(s.getKey(), "síremlék", "a tomb");
					Item item40 = new Item(s.getKey(), "templom", "a temple");
					Item item41 = new Item(s.getKey(), "akárki, bárki", "whoever");
					Item item42 = new Item(s.getKey(), "haladás", "advance");
					Item item43 = new Item(s.getKey(), "reménykedni, bízni valamiben", "to hope for");
					Item item44 = new Item(s.getKey(), "etetés, táplálás", "a feed");
					Item item45 = new Item(s.getKey(), "katonaorvos", "a surgean");
					Item item46 = new Item(s.getKey(), "meglepő, mulatságos", "amazing");
					Item item47 = new Item(s.getKey(), "illik valamihez", "to go with");
					Item item48 = new Item(s.getKey(), "feltárás, kitalálás", "inventionto");
					Item item49 = new Item(s.getKey(), "hihetetlen", "incredible");
					Item item50 = new Item(s.getKey(), "kényelmes", "convinient");
					Item item51 = new Item(s.getKey(), "némileg, kissé", "sightly");
					Item item52 = new Item(s.getKey(), "szemlél, megfontol", "to contemplate");
					Item item53 = new Item(s.getKey(), "öröm, gyönyörüség, élvezet", "pleasure");
					Item item54 = new Item(s.getKey(), "egyedül", "alone");
					Item item55 = new Item(s.getKey(), "nyilvánvaló, kézenfekvő", "obvious");
					Item item56 = new Item(s.getKey(), "nagy hatással van", "to be impressed by");
					Item item57 = new Item(s.getKey(), "valójában, ténylegesen", "actually");
					Item item58 = new Item(s.getKey(), "főleg, különösen", "especially");
					Item item59 = new Item(s.getKey(), "megszállottja", "to be obsessed by");
					Item item60 = new Item(s.getKey(), "majdnem", "almost");
					Item item61 = new Item(s.getKey(), "ámbár, habár", "thought");
					Item item62 = new Item(s.getKey(), "megnyit, hozzáférhetővé tesz", "to open up");
					Item item63 = new Item(s.getKey(), "elképzelhetetlen, alig hihető", "inconciviable");
					Item item64 = new Item(s.getKey(), "csinos, bájos", "pretty");
					Item item65 = new Item(s.getKey(), "hírnév", "reputation");
					Item item66 = new Item(s.getKey(), "hajlik, meghajol, elgörbül", "to bend");
					Item item67 = new Item(s.getKey(), "megharap, megmar", "to bit");
					Item item68 = new Item(s.getKey(), "szétreped", "to burst");
					Item item69 = new Item(s.getKey(), "ás", "to dig");
					Item item70 = new Item(s.getKey(), "megbocsát, elenged", "to forgive");
					Item item71 = new Item(s.getKey(), "megfagy, megdermed", "to freeze");
					Item item72 = new Item(s.getKey(), "függ, lóg, akaszt", "to hang");
					Item item73 = new Item(s.getKey(), "üt, eltalál", "to bit");
					Item item74 = new Item(s.getKey(), "árt, károsít, megsért", "to hurt");
					Item item75 = new Item(s.getKey(), "térdel", "to kneel");
					Item item76 = new Item(s.getKey(), "lő", "to shoot");
					Item item77 = new Item(s.getKey(), "becsuk, betesz", "to shut");
					Item item78 = new Item(s.getKey(), "süllyed, merül", "to shink");
					Item item79 = new Item(s.getKey(), "csúszik, csúszkál", "to slide");
					Item item80 = new Item(s.getKey(), "szagol", "to smell");
					Item item81 = new Item(s.getKey(), "felborul, kiömlik", "to spill");
					Item item82 = new Item(s.getKey(), "elront, tönkretesz", "to spoil");
					Item item83 = new Item(s.getKey(), "lop", "to steel");
					Item item84 = new Item(s.getKey(), "szúr, döf", "to stick");
					Item item85 = new Item(s.getKey(), "nálam", "on me");
					Item item86 = new Item(s.getKey(), "megszülni", "to give a birth");
					Item item87 = new Item(s.getKey(), "elege van", "to be fed up with");
					Item item88 = new Item(s.getKey(), "kivenni egy hetet", "to have a week off");
					Item item89 = new Item(s.getKey(), "vágyni", "to long for");
					Item item90 = new Item(s.getKey(), "ingázni", "to commute");
					Item item91 = new Item(s.getKey(), "szerence, gazdagság", "furtune");
					Item item92 = new Item(s.getKey(), "alapít", "to establish");
					Item item93 = new Item(s.getKey(), "alapít, létesít", "to found");
*/
					pm.makePersistent(item1);
					pm.makePersistent(item2);
					pm.makePersistent(item3);
					pm.makePersistent(item4);
					pm.makePersistent(item5);
/*
					pm.makePersistent(item6);
					pm.makePersistent(item7);
					pm.makePersistent(item8);
					pm.makePersistent(item9);
					pm.makePersistent(item10);
					pm.makePersistent(item11);
					pm.makePersistent(item12);
					pm.makePersistent(item13);
					pm.makePersistent(item14);
					pm.makePersistent(item15);
					pm.makePersistent(item16);
					pm.makePersistent(item17);
					pm.makePersistent(item18);
					pm.makePersistent(item19);
					pm.makePersistent(item20);
					pm.makePersistent(item21);
					pm.makePersistent(item22);
					pm.makePersistent(item23);
					pm.makePersistent(item24);
					pm.makePersistent(item25);
					pm.makePersistent(item26);
					pm.makePersistent(item27);
					pm.makePersistent(item28);
					pm.makePersistent(item29);
					pm.makePersistent(item30);
					pm.makePersistent(item31);
					pm.makePersistent(item32);
					pm.makePersistent(item33);
					pm.makePersistent(item34);
					pm.makePersistent(item35);
					pm.makePersistent(item36);
					pm.makePersistent(item37);
					pm.makePersistent(item38);
					pm.makePersistent(item39);
					pm.makePersistent(item40);
					pm.makePersistent(item41);
					pm.makePersistent(item42);
					pm.makePersistent(item43);
					pm.makePersistent(item44);
					pm.makePersistent(item45);
					pm.makePersistent(item46);
					pm.makePersistent(item47);
					pm.makePersistent(item48);
					pm.makePersistent(item49);
					pm.makePersistent(item50);
					pm.makePersistent(item51);
					pm.makePersistent(item52);
					pm.makePersistent(item53);
					pm.makePersistent(item54);
					pm.makePersistent(item55);
					pm.makePersistent(item56);
					pm.makePersistent(item57);
					pm.makePersistent(item58);
					pm.makePersistent(item59);
					pm.makePersistent(item60);
					pm.makePersistent(item61);
					pm.makePersistent(item62);
					pm.makePersistent(item63);
					pm.makePersistent(item64);
					pm.makePersistent(item65);
					pm.makePersistent(item66);
					pm.makePersistent(item67);
					pm.makePersistent(item68);
					pm.makePersistent(item69);
					pm.makePersistent(item70);
					pm.makePersistent(item71);
					pm.makePersistent(item72);
					pm.makePersistent(item73);
					pm.makePersistent(item74);
					pm.makePersistent(item75);
					pm.makePersistent(item76);
					pm.makePersistent(item77);
					pm.makePersistent(item78);
					pm.makePersistent(item79);
					pm.makePersistent(item80);
					pm.makePersistent(item81);
					pm.makePersistent(item82);
					pm.makePersistent(item83);
					pm.makePersistent(item84);
					pm.makePersistent(item85);
					pm.makePersistent(item86);
					pm.makePersistent(item87);
					pm.makePersistent(item88);
					pm.makePersistent(item89);
					pm.makePersistent(item90);
					pm.makePersistent(item91);
					pm.makePersistent(item92);
					pm.makePersistent(item93);
*/
				}
			}
		}
	}
}
