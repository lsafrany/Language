package hu.safi.language.server;

import hu.safi.language.server.jdo.Item;
import hu.safi.language.server.jdo.SubTheme;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class Kis_angol_nyelvtan__Forditasi_gyakorlat1 {

	public Kis_angol_nyelvtan__Forditasi_gyakorlat1(PersistenceManager pm) {
		super();

		Query querySubTheme = pm.newQuery("select from " + SubTheme.class.getName());
		@SuppressWarnings("unchecked")
		List<SubTheme> subThemeList = (List<SubTheme>) pm.newQuery(querySubTheme).execute();
		if (!subThemeList.isEmpty()) {
			for (SubTheme s : subThemeList) {
				if (s.getName().equals("Fordítási gyakorlat")) {
					
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
					Item item571 = new Item(s.getKey(), "Mibol gondolod, hogy van még idonk?",
							"What makes you think we still have time?");
					Item item572 = new Item(s.getKey(), "Te is kertésszel gondoztatod a kertedet?",
							"Do you also get a gardener to look after your garden?");
					Item item573 = new Item(s.getKey(), "A vacsorán egy fél disznót megetettek velem.",
							"They made me eat half a hog for dinner.");
					Item item574 = new Item(s.getKey(), "Egy rendorrel magyaráztatta el a helyes útirányt.",
							"She has had a policeman explain the right way.");
					Item item575 = new Item(s.getKey(), "Egyenesíttesd ki, ha görbe.", "Have it straightened if it's crooked.");
					Item item576 = new Item(s.getKey(), "Le kell vágatnom a hajam.", "I must get my hair cut.");
					Item item577 = new Item(s.getKey(), "Elhitettem vele, hogy minden rendben van.",
							"I made him believe that everything was alright.");
					Item item578 = new Item(s.getKey(), "Messzirol kell szállíttatnia a tejet.",
							"He's got to get the milk delivered from far away.");
					Item item579 = new Item(s.getKey(), "Portrét csináltattam a feleségemrol.", "I had a portrait made of my wife.");
					Item item580 = new Item(s.getKey(), "Rózsa Sándor a lovát ugratja.", "Alex Rose is getting his horse to jump.");
					Item item581 = new Item(s.getKey(), "Felköttetem a Lord Mayort!", "I'll have the Lord Mayor hanged.");
					Item item582 = new Item(s.getKey(), "Az utolsó szemig felszedettem vele, amit eldobált.",
							"I've made him pick up every scrap he's thrown.");
					Item item583 = new Item(s.getKey(), "Szörnyu szegénységemben lopni kezdtem.",
							"My terrible poverty made me start stealing.");
					Item item584 = new Item(s.getKey(), "Szörnyu izgalmamban dadogni kezdtem.",
							"My terrible excitement made me sart stammering.");
					Item item585 = new Item(s.getKey(), "Akkor se vetetem el, ha nem veszel el!",
							"I won't have it taken even if you don't marry me.");
					Item item586 = new Item(s.getKey(), "Csak nem akarod velem elhitetni, hogy én voltam neked az elso?",
							"I hope you don't want to make me believe I was the first for you!");
					Item item587 = new Item(s.getKey(), "Ki kényszeríthet arra, hogy megtedd?", "Who can get you to do it?");
					Item item588 = new Item(s.getKey(), "Szerinted nem szörnyu dolog kitömetni a kedvenc állataidat?",
							"Don't you think it's a horrible thing to have your pets stuffed?");
					Item item589 = new Item(s.getKey(), "Miért nem csinálataod már meg ezt a vacak magnót?",
							"Why don't you have that shoddy tape recorder mended?");
					Item item590 = new Item(s.getKey(), "Nem tudtam kiverni a fejébol, amit az anyósa mondott neki.",
							"I couldn't make him forget what his mother-in-law had told him.");
					Item item591 = new Item(s.getKey(), "A tizedik felesége se tudta feledtetni vele a legelsot.",
							"Even his tenth wife was unable to make him forget the first one.");
					Item item592 = new Item(s.getKey(), "Egy kis sírással mindent elérek nála.",
							"With some crying I can make him do anything I want.");
					Item item593 = new Item(s.getKey(), "Miért nem vágatod le, ha túl hosszú?",
							"Why don't you have it cut if it's too long?");
					Item item594 = new Item(s.getKey(), "Eloszedettem vele mindent, amit eldugott.",
							"I've had her produce everything she's hidden.");
					Item item595 = new Item(s.getKey(), "Hányszor építtetted át a házadat?",
							"How many times have you had your house rebuilt?");
					Item item596 = new Item(s.getKey(), "Itasd meg vele az egészet.", "Get him to drink it all.");
					Item item597 = new Item(s.getKey(), "Érd el, hogy bevallja, kivel, hol, hányszor.",
							"Get her to confess where, with whom, and how many times.");
					Item item598 = new Item(s.getKey(), "Az az idióta tanár mindig ilyen hülye mondatokat fordíttat velünk.",
							"That foolish teacher is always making us translate such stupid sentences.");
					Item item599 = new Item(s.getKey(), "Ha szeretsz, eljössz délután.",
							"If you love me, you will come to my place in the afternoon.");
					Item item600 = new Item(s.getKey(), "Ha szeretnél, eljönnél délután.",
							"If you loved me, you will come to my place in the afternoon.");
					Item item601 = new Item(s.getKey(), "Ha szerettél volna, eljöttél volna délután.",
							"If you had loved me, you would have come to my place in the afternoon.");
					Item item602 = new Item(s.getKey(), "Ha többet dolgoztál volna, most több pénzt kapnál.",
							"If you had worked harder, you would get more money now.");
					Item item603 = new Item(s.getKey(), "Ha akkor leszoksz a dohányzásról, nem kerültél volna kórházba.",
							"If you had given up smoking, you wouldn’t have been taking to hospital.");
					Item item604 = new Item(s.getKey(), "A tej megsavanyodik, ha néhány napra elöl hagyod.",
							"Milk goes sour if you leave it outside for some days.");
					Item item605 = new Item(s.getKey(), "A virág elpusztul, ha nem öntözöd.",
							"Flowers die if you do not water them.");
					Item item606 = new Item(s.getKey(), "Mindig segítek neki, ha megkér rá.",
							"I always help her if she asks me to.");
					Item item607 = new Item(s.getKey(), "Ha neked lennék,…", "If I were you,...");
					Item item608 = new Item(s.getKey(), "Nem adok neki pénzt, hacsak tényleg nincs rá szüksége.",
							"I won’t give her money unless she really needs it.");
					Item item609 = new Item(s.getKey(), "Ha hajlandó lenne ideadni a kocsidat, el tudnék menni Püspökladányba.",
							"If you would lend me your car, I would go to Püspökladány.");
					Item item610 = new Item(s.getKey(), "Ha lennél szíves segíteni, hamarabb befejezném.",
							"If you would be so kind as to help me, I would finish it sooner.");
					Item item611 = new Item(s.getKey(),
							"Ha esetleg, netalántán találkoznál a barátommal, mond meg neki, hogy látni szeretném.",
							"If you should meet my friend, tell him I want to see him.");
					Item item612 = new Item(s.getKey(), "Ha nem lenne rossz a kocsi, idoben odaérnénk.",
							"If it weren’t for the bad car, we would get it there in time.");
					Item item613 = new Item(s.getKey(), "Ha nem termeszthettek volna zöldséget, biztos, hogy éheztek volna.",
							"If it weren’t for a few vegetables they grew, they would surely have starved.");
					Item item614 = new Item(s.getKey(), "Ha el tudsz jönni délután, kimehetünk a Fradi meccsre.",
							"If you can come in the afternoon, we can go to the Fradi's match.");
					Item item615 = new Item(s.getKey(), "Vigyél kabátot arra az esetre, ha esne.",
							"Take your coat in case it rains.");
					Item item616 = new Item(s.getKey(),
							"Fozök egy csomó levest, arra az esetre, ha úgy döntenek, hogy itt maradnak vacsorára.",
							"I’ll cook plenty of soap just in case they decide to stay for dinner.");
					Item item617 = new Item(s.getKey(), "Elmegyek, feltéve ha te is mész.", "I’ll go provided you go, too.");
					Item item618 = new Item(s.getKey(), "Feltéve ha nincs ellenvélemény, itt tartjuk a gyulést.",
							"Provided there is no opposition, we’ll hold the meeting here.");
					Item item619 = new Item(s.getKey(), "Két szegény legény szántani menne, ha volna kenyere.",
							"The two poor chaps would go ploughing if they had bread.");
					Item item620 = new Item(s.getKey(), "Ha adsz egy zsebkendot, megtörlöm az orrom.",
							"If you give me a tissue paper, I’ll wipe my nose.");
					Item item621 = new Item(s.getKey(), "Ha a kutya nem ébresztett volna fel, nem hallottuk volna a betöroket.",
							"If the dog hadn’t woken us, we wouldn’t have heard the burglars.");
					Item item622 = new Item(s.getKey(),
							"Ha a japánok nem építenének olyan jó hajókat, Lengyelország volna a csúcson.",
							"Were it not for the Nips being so good at building ships, Poland would be on the top.");
					Item item623 = new Item(s.getKey(), "Elcserélnéd két 16 évesre, ha fiatalabb volnál?",
							"Would you change her for two 16-year old chicks if you were younger?");
					Item item624 = new Item(s.getKey(), "Megszámoltam volna, ha tudtam volna.",
							"I would have counted it if I had been able to.");
					Item item625 = new Item(s.getKey(), "Ha vártak volna, találkoztunk volna.",
							"Had they waited, we would have met.");
					Item item626 = new Item(s.getKey(), "Ha a lónak hat lába volna, nem botlana meg.",
							"If a horse had six legs, it wouldn't stumble.");
					Item item627 = new Item(s.getKey(), "Táncoltam volan én veled, ha nem fáj a fogam.",
							"I would have danced with you if I hadn't had a toothache.");
					Item item628 = new Item(s.getKey(), "Majd meglátogatlak, ha lesz elég idom.",
							"I'll visit you if I have enough time.");
					Item item629 = new Item(s.getKey(), "Mit vennél, ha lenne egy milliód?",
							"What would you buy if you had a million.");
					Item item630 = new Item(s.getKey(), "Ha nem sietsz, még elkésünk.", "If you don't hurry we'll be late.");
					Item item631 = new Item(s.getKey(), "Ha megvetted volna, most nem lenne pénzed.",
							"If you had bought it, now you wouldn't have money.");
					Item item632 = new Item(s.getKey(), "Meginnám, ha nem lenne olyan hideg.",
							"I would drink it if it wasn't so cold.");
					Item item633 = new Item(s.getKey(), "A helyedben nem fogadnám el azt az állást.",
							"If I were you I wouldn't take that job.");
					Item item634 = new Item(s.getKey(), "Ha tovább kerested volna, megtaláltad volna.",
							"Had you kept on looking for it, you would have found it.");
					Item item635 = new Item(s.getKey(), "Ha megfáztál volna, most nem jöhetnél velünk.",
							"If you had caught a cold, you couldn't come with us now.");
					Item item636 = new Item(s.getKey(), "Ha már úgyis mész a zöldségeshez, hozz egy fél kiló uborkát.",
							"If you go to the greengrocer's anyway, please bring me half a kilo of cucumber.");
					Item item637 = new Item(s.getKey(), "Örülnék, ha nem szórakoznál annyit.",
							"I'd be happy if you didn't keep fooling around.");
					Item item638 = new Item(s.getKey(), "Ha nem lettek volna téveszméi, már rég elhagyta volna az országot.",
							"If he hadn't had delusions, he would have left the country long ago.");
					Item item639 = new Item(s.getKey(), "Ha a nyuszi medve volna, a vadásznak is kisebb szája lenne.",
							"If a rabbit were a bear, the hunter would be less boastful.");
					Item item640 = new Item(s.getKey(), "Elmennék, ha nem kéne nyakkendot kötnöm.",
							"I would go if I didn't need to put on a tie.");
					Item item641 = new Item(s.getKey(), "Ha esetleg megtalálod, add vissza neki.",
							"If you should find it, give it back to him.");
					Item item642 = new Item(s.getKey(), "Ha hajlandó lennél rámfigyelni, már túl lennénk rajta.",
							"If you would listen to me, we would be over with it.");
					Item item643 = new Item(s.getKey(), "El tudtam volna vágni, ha jobb kést adtál volna.",
							"I would have been able to cut it if you had given me a better knife.");
					Item item644 = new Item(s.getKey(), "Nem örülnék, ha máris elmennél.",
							"I wouldn't be glad if you left right away.");
					Item item645 = new Item(s.getKey(), "Ha nem lett volna ez a sok új szó, most én lennék a legokosabb.",
							"If there hadn't been so many new words. I'd be the cleverest now.");
					Item item646 = new Item(s.getKey(), "Ha én lennék a téeszelnök, Jóska lenne a párttitkár.",
							"If I were the farm manager, Joe would be the secretary of the party.");
					Item item647 = new Item(s.getKey(), "Megszámoltam volna, ha tudtam volna.",
							"I would have counted it if I had been able to.");
					Item item648 = new Item(s.getKey(),
							"Ha csak azért jöttél, hogy veszekedj, jobb lett volna, ha otthon maradsz.",
							"If you've come only to quarrel, you'd better have stayed at home.");
					Item item649 = new Item(
							s.getKey(),
							"Ha örökké attól félnél, hogy nem tudsz hozzájutni elég nohöz, elobb vagy utóbb épp oly zavart lennél szellemileg, mint a pszichiáter, aki kezel.",
							"If you were always afraid of not getting enough women, sooner or later you would be as confused as the psychiatrist who treated you.");
					Item item650 = new Item(s.getKey(), "Ha mégis elveszettnek érzed magad, kérj segítséget bárkitol.",
							"Should you feel lost, you could ask anybody for help.");
					Item item651 = new Item(s.getKey(), "Ha hajlandó lennél szép csendben elmenni, minden egyszerubb lenne.",
							"If you would leave in silence, everything would be more simple.");
					Item item652 = new Item(s.getKey(), "Megcsináltam volna, ha kellett volna.",
							"I would have done it if I had had it.");
					Item item653 = new Item(s.getKey(), "Ha netán felébredne, mondd meg neki, hogy hamarosan visszajövök.",
							"If he should wake up, tell him I'll be back in no time.");
					Item item654 = new Item(s.getKey(), "Ha nem huzod meg a farkát nem rúg meg.",
							"If you don't pull his tail, he won't kick you.");
					Item item655 = new Item(s.getKey(), "Ha el tudnám olvasni az írásodat, egybol válaszolnék is.",
							"If I could read your writing, I would answer immediately.");
					Item item656 = new Item(
							s.getKey(),
							"Ha kibirnám, hogy ne nézzem örökké az ajkad, soha nem kérnél meg, hogy az extázis új magasságaiba vigyelek.",
							"If I could help keeping my eyes away from your lips, you would never ask me to take you to the new heights of ecstasy.");
					Item item657 = new Item(s.getKey(),
							"Ha a halálbüntetést nem törölték volna el, most nem ölelhetnélek itt karjaimban.",
							"If capital punishment had not been cancelled, I could certainly not be holding you in my arms.");
					Item item658 = new Item(s.getKey(), "A helyedben nem hinném el, mit mond.",
							"If I were you, I wouldn't believe what he says.");
					Item item659 = new Item(s.getKey(),
							"Ha figyelted volna, hogy rakja a lábát, most te is tudnád járni ezt a táncot.",
							"Had you watched her putting her feet, you would be able now to do this dance.");
					Item item660 = new Item(s.getKey(), "Ha gondját viselnéd a családnak, elmehetnénk végre nyaralni.",
							"If you looked after the family, we could have our holiday at last.");
					Item item661 = new Item(s.getKey(), "Ha véletlenül ült volna rá a kalapomra, meg is bocsájtanék neki.",
							"If she sat on my hat by accident, I would forgive her.");
					Item item662 = new Item(s.getKey(), "Nem tudunk elutazni, hacsak meg nem ütjük a fonyereményt.",
							"We can't go away unless we win the first prize.");
					Item item663 = new Item(
							s.getKey(),
							"Ha nem a férjemhez mentem volna feleségül, hanem hozzád, most nem engedhetnénk meg magunknak, hogy együtt utazzunk Hawaiba.",
							"Had I married you and not my husband, we couldn't afford now to go together to Hawaii.");
					Item item664 = new Item(s.getKey(),
							"Ha idoben telefonáltál volna, nem kellett volna megkérnem az ikreket, hogy hozzanak virágot.",
							"If you had telephoned in time, I wouldn't have had to ask the twins to bring glowers.");
					Item item665 = new Item(s.getKey(), "Ha nagyobb halat tudtam volna fogni, korábban hazajöttem volna.",
							"If I had been able to catch a bigger fish, I would have come home earlier.");
					Item item666 = new Item(s.getKey(), "Ha nem lenne olyan önzo, nekem is adna egy túró rudit.",
							"If he wasn't so selfish, he would give a cottage cheese Rudolph to me, too.");
					Item item667 = new Item(s.getKey(), "Ha esetleg megtalálod, hívj fel.",
							"If you should find it, give me a ring.");
					Item item668 = new Item(s.getKey(), "Megcímezném a borítékot, ha volnál szíves adni egy tollat.",
							"I'd address the envelope if you would give me a pen.");
					Item item669 = new Item(s.getKey(), "Csiga-biga told ki szarvadat, ha nem tolod összetöröm házadat.",
							"Snaily snail, push out your horn, if you don't push it out, I'll break your house.");
					Item item670 = new Item(s.getKey(), "Ha nem teszed a tejet hutobe, megsavanyodik.",
							"If you don't put milk in the fridge, it goes sour.");
					Item item671 = new Item(s.getKey(), "Ha nem lettek volna olyan igézo szemei, észre se vette volna.",
							"Were it not for her eyes being so ravishing, he would never have noticed her.");
					Item item672 = new Item(s.getKey(), "Itthon maradok, hacsak meg nem hívnak.",
							"I'll stay at home unless I'm invited.");
					Item item673 = new Item(s.getKey(), "Hacsak a kormány nem ad több pénzt, be kell zárni a színházat.",
							"Unless the government agrees to give extra money, the theatre will have to be closed.");
					Item item674 = new Item(s.getKey(), "Ha nem segítettél volna, sose fejeztük volna be.",
							"If it hadn't been for your help, we'd never have finished it.");
					Item item675 = new Item(s.getKey(), "Ha hallgattál volna, bölcs maradtál volna.",
							"Had you kept silent, you would have stayed wise.");
					Item item676 = new Item(s.getKey(), "Hangosan beszélt, hogy mindenki hallja.",
							"He spoke loudly so (that) everybody could hear him.");
					Item item677 = new Item(s.getKey(), "Jobb ha taxival mész, nehogy megint elkéss.",
							"You’d better take a taxi so as not to be late again.");
					Item item678 = new Item(s.getKey(), "Fölvette a szemüvegét, hogy jobban lásson.",
							"He put on his glasses to be able to see better/so that he could see better.");
					Item item679 = new Item(s.getKey(), "Újságot tett a székre, nehogy a kéménysepro összemaszatolja.",
							"He put a newspaper on the chair so (that) the chimney sweep wouldn’t stain it.");
					Item item680 = new Item(s.getKey(), "Kinyitotta az ajtót, hogy a gyerekek kimehessenek az utcára.",
							"He opened the door so that the kids could go out to the street.");
					Item item681 = new Item(s.getKey(), "Kesztyut húzott, nehogy ujjlenyomatot hagyjon.",
							"He put on gloves so as not to leave his fingerprints there.");
					Item item682 = new Item(s.getKey(), "Mindjárt ablakot nyitok, hogy kimenjen a füst.",
							"I’m going to open the window so (that) the smoke will go out.");
					Item item683 = new Item(s.getKey(), "Temetni jöttem Caesart nem dicsérni.",
							"I came to bury Caesar not to praise him.");
					Item item684 = new Item(s.getKey(), "Korán kelt, hogy még napnyugta elott elérje a hegy csúcsát.",
							"He got up early (so as) to reach the summit before sunset.");
					Item item685 = new Item(s.getKey(), "Berohant az égo házba, hogy kimentse a gyereket.",
							"He rushed into the burning house to rescue the child.");
					Item item686 = new Item(s.getKey(), "Felhúzta a szoknyáját, hogy gyorsabban tudjon futni.",
							"She pulled up her skirt so that she could run faster.");
					Item item687 = new Item(s.getKey(), "Elkezdett reszketni, hogy jobban sajnálják.",
							"She started trembling to raise more sympathy.");
					Item item688 = new Item(s.getKey(), "Összetörte a tükröt, hogy a felesége ne tudja nézegetni magát.",
							"He broke the mirror into pieces so that his wife couldn't look at herself any more.");
					Item item689 = new Item(s.getKey(), "Jancsi elfordult, hogy ne lássa a leány, hogy könnye kicsordul.",
							"Jancsi turned away so that the girl couldn't see the tears roll down his cheeks.");
					Item item690 = new Item(s.getKey(), "A fejére húzta a szoknyáját, hogy ne ázzon el a frizurája.",
							"She pulled her skirt over her head so that her hairdo wouldn't get ruined.");
					Item item691 = new Item(s.getKey(), "Felemelte a szonyeget, hogy alásöpörhesse a szemetet.",
							"She lifted the rug so as to sweep the garbage under it.");
					Item item692 = new Item(s.getKey(), "Megmutattam neki mim van, nehogy aztán csalódjon.",
							"I showed her what I had so that she shouldn't be disappointed later on.");
					Item item693 = new Item(s.getKey(), "Lenyelte a gyémántot, nehogy a vámos megtalálja nála.",
							"He swallowed the diamond so that the customs officer couldn't find it.");
					Item item694 = new Item(s.getKey(), "Vettem neki virágot, hogy szagolgathassa.",
							"I've bought her some flowers so that she can enjoy the fragrance.");
					Item item695 = new Item(s.getKey(), "Elvált a nyolcadiktól, hogy elvehesse a kilencediket.",
							"He divorced the eight one so as to marry the ninth one.");
					Item item696 = new Item(s.getKey(), "Levettem a cipomet, hogy ne csapjak zajt.",
							"I took off my shoes so as not to make any noise.");
					Item item697 = new Item(s.getKey(), "Levettem a cipomet, hogy ne hallja a nejem, amint bemegyek.",
							"I took off my shoes so that my wife couldn't hear me go in.");
					Item item698 = new Item(s.getKey(), "Nagyon halkan zongorázz, hogy ne zavarj senkit.",
							"Play the piano very soft so as not to disturb anybody.");
					Item item699 = new Item(s.getKey(), "Odaadtam neki a kulcsot, hogy be tudjon menni a szobába.",
							"I've given her the key so that she can go into the room.");
					Item item700 = new Item(s.getKey(), "Kikapcsolta a rádiót, nehogy felébredjen a szomszéd.",
							"He turned the radio off so the neighbor wouldn't wake up.");
					Item item701 = new Item(s.getKey(), "Add ide a poharad, hogy mi is ihassunk.",
							"Give us your glass so we can also drink.");
					Item item702 = new Item(s.getKey(), "Kint hagyta a pisztolyát, nehogy lelojön valakit.",
							"He left his gun outside so as not to shoot anyone.");
					Item item703 = new Item(s.getKey(), "Minden reggel iszik egy felest, hogy vidáman kezdje a napot.",
							"She drinks a 'feles' every morning so as to start the day cheerfully.");
					Item item704 = new Item(s.getKey(),
							"Kolompot akasztottak a tehén nyakába, hogy a bika mindig tudja merre jár.",
							"A bell was hung in the neck of the cow so that the bull would always know which way she was going.");
					Item item705 = new Item(s.getKey(), "Korán indulj, nehogy elkéss.", "Start early not to be late.");
					Item item706 = new Item(s.getKey(), "Örökké változtatta a címét, hogy becsapja a rendorséget.",
							"She kept changing her address so as to fool the police.");
					Item item707 = new Item(s.getKey(), "Adj neki egy nagy pofont, hogy tudja merre mennyi.",
							"Give him a big slap so that he knows the limit.");
					Item item708 = new Item(s.getKey(), "Vett egy macskát, hogy a kutya ne unatkozzon.",
							"He bought a cat so that the dog wouldn't be bored.");
					Item item709 = new Item(s.getKey(),
							"Felállított egy madárijesztot, hogy nehogy a seregélyek ellopják a szolot.",
							"He set up a scarecrow so that the starlings wouldn't steal the grapes.");
					Item item710 = new Item(s.getKey(),
							"Azért mondjuk, hogy 'AHA', hogy Kanga tudja, hogy mi tudjuk, hol van a Zsebibaba.",
							"We say 'AHA' so that Kanga knows that we know where Baby Roo is.");
					Item item711 = new Item(s.getKey(), "Beöltözött apácának, hogy kiszökhessen a börtönbol.",
							"He disguised himself as a nun so that he would be able to run away from prison.");
					Item item712 = new Item(s.getKey(), "Foztem szegény fiamnak egy kis mákostésztát, hadd egyen egy jót.",
							"I cooked some noodles with poppy seeds for my poor son, so that he would have something good to eat.");
					Item item713 = new Item(s.getKey(), "Tedd ki, hogy mindenki láthassa.",
							"Put it out so that everybody can see it.");
					Item item714 = new Item(s.getKey(), "Ültetett egy kis spenótot, hogy legyen majd mit ennünk.",
							"She planted some spinach so that we should have something to eat.");
					Item item715 = new Item(s.getKey(), "Kirúgta, hogy berúghasson.", "He knocked her out so as to get drunk.");
					Item item716 = new Item(s.getKey(), "Meglepodtem azon, amit láttam.", "I was surprised what I saw.");
					Item item717 = new Item(s.getKey(), "Elmesélte azt, amit tudott az esetrol.",
							"He told me what he knew about the event.");
					Item item718 = new Item(s.getKey(), "Emlékszem arra, amit elmeséltél.", "I remember what you told me.");
					Item item719 = new Item(s.getKey(), "Emlékszem arra a történetre, amit elmeséltél.",
							"I remember the story which/that you told me.");
					Item item720 = new Item(s.getKey(), "Elhoztam azt a könyvet, amit kértél.",
							"I’ve brought the book that you asked for.");
					Item item721 = new Item(s.getKey(), "Olyan ember O, akinek nincs múltja.", "He’s a man who has no past.");
					Item item722 = new Item(s.getKey(), "Ez az a ház, ahol áll az ido.",
							"This is the house where time has stopped existing.");
					Item item723 = new Item(s.getKey(), "Emlékeztettem arra, amit ígért.",
							"I reminded him of what he had promised.");
					Item item724 = new Item(s.getKey(), "Ez az, amit nem szabad elfelejtened.", "This is what you mustn't forget.");
					Item item725 = new Item(s.getKey(), "A lány, akinek olyan szép az arca, az én feleségem.",
							"The girl whose face is so pretty is my wife.");
					Item item726 = new Item(s.getKey(), "A fiú, akit láttam, …", "The boy I saw …");
					Item item727 = new Item(s.getKey(), "Az autó, melyet ott látsz, …", "The car you can see there …");
					Item item728 = new Item(s.getKey(), "A szoba, melyet kifestettél, …", "The room you painted …");
					Item item729 = new Item(s.getKey(), "A könyv, amelyr?l beszélek.", "The book I’m talking about.");
					Item item730 = new Item(s.getKey(), "A táska, melyben a levelet találtam.", "The bag I found the letter in.");
					Item item731 = new Item(s.getKey(), "A szék, melyre rá akarok ülni.", "The chair I want to sit on.");
					Item item732 = new Item(s.getKey(), "A lány, akihez beszélek.", "The girl I am talking to.");
					Item item733 = new Item(s.getKey(), "Abban a pillanatban, amikor belépett a szobába.",
							"The moment he entered the room.");
					Item item734 = new Item(s.getKey(), "Abban az évben találkoztam vele, amikor megnosültem.",
							"I met him the year I got married.");
					Item item735 = new Item(s.getKey(), "Oda megyek, ahova akarod.", "I’ll got to any place you want me to.");
					Item item736 = new Item(s.getKey(), "Ez az, amiért szeret ide jönni.",
							"That is the reason he likes to come here.");
					Item item737 = new Item(s.getKey(),
							"Ronald Reagan, aki valaha színész volt, nem nagy dicsosége az amerikai népnek.",
							"Ronald Reagan, who used to be an actor, is an embarrassment for the American people.");
					Item item738 = new Item(s.getKey(), "Budapest, melyet sokan látogatnak, gyönyöru.",
							"Budapest, which lots of tourists visit, is beautiful.");
					Item item739 = new Item(s.getKey(), "Körbefutotta a Szigetet, ami teljesen kimerítette.",
							"He ran around the island, which exhausted him.");
					Item item740 = new Item(s.getKey(), "Ellopta a fonöke tollát, ami nagyon kínos volt.",
							"He stole his boss’s pen, which was very embarrassing.");
					Item item741 = new Item(s.getKey(), "Kösz az ajándékot, amit küldtél.",
							"Thank you for the present you sent me.");
					Item item742 = new Item(s.getKey(), "Az ágy, amin alszom, lószorbol van.",
							"The bed I sleep on is made of horse hair.");
					Item item743 = new Item(s.getKey(), "Elfelejtettem, amit mondtál.", "I’ve forgotten what you've told me.");
					Item item744 = new Item(s.getKey(), "Rómeo, aki szerette Júliát, felmászott az erkélyre.",
							"Romeo, who loved Juliet, limbed up to the balcony.");
					Item item745 = new Item(s.getKey(), "A dal, amit csak neked írok…", "The song I’m writing only for you…");
					Item item746 = new Item(s.getKey(), "A tócsa, amibe belelépett…", "The puddle he stepped in…");
					Item item747 = new Item(s.getKey(), "A lány, akinek a bátyja nagyon eros…",
							"The girl whose brother is very strong…");
					Item item748 = new Item(s.getKey(), "Nem értettem a tréfát, amit mondott.",
							"I didn’t quite understand the joke he said.");
					Item item749 = new Item(s.getKey(), "Nem értettem, amit mondott.", "I didn’t understand what he said.");
					Item item750 = new Item(s.getKey(), "Egy könyvet akar elolvasni, ami teljesen szokatlan tole.",
							"He wants to read a book, which is quite unusual of him.");
					Item item751 = new Item(s.getKey(), "Ez az a szálloda, amelyikben tavaly laktam.",
							"This is the hotel I lived in last year.");
					Item item752 = new Item(s.getKey(), "Szeret Mariskával táncolni, aki úgy mozog, mint a higany.",
							"I like dancing with Mary, who moves like mercury.");
					Item item753 = new Item(s.getKey(), "A hajó, amit amott látsz, a sógoromé.",
							"The ship you can see over there belongs to my brotherin-law.");
					Item item754 = new Item(s.getKey(), "Félek, ez minden, amit adhatok.", "I'm afraid that's all I can give you.");
					Item item755 = new Item(s.getKey(), "Az autó, amiért egy vagyont fizettem, meg se mozdul.",
							"The car I've paid an absolute fortune for doesn't even move.");
					Item item756 = new Item(s.getKey(), "Te úristen, elfelejtettem, amit kértél.",
							"Oh my God, I've forgotten what you've asked me for.");
					Item item757 = new Item(s.getKey(), "Lekéste a vonatot, ami fölöttébb bosszantotta.",
							"She missed the train, which really annoyed her.");
					Item item758 = new Item(s.getKey(), "Jóska, akinek a szülei vidéken élnek, tegnap meglátogatott.",
							"Joe, whose parents live in the country, visited me yesterday.");
					Item item759 = new Item(s.getKey(), "Mindig azt tette, amihez kedve volt.",
							"He always did what he felt like doing.");
					Item item760 = new Item(s.getKey(), "A hölgy, akivel tegnap találkoztál, a nagynéném.",
							"The lady you met yesterday is my aunt.");
					Item item761 = new Item(s.getKey(), "Meglepodtem azon, amit láttam.", "I was surprised at what I had to see.");
					Item item762 = new Item(s.getKey(), "Az állás, amire pályázik, már nem üres.",
							"The job he applies for is not vacant anymore.");
					Item item763 = new Item(s.getKey(), "Aztán bementünk egy bárba, ami teljesen üres volt.",
							"Then we went into a pub which was completely empty.");
					Item item764 = new Item(s.getKey(), "A pincér, aki a rendelést vette föl, olyan koszos volt, mint a föld.",
							"The waiter who took our order was as dirty as earth.");
					Item item765 = new Item(s.getKey(), "A számla, amit késve kaptunk, tele volt olvashatatlan számokkal.",
							"The bill we got late was full of illegible numbers.");
					Item item766 = new Item(s.getKey(), "Az üzletvezeto, akit már 20 éve ismerek, elnézést kért.",
							"The landlord, whom I have known for twenty years, apologized to me.");
					Item item767 = new Item(s.getKey(), "A pofon, amit a pincértol kaptam, nagyon fájt.",
							"The slap I got from the waiter was very painful.");
					Item item768 = new Item(s.getKey(), "A mento, amivel kórházba vittek, úgy zötykölodött, mint egy talicska.",
							"The ambulance I was taken into hospital in was jolting like a barrow.");
					Item item769 = new Item(s.getKey(), "Az ápolóno, akinek a keze selymes volt, megsimogatta a homlokomat.",
							"The nurse whose hand was silky caressed my fore head.");
					Item item770 = new Item(s.getKey(), "A férfi, aki a fa alatt áll, tegnap még börtönben volt.",
							"The man who is standing under the tree was in prison yesterday.");
					Item item771 = new Item(s.getKey(), "A baleset, amit láttunk, nagyon súlyos volt.",
							"The accident we have seen has been very serious.");
					Item item772 = new Item(s.getKey(), "A tehenek, akik ott legelésznek nagyon szomjasak.",
							"The cows who are grazing there are very thirsty.");
					Item item773 = new Item(s.getKey(), "A labda, amit elvesztettél, még teljesen új volt.",
							"The ball you've lost was absolutely new.");
					Item item774 = new Item(s.getKey(), "A tanár, akinek a tanítványa megnyerte a versenyt, szereti a mézet.",
							"The teacher whose student won the competition likes honey.");
					Item item775 = new Item(s.getKey(), "Apukám, aki vidéken született, nagyon eros.",
							"My father, who was born in the country, is a very strong man.");
					Item item776 = new Item(s.getKey(), "Az a fivérem, aki ebbe az iskolába jár, sokat dohányzik.",
							"My brother who attends this school smokes a lot.");
					Item item777 = new Item(s.getKey(), "A novérem, aki újságíró nem szereti a híradót.",
							"My sister, who is a journalist, doesn't like TV news.");
					Item item778 = new Item(s.getKey(), "Budapest, mely Magyarország fovárosa, a Duna két partján terül el.",
							"Budapest, which is the capital of Hungary, lies on the banks of the Danube.");
					Item item779 = new Item(s.getKey(), "A ház, melyben lakom, elég kicsi.", "The house I live in is quite small.");
					Item item780 = new Item(s.getKey(), "Karcsi, akit mindnyájan szeretünk, a város KISZtitkára volt.",
							"Karcsi, whom we all love, used to be the secretary of the Young Communists of the town.");
					Item item781 = new Item(s.getKey(), "A toll, amivel írsz, az enyém.", "The pen you're writing with is mine.");
					Item item782 = new Item(s.getKey(), "A ház, melynek zöldek az ablakai a Dunára néz.",
							"The house whose windows are green overlooks the Danube.");
					Item item783 = new Item(s.getKey(), "Azt mondja, hogy lekéste a vonatot, ami nem igaz.",
							"He says he's missed the train, which is not true.");
					Item item784 = new Item(s.getKey(), "Add oda neki, amit akar.", "Give him what he wants.");
					Item item785 = new Item(s.getKey(), "Mindent adj oda neki, amit akar.", "Give him everything he wants.");
					Item item786 = new Item(s.getKey(), "Megdöbbentett amit mondott.", "I was shocked by what she'd said.");
					Item item787 = new Item(s.getKey(), "Felejtsd el amit láttál.", "Forget what you've seen.");
					Item item788 = new Item(s.getKey(), "Egy szót se értek abból, amit mondasz.",
							"I don't understand a word you say.");
					Item item789 = new Item(s.getKey(), "Nem érted amit mondok?", "Don't you understand what I'm telling you?");
					Item item790 = new Item(s.getKey(), "Talán ez az az ember, akit keres a rendorség.",
							"Maybe this is the guy the police want.");
					Item item791 = new Item(s.getKey(), "Mindnyájunkat meghívott, ami nagyon kedves volt tole.",
							"She invited us all, which was very kind of her.");
					Item item792 = new Item(s.getKey(), "Te vagy a legnagyszerubb lány, akivel valaha találkoztam.",
							"You are the most fantastic girl I've ever met.");
					Item item793 = new Item(s.getKey(), "De hisz ez nem az a férfi, aki megkérte a kezemet!",
							"But this is not the man who popped the question.");
					Item item794 = new Item(s.getKey(), "Emlékszel már arra, amit tegnap tettél velem?",
							"Do you remember now what you did to me yesterday?");
					Item item795 = new Item(s.getKey(), "A rádió, ami az asztalon van, bedöglött.",
							"The radio which is on the table has broken down.");
					Item item796 = new Item(s.getKey(), "A hó, amit a hókotró elkotort, ott feketéllik az út mentén.",
							"The snow that was pushed off by a snow plough is blackening by the road side. ");
					Item item797 = new Item(s.getKey(),
							"A kopár szik sarja, amin tikkadt szöcskenyájak legelésznek, ég a napmelegtol.",
							"The off shoots of the barren wastelands that parched flocks of grasshoppers are grazing are toiling in the hot sun. ");
					Item item798 = new Item(s.getKey(), "A vasorrú bába, akit Jancsi elégetett, egy mézeskalács házban lakott.",
							"The iron nosed witch, who was burnt by Johnny, used to live in gingerbread house.");
					Item item799 = new Item(s.getKey(), "A törpe, akinek az ágyába Hófehérke belefeküdt, szemérmesen mosolygott.",
							"The dwarf whose bed Snow White lay in was smiling shyly.");
					Item item800 = new Item(s.getKey(), "A farkas, aki a ngymama ruháját vette föl, izgatottan várta Piroskát.",
							"The wolf, who put on Grandmother's robe, was expecting Little Red Riding Hood excitedly.");
					Item item801 = new Item(s.getKey(),
							"Lenin, akit az úttörok nagyon tiszteltek, a Nagy Októberi Szocialista forradalom atyja volt.",
							"Lenin, who was deeplyrespected by pioneers, was the father of the Great October Socialist Revolution.");
					Item item802 = new Item(s.getKey(), "Az Auróra, ami a Volga folyón ringott, a forradalom szimbóluma volt.",
							"Aurora, which was floating on river Volga, was the symbol of the revolution.");
					Item item803 = new Item(s.getKey(), "A puska, amit a lány levett a falról, töltve volt.",
							"The shotgun the girl took off the wall was loaded.");
					Item item804 = new Item(s.getKey(), "A kés, amibe a fiú tízszer belerohant, csirketrancsírozó szerszám volt.",
							"The knife the boy ran into ten minutes times was a chicken carving tool.");
					Item item805 = new Item(s.getKey(), "A hevero, amin a fiú feküdt, a nagyszobában volt.",
							"The couch the boy was lying on was in the living room.");
					Item item806 = new Item(s.getKey(), "Mindent megvesz, amit meglát.", "She buys everything she sees.");
					Item item807 = new Item(s.getKey(), "Elmondtam neki mindent, amit tudok.", "I've told her everything I know.");
					Item item808 = new Item(s.getKey(), "Semmi más nem kell nekem, csak szerelem.", "All I need is love.");
					Item item809 = new Item(s.getKey(),
							"Semmi mást nem tudtam enni, csak egy kis húslevest, töltöttkáposztát, meg egy sültcsirkét.",
							"All I could eat was some meat soup, stuffed cabbage and a fried chicken.");
					Item item810 = new Item(s.getKey(), "Csak egy ötös van nálam.", "All I have on me is a fiver.");
					Item item811 = new Item(s.getKey(), "Csak annyit tudok róla, hogy van egy háza Sukorón.",
							"All I know about her is that she has a house at Sukoró.");
					Item item812 = new Item(s.getKey(), "Nem volt más rajta, csak a kalapja.", "All she had on was her hat.");
					Item item813 = new Item(s.getKey(), "Minden amit ott látsz, a volt férjemé.",
							"All that you can see there belongs to my ex-husband.");
					Item item814 = new Item(s.getKey(), "Nem hagyott itt semmi mást, csak egy koszlott konyharuhát.",
							"All he's left here is a ragged dishcloth.");
					Item item815 = new Item(s.getKey(), "Nem láttam semmi mást, csak sötétséget.",
							"All that I could see was darkness.");
					Item item816 = new Item(s.getKey(), "Ne csináljon semmi mást, csak mossa meg, vágja le, és szárítsa meg.",
							"All you have to do is wash it, cut it, and dry it.");
					Item item817 = new Item(s.getKey(), "Nem tudta mit csinál.", "She didn't know what she was doing.");
					Item item818 = new Item(s.getKey(), "Akármi lehetsz, ami csak akarsz.", "You can be anything you want to be.");
					Item item819 = new Item(s.getKey(), "Azt mondta, hogy megcsinálta, ami igaz volt.",
							"She said she'd done it, which was true.");
					Item item820 = new Item(s.getKey(), "Fiatal koromban jól úsztam.", "I could swim very well when I was young.");
					Item item821 = new Item(s.getKey(), "Olyan nehéz volt, hogy nem tudta megcsinálni.",
							"It was so difficult that he couldn’t do it.");
					Item item822 = new Item(s.getKey(), "Jó úszó voltam, és még abban a viharban is sikerült kijutnom a partra.",
							"I could swim very well, and even in that storm I was able to reach the shore.");
					Item item823 = new Item(s.getKey(), "Bemehetek?", "May I come?");
					Item item824 = new Item(s.getKey(), "Nem mehetsz moziba.", "You may not go to the cinema.");
					Item item825 = new Item(s.getKey(), "Kölcsönveheted a kocsimat.", "You may borrow my car.");
					Item item826 = new Item(s.getKey(), "Kimehetek játszani?", "Can I go out and play?");
					Item item827 = new Item(s.getKey(), "Nem mehetsz Tótkomlósra.", "You can’t go to Tótkomlós.");
					Item item828 = new Item(s.getKey(), "Megnézheted nálam a TV musorát.", "You can watch TV at my place.");
					Item item829 = new Item(s.getKey(), "Nyitva hagyhatom az ajtót?", "Might I leave the door open?");
					Item item830 = new Item(s.getKey(), "Nem jöhetsz be a szobába.", "You might not enter the room.");
					Item item831 = new Item(s.getKey(), "Táncolhatsz avval az úrral.", "You might dance with that man.");
					Item item832 = new Item(s.getKey(), "Nem gyújthatott rá abban a szobában.",
							"He wasn’t allowed to light a cigarette in that room.");
					Item item833 = new Item(s.getKey(), "Nem építhettek úszómedencét a kertben.",
							"They weren’t allowed to build a swimming pool in the garden.");
					Item item834 = new Item(s.getKey(), "Nem csókolhatom meg, mióta bárányhimlos.",
							"I haven’t been allowed to give her a kiss since she has had chicken pox.");
					Item item835 = new Item(s.getKey(), "Soha nem fogják megengedni, hogy átlépd az országhatárt.",
							"You will never be allowed to cross the border.");
					Item item836 = new Item(s.getKey(), "Azt mondta, hogy nem vezethet, mióta összetörte a papa kocsiját.",
							"He said he hadn’t been allowed to drive a car since he had crashed his father’s.");
					Item item837 = new Item(s.getKey(), "Ne tégy ilyet.", "Don’t do things like that.");
					Item item838 = new Item(s.getKey(), "Ne sírj érettem Argentina.", "Don’t cry for me Argentina.");
					Item item839 = new Item(s.getKey(), "Ne kényszeríts arra, hogy megöljem magam.", "Don’t make me kill myself.");
					Item item840 = new Item(s.getKey(), "Nem szabad zavarnod a munkájában.", "You mustn’t disturb him at work.");
					Item item841 = new Item(s.getKey(), "Fure lépni tilos.", "You mustn’t walk on the grass.");
					Item item842 = new Item(s.getKey(), "Nem szabad azt gondolnod, hogy valaha is elfeledlek.",
							"You mustn’t think I’ll ever forget you.");
					Item item843 = new Item(s.getKey(), "Az orvos azt mondja, hogy nem szabad sok kenyeret ennem.",
							"The doctor says I am not to eat much bread.");
					Item item844 = new Item(s.getKey(), "Nem szabad kopogtatás nélkül belépni.",
							"You aren’t to enter the room without knocking.");
					Item item845 = new Item(s.getKey(), "Nem volt szabad velük mennie.", "She wasn’t to go with them.");
					Item item846 = new Item(s.getKey(), "Nem volt szabad kimenned a szobából engedély nélkül.",
							"You weren’t to leave the room without permission.");
					Item item847 = new Item(s.getKey(), "Virágok szedése tilos!", "People may not pick flowers in this park.");
					Item item848 = new Item(s.getKey(), "A kocsiba kutyát behozni tilos.",
							"Dogs may not be taken into these carriages.");
					Item item849 = new Item(s.getKey(), "Nem találkozhatott a családjával a múlt évben.",
							"He wasn’t allowed to meet his family last year.");
					Item item850 = new Item(s.getKey(), "Három hónapja nem találkozhatom a szerelmemmel.",
							"I haven’t been allowed to meet my love for three months.");
					Item item851 = new Item(s.getKey(), "Hagyd abba! Nem tehetsz ilyet!", "Stop! You can’ do that!");
					Item item852 = new Item(s.getKey(), "Nem focizhattok a kertemben.", "You can’t play football in my garden.");
					Item item853 = new Item(s.getKey(), "Nem engedem, hogy Barcelonába menj!", "You can’t go to Barcelona.");
					Item item854 = new Item(s.getKey(), "Nem kéne hazudnod.", "You shouldn’t tell lies.");
					Item item855 = new Item(s.getKey(),
							"Nem volna szabad ígérgetned, hogy randevúzol velem, ha egyszer nem áll szándékodban így tenni.",
							"You oughtn’t to promise you’ll date me, when you have no intention of doing so.");
					Item item856 = new Item(s.getKey(), "Nem kellett volna kinevetned.", "You shouldn’t have laughed at him.");
					Item item857 = new Item(s.getKey(), "Nem lett volna szabad átmenned a piroson.",
							"You oughtn't to have crossed the road when the lights were red.");
					Item item858 = new Item(s.getKey(), "Kilencre vissza kell érned az irodába.",
							"You must be back in the office by nine.");
					Item item859 = new Item(s.getKey(), "Újra meg kell próbálnod.", "You must try it again.");
					Item item860 = new Item(s.getKey(), "Most kell megtennünk.", "We must do it now.");
					Item item861 = new Item(s.getKey(), "Nem kell részt vennie a konferencián.",
							"She needn’t take part in the conference.");
					Item item862 = new Item(s.getKey(), "Nem kell (nem szükséges), hogy a legszebb ruhádban gyere a bulira.",
							"You needn’t put on your smartest dress for the party.");
					Item item863 = new Item(s.getKey(), "Nem kell egész éjjel dolgoznia.", "She doesn't need to work all night.");
					Item item864 = new Item(s.getKey(), "Nyolcra ott kell lennie.", "He has got to be there at eight.");
					Item item865 = new Item(s.getKey(), "Minden reggel el kell vinnie a kislányát iskolába.",
							"She has to take her daughter to school every morning.");
					Item item866 = new Item(s.getKey(), "Kilenckor otthon kell lennem.", "I have (got) to be at home at nine.");
					Item item867 = new Item(s.getKey(), "Itt kell maradnod éjszakára (mert nem engedlek el).",
							"You must stay here for the night.");
					Item item868 = new Item(s.getKey(), "Itt kell maradnod éjszakára (mert már sehogy sem tudsz hazamenni).",
							"You have (to stay here for the night.");
					Item item869 = new Item(s.getKey(), "Új öltönyt kellett vennem.", "I had to buy a new suit.");
					Item item870 = new Item(s.getKey(), "Vissza kellett adniuk.", "They had to give it back.");
					Item item871 = new Item(s.getKey(), "Cigarettát kellett vennie, mert nálam már nem volt.",
							"She had to buy some cigarettes, because I didn’t have any.");
					Item item872 = new Item(s.getKey(), "Nem kellett válaszolniuk arra a buta kérdésre.",
							"They didn’t have to answer that stupid question.");
					Item item873 = new Item(s.getKey(),
							"Nem kellett (nem volt szükséfestot hívnia, mert a férje kifestette az egész lakást.",
							"873) She didn’t need to send for a painter, because her husband could paint the flat.");
					Item item874 = new Item(s.getKey(), "Segítenem kéne neki.", "I ought to help her.");
					Item item875 = new Item(s.getKey(), "Meg kellene (illene) tartanod az ígéretedet.",
							"You should keep your promise.");
					Item item876 = new Item(s.getKey(), "Vigyáznod kéne, hogy mit beszélsz.",
							"You ought to/should be more careful of what you say.");
					Item item877 = new Item(s.getKey(), "Taxival kellett volna menned.", "You should have taken a taxi.");
					Item item878 = new Item(s.getKey(), "Ezeket a könyveket is el kellett volna olvasnom.",
							"I ought to have read these books, too.");
					Item item879 = new Item(s.getKey(), "Már iskolában kellene lenniük.", "They would have to be at school now.");
					Item item880 = new Item(s.getKey(), "El kéne vinnie a kocsiját muszaki vizsgára.",
							"He would have to take his car for an official test.");
					Item item881 = new Item(s.getKey(), "Udvariasabbnak kellett volna lennem.", "I would have had to be politer.");
					Item item882 = new Item(s.getKey(), "Megértobbnek kellett volna lennie velem szemben.",
							"She would have had to be more understandable to me.");
					Item item883 = new Item(s.getKey(), "Ha felmentem volna hozzá, ott is kellett volna maradnom.",
							"If I had gone to his place, I would have had to stay there.");
					Item item884 = new Item(s.getKey(), "Legalább egy fél órát ott kellett volna maradnod.",
							"You should have stayed there for at least half an hour.");
					Item item885 = new Item(s.getKey(),
							"Jövo szombaton kellett volna összeházasodniuk, de összevesztek, így lottek a lagzinak.",
							"They were to have wedded next Saturday, but they fell out.");
					Item item886 = new Item(s.getKey(), "Holnap kellett volna indulnia Amerikába, de elvették az útlevelét.",
							"He was to have left for America tomorrow, but his passport was withdrawn.");
					Item item887 = new Item(s.getKey(), "Végül is nem kellett volna annyira sietned.",
							"You needn’t have been in such a hurry after all.");
					Item item888 = new Item(s.getKey(), "Nem kellett volna idejönnöd.", "You needn’t have come here.");
					Item item889 = new Item(s.getKey(), "Nem kellett volna félbehagynod a munkát.",
							"You oughtn’t to have stopped your work half way.");
					Item item890 = new Item(s.getKey(), "Nem kellett volna hibáztatnod, ha egyszer nem az o bune volt.",
							"You shouldn’t have blamed him, it wasn’t his fault.");
					Item item891 = new Item(s.getKey(), "Mindig kopogj, ha be akarsz jönni hozzám.",
							"You are always to knock before you enter my room.");
					Item item892 = new Item(s.getKey(), "Úgy volt, hogy múlt héten jön.", "She was to arrive last week.");
					Item item893 = new Item(s.getKey(), "Ki kellett rabolniuk a bankot.", "They were to rob the bank.");
					Item item894 = new Item(s.getKey(), "Bizonyára beteg.", "He must be ill.");
					Item item895 = new Item(s.getKey(), "Bizonyára a szobájában tanul.", "He must be studying in his room now.");
					Item item896 = new Item(s.getKey(), "Ez bizonyára szerelem.", "This must be love.");
					Item item897 = new Item(s.getKey(), "Biztos, hogy nem olyan rossz ember.", "He can’t be that bad.");
					Item item898 = new Item(s.getKey(), "Biztos, hogy nem igaz a hír.", "The news can’t be true.");
					Item item899 = new Item(s.getKey(), "Biztos megfáztál a folyón.", "You must have caught cold on the river.");
					Item item900 = new Item(s.getKey(), "Bizonyára elvált.", "She must have got divorced.");
					Item item901 = new Item(s.getKey(), "Biztos Spanyolországba mentek.", "They must have left for Spain.");
					Item item902 = new Item(s.getKey(), "Biztos, hogy nem mondott ilyet.", "She can’t have said that.");
					Item item903 = new Item(s.getKey(), "Biztos, hogy nem o okozta a balesetet.",
							"She couldn’t have caused that accident.");
					Item item904 = new Item(s.getKey(), "Az ki van csukva, hogy ot láttad a Pipacsban, hisz az egy rendes no.",
							"You can’t have seen her at Pipacs night club; she is a decent lady.");
					Item item905 = new Item(s.getKey(), "Bizonyára ez az a hely, ahol a régi iskola állt.",
							"This will be the place where the old school stood.");
					Item item906 = new Item(s.getKey(), "Ez biztosan a postás lesz.", "That will be the postman, I expect.");
					Item item907 = new Item(s.getKey(), "Bizonyára hallottad a hírt.", "You will have heard the news.");
					Item item908 = new Item(s.getKey(), "Vidd magaddal az esokabátod, lehet, hogy esni fog.",
							"Take your raincoat, it may rain.");
					Item item909 = new Item(s.getKey(), "Ne menj el, még megjöhetnek.", "Don’t go away, they may come yet.");
					Item item910 = new Item(s.getKey(), "Lehet, hogy épp a férjével beszélget.",
							"She may be talking now to her husband.");
					Item item911 = new Item(s.getKey(), "Lehet, hogy az esti vonattal jönnek.",
							"They might come by the night train.");
					Item item912 = new Item(s.getKey(), "Lehet, hogy nyerünk egy csomót a lóversenyen.",
							"We might win a lot at the races.");
					Item item913 = new Item(s.getKey(), "Lehet, hogy épp a sarkon áll.", "She might be standing at the corner now.");
					Item item914 = new Item(s.getKey(), "Lehet, hogy beteg volt.", "He may have been ill.");
					Item item915 = new Item(s.getKey(), "Lehet, hogy korábban jött.", "She may have arrived sooner.");
					Item item916 = new Item(s.getKey(), "Lehet, hogy megsérült, vagy meg is sérülhetett volna.",
							"She might have been hurt.");
					Item item917 = new Item(s.getKey(), "Lehet, hogy jelentették a tervüket.",
							"They might have reported their plan.");
					Item item918 = new Item(s.getKey(), "Lehet, hogy eszik. (épp most)", "He may be eating.");
					Item item919 = new Item(s.getKey(), "Lehet, hogy eszik. (ez bizonytalanabb)", "He might be eating.");
					Item item920 = new Item(s.getKey(), "Bizonyára eszik (épp most).", "He must be eating.");
					Item item921 = new Item(s.getKey(), "Biztosan o az.", "It must be him.");
					Item item922 = new Item(s.getKey(), "Biztos, hogy nem o az.", "It can’t be him.");
					Item item923 = new Item(s.getKey(), "Meg kéne házasodni.", "I should get married.");
					Item item924 = new Item(s.getKey(), "El kell venned ot.", "You must marry her.");
					Item item925 = new Item(s.getKey(), "Na fogadjunk, hogy nem kell elvennem.", "I bet I don’t need to marry her.");
					Item item926 = new Item(s.getKey(), "Egy ilyen lányt nem szabad elvenni.",
							"You mustn’t marry a girl like that.");
					Item item927 = new Item(s.getKey(), "Lehet, hogy megette.", "He may eaten it.");
					Item item928 = new Item(s.getKey(), "Lehet, hogy megette. (ez bizonytalanabb)", "He might have eaten it.");
					Item item929 = new Item(s.getKey(), "Biztos megette.", "He must have eaten it.");
					Item item930 = new Item(s.getKey(), "Biztos, hogy nem ette meg.", "He can’t have eaten it.");
					Item item931 = new Item(s.getKey(), "Biztos, hogy nem ette meg.", "He couldn’t have eaten it.");
					Item item932 = new Item(s.getKey(), "Biztosan o volt az.", "It must have been him.");
					Item item933 = new Item(s.getKey(), "Meg kellett volna házasodnod.", "You should have got married.");
					Item item934 = new Item(s.getKey(), "Nem kellett volna megházasodnia. (Nem lett volna szabad értelemben.)",
							"He shouldn’t have got married.");
					Item item935 = new Item(s.getKey(), "Nem kellett volna megházasodnia. (Nem lett volna szükséges értelemben.)",
							"He needn’t have got married.");
					Item item936 = new Item(s.getKey(), "El kellett vennie ot.", "He had to marry her.");
					Item item937 = new Item(s.getKey(), "Nem kellett elvennie ot.", "He didn’t need to marry her.");
					Item item938 = new Item(s.getKey(), "Nem kellett elvennie ot.", "He didn’t have to marry her.");
					Item item939 = new Item(s.getKey(), "valószínuleg", "likely");
					Item item940 = new Item(s.getKey(), "biztosan", "sure");
					Item item941 = new Item(s.getKey(), "valószínuleg", "probably");
					Item item942 = new Item(s.getKey(), "lehetséges", "possible");
					Item item943 = new Item(s.getKey(), "Valószínuleg szereti a knédlit.", "He is likely to like dumplings.");
					Item item944 = new Item(s.getKey(), "Valószínuleg szerette a knédlit.", "He is likely to have liked dumplings.");
					Item item945 = new Item(s.getKey(), "Biztosan szereti a knédlit.", "He is sure to like dumplings.");
					Item item946 = new Item(s.getKey(), "Biztosan szerette a knédlit.", "He is sure to have liked dumplings.");
					Item item947 = new Item(s.getKey(), "Valószínuleg szereti a knédlit.", "He probably likes dumplings.");
					Item item948 = new Item(s.getKey(), "Valószínuleg szerette a knédlit.", "He probably liked dumplings.");
					Item item949 = new Item(s.getKey(), "Lehetséges, hogy szereti a knédlit.", "It is possible he likes dumplings.");
					Item item950 = new Item(s.getKey(), "Lehetséges, hogy szerette a knédlit.",
							"It is possible he liked dumplings.");
					Item item951 = new Item(s.getKey(), "Tud írni.", "He can write.");
					Item item952 = new Item(s.getKey(), "Tudott írni. / Tudna írni.", "He could write.");
					Item item953 = new Item(s.getKey(), "Tudott volna írni.", "He could have written.");
					Item item954 = new Item(s.getKey(), "Nem tudja megírni. / Lehetetlen, hogy megírja.", "He cannot write it.");
					Item item955 = new Item(s.getKey(), "Lehetetlen, hogy megírta.", "He cannot have written it.");
					Item item956 = new Item(s.getKey(), "Lehetetlen, hogy megírta.", "He couldn't have written it.");
					Item item957 = new Item(s.getKey(), "Írhat.", "He may write.");
					Item item958 = new Item(s.getKey(), "Írhatna. / Lehet, hogy ír.", "He might write.");
					Item item959 = new Item(s.getKey(), "Írhatott.", "He was allowed to write.");
					Item item960 = new Item(s.getKey(), "Írhatott is volna. / Lehet, hogy írt.", "He might have written.");
					Item item961 = new Item(s.getKey(), "Lehet, hogy ír.", "He may write.");
					Item item962 = new Item(s.getKey(), "Lehet, hogy írt.", "He may have written.");
					Item item963 = new Item(s.getKey(), "Nem írhat. / Lehet, hogy nem ír.", "He may not write.");
					Item item964 = new Item(s.getKey(), "Lehet, hogy nem írt.", "He may not have written.");
					Item item965 = new Item(s.getKey(), "Kellene (illene) írnia.", "He ought to write.");
					Item item966 = new Item(s.getKey(), "Nem volna szabad írnia.", "He ought not to write.");
					Item item967 = new Item(s.getKey(), "Írnia kellene.", "He would have to write.");
					Item item968 = new Item(s.getKey(), "Írnia kellett volna.", "He ought to have written.");
					Item item969 = new Item(s.getKey(), "Nem lett volna szabad írnia.", "He ought not to have written.");
					Item item970 = new Item(s.getKey(), "Írnia kellett volna.", "He should have written.");
					Item item971 = new Item(s.getKey(), "Nem lett volna szabad írnia.", "He shouldn’t have written.");
					Item item972 = new Item(s.getKey(), "Írnia kellett volna.", "He would have had to write.");
					Item item973 = new Item(s.getKey(), "Nem lett volna szükséges írnia.", "He needn’t have written.");
					Item item974 = new Item(s.getKey(), "Írna.", "He would write.");
					Item item975 = new Item(s.getKey(), "Írt volna.", "He would have written.");
					Item item976 = new Item(s.getKey(), "Írni fog. / Valószínüleg ír.", "He will write.");
					Item item977 = new Item(s.getKey(), "Bizonyára írt.", "He will have written.");
					Item item978 = new Item(s.getKey(), "Írnia kell.", "He must write.");
					Item item979 = new Item(s.getKey(), "Írnia kell.", "He has to write.");
					Item item980 = new Item(s.getKey(), "Nem kell írnia. (nem szükséges)", "He needn’t write.");
					Item item981 = new Item(s.getKey(), "Nem kell írnia.", "He hasn’t got to write.");
					Item item982 = new Item(s.getKey(), "Nem kell írnia.", "He doesn't have to write.");
					Item item983 = new Item(s.getKey(), "Nem szabad írnia.", "He mustn't write.");
					Item item984 = new Item(s.getKey(), "Nem kellett írnia.", "He didn’t have to write.");
					Item item985 = new Item(s.getKey(), "Írnia kellett.", "He had to write.");
					Item item986 = new Item(s.getKey(), "Nem kellett (nem volt szükséírnia.", "986) He didn’t need to write.");
					Item item987 = new Item(s.getKey(), "Bizonyára épp ír.", "987) He must be writing.");
					Item item988 = new Item(s.getKey(), "Bizonyára írt.", "988) He must have written.");
					Item item989 = new Item(s.getKey(), "Valaha írt.", "989) He used to write.");
					Item item990 = new Item(s.getKey(), "Valaha nem írt.", "990) He didn’t use to write.");
					Item item991 = new Item(s.getKey(), "Írni merészel.", "991) He dares write.");
					Item item992 = new Item(s.getKey(), "Írni merészelt.", "He dared (to) write.");
					Item item993 = new Item(s.getKey(), "Nem mert írni.", "993) He didn’t dare write.");
					Item item994 = new Item(s.getKey(), "Hatkor el kell mennem.", "I must leave at six today.");
					Item item995 = new Item(s.getKey(), "Biztos te vagy az új tanár.", "You must be the new teacher.");
					Item item996 = new Item(s.getKey(), "Senkinek nem szabad beszélni róla.",
							"You mustn't talk to anyone about it.");
					Item item997 = new Item(s.getKey(), "Biztos fáradt vagy a sok kutyagolás után.",
							"You must feel tired after your long walk.");
					Item item998 = new Item(s.getKey(), "Biztos mind hazament.", "They all must have gone home.");
					Item item999 = new Item(s.getKey(), "Biztos nem tudtak róla.", "They can’t have known about it.");
					Item item1000 = new Item(s.getKey(), "Biztos, hogy Mariska megjött már.", "Mary will have arrived already.");
					Item item1001 = new Item(s.getKey(), "Az nem lehet, hogy elfeledkeztél a születésnapomról!",
							"You couldn’t have forgotten about my birthday!");
					Item item1002 = new Item(s.getKey(), "Lehet, hogy foz.", "She may be cooking.");
					Item item1003 = new Item(s.getKey(), "Az is lehet, hogy alszik.", "She might be sleeping.");
					Item item1004 = new Item(s.getKey(), "Valószínu egy kicsit késobb jön.", "He’s likely to arrive a bit later.");
					Item item1005 = new Item(s.getKey(), "Valószínu, hogy telefonált.", "He’s likely to have phoned.");
					Item item1006 = new Item(s.getKey(), "Nem valószínu, hogy telefonált.", "He’s unlikely to have phoned.");
					Item item1007 = new Item(s.getKey(), "Ma reggel nem kellett korán kelnem.",
							"I didn’t need to get up early this morning.");
					Item item1008 = new Item(s.getKey(), "Nem kellett volna ajándékot hoznod.",
							"You needn’t have brought me a present.");
					Item item1009 = new Item(s.getKey(), "Abba kéne hagynod a dohányzást.", "You should give up smoking.");
					Item item1010 = new Item(s.getKey(), "Lehet, hogy Józsi lekéste a vonatot.",
							"Joe may/might have missed the train.");
					Item item1011 = new Item(s.getKey(), "Meg kellett volna beszélniük az ügyet.",
							"They should have discussed the matter.");
					Item item1012 = new Item(s.getKey(), "Nem lett volna szabad kiköpni az ablakon.",
							"You shouldn’t have spat it out of the window.");
					Item item1013 = new Item(s.getKey(), "Lehet, hogy Jóska írta a falra azt a gusztustalan mondatot.",
							"Joe may have written that disgusting sentence on the wall.");
					Item item1014 = new Item(s.getKey(), "Az ki van csukva, hogy Jóska írta, hisz nem is tud írni.",
							"Joe can't have written it, as he can't even write.");
					Item item1015 = new Item(s.getKey(), "Biztos a fészekbol esett ki az a kismadár.",
							"That little bird must have fallen out of the nest.");
					Item item1016 = new Item(s.getKey(), "Nem kellett volna táviratot küldened, egy levél is megtette volna.",
							"You needn't have sent a telegram; a letter would also have done.");
					Item item1017 = new Item(s.getKey(), "Akár az egész dinnyét megehetted volna, nekem nem kell.",
							"You might as well have eaten all the melon; I don't need any.");
					Item item1018 = new Item(s.getKey(), "A végállomásig kellet volna menned és ott átszállni egy buszra.",
							"You should have gone as far as the terminus and there change for a bus.");
					Item item1019 = new Item(s.getKey(), "Attól még nem kellett volna lecsavarnod az orrát.",
							"You shouldn't have twisted his nose off!");
					Item item1020 = new Item(s.getKey(), "Valószínu, hogy telefonált, csak nem voltam otthon.",
							"She may have given me a ring but I wasn't at home.");
					Item item1021 = new Item(s.getKey(), "Lehet, hogy megint elvált, mert hetek óta gyakrabban jön.",
							"He may have got divorced again because he's been coming more and more often for weeks.");
					Item item1022 = new Item(s.getKey(), "Ha jó leszel, vacsora után ehetsz egy banánt.",
							"If you are good, you may eat a banana after dinner.");
					Item item1023 = new Item(s.getKey(), "Nem kellett volna fölizgatnod magad, nem ér annyit az egész.",
							"You shouldn't have upset yourself, it's not worth it.");
					Item item1024 = new Item(s.getKey(), "Lehet, hogy megcsináltatom a horoszkópom.",
							"I might have my horoscope made.");
					Item item1025 = new Item(s.getKey(), "Ne izgulj, biztos megjön holnap.",
							"Don't worry, he'll surely come tomorrow.");
					Item item1026 = new Item(s.getKey(), "Nem lehetsz ilyen érzéketlen!", "You can't be so unfeeling!");
					Item item1027 = new Item(s.getKey(), "Esetleg kihullhat a hajad, ha annyit fogyókúrázol.",
							"You might lose your hair if you're dieting so hard.");
					Item item1028 = new Item(s.getKey(), "Hamarább is szólhattál volna, hogy nincs pénzed.",
							"You could have told me earlier that you had no money.");
					Item item1029 = new Item(s.getKey(), "Biztos épp a halakat etette, mikor csöngettél.",
							"He must have been feeding the fish when you rang.");
					Item item1030 = new Item(s.getKey(), "Az nem lehet, hogy annyi szív hiába onta vért…",
							"So many hearts can't have shed that much blood in vain…");
					Item item1031 = new Item(s.getKey(), "Biztos agyára ment a jólét.",
							"Living in clover must have driven him crazy.");
					Item item1032 = new Item(s.getKey(), "Lehet, hogy összekevertelek valakivel. ",
							"I may have confused you with somebody else.");
					Item item1033 = new Item(s.getKey(), "Valószínu lemerevedett, amikor meglátta a húgát egy rendor karjaiban.",
							"He must have been transfixed seeing his sister in a cop's arms.");
					Item item1034 = new Item(s.getKey(), "Meg kellett volna élezned a kaszát.",
							"You should have sharpened the scythe.");
					Item item1035 = new Item(s.getKey(), "Biztos krumplit hámoz.", "She must be peeling potatoes.");
					Item item1036 = new Item(s.getKey(), "Esetleg megvakulhatsz, ha annyit nézed a lábam.",
							"You might go blind if you keep looking at my legs.");
					Item item1037 = new Item(s.getKey(), "Be kéne tenni a hutobe.", "It should be put in the fridge.");
					Item item1038 = new Item(s.getKey(), "Nem kellett volna hozzámenned ahhoz a részeg tengerészhez.",
							"You shouldn't have married that drunken sailor.");
					Item item1039 = new Item(s.getKey(), "Ehetek egy banánt?", "May I eat a banana?");
					Item item1040 = new Item(s.getKey(), "Akár fejbe is verhetett volna.",
							"He might as well have hit you on the head.");
					Item item1041 = new Item(s.getKey(), "Biztos kikelt volna, ha öntözöd.",
							"It would surely have sprouted if you had watered it.");
					Item item1042 = new Item(s.getKey(), "Hála istennek nem kellett mind meginnom.",
							"Thank God, I didn't need to drink it all.");
					Item item1043 = new Item(s.getKey(), "Nem lett volna fontos kiszedni a mellébol a csontot.",
							"You needn't have taken the bone out of its breast.");
					Item item1044 = new Item(s.getKey(), "Holnapra kellett volna megírnia, de közben disszidált.",
							"He was to have written it by tomorrow, but in the meantime he had defected.");
					Item item1045 = new Item(s.getKey(), "Biztos a fejébe vette, hogy nem száll le rólam.",
							"He must have put his mind on not leaving me alone.");
					Item item1046 = new Item(s.getKey(), "Lehetetlen, hogy mind megitta.", "He couldn1t have drunk it all.");
					Item item1047 = new Item(s.getKey(), "Be kellett volna olajoznod a bicikliláncot.",
							"You should have oiled the bike chain.");
					Item item1048 = new Item(s.getKey(), "Lehet, hogy nyitva maradt az ajtó.", "The door may have been left open.");
					Item item1049 = new Item(s.getKey(), "Biztos borotválkozik, az serceg így.",
							"He must be shaving, that's what gives that crackling sound.");
					Item item1050 = new Item(s.getKey(), "Biztos, hogy tévedsz.", "You must be mistaken.");
					Item item1051 = new Item(s.getKey(), "Ki van zárva, hogy ot láttad, hisz Baltimore-ban van.",
							"You couldn't have seen him, since he's in Baltimore now.");
					Item item1052 = new Item(s.getKey(), "Valószíno, hogy ma már nem jön.", "He's unlikely to come today.");
					Item item1053 = new Item(s.getKey(), "Nem kell úgy a szívedre venni.", "You shouldn't take it to your heart.");
					Item item1054 = new Item(s.getKey(), "Eztet kell a szívedre tenni.", "That's what you must put on your heart.");
					Item item1055 = new Item(s.getKey(), "Lehet, hogy otthon vannak.", "They may be at home.");
					Item item1056 = new Item(s.getKey(), "Lehet, hogy elmentek paradicsomot szedni.",
							"They may have gone to pick tomatoes.");
					Item item1057 = new Item(s.getKey(), "Bizonyára nem vett észre minket.", "He can1t have noticed us.");
					Item item1058 = new Item(s.getKey(), "Nem kellett volna olyan korán jönnöd.", "You needn't have come so early.");
					Item item1059 = new Item(s.getKey(), "Nem kellett zöldséget venni, volt elég a kertben.",
							"We didn't need to buy vegetables, there was enough in the garden.");
					Item item1060 = new Item(s.getKey(), "Biztos, hogy nem Mariskát láttad éjjel a körúton.",
							"You couldn't have seen Mary on the boulevard at night.");
					Item item1061 = new Item(s.getKey(), "Nem valószínu, hogy elkapták a tolvajt.",
							"The thief is unlikely to have been caught.");
					Item item1062 = new Item(s.getKey(), "Már bizonyára hallottad az újságot.", "You must have heard the news.");
					Item item1063 = new Item(s.getKey(), "Nem kellett volna mindjárt az elso tánc után letépni a blúzát.",
							"You shouldn't have torn off her blouse right after the first dance.");
					Item item1064 = new Item(s.getKey(), "Lehet, hogy nem vagyok egy lángész.", "I may not be a genius.");
					Item item1065 = new Item(s.getKey(), "Nem valószínu, hogy ma este itt leszek.",
							"I'm likely to be here tonight.");
					Item item1066 = new Item(s.getKey(), "Esetleg meglazulhat a gomb és leesik a szoknyád.",
							"The button might get loose and skirt will fall.");
					Item item1067 = new Item(s.getKey(), "Biztos a taxiban felejtette a pénztárcáját.",
							"She must have left her purse in the cab.");
					Item item1068 = new Item(s.getKey(), "Már rég meg kellett volna mondanod neki.",
							"You should have told her long ago.");
					Item item1069 = new Item(s.getKey(), "Alig valószínu, hogy megváltozol.", "You're hardly likely to change now.");
					Item item1070 = new Item(s.getKey(), "Lehet, hogy tévedtem.", "I might have been wrong.");
					Item item1071 = new Item(s.getKey(), "Bizonyára alszik.", "She must be sleeping.");
					Item item1072 = new Item(s.getKey(), "Nem kéne elmeorvoshoz fordulnod?",
							"Shouldn't you turn to a psychiatrist?");
					Item item1073 = new Item(s.getKey(), "Nem kellett volna úgy rohannod, hisz még nem volt ott.",
							"You needn't have run so fast because there was nobody there.");
					Item item1074 = new Item(s.getKey(), "Nem mondhatott ilyet!", "He can't have said anything like that.");
					Item item1075 = new Item(s.getKey(), "Azért ezt nem kellett volna…", "You shouldn't have…");
					Item item1076 = new Item(s.getKey(), "Rendőr az nem lehet, mert zöld a sapkája.",
							"He can't be a cop since his cap is green.");
					Item item1077 = new Item(s.getKey(), "Méhecske nem lehetett, az hangosabban zümmög.",
							"It couldn't have been a bee, that buzzes more loudly.");
					Item item1078 = new Item(s.getKey(), "Lehet, hogy darázs volt.", "It may have been a wasp.");
					Item item1079 = new Item(s.getKey(), "Esetleg az is lehet, hogy szúnyog volt.",
							"It might have been a mosquito.");
					Item item1080 = new Item(s.getKey(), "Biztos a másikat húzta ki.", "He must have taken out the other one.");
					Item item1081 = new Item(s.getKey(), "A jobb alsó hatost kellett volna kihúznia.",
							"He should have taken out the lower six on the right.");
					Item item1082 = new Item(s.getKey(), "Biztos nőtlen, mert olyan simák az arcvonásai.",
							"He must be single as his face is not worn out at all.");
					Item item1083 = new Item(s.getKey(), "Haza akarok menni.", "I want to go home.");
					Item item1084 = new Item(s.getKey(), "A futás hasznos dolog.", "Running is useful.");
					Item item1085 = new Item(s.getKey(), "Mosolygó kislányt látok.", "I can see a smiling girl.");
					Item item1086 = new Item(s.getKey(), "Táskámban van a megírt levél.", "The written letter is in my bag.");
					Item item1087 = new Item(s.getKey(), "Azt tanácsolom, hogy indulj korábban.", "I advise you to start earlier.");
					Item item1088 = new Item(s.getKey(), "Elmentem az uszodába egy jót úszni.",
							"I went to the swimming pool to swim a bit.");
					Item item1089 = new Item(
							s.getKey(),
							"Még mielott felkérte volna a lányt, Jóska úgy döntött, hogy közelebbrol is megnézi, hogy megbizonyosodjon, nem fiú-e az illeto.",
							"Before asking the girl to dance Joe decided to take a close look at her to make sure it was not a boy.");
					Item item1090 = new Item(s.getKey(), "Tévedni emberi dolog.", "To err is human.");
					Item item1091 = new Item(s.getKey(), "Lenni vagy nem lenni volt az egyik hamleti kérdés.",
							"To be or not to be was a question of Hamlet’s.");
					Item item1092 = new Item(s.getKey(), "Ölni bűn.", "To kill is a sin.");
					Item item1093 = new Item(s.getKey(), "A futás hasznos. (Futni hasznos dolog.)", "Running is useful.");
					Item item1094 = new Item(s.getKey(), "Úszni könnyű.", "Swimming is easy.");
					Item item1095 = new Item(s.getKey(), "Hiszem, ha látom.", "Seeing is believing.");
					Item item1096 = new Item(s.getKey(), "Érdekes dolog esoben énekelni.",
							"Singing in the rain is very interesting.");
					Item item1097 = new Item(s.getKey(), "Repülővel gyorsabb menni mint lóháton.",
							"Travelling by air is faster than riding a horse.");
					Item item1098 = new Item(s.getKey(), "A sírás noi praktika.", "Crying is a female trick.");
					Item item1099 = new Item(s.getKey(), "A tanulás az élet fontos része.",
							"Studying is an important part of your life.");
					Item item1100 = new Item(s.getKey(), "Izgalmas dolog a belvárosban vezetni.",
							"It's exciting to drive a car downtown.");
					Item item1101 = new Item(s.getKey(), "Érdekes volt végighallgatni, hogy mit mond.",
							"It was interesting to hear what he said.");
					Item item1102 = new Item(s.getKey(), "Jó lesz találkozni veled.", "It will be lovely to meet you there.");
					Item item1103 = new Item(s.getKey(), "Nehéz a boldogságtól búcsút venni.",
							"It’s hard to say goodbye to happiness.");
					Item item1104 = new Item(s.getKey(), "Udvariatlanság lenne nem meghívni.",
							"It would be very impolite not to invite him.");
					Item item1105 = new Item(s.getKey(), "Fontos, hogy higgy abban amit csinálsz.",
							"It is important to believe in what you do.");
					Item item1106 = new Item(s.getKey(), "Könnyu ilyen fajta mondatokat lefordítani.",
							"It is easy to translate sentences of the kind.");
					Item item1107 = new Item(s.getKey(), "Jézus, örülök, hogy személyesen találkozhatunk.",
							"Jesus, I’m overjoyed to meet you face to face. (Superstar)");
					Item item1108 = new Item(s.getKey(), "Hajlandók segíteni.", "They are ready to help us.");
					Item item1109 = new Item(s.getKey(), "Örömmel hallottuk a híreket.", "We were glad to hear the news.");
					Item item1110 = new Item(s.getKey(), "Bocs, hogy zavarlak.", "I’m sorry to disturb you.");
					Item item1111 = new Item(s.getKey(), "Meglepetéssel hallottuk a híreket.",
							"We were surprised to hear the news.");
					Item item1112 = new Item(s.getKey(), "Boldog vagyok, hogy vendégül láthatlak.",
							"I’m happy to give you a treat.");
					Item item1113 = new Item(s.getKey(), "Szerencsés vagy, hogy ilyen kabátod van.",
							"You are fortunate to have a coat like that.");
					Item item1114 = new Item(s.getKey(), "Örömmel fog találkozni veled.", "She will be pleased to meet you.");
					Item item1115 = new Item(s.getKey(), "Nekem ez túl nehéz.", "It’s difficult for me to do that.");
					Item item1116 = new Item(s.getKey(), "Alig várom, hogy a barátaim találkozhassanak velük.",
							"I’m anxious for my friends to meet them.");
					Item item1117 = new Item(s.getKey(), "Türelmetlenül vártuk, hogy busz végre elinduljon.",
							"We were impatient for the bus to start.");
					Item item1118 = new Item(s.getKey(), "Derogál neki, hogy eljöjjön hozzánk.",
							"It’s inconvenient for him to visit us.");
					Item item1119 = new Item(s.getKey(), "Veszélyes az, ha egy öreg ember gyorsan fut.",
							"It’s dangerous for an old man to run fast.");
					Item item1120 = new Item(s.getKey(), "Sajnáltuk, hogy olyan korán elmennek.",
							"We were sorry for them to leave so soon.");
					Item item1121 = new Item(s.getKey(), "Örülök, hogy itt vagy.", "I’m happy for you to be here.");
					Item item1122 = new Item(s.getKey(), "Bűn így viselkedni.", "It’s a sin to behave like that.");
					Item item1123 = new Item(s.getKey(), "Kár volt otthagyni.", "It was a pity to leave it there.");
					Item item1124 = new Item(s.getKey(), "Szégyen, hogy nem élvezel egy ilyen könyvet.",
							"It’s a shame not to enjoy a book like that.");
					Item item1125 = new Item(s.getKey(), "Milyen kellemes meglepetés, hogy itt vagy.",
							"It’s a pleasant surprise to see you here.");
					Item item1126 = new Item(s.getKey(), "Ideje, hogy búcsúzzunk.", "It’s time to say our farewells.");
					Item item1127 = new Item(s.getKey(), "Tiszta időpocsékolás akkor beszélni vele, mikor ilyen hangulatban van.",
							"It’s a waste of time to talk to her when she’s in this mood.");
					Item item1128 = new Item(s.getKey(), "Maga a paradicsom forró kádban pihegni egy nehéz nap után.",
							"It’s a sheer paradise to relax in a hot bath after a hard day’s work.");
					Item item1129 = new Item(s.getKey(), "Döbbenetes volt meglátni a számlát.",
							"It was a shock to see the size of the bill.");
					Item item1130 = new Item(s.getKey(), "Nem vagyok olyan hangulatban, hogy beszélgessek veled.",
							"I’m not in the mood to talk to you now.");
					Item item1131 = new Item(s.getKey(), "Nem tett kísérletet a szökésre.", "He made no attempt to escape.");
					Item item1132 = new Item(s.getKey(), "Chicagóban jó lakni.", "Chicago is a nice place to live.");
					Item item1133 = new Item(s.getKey(), "nem olyan, aki ilyet tenne.", "He is not a man to do such a thing.");
					Item item1134 = new Item(s.getKey(), "Nincs itt kérem semmi látnivaló.", "There is nothing to see here.");
					Item item1135 = new Item(s.getKey(), "Nincs miért aggódni.", "There is nothing to worry about.");
					Item item1136 = new Item(s.getKey(), "Micsoda kérdés!", "What a question to ask!");
					Item item1137 = new Item(s.getKey(), "Nincs szórnivaló pénzem.", "I have no money to waste.");
					Item item1138 = new Item(s.getKey(), "Mi vagyunk azok, akik boldogságot hoznak.",
							"We are the ones to make a brighter day.");
					Item item1139 = new Item(s.getKey(), "Sok a dolgom.", "I have a lot of work to do.");
					Item item1140 = new Item(s.getKey(), "Nem volt semmi ok arra, hogy Párizsba menjek.",
							"I had no occasion to go to Paris.");
					Item item1141 = new Item(s.getKey(), "Nincs számodra helyem.", "I have no place for you to stay.");
					Item item1142 = new Item(s.getKey(), "Nem kell errol vitázni.", "There is no need for us to argue about this.");
					Item item1143 = new Item(s.getKey(), "Nem volt lehetoségünk, hogy megnézzük a várost.",
							"There was no possibility for us to see the town.");
					Item item1144 = new Item(s.getKey(), "Nincs számodra pénzem.", "I have no money for your to spend.");
					Item item1145 = new Item(s.getKey(), "Van hely ahova leülhetek?",
							"Is there any room for me to sit down in here?");
					Item item1146 = new Item(s.getKey(), "Nincs esélye, hogy túléli.", "There is no chance for him to survive it.");
					Item item1147 = new Item(s.getKey(), "Nincs érteleme sírni miatta.", "It’s no good crying about it.");
					Item item1148 = new Item(s.getKey(), "Nincs sok értelme beszélni hozzá úgyse figyel sose.",
							"It’s no good talking to him because he never listens.");
					Item item1149 = new Item(s.getKey(), "Nem érdemes várni rá.", "It isn’t worth waiting for him.");
					Item item1150 = new Item(s.getKey(), "Azzal volt elfoglalva, hogy játszotta a nagyfonököt.",
							"He was busy bossing around him.");
					Item item1151 = new Item(s.getKey(), "Érdemes meghallgatni azt a lemezt.", "That record is worth listening to.");
					Item item1152 = new Item(s.getKey(), "Tele van a hócipom azzal, hogy rá várjak.",
							"I’m fed up with waiting for him.");
					Item item1153 = new Item(s.getKey(), "Elegem van, hogy annyit járkálsz a nyakamra.",
							"I’m sick of you coming round here.");
					Item item1154 = new Item(s.getKey(), "Nagyon jól táncol.", "She is very good at dancing.");
					Item item1155 = new Item(s.getKey(), "Nagyon rosszul énekel.", "She is very bad at singing.");
					Item item1156 = new Item(s.getKey(), "Imád aludni.", "He is fond of sleeping.");
					Item item1157 = new Item(s.getKey(), "Engem tett felelossé, hogy elveszett a pénz.",
							"She made me responsible for losing the money.");
					Item item1158 = new Item(s.getKey(), "kezd", "begin");
					Item item1159 = new Item(s.getKey(), "kezd", "start");
					Item item1160 = new Item(s.getKey(), "folytat", "continue");
					Item item1161 = new Item(s.getKey(), "szeret", "like");
					Item item1162 = new Item(s.getKey(), "imád", "love");
					Item item1163 = new Item(s.getKey(), "gyulöl", "hate");
					Item item1164 = new Item(s.getKey(), "jobban szeret", "prefer");
					Item item1165 = new Item(s.getKey(), "Öt éve kezdett zongorázni tanulni.",
							"1165) She began learning the piano five years ago.");
					Item item1166 = new Item(s.getKey(), "És amikor esni kezd…", "And when the rain begins to fall…");
					Item item1167 = new Item(s.getKey(), "Imádok a kertben üldögélni.", "I love sitting in the garden.");
					Item item1168 = new Item(s.getKey(), "Imádok imádni.", "I love to love.");
					Item item1169 = new Item(s.getKey(), "Továbbra is bámulta oket.", "He continued to stare at them.");
					Item item1170 = new Item(s.getKey(), "Tovább folytatod a kertészkedést?", "Will you continue gardening?");
					Item item1171 = new Item(s.getKey(), "Utál elkésni a munkából.", "She hates to be late for work.");
					Item item1172 = new Item(s.getKey(), "Utál elkésni a munkából.", "She hates being late for work.");
					Item item1173 = new Item(s.getKey(), "Jobb szeretek olvasni, mint írni.", "I prefer reading to writing.");
					Item item1174 = new Item(s.getKey(), "Jobb szereti egyedül csinálni.", "She prefers to do it herself.");
					Item item1175 = new Item(s.getKey(), "Emlékszem, hogy bezártam az ajtót, mikor elmentem hazulról.",
							"I remember locking the door as I left the house.");
					Item item1176 = new Item(s.getKey(), "Nem felejtettem el bezárni az ajtót, mikor elmentem hazulról.",
							"I remembered to lock the door as I left the house.");
					Item item1177 = new Item(s.getKey(),
							"Soha nem fogom elfelejteni az, amikor megtaláltam azt a régi érmét a kertben.",
							"I’ll never forget finding that old coin in my garden.");
					Item item1178 = new Item(s.getKey(), "Ne felejtsd el elhozni a boröndöket.", "Don’t forget to bring the cases.");
					Item item1179 = new Item(s.getKey(), "Sajnálom, hogy ráültem a kutyádra.", "I regret sitting on your dog.");
					Item item1180 = new Item(s.getKey(), "Sajnálattal kell közölnöm, hogy tartozol egy ezressel.",
							"I regret to inform you that you owe me a grand.");
					Item item1181 = new Item(s.getKey(), "Abbahagyták a beszélgetést.", "They stopped talking.");
					Item item1182 = new Item(s.getKey(), "Megálltak, hogy beszélgessenek.", "They stopped to talk.");
					Item item1183 = new Item(s.getKey(), "Kipróbálta, hogy milyen dolog csókolózni.", "He tried kissing.");
					Item item1184 = new Item(s.getKey(), "Megpróbálta megcsókolni a lányt.", "He tried to kiss the girl.");
					Item item1185 = new Item(s.getKey(), "nem engedheti meg magának", "can’t afford");
					Item item1186 = new Item(s.getKey(), "beleegyezik", "agree");
					Item item1187 = new Item(s.getKey(), "elintéz", "arrange");
					Item item1188 = new Item(s.getKey(), "kér", "ask");
					Item item1189 = new Item(s.getKey(), "megkísérel", "attempt");
					Item item1190 = new Item(s.getKey(), "kér, könyörög", "beg");
					Item item1191 = new Item(s.getKey(), "követel", "claim");
					Item item1192 = new Item(s.getKey(), "elhatároz", "decide");
					Item item1193 = new Item(s.getKey(), "követel", "demand");
					Item item1194 = new Item(s.getKey(), "megenged", "allow");
					Item item1195 = new Item(s.getKey(), "tanácsol", "advise");
					Item item1196 = new Item(s.getKey(), "parancsol", "command");
					Item item1197 = new Item(s.getKey(), "kíván", "desire");
					Item item1198 = new Item(s.getKey(), "elvisel", "endure");
					Item item1199 = new Item(s.getKey(), "biztat", "encourage");

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
					pm.makePersistent(item571);
					pm.makePersistent(item572);
					pm.makePersistent(item573);
					pm.makePersistent(item574);
					pm.makePersistent(item575);
					pm.makePersistent(item576);
					pm.makePersistent(item577);
					pm.makePersistent(item578);
					pm.makePersistent(item579);
					pm.makePersistent(item580);
					pm.makePersistent(item581);
					pm.makePersistent(item582);
					pm.makePersistent(item583);
					pm.makePersistent(item584);
					pm.makePersistent(item585);
					pm.makePersistent(item586);
					pm.makePersistent(item587);
					pm.makePersistent(item588);
					pm.makePersistent(item589);
					pm.makePersistent(item590);
					pm.makePersistent(item591);
					pm.makePersistent(item592);
					pm.makePersistent(item593);
					pm.makePersistent(item594);
					pm.makePersistent(item595);
					pm.makePersistent(item596);
					pm.makePersistent(item597);
					pm.makePersistent(item598);
					pm.makePersistent(item599);
					pm.makePersistent(item600);
					pm.makePersistent(item601);
					pm.makePersistent(item602);
					pm.makePersistent(item603);
					pm.makePersistent(item604);
					pm.makePersistent(item605);
					pm.makePersistent(item606);
					pm.makePersistent(item607);
					pm.makePersistent(item608);
					pm.makePersistent(item609);
					pm.makePersistent(item610);
					pm.makePersistent(item611);
					pm.makePersistent(item612);
					pm.makePersistent(item613);
					pm.makePersistent(item614);
					pm.makePersistent(item615);
					pm.makePersistent(item616);
					pm.makePersistent(item617);
					pm.makePersistent(item618);
					pm.makePersistent(item619);
					pm.makePersistent(item620);
					pm.makePersistent(item621);
					pm.makePersistent(item622);
					pm.makePersistent(item623);
					pm.makePersistent(item624);
					pm.makePersistent(item625);
					pm.makePersistent(item626);
					pm.makePersistent(item627);
					pm.makePersistent(item628);
					pm.makePersistent(item629);
					pm.makePersistent(item630);
					pm.makePersistent(item631);
					pm.makePersistent(item632);
					pm.makePersistent(item633);
					pm.makePersistent(item634);
					pm.makePersistent(item635);
					pm.makePersistent(item636);
					pm.makePersistent(item637);
					pm.makePersistent(item638);
					pm.makePersistent(item639);
					pm.makePersistent(item640);
					pm.makePersistent(item641);
					pm.makePersistent(item642);
					pm.makePersistent(item643);
					pm.makePersistent(item644);
					pm.makePersistent(item645);
					pm.makePersistent(item646);
					pm.makePersistent(item647);
					pm.makePersistent(item648);
					pm.makePersistent(item649);
					pm.makePersistent(item650);
					pm.makePersistent(item651);
					pm.makePersistent(item652);
					pm.makePersistent(item653);
					pm.makePersistent(item654);
					pm.makePersistent(item655);
					pm.makePersistent(item656);
					pm.makePersistent(item657);
					pm.makePersistent(item658);
					pm.makePersistent(item659);
					pm.makePersistent(item660);
					pm.makePersistent(item661);
					pm.makePersistent(item662);
					pm.makePersistent(item663);
					pm.makePersistent(item664);
					pm.makePersistent(item665);
					pm.makePersistent(item666);
					pm.makePersistent(item667);
					pm.makePersistent(item668);
					pm.makePersistent(item669);
					pm.makePersistent(item670);
					pm.makePersistent(item671);
					pm.makePersistent(item672);
					pm.makePersistent(item673);
					pm.makePersistent(item674);
					pm.makePersistent(item675);
					pm.makePersistent(item676);
					pm.makePersistent(item677);
					pm.makePersistent(item678);
					pm.makePersistent(item679);
					pm.makePersistent(item680);
					pm.makePersistent(item681);
					pm.makePersistent(item682);
					pm.makePersistent(item683);
					pm.makePersistent(item684);
					pm.makePersistent(item685);
					pm.makePersistent(item686);
					pm.makePersistent(item687);
					pm.makePersistent(item688);
					pm.makePersistent(item689);
					pm.makePersistent(item690);
					pm.makePersistent(item691);
					pm.makePersistent(item692);
					pm.makePersistent(item693);
					pm.makePersistent(item694);
					pm.makePersistent(item695);
					pm.makePersistent(item696);
					pm.makePersistent(item697);
					pm.makePersistent(item698);
					pm.makePersistent(item699);
					pm.makePersistent(item700);
					pm.makePersistent(item701);
					pm.makePersistent(item702);
					pm.makePersistent(item703);
					pm.makePersistent(item704);
					pm.makePersistent(item705);
					pm.makePersistent(item706);
					pm.makePersistent(item707);
					pm.makePersistent(item708);
					pm.makePersistent(item709);
					pm.makePersistent(item710);
					pm.makePersistent(item711);
					pm.makePersistent(item712);
					pm.makePersistent(item713);
					pm.makePersistent(item714);
					pm.makePersistent(item715);
					pm.makePersistent(item716);
					pm.makePersistent(item717);
					pm.makePersistent(item718);
					pm.makePersistent(item719);
					pm.makePersistent(item720);
					pm.makePersistent(item721);
					pm.makePersistent(item722);
					pm.makePersistent(item723);
					pm.makePersistent(item724);
					pm.makePersistent(item725);
					pm.makePersistent(item726);
					pm.makePersistent(item727);
					pm.makePersistent(item728);
					pm.makePersistent(item729);
					pm.makePersistent(item730);
					pm.makePersistent(item731);
					pm.makePersistent(item732);
					pm.makePersistent(item733);
					pm.makePersistent(item734);
					pm.makePersistent(item735);
					pm.makePersistent(item736);
					pm.makePersistent(item737);
					pm.makePersistent(item738);
					pm.makePersistent(item739);
					pm.makePersistent(item740);
					pm.makePersistent(item741);
					pm.makePersistent(item742);
					pm.makePersistent(item743);
					pm.makePersistent(item744);
					pm.makePersistent(item745);
					pm.makePersistent(item746);
					pm.makePersistent(item747);
					pm.makePersistent(item748);
					pm.makePersistent(item749);
					pm.makePersistent(item750);
					pm.makePersistent(item751);
					pm.makePersistent(item752);
					pm.makePersistent(item753);
					pm.makePersistent(item754);
					pm.makePersistent(item755);
					pm.makePersistent(item756);
					pm.makePersistent(item757);
					pm.makePersistent(item758);
					pm.makePersistent(item759);
					pm.makePersistent(item760);
					pm.makePersistent(item761);
					pm.makePersistent(item762);
					pm.makePersistent(item763);
					pm.makePersistent(item764);
					pm.makePersistent(item765);
					pm.makePersistent(item766);
					pm.makePersistent(item767);
					pm.makePersistent(item768);
					pm.makePersistent(item769);
					pm.makePersistent(item770);
					pm.makePersistent(item771);
					pm.makePersistent(item772);
					pm.makePersistent(item773);
					pm.makePersistent(item774);
					pm.makePersistent(item775);
					pm.makePersistent(item776);
					pm.makePersistent(item777);
					pm.makePersistent(item778);
					pm.makePersistent(item779);
					pm.makePersistent(item780);
					pm.makePersistent(item781);
					pm.makePersistent(item782);
					pm.makePersistent(item783);
					pm.makePersistent(item784);
					pm.makePersistent(item785);
					pm.makePersistent(item786);
					pm.makePersistent(item787);
					pm.makePersistent(item788);
					pm.makePersistent(item789);
					pm.makePersistent(item790);
					pm.makePersistent(item791);
					pm.makePersistent(item792);
					pm.makePersistent(item793);
					pm.makePersistent(item794);
					pm.makePersistent(item795);
					pm.makePersistent(item796);
					pm.makePersistent(item797);
					pm.makePersistent(item798);
					pm.makePersistent(item799);
					pm.makePersistent(item800);
					pm.makePersistent(item801);
					pm.makePersistent(item802);
					pm.makePersistent(item803);
					pm.makePersistent(item804);
					pm.makePersistent(item805);
					pm.makePersistent(item806);
					pm.makePersistent(item807);
					pm.makePersistent(item808);
					pm.makePersistent(item809);
					pm.makePersistent(item810);
					pm.makePersistent(item811);
					pm.makePersistent(item812);
					pm.makePersistent(item813);
					pm.makePersistent(item814);
					pm.makePersistent(item815);
					pm.makePersistent(item816);
					pm.makePersistent(item817);
					pm.makePersistent(item818);
					pm.makePersistent(item819);
					pm.makePersistent(item820);
					pm.makePersistent(item821);
					pm.makePersistent(item822);
					pm.makePersistent(item823);
					pm.makePersistent(item824);
					pm.makePersistent(item825);
					pm.makePersistent(item826);
					pm.makePersistent(item827);
					pm.makePersistent(item828);
					pm.makePersistent(item829);
					pm.makePersistent(item830);
					pm.makePersistent(item831);
					pm.makePersistent(item832);
					pm.makePersistent(item833);
					pm.makePersistent(item834);
					pm.makePersistent(item835);
					pm.makePersistent(item836);
					pm.makePersistent(item837);
					pm.makePersistent(item838);
					pm.makePersistent(item839);
					pm.makePersistent(item840);
					pm.makePersistent(item841);
					pm.makePersistent(item842);
					pm.makePersistent(item843);
					pm.makePersistent(item844);
					pm.makePersistent(item845);
					pm.makePersistent(item846);
					pm.makePersistent(item847);
					pm.makePersistent(item848);
					pm.makePersistent(item849);
					pm.makePersistent(item850);
					pm.makePersistent(item851);
					pm.makePersistent(item852);
					pm.makePersistent(item853);
					pm.makePersistent(item854);
					pm.makePersistent(item855);
					pm.makePersistent(item856);
					pm.makePersistent(item857);
					pm.makePersistent(item858);
					pm.makePersistent(item859);
					pm.makePersistent(item860);
					pm.makePersistent(item861);
					pm.makePersistent(item862);
					pm.makePersistent(item863);
					pm.makePersistent(item864);
					pm.makePersistent(item865);
					pm.makePersistent(item866);
					pm.makePersistent(item867);
					pm.makePersistent(item868);
					pm.makePersistent(item869);
					pm.makePersistent(item870);
					pm.makePersistent(item871);
					pm.makePersistent(item872);
					pm.makePersistent(item873);
					pm.makePersistent(item874);
					pm.makePersistent(item875);
					pm.makePersistent(item876);
					pm.makePersistent(item877);
					pm.makePersistent(item878);
					pm.makePersistent(item879);
					pm.makePersistent(item880);
					pm.makePersistent(item881);
					pm.makePersistent(item882);
					pm.makePersistent(item883);
					pm.makePersistent(item884);
					pm.makePersistent(item885);
					pm.makePersistent(item886);
					pm.makePersistent(item887);
					pm.makePersistent(item888);
					pm.makePersistent(item889);
					pm.makePersistent(item890);
					pm.makePersistent(item891);
					pm.makePersistent(item892);
					pm.makePersistent(item893);
					pm.makePersistent(item894);
					pm.makePersistent(item895);
					pm.makePersistent(item896);
					pm.makePersistent(item897);
					pm.makePersistent(item898);
					pm.makePersistent(item899);
					pm.makePersistent(item900);
					pm.makePersistent(item901);
					pm.makePersistent(item902);
					pm.makePersistent(item903);
					pm.makePersistent(item904);
					pm.makePersistent(item905);
					pm.makePersistent(item906);
					pm.makePersistent(item907);
					pm.makePersistent(item908);
					pm.makePersistent(item909);
					pm.makePersistent(item910);
					pm.makePersistent(item911);
					pm.makePersistent(item912);
					pm.makePersistent(item913);
					pm.makePersistent(item914);
					pm.makePersistent(item915);
					pm.makePersistent(item916);
					pm.makePersistent(item917);
					pm.makePersistent(item918);
					pm.makePersistent(item919);
					pm.makePersistent(item920);
					pm.makePersistent(item921);
					pm.makePersistent(item922);
					pm.makePersistent(item923);
					pm.makePersistent(item924);
					pm.makePersistent(item925);
					pm.makePersistent(item926);
					pm.makePersistent(item927);
					pm.makePersistent(item928);
					pm.makePersistent(item929);
					pm.makePersistent(item930);
					pm.makePersistent(item931);
					pm.makePersistent(item932);
					pm.makePersistent(item933);
					pm.makePersistent(item934);
					pm.makePersistent(item935);
					pm.makePersistent(item936);
					pm.makePersistent(item937);
					pm.makePersistent(item938);
					pm.makePersistent(item939);
					pm.makePersistent(item940);
					pm.makePersistent(item941);
					pm.makePersistent(item942);
					pm.makePersistent(item943);
					pm.makePersistent(item944);
					pm.makePersistent(item945);
					pm.makePersistent(item946);
					pm.makePersistent(item947);
					pm.makePersistent(item948);
					pm.makePersistent(item949);
					pm.makePersistent(item950);
					pm.makePersistent(item951);
					pm.makePersistent(item952);
					pm.makePersistent(item953);
					pm.makePersistent(item954);
					pm.makePersistent(item955);
					pm.makePersistent(item956);
					pm.makePersistent(item957);
					pm.makePersistent(item958);
					pm.makePersistent(item959);
					pm.makePersistent(item960);
					pm.makePersistent(item961);
					pm.makePersistent(item962);
					pm.makePersistent(item963);
					pm.makePersistent(item964);
					pm.makePersistent(item965);
					pm.makePersistent(item966);
					pm.makePersistent(item967);
					pm.makePersistent(item968);
					pm.makePersistent(item969);
					pm.makePersistent(item970);
					pm.makePersistent(item971);
					pm.makePersistent(item972);
					pm.makePersistent(item973);
					pm.makePersistent(item974);
					pm.makePersistent(item975);
					pm.makePersistent(item976);
					pm.makePersistent(item977);
					pm.makePersistent(item978);
					pm.makePersistent(item979);
					pm.makePersistent(item980);
					pm.makePersistent(item981);
					pm.makePersistent(item982);
					pm.makePersistent(item983);
					pm.makePersistent(item984);
					pm.makePersistent(item985);
					pm.makePersistent(item986);
					pm.makePersistent(item987);
					pm.makePersistent(item988);
					pm.makePersistent(item989);
					pm.makePersistent(item990);
					pm.makePersistent(item991);
					pm.makePersistent(item992);
					pm.makePersistent(item993);
					pm.makePersistent(item994);
					pm.makePersistent(item995);
					pm.makePersistent(item996);
					pm.makePersistent(item997);
					pm.makePersistent(item998);
					pm.makePersistent(item999);
					pm.makePersistent(item1000);
					pm.makePersistent(item1001);
					pm.makePersistent(item1002);
					pm.makePersistent(item1003);
					pm.makePersistent(item1004);
					pm.makePersistent(item1005);
					pm.makePersistent(item1006);
					pm.makePersistent(item1007);
					pm.makePersistent(item1008);
					pm.makePersistent(item1009);
					pm.makePersistent(item1010);
					pm.makePersistent(item1011);
					pm.makePersistent(item1012);
					pm.makePersistent(item1013);
					pm.makePersistent(item1014);
					pm.makePersistent(item1015);
					pm.makePersistent(item1016);
					pm.makePersistent(item1017);
					pm.makePersistent(item1018);
					pm.makePersistent(item1019);
					pm.makePersistent(item1020);
					pm.makePersistent(item1021);
					pm.makePersistent(item1022);
					pm.makePersistent(item1023);
					pm.makePersistent(item1024);
					pm.makePersistent(item1025);
					pm.makePersistent(item1026);
					pm.makePersistent(item1027);
					pm.makePersistent(item1028);
					pm.makePersistent(item1029);
					pm.makePersistent(item1030);
					pm.makePersistent(item1031);
					pm.makePersistent(item1032);
					pm.makePersistent(item1033);
					pm.makePersistent(item1034);
					pm.makePersistent(item1035);
					pm.makePersistent(item1036);
					pm.makePersistent(item1037);
					pm.makePersistent(item1038);
					pm.makePersistent(item1039);
					pm.makePersistent(item1040);
					pm.makePersistent(item1041);
					pm.makePersistent(item1042);
					pm.makePersistent(item1043);
					pm.makePersistent(item1044);
					pm.makePersistent(item1045);
					pm.makePersistent(item1046);
					pm.makePersistent(item1047);
					pm.makePersistent(item1048);
					pm.makePersistent(item1049);
					pm.makePersistent(item1050);
					pm.makePersistent(item1051);
					pm.makePersistent(item1052);
					pm.makePersistent(item1053);
					pm.makePersistent(item1054);
					pm.makePersistent(item1055);
					pm.makePersistent(item1056);
					pm.makePersistent(item1057);
					pm.makePersistent(item1058);
					pm.makePersistent(item1059);
					pm.makePersistent(item1060);
					pm.makePersistent(item1061);
					pm.makePersistent(item1062);
					pm.makePersistent(item1063);
					pm.makePersistent(item1064);
					pm.makePersistent(item1065);
					pm.makePersistent(item1066);
					pm.makePersistent(item1067);
					pm.makePersistent(item1068);
					pm.makePersistent(item1069);
					pm.makePersistent(item1070);
					pm.makePersistent(item1071);
					pm.makePersistent(item1072);
					pm.makePersistent(item1073);
					pm.makePersistent(item1074);
					pm.makePersistent(item1075);
					pm.makePersistent(item1076);
					pm.makePersistent(item1077);
					pm.makePersistent(item1078);
					pm.makePersistent(item1079);
					pm.makePersistent(item1080);
					pm.makePersistent(item1081);
					pm.makePersistent(item1082);
					pm.makePersistent(item1083);
					pm.makePersistent(item1084);
					pm.makePersistent(item1085);
					pm.makePersistent(item1086);
					pm.makePersistent(item1087);
					pm.makePersistent(item1088);
					pm.makePersistent(item1089);
					pm.makePersistent(item1090);
					pm.makePersistent(item1091);
					pm.makePersistent(item1092);
					pm.makePersistent(item1093);
					pm.makePersistent(item1094);
					pm.makePersistent(item1095);
					pm.makePersistent(item1096);
					pm.makePersistent(item1097);
					pm.makePersistent(item1098);
					pm.makePersistent(item1099);
					pm.makePersistent(item1100);
					pm.makePersistent(item1101);
					pm.makePersistent(item1102);
					pm.makePersistent(item1103);
					pm.makePersistent(item1104);
					pm.makePersistent(item1105);
					pm.makePersistent(item1106);
					pm.makePersistent(item1107);
					pm.makePersistent(item1108);
					pm.makePersistent(item1109);
					pm.makePersistent(item1110);
					pm.makePersistent(item1111);
					pm.makePersistent(item1112);
					pm.makePersistent(item1113);
					pm.makePersistent(item1114);
					pm.makePersistent(item1115);
					pm.makePersistent(item1116);
					pm.makePersistent(item1117);
					pm.makePersistent(item1118);
					pm.makePersistent(item1119);
					pm.makePersistent(item1120);
					pm.makePersistent(item1121);
					pm.makePersistent(item1122);
					pm.makePersistent(item1123);
					pm.makePersistent(item1124);
					pm.makePersistent(item1125);
					pm.makePersistent(item1126);
					pm.makePersistent(item1127);
					pm.makePersistent(item1128);
					pm.makePersistent(item1129);
					pm.makePersistent(item1130);
					pm.makePersistent(item1131);
					pm.makePersistent(item1132);
					pm.makePersistent(item1133);
					pm.makePersistent(item1134);
					pm.makePersistent(item1135);
					pm.makePersistent(item1136);
					pm.makePersistent(item1137);
					pm.makePersistent(item1138);
					pm.makePersistent(item1139);
					pm.makePersistent(item1140);
					pm.makePersistent(item1141);
					pm.makePersistent(item1142);
					pm.makePersistent(item1143);
					pm.makePersistent(item1144);
					pm.makePersistent(item1145);
					pm.makePersistent(item1146);
					pm.makePersistent(item1147);
					pm.makePersistent(item1148);
					pm.makePersistent(item1149);
					pm.makePersistent(item1150);
					pm.makePersistent(item1151);
					pm.makePersistent(item1152);
					pm.makePersistent(item1153);
					pm.makePersistent(item1154);
					pm.makePersistent(item1155);
					pm.makePersistent(item1156);
					pm.makePersistent(item1157);
					pm.makePersistent(item1158);
					pm.makePersistent(item1159);
					pm.makePersistent(item1160);
					pm.makePersistent(item1161);
					pm.makePersistent(item1162);
					pm.makePersistent(item1163);
					pm.makePersistent(item1164);
					pm.makePersistent(item1165);
					pm.makePersistent(item1166);
					pm.makePersistent(item1167);
					pm.makePersistent(item1168);
					pm.makePersistent(item1169);
					pm.makePersistent(item1170);
					pm.makePersistent(item1171);
					pm.makePersistent(item1172);
					pm.makePersistent(item1173);
					pm.makePersistent(item1174);
					pm.makePersistent(item1175);
					pm.makePersistent(item1176);
					pm.makePersistent(item1177);
					pm.makePersistent(item1178);
					pm.makePersistent(item1179);
					pm.makePersistent(item1180);
					pm.makePersistent(item1181);
					pm.makePersistent(item1182);
					pm.makePersistent(item1183);
					pm.makePersistent(item1184);
					pm.makePersistent(item1185);
					pm.makePersistent(item1186);
					pm.makePersistent(item1187);
					pm.makePersistent(item1188);
					pm.makePersistent(item1189);
					pm.makePersistent(item1190);
					pm.makePersistent(item1191);
					pm.makePersistent(item1192);
					pm.makePersistent(item1193);
					pm.makePersistent(item1194);
					pm.makePersistent(item1195);
					pm.makePersistent(item1196);
					pm.makePersistent(item1197);
					pm.makePersistent(item1198);
					pm.makePersistent(item1199);
				}
			}
		}
	}

}
