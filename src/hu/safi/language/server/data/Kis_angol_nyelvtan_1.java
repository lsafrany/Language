package hu.safi.language.server.data;

import hu.safi.language.server.ServerConstants;
import hu.safi.language.server.jdo.Item;
import hu.safi.language.server.jdo.SubTheme;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class Kis_angol_nyelvtan_1 {

	public Kis_angol_nyelvtan_1(PersistenceManager pm) {
		super();

		Query querySubTheme = pm.newQuery("select from " + SubTheme.class.getName());
		@SuppressWarnings("unchecked")
		List<SubTheme> subThemeList = (List<SubTheme>) pm.newQuery(querySubTheme).execute();
		if (!subThemeList.isEmpty()) {
			for (SubTheme s : subThemeList) {
				if (s.getName().equals(ServerConstants.THEME2_SUBTHEME1)) {
					
					Item item1 = new Item(s.getKey(), "Mióta vársz magasabb életszínvonalra?",
							"How long have you been waiting for a higher standard of living?");
					Item item2 = new Item(s.getKey(), "Mióta próbálja visszaszerezni?",
							"How long has he been trying to get it back?");
					Item item3 = new Item(s.getKey(), "Mióta tervezik, hogy összeházasodnak?",
							"Since when have they been planning to get married?");
					Item item4 = new Item(s.getKey(), "6 éve vagyok nős/férjnél.", "I have been married for 6 years.");
					Item item5 = new Item(s.getKey(), "Első találkozásunk óta szeretlek.",
							"I have been in love with you since we first met.");
					Item item6 = new Item(s.getKey(), "Már öt perce boldog.", "She has been happy for 5 minutes.");
					Item item7 = new Item(s.getKey(), "1986 óta tanár.", "She has been a teacher since 1896.");
					Item item8 = new Item(s.getKey(), "27 éve katona.", "He has been a soldier for 27 years.");
					Item item9 = new Item(s.getKey(), "Meddig maradsz még Budapesten?", "How long areyou staying in Budapest?");
					Item item10 = new Item(s.getKey(), "Mióta vagy Budapesten?", "How long have you been staying in Budapest?");
					Item item11 = new Item(s.getKey(), "Nyár óta csak rád gondolok.", "I’ve been thinking of you since summer.");
					Item item12 = new Item(s.getKey(), "Már három hete dolgozom.", "I’ve been working for three weeks.");
					Item item13 = new Item(s.getKey(), "Tizennégy éves kora óta ír naplót.",
							"She’s been keeping a diary since she was fourteen.");
					Item item14 = new Item(s.getKey(), "Dél óta alszik.", "He has been sleeping since noon.");
					Item item15 = new Item(s.getKey(), "Már öt perce szól a telefon.",
							"The phone has been ringing for five minutes.");
					Item item16 = new Item(s.getKey(), "Azóta horkol, mióta kivették a manduláját.",
							"He has been snoring since his tonsils were removed.");
					Item item17 = new Item(s.getKey(), "Mióta tanítasz?", "How long have you been teaching?");
					Item item18 = new Item(s.getKey(), "Két napja nyüszög.", "He’s been whining for two days.");
					Item item19 = new Item(s.getKey(), "Tavaly óta cigarettázik.", "He has been smoking since last year.");
					Item item20 = new Item(s.getKey(), "Órák óta azt az egy halat eszi.", "She’s been eating that fish for hours.");
					Item item21 = new Item(s.getKey(), "Mióta miniszter lett, autóval jár.",
							"He has been travelling in a car since he became a minister.");
					Item item22 = new Item(s.getKey(), "Már egy hete csak a mamára gondolok.",
							"I’ve been thinking of mum for a week.");
					Item item23 = new Item(s.getKey(), "Ősz óta az öbölben úsznak a magányos hattyúk.",
							"The lonely swans have been floating in the bay since autumn/fall.");
					Item item24 = new Item(s.getKey(), "Mióta jár Jóska Gézával?", "How long has Joe been dating Géza?");
					Item item25 = new Item(s.getKey(), "Már egy hete csak a mamára gondolok.",
							"I've been thinking of Mum for a week now.");
					Item item26 = new Item(s.getKey(), "Még fél évig sem éltek együtt, mikor elváltak.",
							"They had been living together for less than half a year when they got divorced. ");
					Item item27 = new Item(s.getKey(), "Mióta megnosült, egész másképp viselkedik.",
							"Since she got married, she's been behaving rather differently.");
					Item item28 = new Item(s.getKey(), "Egész nap úgy hiányoztál.", "I've been missing you all day.");
					Item item29 = new Item(
							s.getKey(),
							"Te jó isten, mennyit ittál! Nyugi, anyukám, nem ittam többet, mint a Józsi, pedig o már tegnap elkezdte, és még most sem fejezte be.",
							"Oh, my God, you've been drinking a lot! Easy, mum, I haven't drunk more than Joe, mind you, he started it yesterday and hasn't finished it yet.");
					Item item30 = new Item(s.getKey(), "Három éve hordja azt a rongyos farmert.",
							"She's been wearing that shabby pair if jeans for three years.");
					Item item31 = new Item(s.getKey(), "Mióta megláttalak a bokrok alatt, csak rólad álmodom.",
							"I've been dreaming about you since I saw you under the bushes.");
					Item item32 = new Item(s.getKey(), "Mióta megérkezett a városba, a legdrágább szállodában lakik.",
							"Since he arrived in town, he has been living in the ritziest hotel.");
					Item item33 = new Item(s.getKey(), "Úgyhogy most három napja táncol.",
							"So now she's been dancing for three days.");
					Item item34 = new Item(s.getKey(), "Egy hete lakom a California szállodában.",
							"I've been living in the Hotel California for a week.");
					Item item35 = new Item(s.getKey(), "Már egy órája olvassa azt a kurta cikket.",
							"Ha has been reading that short article for an hour already.");
					Item item36 = new Item(s.getKey(), "Ablakot nyitottam.", "I have opened the window.");
					Item item37 = new Item(s.getKey(), "Megcsókolta (és most várandós).", "He has given her a kiss.");
					Item item38 = new Item(s.getKey(), "Lábát törte, így nem jöhet velem diszkózni.",
							"He has broken his leg he can’t come with me to the disco.");
					Item item39 = new Item(s.getKey(), "Jártam már Tótkomlóson.", "I have already been to Tótkomlós.");
					Item item40 = new Item(s.getKey(), "Háltam már lópokrócon.", "I’ve already slept on a horse blanket.");
					Item item41 = new Item(s.getKey(), "Még nem jártam Tótkomlóson.", "I haven’t been to Tótkomlós yet.");
					Item item42 = new Item(s.getKey(), "Még sosem háltam lópokrócon.", "I’ve never slept on a horse blanket.");
					Item item43 = new Item(s.getKey(), "Jártál te már Tótkomlóson?", "Have you ever been to Tótkomlós?");
					Item item44 = new Item(s.getKey(), "Háltál te már lópokrócon?", "Have you slept on a horse blanket yet?");
					Item item45 = new Item(s.getKey(), "Épp most jártam Tótkomlóson.", "I’ve just been to Tótkomlós.");
					Item item46 = new Item(s.getKey(), "Épp most háltam lópokrócon.", "I’ve just sleep on a horse blanket.");
					Item item47 = new Item(s.getKey(), "Ma reggel jártam Tótkomlósan.", "I’ve been to Tótkomlós this morning.");
					Item item48 = new Item(s.getKey(), "E héten háltam lópokrócon.", "I’ve slept on a horse blanket this week.");
					Item item49 = new Item(s.getKey(), "Végre már ezt is megtanultam.", "I have learnt it now.");
					Item item50 = new Item(s.getKey(), "De hisz ezt már tanultam.", "I have already learnt it.");
					Item item51 = new Item(s.getKey(), "Még nem tanultam meg.", "I haven’t learnt it yet.");
					Item item52 = new Item(s.getKey(), "Még mindig nem kérdeztem meg.", "I still haven’t asked him.");
					Item item53 = new Item(s.getKey(), "Épp most ment el hazulról.", "She has just left home.");
					Item item54 = new Item(s.getKey(), "Egész mostanáig boldogok voltunk.",
							"We have been very happy until recently.");
					Item item55 = new Item(s.getKey(), "Én még ilyet nem láttam!", "I haven’t seen anything like that.");
					Item item56 = new Item(s.getKey(), "Nem találkoztunk mi már valahol?", "Haven’t we met somewhere before?");
					Item item57 = new Item(s.getKey(), "Bocsánatot kértél már tole?", "Have you apologized to him yet?");
					Item item58 = new Item(s.getKey(), "Már olvastam.", "I’ve already read it.");
					Item item59 = new Item(s.getKey(), "Kicsit meghíztál, nem?", "You’ve put a bit weight on, haven’t you?");
					Item item60 = new Item(s.getKey(), "A kezét már megkérte, de még nem vette el.",
							"He’s already popped the question, but he hasn’t married yet.");
					Item item61 = new Item(s.getKey(), "Még sose féltem így.", "I’ve never been so scared.");
					Item item62 = new Item(s.getKey(), "Még mindig nem felelt.",
							"He hasn’t yet answered. (He still hasn’t answered.)");
					Item item63 = new Item(s.getKey(), "Elaludtál már?", "Have you gone to sleep yet?");
					Item item64 = new Item(s.getKey(), "Épp most dugta el.", "She’s just hidden it.");
					Item item65 = new Item(s.getKey(), "Évek óta nem ettem ilyen jó véreshurkát.",
							"I haven't eaten such good blood pudding for years.");
					Item item66 = new Item(
							s.getKey(),
							"A mai napig nem felejtettem el azt a szeptemberi estét, mikor eloször láttalak meg a szénakazal tövibe'.",
							"I haven't forgotten the night in September when I first saw you in the shade of the haybale.");
					Item item67 = new Item(s.getKey(), "Már 10 éve barátok.", "They've been friends for ten years.");
					Item item68 = new Item(s.getKey(), "Majd szólok, ha befejeztem.", "I'll tell you when I've finished.");
					Item item69 = new Item(s.getKey(), "Megkaptad már a pénzt?", "Have you received the money yet?");
					Item item70 = new Item(s.getKey(), "Kettőkor jöttek meg, de azóta se láttuk őket.",
							"They arrived at two we haven't seen them ever since.");
					Item item71 = new Item(s.getKey(), "Az összes húst bepaníroztad?",
							"Have you coated all the meat with breadcrumbs?");
					Item item72 = new Item(s.getKey(), "Nem találkoztunk mi már valahol?", "Haven't we met somewhere before?");
					Item item73 = new Item(s.getKey(), "Még soha nem volt ilyen fejfájásom.", "I've never had such a headache.");
					Item item74 = new Item(s.getKey(), "Láttál te már felnőtt férfit meztelen?",
							"Have you ever seen a brown man naked?");
					Item item75 = new Item(s.getKey(), "Megetted már amit tegnap főztem?",
							"Have you yet eaten what I cooked yesterday?");
					Item item76 = new Item(
							s.getKey(),
							"A cipőjét és a kabátját levette, az ingét épp most gombolja, de a fülbevalóját még nem kattintotta ki.",
							"She has taken off her shoes and coat, she's undoing her louse right now, but she hasn't unclipped her earrings yet.");
					Item item77 = new Item(s.getKey(), "Mondtam már neked, hogy ne szopd az ujjad!",
							"I've already told you not to suck your finger!");
					Item item78 = new Item(s.getKey(), "Megjavítottad már a csapot?", "Have you repaired the tap yet?");
					Item item79 = new Item(s.getKey(), "Elfogyott a cigarettám.", "I've run out of cigarettes.");
					Item item80 = new Item(s.getKey(), "Befejezted már?", "Have you finished yet?");
					Item item81 = new Item(s.getKey(),
							"Nem említettem még neked azt az estét, mikor véletlenül rossz buszra szálltam?",
							"Haven't I mentioned to you the case when I accidentally took the wrong bus?");
					Item item82 = new Item(
							s.getKey(),
							"Ugye még nem meséltem azokról az időkről, mikor kéz a kézben mentünk a Dózsa György úton május 1-jén?",
							"I haven't told you about the days when we were walking hand in hand on Dózsa György road on May Day, have I?");
					Item item83 = new Item(s.getKey(), "Felfújta a lufit, és az most akkora, mint egy ház.",
							"He has blown up the balloon and now it's as big as a house.");
					Item item84 = new Item(s.getKey(), "Most már befejeztem.", "I've finished it now.");
					Item item85 = new Item(
							s.getKey(),
							"Meglocsoltad már a feleséged? Ot még nem locsoltam meg, de a barátnomet már igen. Tegnap mentem hozzá és kaptam tole piros tojást. A feleségemtol piros tojást még nem kaptam, de a sodrófát már elovette. Még nem csapott a fejemre, de nagyon félek, mert tavaly úgy kupán vágott, hogy még most sem ment le a púp a fejemrol.",
							"Have you sprinkled your wife? No, I haven't, but I've already sprinkled my girlfriend. I went to her place yesterday and I got a red egg from her. I haven't got a red from my wife yet, but she has already produced the rolling pin. She hasn't yet hit me on the head but I'm scared because last year she hit me on the head so hard that the lump hasn't gone down from my head yet.");
					Item item86 = new Item(s.getKey(), "Ittam egy kis kólát, és most csuklok.",
							"I've drunk some coke and now I'm hiccuping.");
					Item item87 = new Item(s.getKey(), "Te csöngettél, Tasziló?", "Have you rung the bell, Tasziló?");
					Item item88 = new Item(s.getKey(), "A hullámvasúton már ültem, de az elvarázsolt kastélyban még nem voltam.",
							"I've already traveled on the roller coaster but I haven't been to the haunted castle.");
					Item item89 = new Item(s.getKey(), "Ivott egy pohár vodkát és most itt kacsázik az utcán.",
							"He has drunk a glass of vodka and now he's zigzagging in the street.");
					Item item90 = new Item(s.getKey(), "Még sosem volt ilyen szerencsém.", "I've never been so lucky.");
					Item item91 = new Item(s.getKey(), "Én még sohasem utaztam a szellemvasúton, soha sem láttam a nagy sárkányt.",
							"I have never ever traveled on the ghost train, I have never ever seen the large dragon.");
					Item item92 = new Item(s.getKey(), "Láttál te már mackót málnásban?",
							"Have you ever seen a bear in raspberries?");
					Item item93 = new Item(s.getKey(), "Sok kérdést már megoldottunk.", "We have solved a lot of problems.");
					Item item94 = new Item(s.getKey(), "Én még sose voltam férfivel.", "I've never been with a man before.");
					Item item95 = new Item(s.getKey(), "Sokszor voltam már ideges.", "I've been nervous lots of times.");
					Item item96 = new Item(s.getKey(), "Szakítottam Józsival.", "Me and Joe have had a bust up.");
					Item item97 = new Item(s.getKey(), "Olvastad már?", "Have you read it yet?");
					Item item98 = new Item(s.getKey(), "Amikor majd elolvasod, légyszives add ide.",
							"When you've read it, please give it to me.");
					Item item99 = new Item(s.getKey(), "Amikor befejezi, összesen hat napja fog táncolni.",
							"When she has finished, she'll have been dancing for six days altogether.");
					Item item100 = new Item(s.getKey(), "Ugye milyen sokat javult az életszínvonaluk? De idétlen vagy.",
							"Our living standard has improved greatly, hasn't it? How stupid can you get!");
					Item item101 = new Item(s.getKey(), "Épp TV-t név.", "He is watching TV now.");
					Item item102 = new Item(s.getKey(), "Most áll, vagy ül?", "Is she sitting or standing?");
					Item item103 = new Item(s.getKey(), "Általában 7-kor kel, de e héten 8-kor.",
							"He usually gets up at 7, but this week he is getting up at 8.");
					Item item104 = new Item(s.getKey(), "Általában Camparit iszik, de ma este kevertet.",
							"She generally drinks Campari, but this evening she is drinking “kevert”.");
					Item item105 = new Item(s.getKey(), "Állandóan ezt a hülye disco-lemezt hallgatja!",
							"He is always listening to that stupid disco record!");
					Item item106 = new Item(s.getKey(), "Állandóan hazudsz!", "You are always telling me lies!");
					Item item107 = new Item(s.getKey(), "Most már tudom.", "Now I know.");
					Item item108 = new Item(s.getKey(), "Áh, most már emlékszem.", "Oh, now I remember.");
					Item item109 = new Item(s.getKey(), "Holnap este színházba megyek.",
							"I am going to the theatre tomorrow night.");
					Item item110 = new Item(s.getKey(), "Mit csinálsz?", "What are you doing?");
					Item item111 = new Item(s.getKey(), "Hova mész?", "Where are you going?");
					Item item112 = new Item(s.getKey(), "Most hülyéskedsz?", "Are you kidding?");
					Item item113 = new Item(s.getKey(), "Hull az elsárgult levél.", "The yellow leaves are falling.");
					Item item114 = new Item(s.getKey(), "Almát eszem.", "I’m eating an apple.");
					Item item115 = new Item(s.getKey(), "Ülök egy rózsaszínu kádban.", "I’m sitting in a pink bathtub.");
					Item item116 = new Item(s.getKey(), "Majd holnap kimegyek a piacra.", "I’m going to market tomorrow.");
					Item item117 = new Item(s.getKey(), "Állandóan csapkodja az ajtót.", "He is always slamming the door.");
					Item item118 = new Item(s.getKey(), "Sírok.", "I am crying.");
					Item item119 = new Item(s.getKey(), "Írok.", "I am writing.");
					Item item120 = new Item(s.getKey(), "Most épp nem írok, nem olvasok.", "I’m not writing or reading.");
					Item item121 = new Item(s.getKey(), "Gondolkodom.", "I’m thinking.");
					Item item122 = new Item(s.getKey(), "A buszra várok.", "I’m waiting for the bus.");
					Item item123 = new Item(s.getKey(), "Csöng a telefon.", "The phone’s ringing.");
					Item item124 = new Item(s.getKey(), "Ez kezd bedilizni.", "He’s cracking up.");
					Item item125 = new Item(s.getKey(), "Kati holnap jön át.", "Kate is coming round tomorrow.");
					Item item126 = new Item(s.getKey(), "Állandóan vitatkoznak.", "They’re always arguing.");
					Item item127 = new Item(s.getKey(), "Lehúnyja kék szemét az ég.", "The sky is closing its blue eyes.");
					Item item128 = new Item(s.getKey(), "Alszik a széken a kabát.", "The coat is sleeping on the chair.");
					Item item129 = new Item(s.getKey(), "Hé, mit csinálsz te itt?", "Hey, what are you doing here?");
					Item item130 = new Item(s.getKey(), "Ezen a tavaszon fogok férjhez menni.",
							"I'm going to get married this spring.");
					Item item131 = new Item(s.getKey(), "Itt ül az ido a nyakamon.", "Time is sitting on my neck.");
					Item item132 = new Item(s.getKey(), "Nincs hozzászokva ahhoz, hogy busszal járjon a piacra.",
							"She is not used to going to the market by bus.");
					Item item133 = new Item(s.getKey(), "Ezt a sört most megiszom.", "I'm going to drink this beer now.");
					Item item134 = new Item(s.getKey(), "Most épp nem alszik.", "She's not sleeping right now.");
					Item item135 = new Item(s.getKey(), "Hová mész te kisnyulacska?", "Where are you going bunny?");
					Item item136 = new Item(s.getKey(), "Ballag a katona, szájában csutora.",
							"The GI is trudging with a mouthpiece in his mouth.");
					Item item137 = new Item(s.getKey(), "Apu, mit csinál a kutya a fánál?",
							"Daddy, what's the dog doing by the tree?");
					Item item138 = new Item(s.getKey(), "Állandóan újságot olvas reggeli közben.",
							"He is always reading a paper during breakfast.");
					Item item139 = new Item(s.getKey(), "Hu de köhögsz. Csak nem fáztál meg?",
							"Hey, you are coughing a lot. I hope you haven't caught a cold.");
					Item item140 = new Item(s.getKey(), "Hegyek között, völgyek között zakatol a vonat.",
							"The train is rattling along between mountains and valleys.");
					Item item141 = new Item(s.getKey(), "Csörög a lánc. Mi? Csörög a lánc. Nem hallom, mert csörög a lánc.",
							"The chain is rattling! What? The chain is rattling! I can't hear you because the chain is rattling.");
					Item item142 = new Item(s.getKey(), "Mit sütsz kis szucs? Sós húst sütsz kis szucs?",
							"What are you frying little furrier? Are you frying salty meat, furrier? ");
					Item item143 = new Item(s.getKey(), "Süt a pék, süt a pék gezemice lángost.",
							"The baker is frying, the baker is frying hotchpotch dough.");
					Item item144 = new Item(s.getKey(), "Perceg a szú.", "The woodworm is ticking away.");
					Item item145 = new Item(s.getKey(), "Állandóan csapkodja az ajtót.", "He is always slamming the door.");
					Item item146 = new Item(s.getKey(), "Egy fekete macska ül a fogason.", "A black cat is sitting on the rack.");
					Item item147 = new Item(s.getKey(), "Ezért megfizetsz!", "You're going to pay for this.");
					Item item148 = new Item(s.getKey(), "Hull az elsárgult levél.", "The yellow leaves are falling.");
					Item item149 = new Item(s.getKey(), "Hol lesz a hétvégi buli?", "Where's the party gonna be this weekend?");
					Item item150 = new Item(s.getKey(), "Melyik horkol?", "Which one is snoring?");
					Item item151 = new Item(s.getKey(), "Idáig vagyok az üzleti problémáiddal.",
							"I'm having to here with your business problems.");
					Item item152 = new Item(s.getKey(), "Londonban üzletel.", "He's doing some deal in London now.");
					Item item153 = new Item(s.getKey(), "Halálra untatsz.", "You're boring me stiff.");
					Item item154 = new Item(s.getKey(), "Most is olvas.", "He's reading right now.");
					Item item155 = new Item(s.getKey(), "Csakazértis el fogom olvasni.", "I'm going to read it.");
					Item item156 = new Item(s.getKey(), "Gyakran megyünk moziba.", "We often go to the cinema.");
					Item item157 = new Item(s.getKey(), "Az állatok sosem ölnek pénzért.",
							"Animals never kill each other for money.");
					Item item158 = new Item(s.getKey(), "Éjfélkor szokott lefeküdni.", "She usually goes to bed at midnight.");
					Item item159 = new Item(s.getKey(), "A Nap keleten kel.", "The sun rises in the East.");
					Item item160 = new Item(s.getKey(), "Szeretlek.", "I love you.");
					Item item161 = new Item(s.getKey(), "Utálom az esot.", "I hate rain.");
					Item item162 = new Item(s.getKey(), "Itt jön a Nap.", "Here comes the sun. (Beatles)");
					Item item163 = new Item(s.getKey(), "Ott megy az álmunk.", "There goes our dream.");
					Item item164 = new Item(s.getKey(), "Ismerlek.", "I know you.");
					Item item165 = new Item(s.getKey(), "Szabad akarok lenni.", "I want to break free.");
					Item item166 = new Item(s.getKey(), "Érted?", "Do you understand?");
					Item item167 = new Item(s.getKey(), "Mindenre emlékszem.", "I remember everything.");
					Item item168 = new Item(s.getKey(), "Azt hiszem igazad van.", "I think you are right.");
					Item item169 = new Item(s.getKey(), "Remélem érted a könyvet.", "I hope you see through the book.");
					Item item170 = new Item(s.getKey(), "Úgy értem, hogy pénteken nem érek rá.", "I mean I’m busy on Friday.");
					Item item171 = new Item(s.getKey(), "Úgy tudom ruhákat ad és vesz.", "I believe you buy and sell clothes.");
					Item item172 = new Item(s.getKey(), "Éjjel nappal rád gondolok.", "I think about you night and day.");
					Item item173 = new Item(s.getKey(), "Korán szoktam kelni.", "I usually get up early.");
					Item item174 = new Item(s.getKey(), "Néha nyolcig alszik.", "Sometimes she sleeps until eight.");
					Item item175 = new Item(s.getKey(), "Tetszem neked?", "Do you like me?");
					Item item176 = new Item(s.getKey(), "Nem ízlik a leves.", "I don’t like the soup.");
					Item item177 = new Item(s.getKey(), "Soha nem segít.", "She never helps me.");
					Item item178 = new Item(s.getKey(), "Minden nap felkel a Nap.", "The sun rises every day.");
					Item item179 = new Item(s.getKey(), "Futni szoktam, de úszni nem járok.",
							"I usually go running but I never go swimming.");
					Item item180 = new Item(s.getKey(), "Én nem golfozom.", "I never play golf.");
					Item item181 = new Item(s.getKey(), "Minden este fest.", "She paints every evening.");
					Item item182 = new Item(s.getKey(), "Utálom a birkahúst.", "I hate mutton.");
					Item item183 = new Item(s.getKey(), "Ritkán sír, de gyakran nevet.", "She seldom cries but often laughs.");
					Item item184 = new Item(s.getKey(), "Remélem jól vagy.", "I hope you are fine.");
					Item item185 = new Item(s.getKey(), "Itt jön.", "Here he comes.");
					Item item186 = new Item(s.getKey(), "Szeretlek.", "I love you.");
					Item item187 = new Item(s.getKey(), "Hányszor mosol naponta fogat?",
							"How many times a day do you clean your teeth?");
					Item item188 = new Item(s.getKey(), "Józsi bácsi már nem dolgozik itt.",
							"Józsi bácsi doesn't work here anymore.");
					Item item189 = new Item(s.getKey(), "Malacka minden nap meglátogatja Micimackót.",
							"Piglet goes to see Winnie-the-Pooh every day.");
					Item item190 = new Item(s.getKey(), "Hol élsz te?", "Where do you live?");
					Item item191 = new Item(s.getKey(), "Te kinek drukkolsz?", "Who do you support?");
					Item item192 = new Item(s.getKey(), "Mindig este zuhanyozok, mert reggel rohanok.",
							"I always take a shower in the evening because in the morning I'm in a hurry.");
					Item item193 = new Item(s.getKey(), "Szereted a mézet?", "Do you like honey?");
					Item item194 = new Item(s.getKey(), "Szeretsz még, mondd?", "Tell me, do you still love me?");
					Item item195 = new Item(s.getKey(), "Érted?", "Do you understand?");
					Item item196 = new Item(s.getKey(), "Azt hiszem, én értem.", "I think I understand.");
					Item item197 = new Item(s.getKey(), "Milyen nap van ma?", "What day is today?");
					Item item198 = new Item(s.getKey(), "Minden kártya nálad van.", "You hold every card.");
					Item item199 = new Item(s.getKey(), "Mindig azt mondod, hogy visszafogott vagyok.",
							"You always say I'm too reserved.");
					Item item200 = new Item(s.getKey(), "Sose olvas.", "He never reads.");
					Item item201 = new Item(s.getKey(), "Néha olvas.", "Sometimes he reads.");
					Item item202 = new Item(s.getKey(), "Minden este étteremben vacsorázik.",
							"He has dinner in a restaurant every evening.");
					Item item203 = new Item(s.getKey(), "Mikor felébredtem, már 10 perce ment a vonat.",
							"When I woke up, the train had been going for ten minutes.");
					Item item204 = new Item(s.getKey(), "Mikor a sarokra értem, a lány már 20 perce ott várt.",
							"When I got to the corner, the girl had been waiting for twenty minutes. ");
					Item item205 = new Item(s.getKey(), "Már tíz perce gépelt, mikor látta, hogy nincs papír a gépben.",
							"He had been typing for ten minutes when he saw there was no sheet in the typewriter. ");
					Item item206 = new Item(s.getKey(), "Mikor felébredt, a kakas már fél órája kukorékolt.",
							"When he woke up, the cock had been crowing for half an hour.");
					Item item207 = new Item(s.getKey(), "Még csak öt perce ettek, mikor újabb vendégek érkeztek.",
							"They had only been eating for five minutes when more guests arrived.");
					Item item208 = new Item(s.getKey(), "Már egy órája ugatott a kutya, mikor végre kiment.",
							"The dog had been barking for an hour when at least he went out.");
					Item item209 = new Item(s.getKey(), "Nagy elánnal bontotta a csirkét, amikor rájött, hogy nincs otthon zsír.",
							"She had been easily carving up the chicken when she realized there was no lard at home.");
					Item item210 = new Item(s.getKey(), "Órák hosszat ült a rókalyuk elott, mikor végre feltunt egy nyuszi.",
							"He had been sitting at the fox-hole for hours when at least a hare/rabbit/bunny showed up.");
					Item item211 = new Item(s.getKey(),
							"Még tíz percet sem vezetett a forgalomban, mikor a vizsgabiztos megkérte, hogy cseréljenek helyet.",
							"She had been driving in the traffic for less than 10 minutes when the examiner asked her to change seats.");
					Item item212 = new Item(s.getKey(), "Már vagy három órája nyomta a csengot, mikor a házmester végre kinézett.",
							"He had been ringing the bell for three hours when the caretaker looked out at last.");
					Item item213 = new Item(s.getKey(), "Már két órája beszélt, mikor rájött, hogy senki nincs a szobában.",
							"She had been talking for two hours when she realized there was nobody in the room.");
					Item item214 = new Item(s.getKey(), "Magas lovon ült, mielott lebukott.",
							"He had been riding high before he had a fall.");
					Item item215 = new Item(s.getKey(), "Tegnap már két napja táncolt.",
							"Yesterday she had been dancing for two days.");
					Item item216 = new Item(s.getKey(), "Csak olvasta, olvasta, mikor látta, hogy fejjel lefelé van.",
							"He had been reading and reading when he saw it was upside down.");
					Item item217 = new Item(s.getKey(), "Mire kiért az állomásra, a vonat már elment.",
							"By the he got to the station, the train had already left.");
					Item item218 = new Item(s.getKey(), "Mire rájöttem, hogy szélhámos, már összetört a szívem.",
							"When I realized she was a swindler, she had already broken my heart.");
					Item item219 = new Item(s.getKey(), "Dühös voltam rá, mert elfelejtete föladni a levelet.",
							"I was angry with him because he had forgotten to post the letter.");
					Item item220 = new Item(s.getKey(), "Mire a vadász megtöltötte a pukáját, a nyuszi már elszaladt.",
							"By the time the hunter had loaded his gun, the hare had already run away.");
					Item item221 = new Item(s.getKey(), "Mielott elszaladt, sárgarépát dugott a puska csövébe.",
							"Before she run away she had put a carrot into the muzzle of the rifle.");
					Item item222 = new Item(s.getKey(), "Már rég megsavanyodott a túró rudi, mire rászánta magát, hogy megegye. ",
							"CCR (Cottage Cheese Rudolph) had gone sour long before he brought himself to eat it.");
					Item item223 = new Item(s.getKey(), "Miután megette, rosszul lett.", "After he had eaten it, he got sick.");
					Item item224 = new Item(s.getKey(), "Egész tavaly nyárig Mehemed nem is látott tehenet.",
							"Until the very last summer Mehemed hadn’t even seen a cow.");
					Item item225 = new Item(s.getKey(), "Mesélt a lovakról, akiket lovászfiú korából ismert.",
							"He droned on about horses he had known when he was an ostler.");
					Item item226 = new Item(s.getKey(), "Pipa volt, mikor látta, hogy nem hoztam kenyeret.",
							"She went mad when she saw I hadn’t brought bread.");
					Item item227 = new Item(s.getKey(), "Megoszültem, mire ezt megírtam.",
							"My hair had turned grey by the time I wrote this.");
					Item item228 = new Item(s.getKey(), "Jól megrágta, mielott kiköpte.",
							"He had chewed it well before he spat it out.");
					Item item229 = new Item(s.getKey(), "Nem látott semmit, míg fel nem rakta a szemüvegét.",
							"He hadn't seen a thing until he put on his glasses.");
					Item item230 = new Item(s.getKey(), "Korán lefeküdt, így aztán hazaért nyolcra.",
							"She had gone to bed early, so she got home by eight.");
					Item item231 = new Item(s.getKey(), "A nap is lement mire elolvastad.",
							"The sun had set by the time you read it.");
					Item item232 = new Item(s.getKey(), "Épp egy dalt dúdoltam, mikor a gyerekek betörték az ablakot.",
							"I was singing a song when the children broke the window.");
					Item item233 = new Item(s.getKey(), "A lámpát szerelte, mikor agyonvágta az áram.",
							"He was repairing the electricity when a short circuit killed him.");
					Item item234 = new Item(s.getKey(), "Épp sütotököket ettünk, mikor lazán megszólalt:…",
							"We were eating pumpkin pie when he casually said…");
					Item item235 = new Item(s.getKey(), "Aludtál az eloadás alatt?", "Were you sleeping during the show?");
					Item item236 = new Item(s.getKey(), "Miközben golfozott, a száját harapdálta.",
							"While he was playing golf, he was biting his lips.");
					Item item237 = new Item(s.getKey(), "Fél nyolckor nem a hiradót nézte, hanem a fiát fürdette.",
							"At seven-thirty he was not watching the news but he was bathing his son.");
					Item item238 = new Item(s.getKey(), "Sokáig tartotta Toldi Miklós a petrencét.",
							"T.M. was holding the hay shaft for a long time.");
					Item item239 = new Item(s.getKey(), "Útközben a lányokról beszélgettek.",
							"On the way they were talking about girls.");
					Item item240 = new Item(s.getKey(), "Épp krumpliért állt sorba, mikor meglátta a karfiolfülüt.",
							"She was queuing for potatoes when she saw the one with cauliflower ears.");
					Item item241 = new Item(s.getKey(), "Végig a film alatt a hátát vakargatta.",
							"She was scratching his back during the whole film.");
					Item item242 = new Item(s.getKey(), "Még éjfélkor is a mesét nézte.",
							"He was watching the tale even at midnight.");
					Item item243 = new Item(s.getKey(),
							"Míg a nyuszi magyarázott, Micimackó mézre gondolt, Malacka a földet nézte, Bagoly meg a haját tépte.",
							"Whlie Rabbit was explaining, Winnie-the-Pooh was thinking of honey, Piglet was staring at ground, and Owl was tearing his hair.");
					Item item244 = new Item(s.getKey(), "Egész úton hazafelé azon gondolkodám…", "All my way home I was wondering…");
					Item item245 = new Item(s.getKey(), "Amíg a lányok csevegtek, addig a fiúk a bányában dolgoztak.",
							"While the girls were chatting, the boys were working in the colliery.");
					Item item246 = new Item(s.getKey(), "A rakodópart alsó kövén ültem, és néztem, hogy úszik a dinnyehéj.",
							"I was sitting on the lower stone of the quay watching the melon rind foating.");
					Item item247 = new Item(s.getKey(), "Nagyon esett, mikor leszálltál a buszról?",
							"Was it pouring when you got off the bus?");
					Item item248 = new Item(s.getKey(), "Egész este dünnyögött.", "He was mumbling all evening.");
					Item item249 = new Item(s.getKey(), "Épp az utcán sétáltam, mikor a baleset történt.",
							"I was walking in the street when the accident happened.");
					Item item250 = new Item(s.getKey(), "Meredten bámult a távolba, mikor egyszercsak megpillantotta Aljosát.",
							"She was staring into space when out of a sudden she caught sight of Aliosha.");
					Item item251 = new Item(
							s.getKey(),
							"A bártündér a villanyokat oltogatta, a lány a fogasnál állt, mikor egy fiatal rendor lépett be a hátsó ajtón át.",
							"The bartender was putting out the lights, the girl was standing by the clothes tree, when a young cop entered the back door.");
					Item item252 = new Item(s.getKey(), "Az istálló hátsó részében tehenek aludtak szalmán. ",
							"At the far side of the barn cows were sleeping on straw.");
					Item item253 = new Item(
							s.getKey(),
							"Szóval borotválkozott, megcsúszott és levágta az orrát. Aztán elejtette a borotvát és levágta a lába ujját. Az orvos elszúrt valamit és a lábujját varrta az arcára, az orrát meg a lábára, és most azért reklamál, mert amikor tüsszent, mindig lerepül a cipoje. ",
							"So, you were shaving, you slipped and cut your nose off. Then you dropped the razor and cut your off. The doctor made a mistake and he sewed your toe onto your face and your nose onto your foot, and now you complain that every time you sneeze you blow your shoe off.");
					Item item254 = new Item(s.getKey(), "Az egyikük a könyvet tartotta, a másik meg olvasott.",
							"One of them was holding the book, the other one was reading.");
					Item item255 = new Item(s.getKey(), "Ki ment el az orvoshoz?", "Who went to see the doctor?");
					Item item256 = new Item(s.getKey(), "Melyik orvos vett R.R.-t?", "Which doctor bought a Rolls Royce?");
					Item item257 = new Item(s.getKey(), "Mi robbant fel?", "What blew up?");
					Item item258 = new Item(s.getKey(), "Mikor láttad utoljára?", "When did you last see her?");
					Item item259 = new Item(s.getKey(), "Tegnap is késon jött haza.", "Yesterday she came home late again.");
					Item item260 = new Item(s.getKey(), "1950-ben lépett be a pártba.", "He joined the party in 1950.");
					Item item261 = new Item(s.getKey(), "Egy éve még taxisofor volt.", "A year ago he was still a cab driver.");
					Item item262 = new Item(s.getKey(), "Hörcsögöt kapott a születésnapjára.", "He got a hamster for his birthday.");
					Item item263 = new Item(s.getKey(), "Ki ölte meg Marilyn Monroe-t?", "Who killed Norma Jane?");
					Item item264 = new Item(s.getKey(), "Eloször Csorvásra ment, aztán meg kardoskútra.",
							"First he went to Csorvás, then to Kardoskút.");
					Item item265 = new Item(s.getKey(), "Te is vidéken nottél fel?", "Did you also grow up in the provinces.");
					Item item266 = new Item(s.getKey(), "Ezt a céklát még júniusban raktam el.",
							"I pickeled this beetroot in June.");
					Item item267 = new Item(s.getKey(), "Én nem jártam iskolába.", "I never went to school.");
					Item item268 = new Item(s.getKey(), "Kelt a legény, felöltözött,", "Up he rose and donn’d his clothes,");
					Item item269 = new Item(s.getKey(), "Ajtót nyitott neki,", "Dopp’d the chamber door,");
					Item item270 = new Item(s.getKey(), "Bement a lány, de mint leány,", "Let in the maid, that out a maid");
					Item item271 = new Item(s.getKey(), "Többé nem jöve ki. (Arany János)", "Never departed more. (Shakespeare)");
					Item item272 = new Item(s.getKey(),
							"Ránézett a lányra, kacsintott, búcsút intett neki, aztán belépett a liftaknába.",
							"He looked at the girl, winked at her, waved good bye and stepped into the lift shaft.");
					Item item273 = new Item(s.getKey(), "Belépett a szobába. De elotte lezuhanyozott.",
							"He entered the room. But he had taken a shower before.");
					Item item274 = new Item(s.getKey(),
							"Amikor én még kissrác voltam, minden nap elmentem meglesni a lányokat a munkásszállás fürdojében.",
							"When I was a little boy I used to go and see girls in the bath of the workers' hostel every day.");
					Item item275 = new Item(s.getKey(),
							"Ez elment vadászni, ez meglotte, ez hazavitte, ez megsütötte, ez az iciripiciri meg mind megette.",
							"This one went hunting, this one shot it, this one took it home, this one fried it and this teeny weenie one ate it.");
					Item item276 = new Item(s.getKey(), "Mikor meglátta az egeret, felugrott egy székre.",
							"When she saw the mouse she jumped on a chair.");
					Item item277 = new Item(s.getKey(), "Hol születtél?", "Where were you born?");
					Item item278 = new Item(s.getKey(), "Lenin élt, Lenin él, Lenin élni fog.",
							"Lenin lived, Lenin lives, Lenin will live.");
					Item item279 = new Item(s.getKey(), "Szerencse, hogy tegnap nem fájt a fejem.",
							"Luckely enough, I didn't have a headache yesterday.");
					Item item280 = new Item(s.getKey(), "Mire megtalálta az anyát, eltunt a csavar.",
							"By the time he found the nut, the bolt had disappeared.");
					Item item281 = new Item(s.getKey(),
							"Megitta a tejet, megette a kakaóscsigát, megköszönte a reggelit és bement a szobájába.",
							"He drank the milk, ate the cocoa snail, thanked for the breakfast and went into his room.");
					Item item282 = new Item(s.getKey(), "Hétkor találkoztunk a Nemzetinél.",
							"We met at the National Theatre at seven.");
					Item item283 = new Item(s.getKey(), "Nyáreste volt, pacsirta szólt a fán, ott kóborolt egy cigány.",
							"It was a summer night, there was a lark singing in the tree and a gypsy roaming about.");
					Item item284 = new Item(s.getKey(), "Félt, hogy felébresztett valakit az ordibálásával.",
							"He was afraid he had awaked someone with his shout.");
					Item item285 = new Item(s.getKey(), "Úgy megcsókolt, ahogy, soha senki azelott.",
							"She kissed me in a way I had never been kissed before.");
					Item item286 = new Item(s.getKey(), "Piroska karjára akasztotta a kosarat, amit a nagymamája font.",
							"Little Red Riding Hood put the basket on her arm that her grandma had woven.");
					Item item287 = new Item(s.getKey(),
							"Olyan nehézségekkel találtam szembe magam, amilyeneket azelott nem tapasztaltam.",
							"I met with difficulties I had never met before.");
					Item item288 = new Item(s.getKey(), "A bíró az ujjával fütyült, mert elfelejtette elhozni a sípját.",
							"The referee used his fingers to whistle, because he had forgotten to take his whistle.");
					Item item289 = new Item(s.getKey(), "Tegnap robbant le.", "It broke down yesterday.");
					Item item290 = new Item(s.getKey(), "Tegnap se olvastad el.", "You didn't read it yesterday.");
					Item item291 = new Item(s.getKey(), "Jövore lesz négy éve, hogy Tengizben dolgozik.",
							"Next he’ll have been working in Tengiz for four years.");
					Item item292 = new Item(s.getKey(), "Tiz perc múlva tiz perce lesz, hogy tizóraizik.",
							"In ten minutes he will have been eating his elevenses for ten minutes.");
					Item item293 = new Item(s.getKey(), "Egy óra múlva fél órája fog takaritani.",
							"In an hour she will have been doing the rooms for half an hour.");
					Item item294 = new Item(s.getKey(), "Majd ha lemegy a nap, egy napja lesz, hogy napozik.",
							"When the sun sets she will have been lying in the sun for a day.");
					Item item295 = new Item(s.getKey(), "Mikor feljön a nap, fél napja lesz, hogy alszik.",
							"When the sun rises he will have been sleeping for half a day.");
					Item item296 = new Item(s.getKey(), "Jövo ilyenkor lesz két éve, hogy épiti a házát.",
							"This time next year he will have been building his house for 2 years.");
					Item item297 = new Item(s.getKey(), "Holnap lesz egy éve, hogy csöpög a csap.",
							"Tomorrow the tap will have been dripping for a year.");
					Item item298 = new Item(s.getKey(), "Még egy perc, és pont félórája lesz, hogy itt ordibálsz.",
							"One more minute and you’ll have been yelling here for half an hour.");
					Item item299 = new Item(s.getKey(), "A hónap utolsó vasárnapján lesz egy éve, hogy önmagát keresi.",
							"On the last Sunday of the month he’ll have been looking for himself for a year.");
					Item item300 = new Item(
							s.getKey(),
							"Holnap háromkor? Nem, akkor épp a fogorvosnál fog ülni. Ötkor? Nem, akkor épp a fogát fogja borogatni. Úgy érted, hogy hétkor? Nem, akkor már aludni fog. Ja, hogy tegnap hétkor? Nem, akkor vasalt. Tegnapelott hétkor? Akkor meg mosott. Hogy most? Most itt ül mellettem és kuncog.",
							"At three tomorrow? No, then he'll be sitting at the dentist's. At five? No, at that time he'll be having a cold compress on his tooth. You mean at seven? No, he'll be sleeping then. You mean at seven yesterday? No, he was ironing then. At seven the day before yesterday? He was washing then. You mean now? Now, he is sitting next to me and tittering.");
					Item item301 = new Item(s.getKey(), "Vasárnap már három napja lesz, hogy táncol.",
							"On Sunday she'll have been dancing for three days.");
					Item item302 = new Item(s.getKey(), "Kedden lesz egy hete, hogy olvassa.",
							"On Tuesday he'll have been reading it for a week.");
					Item item303 = new Item(s.getKey(), "Holnap reggel négyre az összes gyümölcsöt kiszállitják a piacra.",
							"All the fruit will have been delivered to the market by 4 next morning.");
					Item item304 = new Item(s.getKey(), "Holnap 6-ra a gép már leszáll (leszállt).",
							"The plan will have landed by 6 tomorrow.");
					Item item305 = new Item(s.getKey(), "Mire új gyertyát gyújtasz, a többi már leég. (leégett).",
							"By the time you light a new candle, the other ones will have burnt down.");
					Item item306 = new Item(s.getKey(), "Majd délutánra megirom.", "I’ll have written it by this afternoon.");
					Item item307 = new Item(s.getKey(), "Mire hármat számolsz, megcsinálom.",
							"By the time you count up to three, I’ll have done it.");
					Item item308 = new Item(s.getKey(), "Mire megvénülünk, megspórolunk annyit, hogy legyen egy lakásunk.",
							"By the time we get old, we’ll have saved up enough money to buy a flat.");
					Item item309 = new Item(s.getKey(), "Mire fölébredsz, az összes poharat elmosogatom.",
							"By the time you wake up, I’ll have washed up all the glasses.");
					Item item310 = new Item(s.getKey(), "Szeptember végére kinyilnak a kerti virágok.",
							"By the end of September the flowers in the garden will have blossomed.");
					Item item311 = new Item(s.getKey(), "Holnap délutánra fogja megtalpalni a cipomet.",
							"He will have soled my shoes by tomorrow afternoon.");
					Item item312 = new Item(s.getKey(), "Tizenegyre legépelem.", "I’ll have typed it by eleven.");
					Item item313 = new Item(s.getKey(), "Jövore lesz 15 éve, hogy nos vagyok.",
							"Next year I'll have been married for 15 years.");
					Item item314 = new Item(s.getKey(), "Megcsinálod mire visszajövök?",
							"Will you have done it by the time I return?");
					Item item315 = new Item(s.getKey(), "Holnap lesz egy hete, hogy sztrájkolnak.",
							"Tomorrow they'll have been on strike for a week.");
					Item item316 = new Item(s.getKey(), "Mire a végére érsz, el fogod felejteni az elejét.",
							"By the time you get to the end, you'll have forgotten the beginning.");
					Item item317 = new Item(s.getKey(), "Mire kisül a hús, kihül a krumpli.",
							"By the time the meat fries, the chips will have got cold.");
					Item item318 = new Item(s.getKey(), "Holnap lesz egy hete, hogy nem mos lábat.",
							"Tomorrow he won't have washed his feet for a week.");
					Item item319 = new Item(s.getKey(), "Úgyis elfelejti az elso részét mire végigolvassa.",
							"He will have forgotten the first part by the time he reads it.");
					Item item320 = new Item(s.getKey(), "Most volt a hirekben, hogy egész jövo héten esni fog.",
							"It has just been on the news that it will be raining all next week.");
					Item item321 = new Item(s.getKey(), "Vasalás közben TV-t fogok nézni.", "I’ll be watching TV while ironong.");
					Item item322 = new Item(s.getKey(), "TV nézés közben vasalni fogok.", "I’ll be ironing while watching TV.");
					Item item323 = new Item(s.getKey(), "Amig én vasalok, Mari néni foltozni fogja a farmeremet.",
							"While I’m ironing, Mari néni will be sewing a patch on my jeans.");
					Item item324 = new Item(s.getKey(), "Holnap este tizkor a házunk fölött fog elrepülni.",
							"At 10 tomorrow night she’ll be flying over our house.");
					Item item325 = new Item(s.getKey(), "Jövo ilyenkor már a kisbabáját fogja tolni.",
							"This time next year she will be pushing her baby carriage.");
					Item item326 = new Item(s.getKey(),
							"Jövo ilyenkor nem a Leninkörúton, hanem az Erzsébet körúton fogja tolni a babakocsit.",
							"This time next year she will be pushing the baby carriage on Erzsébet boulevard and not on Lenin Boulevard.");
					Item item327 = new Item(s.getKey(), "Egész délután próbálni fognak.", "They’ll be rehearsing all afternoon.");
					Item item328 = new Item(s.getKey(), "Kopogj, ha jössz, mert a fényképeket fogom elohivni.",
							"Knock when you come, because I’ll be developing the photos.");
					Item item329 = new Item(s.getKey(),
							"A tervek szerint, amikor belép a polgármester, a kórus épp a refrént fogja énekelni.",
							"According to the plans the chorus will be singing the refrain when the Mayor enters.");
					Item item330 = new Item(s.getKey(),
							"Lefogadom, hogy akkor is olvasni fog, ha néger gyerekek potyognak az égbol.",
							"I bet he'll be reading even when black kids are falling from the sky.");
					Item item331 = new Item(s.getKey(), "Majd holnap lemosom.", "I’ll wash it tomorrow.");
					Item item332 = new Item(s.getKey(), "Mész holnap a bálba?", "Will you go to the party tomorrow?");
					Item item333 = new Item(s.getKey(), "Iszol velem egyet?", "Will you have a drink with me?");
					Item item334 = new Item(s.getKey(), "Majd iszunk a Pistáéknál.", "We’ll have a drink at Pista’s place.");
					Item item335 = new Item(s.getKey(), "A hét végén nem megyünk Nagyszakácsiba.",
							"At the weekend we won’t go to Nagyszakácsi.");
					Item item336 = new Item(s.getKey(), "Mikor lesz már vége?", "When will it end?");
					Item item337 = new Item(s.getKey(), "A vége az lesz, hogy bedilizel.", "You’ll end up cracking.");
					Item item338 = new Item(s.getKey(), "Hogy fogsz kijönni a ketrecbol?", "How will you come out of the cage?");
					Item item339 = new Item(s.getKey(), "Hát ezt én orrbaverem.", "I’m going to punch him.");
					Item item340 = new Item(s.getKey(), "Ha kisebb mint én, orrbaverem.",
							"If he is smaller than me, I’ll punch him.");
					Item item341 = new Item(s.getKey(), "Tuzoltó leszel, vagy katona.", "You’ll be a fireman or a soldier.");
					Item item342 = new Item(s.getKey(), "Én mindenképpen tuzoltó leszek.", "I’m going to be a fireman.");
					Item item343 = new Item(s.getKey(), "Te ezt tényleg megiszod?", "Are you going to drink it?");
					Item item344 = new Item(s.getKey(), "Iszol egy kis tejet?", "Will you drink some milk?");
					Item item345 = new Item(s.getKey(), "Nagyon fogsz hiányozni.", "I’m going to miss you.");
					Item item346 = new Item(s.getKey(), "Igen, azt hiszem, te is fogsz hiányozni nekem.",
							"Yes, I think, I’ll miss you, too.");
					Item item347 = new Item(s.getKey(), "Majd jövore feleségül veszlek.", "I’ll marry you next year.");
					Item item348 = new Item(s.getKey(), "Azértse megyek hozzád.", "I’m not going to marry you.");
					Item item349 = new Item(s.getKey(), "Aigner Szilárd most mondta, hogy eso lesz.",
							"Aigner Szilárd has just said it will rain.");
					Item item350 = new Item(s.getKey(), "Ott az a nagy kövér felho, biztos eso lesz.",
							"There is big fat cloud, it’s going to rain.");
					Item item351 = new Item(s.getKey(), "Te, ez mindjárt leveszi a cipojét.",
							"Hey, he’s going to take off his shoes.");
					Item item352 = new Item(s.getKey(), "Majd a konyhában leveszem a cipomet.",
							"I’ll take off my shoes in the kitchen.");
					Item item353 = new Item(s.getKey(), "Vissza fogom adni, mihelyst megtalálom.",
							"I'll give it back as soon as possible.");
					Item item354 = new Item(s.getKey(), "Hol fogsz dolgozni?", "Where will you work?");
					Item item355 = new Item(s.getKey(), "Senki nem fog egy könnycseppet sem hullatni érte.",
							"Not a tear will be shed for him.");
					Item item356 = new Item(s.getKey(), "Holnap tizenegy jó lesz?", "Eleven tomorrow will do?");
					Item item357 = new Item(s.getKey(), "Mikor jössz vissza?", "When will you be back?");
					Item item358 = new Item(s.getKey(), "Az se segít, ha tudjuk.", "It won't help knowing.");
					Item item359 = new Item(s.getKey(), "Majd én leviszem a kutyát.", "I'll walk the dog.");
					Item item360 = new Item(s.getKey(), "Biztos, hogy el fogja olvasni?", "Are you sure he will read it?");
					Item item361 = new Item(s.getKey(), "Nekem cimezték a levelet.", "The letter has been addressed to me.");
					Item item362 = new Item(s.getKey(), "Élve temették.", "He was buried alive.");
					Item item363 = new Item(s.getKey(), "Eddig még semmit nem mondtak róla.",
							"Nothing has been said about it so far.");
					Item item364 = new Item(s.getKey(), "Épp teritettek, mikor leesett a tányér.",
							"The table was beinnd laid when the plate fell down.");
					Item item365 = new Item(s.getKey(), "A levelet elégették még mielott megtalálták volna.",
							"The letter had been burnt before it was found.");
					Item item366 = new Item(s.getKey(), "Elmozdult, pont amikor fényképezték.",
							"He moved just as the photo was being taken of him.");
					Item item367 = new Item(s.getKey(), "Ki fogják üriteni a termet.", "The hall will be emptied.");
					Item item368 = new Item(s.getKey(), "Söprik az Engels teret.", "Engels square is being swept.");
					Item item369 = new Item(s.getKey(), "Jövo ?szre learatják a termést.",
							"The crop will have been harvested by next fall.");
					Item item370 = new Item(s.getKey(), "Most elesett, vagy meglökték?", "Did he fall or was he pushed?");
					Item item371 = new Item(s.getKey(), "Kirúgták az igazgatót.", "The manager has been fired.");
					Item item372 = new Item(s.getKey(), "Lehet látni a tetoválását.", "His tattoo can be seen.");
					Item item373 = new Item(s.getKey(), "Meg kéne csinálni.", "It should be repaired.");
					Item item374 = new Item(s.getKey(), "Kapott egy nagy pofont.", "He has been given a punch.");
					Item item375 = new Item(s.getKey(), "Új nevet adnak majd neki.", "It will be given a new name.");
					Item item376 = new Item(s.getKey(), "Ezt a könyvet még semmilyen nyelvre nem fordították le.",
							"This book has not been translated into any language yet.");
					Item item377 = new Item(s.getKey(), "Mondd, téged meghívtak?", "Say, have you been invited?");
					Item item378 = new Item(s.getKey(), "Új iskolát építenek a falunkban.",
							"A new school is being built in our village.");
					Item item379 = new Item(s.getKey(), "Most viszik, most viszik Danikáné lányát, bíborban, bársonyban…",
							"Old Mrs. Danika's daughter is being taken, right now, in a fancy velvet garment.");
					Item item380 = new Item(s.getKey(), "Legújabb filmjét tartják a legjobbnak.",
							"His latest film is thought to be the best.");
					Item item381 = new Item(s.getKey(), "Nemsoká fölszolgálják a jéghideg söröket.",
							"The ice-cold beer will be served up in no time.");
					Item item382 = new Item(s.getKey(), "Már a múlt héten elküldték a levelet.", "The letter was posted last week.");
					Item item383 = new Item(s.getKey(), "Jövore talán majd kiadják.", "Maybe it will be published next year.");
					Item item384 = new Item(s.getKey(), "Épp most bontják az új felüljárót.",
							"The new flyover is being pulled down.");
					Item item385 = new Item(s.getKey(), "Mire rendorség odaért, a képeket már rég ellopták.",
							"By the time the police got there, the pictures had been stolen.");
					Item item386 = new Item(s.getKey(), "Jó állást ígértek neki.", "He has been promised a good job.");
					Item item387 = new Item(s.getKey(), "Manapság sokkal több pénzt költenek húsra, mint tegnapság.",
							"Nowadays much more money is spent on meat than before.");
					Item item388 = new Item(s.getKey(), "Még tíz ilyen mondat, és biztos a diliházba visznek.",
							"Another ten sentences like this, and I'll surely be taken to hospital.");
					Item item389 = new Item(s.getKey(), "A csónakot szem elol tévesztették a suru ködben.",
							"The boat was lost in the dense fog.");
					Item item390 = new Item(s.getKey(), "Már egy csomószor megmondták neked, hogy ne nyúl hozzá.",
							"You've been told lots of times not to touch it.");
					Item item391 = new Item(s.getKey(), "Föl kéne már építeni ezt a házat.", "This house should be built now.");
					Item item392 = new Item(s.getKey(), "Most már kell találni valakit, aki ért hozzá.",
							"Somebody has to be found who is good at it.");
					Item item393 = new Item(s.getKey(), "Egy csomó embert följelentettek adócsalásért.",
							"A lot of people were reported for tax evasion.");
					Item item394 = new Item(s.getKey(), "Meg kéne mondani nekik, hogy ezt ne csinálják többé.",
							"They should be told not to do this again.");
					Item item395 = new Item(s.getKey(), "Holnap ötre kell legépelni.", "It will have to be typed by five tomorrow.");
					Item item396 = new Item(s.getKey(), "El lehet vinni ezeket a könyveket?", "Can these books be taken?");
					Item item397 = new Item(s.getKey(), "Bárcsak megtalálták volna.", "If only it had been found.");
					Item item398 = new Item(s.getKey(), "Ötezerre értékelték a vadonatúj nercbundáját.",
							"Her brand new mink has been valued at 5,000.");
					Item item399 = new Item(s.getKey(), "Két lövést hallottak.", "Two shots were heard.");
					Item item400 = new Item(s.getKey(), "Ha nem Hong Kongban készült volna, nem venném meg.",
							"If it hadn't been made in Hong Kong, I wouldn't buy it.");
					Item item401 = new Item(s.getKey(), "Késobbre kell halasztani a találkozót.", "The meeting has to be put off.");
					Item item402 = new Item(s.getKey(), "Most szerelik az új antennát.", "The new aerial is being fixed.");
					Item item403 = new Item(s.getKey(), "Locsolják a Soroksári utat.", "Soroksári road is being sprinkled.");
					Item item404 = new Item(s.getKey(), "Kiürítették a hamutartókat?", "Have the ashtrays been emptied?");
					Item item405 = new Item(s.getKey(), "Jövore talán majd elfogadják a jelentkezésedet.",
							"Maybe your application will be accepted next year.");
					Item item406 = new Item(s.getKey(), "Vettek nékem piros csizmát, rojtosat.",
							"I've been bought red boots with fringes.");
					Item item407 = new Item(s.getKey(), "Hány embert visznek Amerikába a Sorosalapítvánnyal?",
							"How many people will be taken to the States by Soros fund?");
					Item item408 = new Item(s.getKey(), "Az önéletrajzot sajnos angolul kell megírni.",
							"Unfortunately the autobiography has to be written in English.");
					Item item409 = new Item(s.getKey(), "A házat már jóval azelott felépítették, hogy beköltöztek.",
							"The house has been built long before they moved in.");
					Item item410 = new Item(s.getKey(), "A repülogép szerencsétlenség következtében 200 ember vesztette életét.",
							"200 people were killed in the plane crash.");
					Item item411 = new Item(s.getKey(), "A mai napig titkolják a baleset okait.",
							"The causes of the accidents have been concealed so far.");
					Item item412 = new Item(s.getKey(), "Nem létezik, hogy kimosták ezeket a pulóvereket?",
							"These pullovers couldn't have been washed.");
					Item item413 = new Item(s.getKey(), "Ezt mind hibáltanul kellet vona lefordítani?",
							"Should all this have been translated with no mistakes?");
					Item item414 = new Item(s.getKey(), "Az összes pénzt elvitték.", "All the money was stolen.");
					Item item415 = new Item(s.getKey(), "Csak néhány bizsut hagytak az öltözködoasztalon.",
							"Only some bijou was left on the dressing table.");
					Item item416 = new Item(s.getKey(), "Vettek ujjlenyomatot, de nem sok remény van.",
							"Some fingerprints were taken but there is not much hope.");
					Item item417 = new Item(s.getKey(), "A biztosító persze egy fillért nem adott.",
							"I wasn't given a penny by the insurance company.");
					Item item418 = new Item(s.getKey(), "Összességében tehát jól paffra vágtak.", "All in all I was put out.");
					Item item419 = new Item(s.getKey(), "A Kangákat általában vadállatnak tekintik.",
							"A Kanga is generally regarded as a fierce animal.");
					Item item420 = new Item(s.getKey(), "A radványi sötét erdoben halva találták Bárci Benot.",
							"In the dark forest of Radvány Bárci Beno was found dead.");
					Item item421 = new Item(s.getKey(), "Látták, hogy bemászik az ablakon, úgyhogy nem lehetett titokban tartani.",
							"She was seen climbing through the window, so it couldn't be kept a secret.");
					Item item422 = new Item(s.getKey(), "Kapsz tejet, vajat.", "You'll be given milk and butter.");
					Item item423 = new Item(s.getKey(), "Elesett, vagy ellökték?", "Did he fall, or was he pushed?");
					Item item424 = new Item(s.getKey(), "Elmozdította a fejét épp akkor, mikor a fényképet csinálták.",
							"She moved her head just as the photo was being taken.");
					Item item425 = new Item(s.getKey(), "Remélem, nem lopták el.", "I hope it hasn't been stolen.");
					Item item426 = new Item(s.getKey(), "Jani szólt, hogy kész van.", "Jani said he was ready.");
					Item item427 = new Item(s.getKey(), "Annuska azt mondta, hogy még semmit nem mondott Janinak.",
							"Annuska said she hadn’t told Jani a word.");
					Item item428 = new Item(s.getKey(), "Azt mondta, hogy már nem vár tovább.",
							"He said he wouldn’t wait any longer.");
					Item item429 = new Item(s.getKey(), "Szólt, hogy kapcsoljam ki a rádiót.", "He told me to turn off the radio.");
					Item item430 = new Item(s.getKey(),
							"Azt mondta, hogy azért nem nyitott ajtót, mert épp a fülét mosta és nem hallott semmit.",
							"He said he hadn’t open the door because he was cleaning (he had been cleaning) his ears and couldn’t hear anything.");
					Item item431 = new Item(s.getKey(), "Azt mondta, ha már úgyis megyek a boltba, hozzak neki narancsot.",
							"He said if I went to the shop I should bring him some oranges.");
					Item item432 = new Item(s.getKey(), "Azt mondta, hogy tegnap egész nap otthon volt.",
							"He said he had been at home all day the day before.");
					Item item433 = new Item(s.getKey(), "Azt mondta, hogy kész a kávé. ",
							"He has just said that the coffee is ready.");
					Item item434 = new Item(s.getKey(), "Azt hitte, holnap kell elhoznia a ruhát a patyolatból.",
							"She thought she would have to fetch the dress from the laundry the next day.");
					Item item435 = new Item(s.getKey(), "Azt hitte, ha sír, mindent megbocsájtok.",
							"She thought I forgive her if she was crying.");
					Item item436 = new Item(s.getKey(),
							"Azt állította, hogy azért nem no a narancsfája, mert nem kap elég napfényt.",
							"He claimed his orange tree doesn’t grow because it doesn’t get any sunshine.");
					Item item437 = new Item(s.getKey(), "Most szólt a házmester, hogy jönnek az APEH-tól.",
							"The caretaker has just said that the Tax Office guys are approaching.");
					Item item438 = new Item(s.getKey(), "Azt hitték, hogy elkésnek.", "They thought they were late.");
					Item item439 = new Item(s.getKey(), "Azt mondta az anyukám, hogy nem tetszik a frizurám.",
							"My mother said she didn’t liked my hair.");
					Item item440 = new Item(s.getKey(), "Mondtam neki, hogy próbálja meg a zöldet.",
							"I told her to try the green one.");
					Item item441 = new Item(s.getKey(), "Azt mondta, hogy unatkozik.", "She said she was bored.");
					Item item442 = new Item(s.getKey(), "Mondtam, hogy hétre ott kell lennünk.",
							"I told you we would have to be there to seven.");
					Item item443 = new Item(s.getKey(), "Azt mondta, az epret nem szereti.", "He said he didn’t like strawberries.");
					Item item444 = new Item(s.getKey(), "Azt hittem már ebédeltél.", "I thought you had already have launch.");
					Item item445 = new Item(s.getKey(), "Azt hitte kolbászból van a kerítés.",
							"He thought the fence was made of sausages.");
					Item item446 = new Item(s.getKey(), "Azt mondta bemehetek.", "He said I might come in.");
					Item item447 = new Item(s.getKey(), "Megkérdezte, hogy mi van a borödömben.",
							"He asked what I had in my suitcase.");
					Item item448 = new Item(s.getKey(), "Tudni akarta, hogy mikor érkeznek.",
							"He wanted to know when they would arrive.");
					Item item449 = new Item(s.getKey(), "Nem tudtam, hogy mit vegyek fel.",
							"I didn't know what to put on/what I should put on.");
					Item item450 = new Item(s.getKey(), "Nem tudtam, hogy vegyek-e fel valamit.",
							"I didn't know whether to put on something/if I should put on something.");
					Item item451 = new Item(s.getKey(), "Nem tudtam, hogy honnan tudja.", "I didn't know how she could tell.");
					Item item452 = new Item(s.getKey(), "Azon tunodtem, hogy mit jelent mindez.",
							"I was wondering what it all meant.");
					Item item453 = new Item(s.getKey(), "Megkérdezte, hogy miért nincs kész az ebéd.",
							"He asked why dinner was not ready.");
					Item item454 = new Item(s.getKey(), "A vámos azt kérdezte, van-e elvámolni valóm.",
							"The customs officer asked me if I had anything to declare.");
					Item item455 = new Item(s.getKey(), "Tudni akarta, hol vettem a cipofuzot.",
							"He wanted to know where I had bought the shoe lace.");
					Item item456 = new Item(s.getKey(), "Azt kérdezte, jól aludtam-e.", "He asked if I had slept well.");
					Item item457 = new Item(s.getKey(), "Nem tudtam, hogy van-e levelem.",
							"I didn't know whether there were any letters for me.");
					Item item458 = new Item(s.getKey(), "Nem tudtam, melyik kólát kérjem, a szokét, vagy a barnát.",
							"I didn't know which coke to ask for, the blond one, or the brown one.");
					Item item459 = new Item(s.getKey(), "Azon tunodtem, hogy elmenjek-e vagy maradjak.",
							"I was wondering whether to go or stay.");
					Item item460 = new Item(s.getKey(), "Azt mondta, hogy három éve van lova.",
							"He said he had have a horse for three years.");
					Item item461 = new Item(s.getKey(), "Azt mondta, hogy van lova.", "He said he had a horse.");
					Item item462 = new Item(s.getKey(), "Azt mondta, hogy három évet tanult lovagolni.",
							"He said he had learnt how to ride for three years.");
					Item item463 = new Item(s.getKey(), "Azt mondta, hogy három éve tanul lovagolni.",
							"He said he had been learning how to ride for three years.");
					Item item464 = new Item(s.getKey(), "Nem tudtam fog-e rám emlékezni.",
							"I didn't know if she would remember me.");
					Item item465 = new Item(s.getKey(), "Azt kérdezte, hogy jártam-e már Tótkomlóson.",
							"She asked if I had ever been to Tótkomlós.");
					Item item466 = new Item(s.getKey(), "Azt javasolta, hogy pöttyöset vegyem.",
							"She suggested I should buy the spotted one.");
					Item item467 = new Item(s.getKey(), "Nem tudtam hány poharat tegyek az asztalra.",
							"I didn't know how many glasses to put on the table.");
					Item item468 = new Item(s.getKey(),
							"A fiú megígérte, hogy feleségül veszi a lányt, ha az megteszi amire kéri.",
							"The boy promised he would marry the girl is she did what he asked her to do.");
					Item item469 = new Item(s.getKey(), "Többször is megkérdezte, hogy értem-e amit mond.",
							"She asked me several times if I understood what she was saying.");
					Item item470 = new Item(s.getKey(), "Szerinte sáska volt.", "He thought it was a locust.");
					Item item471 = new Item(s.getKey(), "Tudtam, hogy hazudik.", "I knew he was lying.");
					Item item472 = new Item(s.getKey(), "Azt mondta, hogy az anyósának ír.",
							"He said he was writing to his mother-in-law.");
					Item item473 = new Item(s.getKey(), "Szólt, hogy ha esik, vigyek esernyot.",
							"She told me to take an umbrella in case it rained.");
					Item item474 = new Item(s.getKey(), "Azt mondta, hogy már haza kell mennie.", "He said he had to go home.");
					Item item475 = new Item(s.getKey(), "Fogalmam se volt mit tegyek.", "I had no idea what to do.");
					Item item476 = new Item(s.getKey(), "Fogalmam se volt, tegyek-e egyáltalán valamit.",
							"I had no idea whether to do anything at all.");
					Item item477 = new Item(s.getKey(), "Rögtön láttam, hogy nem fog tejelni.",
							"I immediately saw she wouldn't milk.");
					Item item478 = new Item(s.getKey(), "Azt mondtad, nem érdekel.", "You said you didn't care.");
					Item item479 = new Item(s.getKey(), "Azt hittem, mindent elmondtál.", "I thought you had told me everything.");
					Item item480 = new Item(s.getKey(), "Szólt, hogy ne csináljak semmit, o majd mindent elintéz.",
							"She told me not to do anything, she would arrange everything.");
					Item item481 = new Item(s.getKey(), "Nem tudom, hogyan gyógyítsam meg a náthámat.",
							"I don't know how to cure my sniffle.");
					Item item482 = new Item(s.getKey(), "Nem tudom, hogy elhiszed-e még.",
							"I don't know whether you still believe it.");
					Item item483 = new Item(s.getKey(), "Azt se tudtam fiú vagyok-e vagy lány.",
							"I didn't know whether I was coming or going.");
					Item item484 = new Item(s.getKey(), "Vajon hova dugta?", "I wonder where she has hidden it.");
					Item item485 = new Item(s.getKey(), "Nem tudta hova dugta.", "She didn't know where she had hidden it.");
					Item item486 = new Item(s.getKey(), "Azt se tudta, hogy eldugta-e?",
							"She didn't know if she had hidden it at all.");
					Item item487 = new Item(s.getKey(), "Nem tudta, hogy eldugja-e.", "She didn't know if she should hide it.");
					Item item488 = new Item(s.getKey(), "Vajon miért tette?", "I wonder why he did it.");
					Item item489 = new Item(s.getKey(), "Vajon elvesztette?", "I wonder if she has lost it.");
					Item item490 = new Item(s.getKey(), "Nem tudom lesz-e még idonk.", "I don't know if we'll have time.");
					Item item491 = new Item(s.getKey(), "Nem tudom mire gondol a katona orség idején.",
							"I don't know what the soldier on guard has in mind.");
					Item item492 = new Item(s.getKey(), "Vajon adsz-e helyet magad mellett.",
							"I don't know if you'll give me room beside you.");
					Item item493 = new Item(s.getKey(), "Nem tudom vegyek-e kabátot.", "I don't know whether to put on a coat.");
					Item item494 = new Item(s.getKey(), "Azt mondta, nem lát semmit.", "She said she couldn't see anything.");
					Item item495 = new Item(s.getKey(), "Megkérdezte, hogy levegye-e a nadrágját.",
							"He asked whether he should take off his pants.");
					Item item496 = new Item(s.getKey(), "Azt hitte, rosszul hall.", "He thought he heard wrong.");
					Item item497 = new Item(s.getKey(), "Azon gondolkodott, vegyen-e egy fél disznót.",
							"He was wondering whether to buy half a hog.");
					Item item498 = new Item(s.getKey(), "A nagymama azt hitte, hogy Piroska az.",
							"Grandmother thought it was Little Red Riding Hood.");
					Item item499 = new Item(s.getKey(), "Felrohantam, hogy megnézzem alszik-e a gyerek.",
							"I ran up to see if the child was sleeping.");
					Item item500 = new Item(s.getKey(), "Mondtam már, hogy nosülök?",
							"500) Have I told you I'm going to get married?");
					Item item501 = new Item(s.getKey(), "Azt mondtad, hogy nem akarsz mindenáron férjhez menni.",
							"You said you didn't want to get married at any cost.");
					Item item502 = new Item(s.getKey(), "Tudtam, hogy o az.", "I knew it was him.");
					Item item503 = new Item(s.getKey(), "Nem tudtam, hogy így fáj.", "I didn't know it would be so painful.");
					Item item504 = new Item(s.getKey(), "Azt hitte nincs több.", "He thought there was no more.");
					Item item505 = new Item(s.getKey(), "Azt mondtad, hogy kilencre jössz.", "You said you would come by nine.");
					Item item506 = new Item(s.getKey(), "Azt mondta csak 10 perce van, mert délre az irodában kell lennie.",
							"She said she had only ten minutes left because she would have to be in the office at noon.");
					Item item507 = new Item(s.getKey(), "Nem tudtam miért takarja el az arcát.",
							"I didn't know why she was hiding her face.");
					Item item508 = new Item(s.getKey(), "Azt hitte nem bolha, hanem elefánt.",
							"He thought it was not a flea but an elephant.");
					Item item509 = new Item(s.getKey(), "Te tudtad mire akar kilyukadni?", "Did you know what she was driving at?");
					Item item510 = new Item(s.getKey(), "Mondtam már, hogy hallgass!", "I've told you to shut up!");
					Item item511 = new Item(s.getKey(), "Azt mondta, hogy belépett?", "Did she say she had joined?");
					Item item512 = new Item(s.getKey(), "Nem, azt mondta, hogy kilépett.", "No, she said she had left.");
					Item item513 = new Item(s.getKey(), "Azt mondta, hogy alig lépett be, máris kilépett.",
							"She said hardly had she joined when she had left.");
					Item item514 = new Item(s.getKey(), "Vajon mikor lesz már vége.", "I wonder when it will end.");
					Item item515 = new Item(s.getKey(), "Vajon vége lesz-e valaha.", "I wonder whether it will ever end.");
					Item item516 = new Item(s.getKey(), "Azt hitte nincs benne áram.", "He thought there was no current in it.");
					Item item517 = new Item(s.getKey(), "Mondd meg a tejesnek, hogy ne hozzon több sajtot.",
							"Tell the milkman to bring no more cheese.");
					Item item518 = new Item(s.getKey(), "Azt mondta, egész éjjel énelkelt.", "He said she singing all night.");
					Item item519 = new Item(s.getKey(), "Azt mondta, hogy megenné, ha éhes volna.",
							"She said she would eat if she was hungry.");
					Item item520 = new Item(s.getKey(), "Azt mondta, hogy mihelyt elkészül jön.",
							"She said she would come as soon as she was ready.");
					Item item521 = new Item(s.getKey(), "Fogalmam se volt, hány éves lehet.", "I had no idea how old she could be.");
					Item item522 = new Item(s.getKey(), "Micimackó azt mondta, hogy azt hitte, a Nyuszi a családjáról beszélt.",
							"Pooh said he thought Rabbit had been talking about his family.");
					Item item523 = new Item(s.getKey(),
							"Kukorica Jancsi azt mondta, hogy kicsit ugyan parasztos a neve, de nem szégyelli.",
							"Johnny Corn said his name was a bit peasant-like, but he wasn't ashamed of it.");
					Item item524 = new Item(s.getKey(), "Azt mondta, jobb ha nem nézek oda.", "She said I had better not watch it.");
					Item item525 = new Item(s.getKey(), "Az orvos szerint egy-két napig még ágyban kell maradnia.",
							"The doctor said she would have to stay in bed for another day or two.");
					Item item526 = new Item(s.getKey(), "Azt mondta, próbáljuk meg még egyszer.", "He suggested trying it again.");
					Item item527 = new Item(s.getKey(), "Azt mondtam, hogy nincs értelme mégegyszer megpróbálni.",
							"I said it was no use trying it again.");
					Item item528 = new Item(s.getKey(), "Levágattam a hajam.", "I had/got my hair cut.");
					Item item529 = new Item(s.getKey(), "Lilára fogom festetni a hajam.", "I will have/get my hair dyed violet.");
					Item item530 = new Item(s.getKey(), "Meg kell csináltatnom a lemezjátszómat.",
							"I must have/get my record-player repaired.");
					Item item531 = new Item(s.getKey(), "Vajat hozattam a közértbol.",
							"I had/got some butter brought from the shop.");
					Item item532 = new Item(s.getKey(), "Levágattad a szoknyád alját?", "Did you have/get your skirt shortened?");
					Item item533 = new Item(s.getKey(), "Minden nap lemosatod a kocsidat?",
							"Do you have your car washed every day?");
					Item item534 = new Item(s.getKey(), "Tegnap nem hozattam sört.", "I didn’t have/get beer brought yesterday.");
					Item item535 = new Item(s.getKey(), "Komuvessel építtetett házat.", "He got the maison to build a house.");
					Item item536 = new Item(s.getKey(), "Az újoncokkal mosatta fel a folyosót.",
							"He had the rookies wash the corridor.");
					Item item537 = new Item(s.getKey(), "Bélával fogja megfizettetni a kárt.",
							"He’ll make Béla pay for the damage.");
					Item item538 = new Item(s.getKey(), "Nem tudta hallatni a hangját.", "He couldn’t make his voice heard.");
					Item item539 = new Item(s.getKey(), "Éreztette befolyását.", "He made his influence felt.");
					Item item540 = new Item(s.getKey(), "Észre tudja magát vétetni.", "He can make himself noticed.");
					Item item541 = new Item(s.getKey(), "Tudatni fogom veled a híreket.", "I will let you know the news.");
					Item item542 = new Item(s.getKey(), "Mibol gondolod?", "What make you think that?");
					Item item543 = new Item(s.getKey(), "Jól áll neked.", "It makes you look so pretty.");
					Item item544 = new Item(s.getKey(), "Ahogy meglátta a vért, elájult.", "The sight of blood made her faint.");
					Item item545 = new Item(s.getKey(), "Rávette, hogy álljon be rendornek.",
							"He forced her to join the police force.");
					Item item546 = new Item(s.getKey(), "Miért tette ezt?", "What caused him to do it?");
					Item item547 = new Item(s.getKey(), "Csak magának köszönhette (? jövette el).", "He had it coming.");
					Item item548 = new Item(
							s.getKey(),
							"Úgy intézte, hogy holnap kettokor érkezem meg (kettokor érkeztet meg) New York legnagyobb repüloterére.",
							"She’ll have me arriving at Kennedy at 2:00 tomorrow.");
					Item item549 = new Item(s.getKey(), "Megismételtetnéd vele?", "Would you make him repeat it?");
					Item item550 = new Item(s.getKey(), "Egy néger fiúval pucoltatja a cipojét.",
							"He gets a black boy to clean his shoes.");
					Item item551 = new Item(s.getKey(), "Gépeltesd ezt le.", "Have it typed.");
					Item item552 = new Item(s.getKey(), "Hány fényképet csináltattál?", "How many photos have you had taken?");
					Item item553 = new Item(s.getKey(), "Mikor fogod megéleztetni a késeket?",
							"When will you have the knives sharpened?");
					Item item554 = new Item(s.getKey(), "A szomszéddal hozatott cigarettát.",
							"He had his neighbour bring cigarettes.");
					Item item555 = new Item(s.getKey(), "Vak zongorahangolóval hangoltatta fel a zongorát.",
							"He had a blind piano tuner tune the piano.");
					Item item556 = new Item(s.getKey(), "Épp most másoltatom.", "I’m having it copied right now.");
					Item item557 = new Item(s.getKey(), "A borbéllyal húzatta ki a fogát.",
							"He got the barber to take out his tooth.");
					Item item558 = new Item(s.getKey(), "A macskával etette meg a párizsit.", "He made the cat eat the párizsi.");
					Item item559 = new Item(s.getKey(), "A jókedvu tizedes fogkefével mosatta fel a folyosót.",
							"The cheerful corporal had the corridor washed with a toothbrush.");
					Item item560 = new Item(s.getKey(), "Virágot küldettem a névnapjára.", "I had lowers sent to her nameday.");
					Item item561 = new Item(s.getKey(), "Piros palát fogok rakatni a házam tetejére.",
							"I'll get red slate put on the roof of my house.");
					Item item562 = new Item(s.getKey(), "Az a sok szilva jól megszalasztott.", "That lot of plums made me run.");
					Item item563 = new Item(s.getKey(), "Ne Technocol Rapidot szagoltass vele, hanem repülosót.",
							"Don't make him smell Technocol Rapid, but smelling salts.");
					Item item564 = new Item(s.getKey(), "Mondd, te kivel csináltattad a futést?",
							"Say, who did you get to install heating?");
					Item item565 = new Item(s.getKey(), "Mindig velem fordíttatja le az idétlen mondatait.",
							"She is always making me translate her stupid sentences.");
					Item item566 = new Item(s.getKey(), "Na, ezt a szerencsétlent is jól megszivatták.",
							"They got that unfortunate guy to suck.");
					Item item567 = new Item(s.getKey(), "Kicseréltettem a féltengelyt és a levegoszurot.",
							"I had the half axle and the air filter replaced.");
					Item item568 = new Item(s.getKey(), "Mindenáron tükröt akar szereltetni a hálószoba plafonjára.",
							"She wants to get a mirror fixed onto the ceiling of the bedroom at any cost.");
					Item item569 = new Item(s.getKey(), "Mindig velem iratja a szerelmes leveleit.",
							"She is always making me write her love letters.");
					Item item570 = new Item(s.getKey(), "Miért nem a villanyszerelovel kötteted be a mosógépet?",
							"Why didn't you get the electrician to connect up your washing machine?");

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
					pm.makePersistent(item122);
					pm.makePersistent(item123);
					pm.makePersistent(item124);
					pm.makePersistent(item125);
					pm.makePersistent(item126);
					pm.makePersistent(item127);
					pm.makePersistent(item128);
					pm.makePersistent(item129);
					pm.makePersistent(item130);
					pm.makePersistent(item131);
					pm.makePersistent(item132);
					pm.makePersistent(item133);
					pm.makePersistent(item134);
					pm.makePersistent(item135);
					pm.makePersistent(item136);
					pm.makePersistent(item137);
					pm.makePersistent(item138);
					pm.makePersistent(item139);
					pm.makePersistent(item140);
					pm.makePersistent(item141);
					pm.makePersistent(item142);
					pm.makePersistent(item143);
					pm.makePersistent(item144);
					pm.makePersistent(item145);
					pm.makePersistent(item146);
					pm.makePersistent(item147);
					pm.makePersistent(item148);
					pm.makePersistent(item149);
					pm.makePersistent(item150);
					pm.makePersistent(item151);
					pm.makePersistent(item152);
					pm.makePersistent(item153);
					pm.makePersistent(item154);
					pm.makePersistent(item155);
					pm.makePersistent(item156);
					pm.makePersistent(item157);
					pm.makePersistent(item158);
					pm.makePersistent(item159);
					pm.makePersistent(item160);
					pm.makePersistent(item161);
					pm.makePersistent(item162);
					pm.makePersistent(item163);
					pm.makePersistent(item164);
					pm.makePersistent(item165);
					pm.makePersistent(item166);
					pm.makePersistent(item167);
					pm.makePersistent(item168);
					pm.makePersistent(item169);
					pm.makePersistent(item170);
					pm.makePersistent(item171);
					pm.makePersistent(item172);
					pm.makePersistent(item173);
					pm.makePersistent(item174);
					pm.makePersistent(item175);
					pm.makePersistent(item176);
					pm.makePersistent(item177);
					pm.makePersistent(item178);
					pm.makePersistent(item179);
					pm.makePersistent(item180);
					pm.makePersistent(item181);
					pm.makePersistent(item182);
					pm.makePersistent(item183);
					pm.makePersistent(item184);
					pm.makePersistent(item185);
					pm.makePersistent(item186);
					pm.makePersistent(item187);
					pm.makePersistent(item188);
					pm.makePersistent(item189);
					pm.makePersistent(item190);
					pm.makePersistent(item191);
					pm.makePersistent(item192);
					pm.makePersistent(item193);
					pm.makePersistent(item194);
					pm.makePersistent(item195);
					pm.makePersistent(item196);
					pm.makePersistent(item197);
					pm.makePersistent(item198);
					pm.makePersistent(item199);
					pm.makePersistent(item200);
					pm.makePersistent(item201);
					pm.makePersistent(item202);
					pm.makePersistent(item203);
					pm.makePersistent(item204);
					pm.makePersistent(item205);
					pm.makePersistent(item206);
					pm.makePersistent(item207);
					pm.makePersistent(item208);
					pm.makePersistent(item209);
					pm.makePersistent(item210);
					pm.makePersistent(item211);
					pm.makePersistent(item212);
					pm.makePersistent(item213);
					pm.makePersistent(item214);
					pm.makePersistent(item215);
					pm.makePersistent(item216);
					pm.makePersistent(item217);
					pm.makePersistent(item218);
					pm.makePersistent(item219);
					pm.makePersistent(item220);
					pm.makePersistent(item221);
					pm.makePersistent(item222);
					pm.makePersistent(item223);
					pm.makePersistent(item224);
					pm.makePersistent(item225);
					pm.makePersistent(item226);
					pm.makePersistent(item227);
					pm.makePersistent(item228);
					pm.makePersistent(item229);
					pm.makePersistent(item230);
					pm.makePersistent(item231);
					pm.makePersistent(item232);
					pm.makePersistent(item233);
					pm.makePersistent(item234);
					pm.makePersistent(item235);
					pm.makePersistent(item236);
					pm.makePersistent(item237);
					pm.makePersistent(item238);
					pm.makePersistent(item239);
					pm.makePersistent(item240);
					pm.makePersistent(item241);
					pm.makePersistent(item242);
					pm.makePersistent(item243);
					pm.makePersistent(item244);
					pm.makePersistent(item245);
					pm.makePersistent(item246);
					pm.makePersistent(item247);
					pm.makePersistent(item248);
					pm.makePersistent(item249);
					pm.makePersistent(item250);
					pm.makePersistent(item251);
					pm.makePersistent(item252);
					pm.makePersistent(item253);
					pm.makePersistent(item254);
					pm.makePersistent(item255);
					pm.makePersistent(item256);
					pm.makePersistent(item257);
					pm.makePersistent(item258);
					pm.makePersistent(item259);
					pm.makePersistent(item260);
					pm.makePersistent(item261);
					pm.makePersistent(item262);
					pm.makePersistent(item263);
					pm.makePersistent(item264);
					pm.makePersistent(item265);
					pm.makePersistent(item266);
					pm.makePersistent(item267);
					pm.makePersistent(item268);
					pm.makePersistent(item269);
					pm.makePersistent(item270);
					pm.makePersistent(item271);
					pm.makePersistent(item272);
					pm.makePersistent(item273);
					pm.makePersistent(item274);
					pm.makePersistent(item275);
					pm.makePersistent(item276);
					pm.makePersistent(item277);
					pm.makePersistent(item278);
					pm.makePersistent(item279);
					pm.makePersistent(item280);
					pm.makePersistent(item281);
					pm.makePersistent(item282);
					pm.makePersistent(item283);
					pm.makePersistent(item284);
					pm.makePersistent(item285);
					pm.makePersistent(item286);
					pm.makePersistent(item287);
					pm.makePersistent(item288);
					pm.makePersistent(item289);
					pm.makePersistent(item290);
					pm.makePersistent(item291);
					pm.makePersistent(item292);
					pm.makePersistent(item293);
					pm.makePersistent(item294);
					pm.makePersistent(item295);
					pm.makePersistent(item296);
					pm.makePersistent(item297);
					pm.makePersistent(item298);
					pm.makePersistent(item299);
					pm.makePersistent(item300);
					pm.makePersistent(item301);
					pm.makePersistent(item302);
					pm.makePersistent(item303);
					pm.makePersistent(item304);
					pm.makePersistent(item305);
					pm.makePersistent(item306);
					pm.makePersistent(item307);
					pm.makePersistent(item308);
					pm.makePersistent(item309);
					pm.makePersistent(item310);
					pm.makePersistent(item311);
					pm.makePersistent(item312);
					pm.makePersistent(item313);
					pm.makePersistent(item314);
					pm.makePersistent(item315);
					pm.makePersistent(item316);
					pm.makePersistent(item317);
					pm.makePersistent(item318);
					pm.makePersistent(item319);
					pm.makePersistent(item320);
					pm.makePersistent(item321);
					pm.makePersistent(item322);
					pm.makePersistent(item323);
					pm.makePersistent(item324);
					pm.makePersistent(item325);
					pm.makePersistent(item326);
					pm.makePersistent(item327);
					pm.makePersistent(item328);
					pm.makePersistent(item329);
					pm.makePersistent(item330);
					pm.makePersistent(item331);
					pm.makePersistent(item332);
					pm.makePersistent(item333);
					pm.makePersistent(item334);
					pm.makePersistent(item335);
					pm.makePersistent(item336);
					pm.makePersistent(item337);
					pm.makePersistent(item338);
					pm.makePersistent(item339);
					pm.makePersistent(item340);
					pm.makePersistent(item341);
					pm.makePersistent(item342);
					pm.makePersistent(item343);
					pm.makePersistent(item344);
					pm.makePersistent(item345);
					pm.makePersistent(item346);
					pm.makePersistent(item347);
					pm.makePersistent(item348);
					pm.makePersistent(item349);
					pm.makePersistent(item350);
					pm.makePersistent(item351);
					pm.makePersistent(item352);
					pm.makePersistent(item353);
					pm.makePersistent(item354);
					pm.makePersistent(item355);
					pm.makePersistent(item356);
					pm.makePersistent(item357);
					pm.makePersistent(item358);
					pm.makePersistent(item359);
					pm.makePersistent(item360);
					pm.makePersistent(item361);
					pm.makePersistent(item362);
					pm.makePersistent(item363);
					pm.makePersistent(item364);
					pm.makePersistent(item365);
					pm.makePersistent(item366);
					pm.makePersistent(item367);
					pm.makePersistent(item368);
					pm.makePersistent(item369);
					pm.makePersistent(item370);
					pm.makePersistent(item371);
					pm.makePersistent(item372);
					pm.makePersistent(item373);
					pm.makePersistent(item374);
					pm.makePersistent(item375);
					pm.makePersistent(item376);
					pm.makePersistent(item377);
					pm.makePersistent(item378);
					pm.makePersistent(item379);
					pm.makePersistent(item380);
					pm.makePersistent(item381);
					pm.makePersistent(item382);
					pm.makePersistent(item383);
					pm.makePersistent(item384);
					pm.makePersistent(item385);
					pm.makePersistent(item386);
					pm.makePersistent(item387);
					pm.makePersistent(item388);
					pm.makePersistent(item389);
					pm.makePersistent(item390);
					pm.makePersistent(item391);
					pm.makePersistent(item392);
					pm.makePersistent(item393);
					pm.makePersistent(item394);
					pm.makePersistent(item395);
					pm.makePersistent(item396);
					pm.makePersistent(item397);
					pm.makePersistent(item398);
					pm.makePersistent(item399);
					pm.makePersistent(item400);
					pm.makePersistent(item401);
					pm.makePersistent(item402);
					pm.makePersistent(item403);
					pm.makePersistent(item404);
					pm.makePersistent(item405);
					pm.makePersistent(item406);
					pm.makePersistent(item407);
					pm.makePersistent(item408);
					pm.makePersistent(item409);
					pm.makePersistent(item410);
					pm.makePersistent(item411);
					pm.makePersistent(item412);
					pm.makePersistent(item413);
					pm.makePersistent(item414);
					pm.makePersistent(item415);
					pm.makePersistent(item416);
					pm.makePersistent(item417);
					pm.makePersistent(item418);
					pm.makePersistent(item419);
					pm.makePersistent(item420);
					pm.makePersistent(item421);
					pm.makePersistent(item422);
					pm.makePersistent(item423);
					pm.makePersistent(item424);
					pm.makePersistent(item425);
					pm.makePersistent(item426);
					pm.makePersistent(item427);
					pm.makePersistent(item428);
					pm.makePersistent(item429);
					pm.makePersistent(item430);
					pm.makePersistent(item431);
					pm.makePersistent(item432);
					pm.makePersistent(item433);
					pm.makePersistent(item434);
					pm.makePersistent(item435);
					pm.makePersistent(item436);
					pm.makePersistent(item437);
					pm.makePersistent(item438);
					pm.makePersistent(item439);
					pm.makePersistent(item440);
					pm.makePersistent(item441);
					pm.makePersistent(item442);
					pm.makePersistent(item443);
					pm.makePersistent(item444);
					pm.makePersistent(item445);
					pm.makePersistent(item446);
					pm.makePersistent(item447);
					pm.makePersistent(item448);
					pm.makePersistent(item449);
					pm.makePersistent(item450);
					pm.makePersistent(item451);
					pm.makePersistent(item452);
					pm.makePersistent(item453);
					pm.makePersistent(item454);
					pm.makePersistent(item455);
					pm.makePersistent(item456);
					pm.makePersistent(item457);
					pm.makePersistent(item458);
					pm.makePersistent(item459);
					pm.makePersistent(item460);
					pm.makePersistent(item461);
					pm.makePersistent(item462);
					pm.makePersistent(item463);
					pm.makePersistent(item464);
					pm.makePersistent(item465);
					pm.makePersistent(item466);
					pm.makePersistent(item467);
					pm.makePersistent(item468);
					pm.makePersistent(item469);
					pm.makePersistent(item470);
					pm.makePersistent(item471);
					pm.makePersistent(item472);
					pm.makePersistent(item473);
					pm.makePersistent(item474);
					pm.makePersistent(item475);
					pm.makePersistent(item476);
					pm.makePersistent(item477);
					pm.makePersistent(item478);
					pm.makePersistent(item479);
					pm.makePersistent(item480);
					pm.makePersistent(item481);
					pm.makePersistent(item482);
					pm.makePersistent(item483);
					pm.makePersistent(item484);
					pm.makePersistent(item485);
					pm.makePersistent(item486);
					pm.makePersistent(item487);
					pm.makePersistent(item488);
					pm.makePersistent(item489);
					pm.makePersistent(item490);
					pm.makePersistent(item491);
					pm.makePersistent(item492);
					pm.makePersistent(item493);
					pm.makePersistent(item494);
					pm.makePersistent(item495);
					pm.makePersistent(item496);
					pm.makePersistent(item497);
					pm.makePersistent(item498);
					pm.makePersistent(item499);
					pm.makePersistent(item500);
					pm.makePersistent(item501);
					pm.makePersistent(item502);
					pm.makePersistent(item503);
					pm.makePersistent(item504);
					pm.makePersistent(item505);
					pm.makePersistent(item506);
					pm.makePersistent(item507);
					pm.makePersistent(item508);
					pm.makePersistent(item509);
					pm.makePersistent(item510);
					pm.makePersistent(item511);
					pm.makePersistent(item512);
					pm.makePersistent(item513);
					pm.makePersistent(item514);
					pm.makePersistent(item515);
					pm.makePersistent(item516);
					pm.makePersistent(item517);
					pm.makePersistent(item518);
					pm.makePersistent(item519);
					pm.makePersistent(item520);
					pm.makePersistent(item521);
					pm.makePersistent(item522);
					pm.makePersistent(item523);
					pm.makePersistent(item524);
					pm.makePersistent(item525);
					pm.makePersistent(item526);
					pm.makePersistent(item527);
					pm.makePersistent(item528);
					pm.makePersistent(item529);
					pm.makePersistent(item530);
					pm.makePersistent(item531);
					pm.makePersistent(item532);
					pm.makePersistent(item533);
					pm.makePersistent(item534);
					pm.makePersistent(item535);
					pm.makePersistent(item536);
					pm.makePersistent(item537);
					pm.makePersistent(item538);
					pm.makePersistent(item539);
					pm.makePersistent(item540);
					pm.makePersistent(item541);
					pm.makePersistent(item542);
					pm.makePersistent(item543);
					pm.makePersistent(item544);
					pm.makePersistent(item545);
					pm.makePersistent(item546);
					pm.makePersistent(item547);
					pm.makePersistent(item548);
					pm.makePersistent(item549);
					pm.makePersistent(item550);
					pm.makePersistent(item551);
					pm.makePersistent(item552);
					pm.makePersistent(item553);
					pm.makePersistent(item554);
					pm.makePersistent(item555);
					pm.makePersistent(item556);
					pm.makePersistent(item557);
					pm.makePersistent(item558);
					pm.makePersistent(item559);
					pm.makePersistent(item560);
					pm.makePersistent(item561);
					pm.makePersistent(item562);
					pm.makePersistent(item563);
					pm.makePersistent(item564);
					pm.makePersistent(item565);
					pm.makePersistent(item566);
					pm.makePersistent(item567);
					pm.makePersistent(item568);
					pm.makePersistent(item569);
					pm.makePersistent(item570);

				}
			}
		}
	}

}
