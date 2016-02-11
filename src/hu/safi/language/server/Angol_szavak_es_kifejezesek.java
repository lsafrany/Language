package hu.safi.language.server;

import hu.safi.language.server.jdo.Item;
import hu.safi.language.server.jdo.SubTheme;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class Angol_szavak_es_kifejezesek {

	public void elso_resz1(PersistenceManager pm) {

		Query querySubTheme = pm.newQuery("select from " + SubTheme.class.getName());
		@SuppressWarnings("unchecked")
		List<SubTheme> subThemeList = (List<SubTheme>) pm.newQuery(querySubTheme).execute();
		if (!subThemeList.isEmpty()) {
			for (SubTheme s : subThemeList) {
				if (s.getName().equals("Első rész")) {

					Item item1 = new Item(s.getKey(), "régi,ódon,antik", "ancient");
					Item item2 = new Item(s.getKey(), "blúz", "a blouse");
					Item item3 = new Item(s.getKey(), "kabát", "a coat");
					Item item4 = new Item(s.getKey(), "női ruha", "a dress");
					Item item5 = new Item(s.getKey(), "zakó", "a jacket");
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
					
				}
			}
		}

	}
}
