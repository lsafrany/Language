package hu.safi.language.server;

import hu.safi.language.server.jdo.Item;
import hu.safi.language.server.jdo.SubTheme;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class Angol_szavak_es_kifejezesek__Elso_resz4 {

	public Angol_szavak_es_kifejezesek__Elso_resz4(PersistenceManager pm) {
		super();

		Query querySubTheme = pm.newQuery("select from " + SubTheme.class.getName());
		@SuppressWarnings("unchecked")
		List<SubTheme> subThemeList = (List<SubTheme>) pm.newQuery(querySubTheme).execute();
		if (!subThemeList.isEmpty()) {
			for (SubTheme s : subThemeList) {
				if (s.getName().equals("Első rész")) {

					Item item1 = new Item(s.getKey(), ".", "full stop, dot");
					Item item2 = new Item(s.getKey(), "?", "question mark");
					Item item3 = new Item(s.getKey(), ",", "comma");
					Item item4 = new Item(s.getKey(), "!", "exclamation mark");
					Item item5 = new Item(s.getKey(), ":", "colon");					
					Item item6 = new Item(s.getKey(), ";", "semi colon");
					Item item7 = new Item(s.getKey(), "\'", "apostrophe");
					Item item8 = new Item(s.getKey(), "\"", "quotation mark");
					Item item9 = new Item(s.getKey(), "-", "hyphen");
					Item item10 = new Item(s.getKey(), "()", "brakets");
					Item item11 = new Item(s.getKey(), "*", "asterick");
					Item item12 = new Item(s.getKey(), "[]", "square brakets");
					Item item13 = new Item(s.getKey(), "&", "ampersand");
					Item item14 = new Item(s.getKey(), "@", "at");
					Item item15 = new Item(s.getKey(), "tört", "fraction");
					Item item16 = new Item(s.getKey(), "téglalap", "regtangle");
					Item item17 = new Item(s.getKey(), "szervíz", "garage");
					Item item18 = new Item(s.getKey(), "randizni", "to date");
					Item item19 = new Item(s.getKey(), "sikerülni", "to manage to");
					Item item20 = new Item(s.getKey(), "sikerülni", "to succed in");
					Item item21 = new Item(s.getKey(), "Jobban szeretem a futást a focinál.", "I prefer running to playing football.");
					Item item22 = new Item(s.getKey(), "Az a bátyám, aki Amerikában van, doktor. /Szűkítő/", "My brothre who lives in America is a doctor.");
					Item item23 = new Item(s.getKey(), "Bátyám, aki Amerikában van, doktor. /Bővítő/", "My brothre, who lives in America, is a doctor.");
					Item item24 = new Item(s.getKey(), "nyíl balra", "arrow to the left");
					Item item25 = new Item(s.getKey(), "tilos", "mustn't");
					Item item26 = new Item(s.getKey(), "példa valamire", "example of");
					Item item27 = new Item(s.getKey(), "érdekelni valamit", "to interest int");
					Item item28 = new Item(s.getKey(), "teli valamivel", "full of");
					Item item29 = new Item(s.getKey(), "hasonló valamihez", "similar to");
					Item item30 = new Item(s.getKey(), "függni valakitől/valamitől", "to depend on");
					Item item31 = new Item(s.getKey(), "féltékenynek lenni valakire", "to be jealous of");
					Item item32 = new Item(s.getKey(), "költeni valamire", "to spend on");
					Item item33 = new Item(s.getKey(), "ütközni valaminek", "to crash into");				
					Item item34 = new Item(s.getKey(), "rossz valamiben", "to be bad at");
					Item item35 = new Item(s.getKey(), "megérkezni valahova", "to arrive at,in");
					Item item36 = new Item(s.getKey(), "elmagyarázni valakinek", "to explain to");
					Item item37 = new Item(s.getKey(), "megszabadulni valakitől/valamitől", "to be/get rid of");
					Item item38 = new Item(s.getKey(), "írni valamivel", "to write in");					
					Item item39 = new Item(s.getKey(), "elpanaszolni valamit", "to complain of");
					Item item40 = new Item(s.getKey(), "megvádolni valamivel", "to accuse of");
					Item item41 = new Item(s.getKey(), "hinni valamiben", "to beleive in");
					Item item42 = new Item(s.getKey(), "indulni valahova", "to leave for");
					Item item43 = new Item(s.getKey(), "keresni valamit", "to search for");
					Item item44 = new Item(s.getKey(), "osztani valamit", "to devide into");
					Item item45 = new Item(s.getKey(), "résztvenni valamiben", "to take part in");
					Item item46 = new Item(s.getKey(), "emlékezni valamire", "to remind of");
					Item item47 = new Item(s.getKey(), "elszenvedni valamit", "to suffer from");
					Item item48 = new Item(s.getKey(), "vezeréknév", "surname, family name, last name");
					Item item49 = new Item(s.getKey(), "keresztnév", "Christian name, first name, given name");
					Item item50 = new Item(s.getKey(), "büntetést fizet", "to pay a fine");
					Item item51 = new Item(s.getKey(), "beteg /hosszan/", "ill");
					Item item52 = new Item(s.getKey(), "beteg /röviden/", "sick");
					Item item53 = new Item(s.getKey(), "haszontalan", "naughty");
					Item item54 = new Item(s.getKey(), "fegyver", "arms, weapon, gun");
					Item item55 = new Item(s.getKey(), "leszerelés", "disarmement");
					Item item56 = new Item(s.getKey(), "kötni", "to knit");
					Item item57 = new Item(s.getKey(), "anyagdarab", "a cloth");
					Item item58 = new Item(s.getKey(), "kréta", "chalk");
					Item item59 = new Item(s.getKey(), "helyette", "instead of");
					Item item60 = new Item(s.getKey(), "osztályfőnök", "classmaster");					
					Item item61 = new Item(s.getKey(), "headmaster", "igazgató");
					Item item62 = new Item(s.getKey(), "büntetés", "punishment");
					Item item63 = new Item(s.getKey(), "rendez, elintéz, előkészít", "to arrange");
					Item item64 = new Item(s.getKey(), "vár, valószínúnek tart, számít", "to expect");
					Item item65 = new Item(s.getKey(), "éppen, pont", "bang");
					Item item66 = new Item(s.getKey(), "feltételez, feltesz", "to assume");
					Item item67 = new Item(s.getKey(), "széleskörú, kiterjedt, általános", "widespread");
					Item item68 = new Item(s.getKey(), "megfelelő", "corresponding");
					Item item69 = new Item(s.getKey(), "felfog, megért", "to realize");
					Item item70 = new Item(s.getKey(), "viselkedni", "to behave");
					Item item71 = new Item(s.getKey(), "nekigyörkőzik", "to roll up one's sleeves");
					Item item72 = new Item(s.getKey(), "nyugalom, jólét, kényelem", "ease");
					Item item73 = new Item(s.getKey(), "fontosság", "importance");
					Item item74 = new Item(s.getKey(), "megráz, megöbbent, megbotránkoztat", "to shock");
					Item item75 = new Item(s.getKey(), "talp", "sole");
					Item item76 = new Item(s.getKey(), "felülmúl", "to exceed");
					Item item77 = new Item(s.getKey(), "szigorú, pontos, szabatos", "strict");
					Item item78 = new Item(s.getKey(), "alku, üzlet", "deal");
					Item item79 = new Item(s.getKey(), "meghajlás, fejbólintás", "bow");
					Item item80 = new Item(s.getKey(), "hunyorítás, kacsintás", "wink");

					pm.makePersistent(item1);
					pm.makePersistent(item2);
					pm.makePersistent(item3);
					pm.makePersistent(item4);
					pm.makePersistent(item5);
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

				}
			}
		}
	}
}
