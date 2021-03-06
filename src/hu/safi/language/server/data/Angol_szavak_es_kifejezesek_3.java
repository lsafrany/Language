package hu.safi.language.server.data;

import hu.safi.language.server.ServerConstants;
import hu.safi.language.server.jdo.Item;
import hu.safi.language.server.jdo.SubTheme;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class Angol_szavak_es_kifejezesek_3 {

	public Angol_szavak_es_kifejezesek_3(PersistenceManager pm) {
		super();

		Query querySubTheme = pm.newQuery("select from " + SubTheme.class.getName());
		@SuppressWarnings("unchecked")
		List<SubTheme> subThemeList = (List<SubTheme>) pm.newQuery(querySubTheme).execute();
		if (!subThemeList.isEmpty()) {
			for (SubTheme s : subThemeList) {
				if (s.getName().equals(ServerConstants.THEME1_SUBTHEME3)) {

					Item item1 = new Item(s.getKey(), "tölgy", "oak");
					Item item2 = new Item(s.getKey(), "ág, ágazat, iroda", "branch");
					Item item3 = new Item(s.getKey(), "bolond, buta, nevetséges", "foolish");
					Item item4 = new Item(s.getKey(), "szőlőskert", "vineyard");
					Item item5 = new Item(s.getKey(), "eltemet, elás", "to bury");					
					Item item6 = new Item(s.getKey(), "nyaklánc, nyakék", "necklace");
					Item item7 = new Item(s.getKey(), "izgalom, lelki zavar", "upset");
					Item item8 = new Item(s.getKey(), "szölő", "grape");
					Item item9 = new Item(s.getKey(), "szölőtő", "vine");
					Item item10 = new Item(s.getKey(), "gazdag, vagyonos", "wealtlhy");
					Item item11 = new Item(s.getKey(), "figyelemre méltó, nevezetes", "remarkable");
					Item item12 = new Item(s.getKey(), "torokfájás", "to have a sore throut");
					Item item13 = new Item(s.getKey(), "fejfájás", "to have a headache");
					Item item14 = new Item(s.getKey(), "láz", "to have a temperature");
					Item item15 = new Item(s.getKey(), "hányni", "to romit");
					Item item16 = new Item(s.getKey(), "járvány", "epidemic");
					Item item17 = new Item(s.getKey(), "fájni valami", "to have a pain");
					Item item18 = new Item(s.getKey(), "boka", "an ankle");
					Item item19 = new Item(s.getKey(), "hajat festeni", "to dye");
					Item item20 = new Item(s.getKey(), "bögre, korsó", "a mug");
					Item item21 = new Item(s.getKey(), "mese", "a tale");
					Item item22 = new Item(s.getKey(), "mese /tanulsággal/", "to a fable");
					Item item23 = new Item(s.getKey(), "egyszer volt, hol nem volt", "once upon a time");
					Item item24 = new Item(s.getKey(), "tanulság", "moral");
					Item item25 = new Item(s.getKey(), "lecke", "lesson");
					Item item26 = new Item(s.getKey(), "koppint, megkopogtat", "to tap");
					Item item27 = new Item(s.getKey(), "ledöngöl", "to tamp");
					Item item28 = new Item(s.getKey(), "végső soron", "eventually");
					Item item29 = new Item(s.getKey(), "létra", "a ladder");
					Item item30 = new Item(s.getKey(), "szellő, szél", "breeze");
					Item item31 = new Item(s.getKey(), "csábít, megkisért", "to tempt");
					Item item32 = new Item(s.getKey(), "10 szorozva 2-vel 20", "10 multiply by 2 is 20");
					Item item33 = new Item(s.getKey(), "10 osztva 2-vel 5", "10 devide by 2 is 5");				
					Item item34 = new Item(s.getKey(), "10 plusz 2 12", "10 add 2 is 12");
					Item item35 = new Item(s.getKey(), "10 minusz 2 8", "10 subtract 2 is 8");
					Item item36 = new Item(s.getKey(), "Láttam őt ?", "Have I seen her ?");
					Item item37 = new Item(s.getKey(), "Nem emlékszem, láttam-e őt ?", "I don't remember, if I have seen her.");
					Item item38 = new Item(s.getKey(), "Nem emlékszem, láttam-e őt ?", "I don't remember, wheather I have seen her.");					
					Item item39 = new Item(s.getKey(), "elhagy, felad", "to abandon");
					Item item40 = new Item(s.getKey(), "idegösszeomlás", "nervous breakdown");
					Item item41 = new Item(s.getKey(), "számbeblileg, létszámban felülmúl", "outnumber");
					Item item42 = new Item(s.getKey(), "fájdalmas, kínos", "painful");
					Item item43 = new Item(s.getKey(), "félénk, bátortalan", "shy");
					Item item44 = new Item(s.getKey(), "derékszíj", "waist-belt");
					Item item45 = new Item(s.getKey(), "bánatos", "grief-sticken");
					Item item46 = new Item(s.getKey(), "gyógyszertár", "dispensary");
					Item item47 = new Item(s.getKey(), "rákövetkező", "subsequent");
					Item item48 = new Item(s.getKey(), "hajadon", "spinster");
					Item item49 = new Item(s.getKey(), "keserű, zord, metsző", "bitter");
					Item item50 = new Item(s.getKey(), "ásatás", "excavation");
					Item item51 = new Item(s.getKey(), "rivaldafény", "limelight");
					Item item52 = new Item(s.getKey(), "végül, végtére", "ultimately");
					Item item53 = new Item(s.getKey(), "kirándulni", "to go on a trip");
					Item item54 = new Item(s.getKey(), "benntlakásos iskola", "boarding school");
					Item item55 = new Item(s.getKey(), "előbb vagy utóbb", "sooner or later");
					Item item56 = new Item(s.getKey(), "mászni", "to claimb");
					Item item57 = new Item(s.getKey(), "honvágy", "homesick");
					Item item58 = new Item(s.getKey(), "megnézni a látnivalókat", "to see the sights");
					Item item59 = new Item(s.getKey(), "napfürdőzni", "to sunbath");
					Item item60 = new Item(s.getKey(), "tengeri étel", "seefood");					
					Item item61 = new Item(s.getKey(), "lélegzet", "breathe");
					Item item62 = new Item(s.getKey(), "galamb", "pigeon");
					Item item63 = new Item(s.getKey(), "élethű", "life-like");
					Item item64 = new Item(s.getKey(), "alak, forma", "shape");
					Item item65 = new Item(s.getKey(), "négyszögletes, négyzetes", "square");
					Item item66 = new Item(s.getKey(), "háromszög", "triangle");
					Item item67 = new Item(s.getKey(), "jellemvonás, sajátság", "feature");
					Item item68 = new Item(s.getKey(), "szobor", "sculpture");
					Item item69 = new Item(s.getKey(), "mentegetőzik", "to apologize");
					Item item70 = new Item(s.getKey(), "szórakoztató", "entertainer");
					Item item71 = new Item(s.getKey(), "kürt", "a bugle");
					Item item72 = new Item(s.getKey(), "battered", "ütött, kopott");
					Item item73 = new Item(s.getKey(), "észrevesz, meglát", "to spot");
					Item item74 = new Item(s.getKey(), "vízpart", "water-font");
					Item item75 = new Item(s.getKey(), "durva, kegyetlen", "rough");
					Item item76 = new Item(s.getKey(), "letelepít, elhelyez", "to settle");
					Item item77 = new Item(s.getKey(), "ököl", "fist");
					Item item78 = new Item(s.getKey(), "megvitat", "to dispute");
					Item item79 = new Item(s.getKey(), "futballpálya", "football field");
					Item item80 = new Item(s.getKey(), "vedő", "defender");
					Item item81 = new Item(s.getKey(), "támadó", "attacker");
					Item item82 = new Item(s.getKey(), "középpályás", "midfielder");
					Item item83 = new Item(s.getKey(), "bíró", "referee");
					Item item84 = new Item(s.getKey(), "bolondos", "fool-roof");
					Item item85 = new Item(s.getKey(), "egyenesen", "straight");
					Item item86 = new Item(s.getKey(), "pazar, klassz", "slap-up");
					Item item87 = new Item(s.getKey(), "elszenved, elvisel", "to suffer");
					Item item88 = new Item(s.getKey(), "infarktus", "heart attack");
					Item item89 = new Item(s.getKey(), "Mennyibe kerülnek ?", "How much do they cost ?");
					Item item90 = new Item(s.getKey(), "Mennyibe kerül ?", "How much is it ?");
					Item item91 = new Item(s.getKey(), "rúgni", "to kick");
					Item item92 = new Item(s.getKey(), "lovag", "knight");
					Item item93 = new Item(s.getKey(), "kopasz", "bald");
					Item item94 = new Item(s.getKey(), "göndör", "curly");
					Item item95 = new Item(s.getKey(), "paróka", "wig");				
					Item item96 = new Item(s.getKey(), "vadászat", "hunt");
					Item item97 = new Item(s.getKey(), "vidáman", "merrily");
					Item item98 = new Item(s.getKey(), "viaszbábuk", "waxwork figures");
					Item item99 = new Item(s.getKey(), "egál", "score draw");
					Item item100 = new Item(s.getKey(), "Az eredmény négy egál volt.", "The score was a four draw.");
					Item item101 = new Item(s.getKey(), "ugyanakkor, dehát", "however");
					Item item102 = new Item(s.getKey(), "majdnem", "nearly");
					Item item103 = new Item(s.getKey(), "hihetetlenül", "incredibly");
					Item item104 = new Item(s.getKey(), "valójában", "eventually");
					Item item105 = new Item(s.getKey(), "kémény", "chimney");
					Item item106 = new Item(s.getKey(), "hajlott", "bent");
					Item item107 = new Item(s.getKey(), "kötés", "bondage");
					Item item108 = new Item(s.getKey(), "ingadozni", "to sway");
					Item item109 = new Item(s.getKey(), "büdösnek lenni valamitől", "to stink, stank, stunk of");
					Item item110 = new Item(s.getKey(), "konnektor", "powerpoint");
					Item item111 = new Item(s.getKey(), "elkeseredetten, nagyon", "desperately");
					Item item112 = new Item(s.getKey(), "értékes, drága", "precious");
					Item item113 = new Item(s.getKey(), "szokásos, átlagos", "ordinary");
					Item item114 = new Item(s.getKey(), "ijesztő, rémisztő", "frightening");
					Item item115 = new Item(s.getKey(), "csokló", "wrist");
					Item item116 = new Item(s.getKey(), "betemet, betakar", "to cover in");
					Item item117 = new Item(s.getKey(), "sérülés, sérelem", "wound");
					Item item118 = new Item(s.getKey(), "gyógyít", "to heal");
					Item item119 = new Item(s.getKey(), "függöny", "curtain");
					Item item120 = new Item(s.getKey(), "fűtés", "heating");
					Item item121 = new Item(s.getKey(), "elindul, útnak indul", "to start off");

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
					pm.makePersistent(item94);
					pm.makePersistent(item95);
					pm.makePersistent(item96);
					pm.makePersistent(item97);
					pm.makePersistent(item98);
					pm.makePersistent(item99);
					pm.makePersistent(item100);
					pm.makePersistent(item101);
					pm.makePersistent(item102);
					pm.makePersistent(item103);
					pm.makePersistent(item104);
					pm.makePersistent(item105);
					pm.makePersistent(item106);
					pm.makePersistent(item107);
					pm.makePersistent(item108);
					pm.makePersistent(item109);
					pm.makePersistent(item110);
					pm.makePersistent(item111);
					pm.makePersistent(item112);
					pm.makePersistent(item113);
					pm.makePersistent(item114);
					pm.makePersistent(item115);
					pm.makePersistent(item116);
					pm.makePersistent(item117);
					pm.makePersistent(item118);
					pm.makePersistent(item119);
					pm.makePersistent(item120);
					pm.makePersistent(item121);

				}
			}
		}
	}
}
