package hu.safi.language.server.data;

import hu.safi.language.server.ServerConstants;
import hu.safi.language.server.jdo.Item;
import hu.safi.language.server.jdo.SubTheme;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class Angol_szavak_1 {

	public Angol_szavak_1(PersistenceManager pm) {
		super();

		Query querySubTheme = pm.newQuery("select from " + SubTheme.class.getName());
		@SuppressWarnings("unchecked")
		List<SubTheme> subThemeList = (List<SubTheme>) pm.newQuery(querySubTheme).execute();
		if (!subThemeList.isEmpty()) {
			for (SubTheme s : subThemeList) {
				if (s.getName().equals(ServerConstants.THEME0_SUBTHEME1)) {

					Item item1 = new Item(s.getKey(), "fehér", "white");
					Item item2 = new Item(s.getKey(), "fekete", "black");
					Item item3 = new Item(s.getKey(), "piros", "red");
					Item item4 = new Item(s.getKey(), "zöld", "green");
					Item item5 = new Item(s.getKey(), "kék", "blue");
					Item item6 = new Item(s.getKey(), "sárga", "yellow");
					Item item7 = new Item(s.getKey(), "lila", "purple");
					Item item8 = new Item(s.getKey(), "rózsaszín", "pink");
					Item item9 = new Item(s.getKey(), "narancssárga", "orange");
					
					Item item10 = new Item(s.getKey(), "haj", "hair");
					Item item11 = new Item(s.getKey(), "arc", "face");
					Item item12 = new Item(s.getKey(), "kéz", "hand");
					Item item13 = new Item(s.getKey(), "láb", "foot");
					
					Item item14 = new Item(s.getKey(), "alma", "apple");
					Item item15 = new Item(s.getKey(), "banán", "banana");
					
					Item item16 = new Item(s.getKey(), "ház", "house");
					Item item17 = new Item(s.getKey(), "fiú", "boy");
					Item item18 = new Item(s.getKey(), "lány", "girl");
					
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

				}
			}
		}
	}
}
