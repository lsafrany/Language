package hu.safi.language.server.data;

import hu.safi.language.server.ServerConstants;
import hu.safi.language.server.jdo.Item;
import hu.safi.language.server.jdo.SubTheme;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class Kis_angol_nyelvtan_3 {

	public Kis_angol_nyelvtan_3(PersistenceManager pm) {
		super();

		Query querySubTheme = pm.newQuery("select from " + SubTheme.class.getName());
		@SuppressWarnings("unchecked")
		List<SubTheme> subThemeList = (List<SubTheme>) pm.newQuery(querySubTheme).execute();
		if (!subThemeList.isEmpty()) {
			for (SubTheme s : subThemeList) {
				if (s.getName().equals(ServerConstants.THEME2_SUBTHEME3)) {
					
					Item item1200 = new Item(s.getKey(), "vár", "expect");
					Item item1201 = new Item(s.getKey(), "nem sikerül", "fail");
					Item item1202 = new Item(s.getKey(), "remél", "hope");
					Item item1203 = new Item(s.getKey(), "segít", "help");
					Item item1204 = new Item(s.getKey(), "megtilt", "forbid");
					Item item1205 = new Item(s.getKey(), "meghív", "invite");
					Item item1206 = new Item(s.getKey(), "vágyódik", "long");
					Item item1207 = new Item(s.getKey(), "sikerül", "manage");
					Item item1208 = new Item(s.getKey(), "fölajánl", "offer");
					Item item1209 = new Item(s.getKey(), "megparancsol", "order");
					Item item1210 = new Item(s.getKey(), "akar, tervez", "plan");
					Item item1211 = new Item(s.getKey(), "javasol", "propose");
					Item item1212 = new Item(s.getKey(), "tettet", "pretend");
					Item item1213 = new Item(s.getKey(), "megígér", "promise");
					Item item1214 = new Item(s.getKey(), "megenged", "permit");
					Item item1215 = new Item(s.getKey(), "rávesz", "persuade");
					Item item1216 = new Item(s.getKey(), "emlékeztet", "remind");
					Item item1217 = new Item(s.getKey(), "megtagad", "refuse");
					Item item1218 = new Item(s.getKey(), "kér", "request");
					Item item1219 = new Item(s.getKey(), "mond", "tell");
					Item item1220 = new Item(s.getKey(), "kísért", "tempt");
					Item item1221 = new Item(s.getKey(), "sürget", "urge");
					Item item1222 = new Item(s.getKey(), "akar", "want");
					Item item1223 = new Item(s.getKey(), "óhajt", "wish");
					Item item1224 = new Item(s.getKey(), "Nem engedhetem meg magamnak, hogy a Fordommal gázoljak át a folyón.",
							"I can’t afford to ford the river in a Ford.");
					Item item1225 = new Item(s.getKey(), "Úgy döntöttek, hogy új dalt tanulnak.",
							"They decided to learn a new song.");
					Item item1226 = new Item(s.getKey(), "Nem sikerült levizsgáznia.", "He failed to pass the exam.");
					Item item1227 = new Item(s.getKey(), "A szülei nem fogják elengedni.", "His parents won’t allow him to come.");
					Item item1228 = new Item(s.getKey(), "Megkérte, hogy hatkor ébressze.", "She asked him to wake her at six.");
					Item item1229 = new Item(s.getKey(), "Azt akarom, hogy velem maradj.", "I want you to stay with me.");
					Item item1230 = new Item(s.getKey(), "Nem akarok veled maradni.", "I don’t want to stay with you.");
					Item item1231 = new Item(s.getKey(), "Majd szólj, hogy írjak neki.", "Remind me to write to him.");
					Item item1232 = new Item(s.getKey(), "A feleségem azt mondta, ne csináljam.", "My wife told me not to do it.");
					Item item1233 = new Item(s.getKey(), "Nem volt hajlandó megmutatni neki a cicijét. (Adrian Mole)",
							"She refused to show him her nipple.");
					Item item1234 = new Item(s.getKey(), "Könyörögtem, hogy vigyen el egy magán orrászhoz. (Adrian Mole)",
							"I’ve begged her to take me to a private nose specialist.");
					Item item1235 = new Item(s.getKey(), "Úgy tett mint aki nem hallja.", "She pretended not to hear it.");
					Item item1236 = new Item(s.getKey(), "bevall", "admit");
					Item item1237 = new Item(s.getKey(), "nagyra becsül", "appreciate");
					Item item1238 = new Item(s.getKey(), "elkerül", "avoid");
					Item item1239 = new Item(s.getKey(), "tekint valaminek", "consider");
					Item item1240 = new Item(s.getKey(), "akadályoz", "delay");
					Item item1241 = new Item(s.getKey(), "élvez", "enjoy");
					Item item1242 = new Item(s.getKey(), "elnézést kér", "excuse");
					Item item1243 = new Item(s.getKey(), "szívesen (nem bán)", "don’t mind");
					Item item1244 = new Item(s.getKey(), "nem tehet róla", "can’t help");
					Item item1245 = new Item(s.getKey(), "elképzel", "imagine");
					Item item1246 = new Item(s.getKey(), "elhalaszt", "postpone");
					Item item1247 = new Item(s.getKey(), "egyre csak csinál valamit", "keep");
					Item item1248 = new Item(s.getKey(), "megakadályoz", "prevent");
					Item item1249 = new Item(s.getKey(), "visszaidéz", "recall");
					Item item1250 = new Item(s.getKey(), "megment, spórol", "save");
					Item item1251 = new Item(s.getKey(), "ki nem állhat", "can’t stand");
					Item item1252 = new Item(s.getKey(), "javasol", "suggest");
					Item item1253 = new Item(s.getKey(), "elvisel", "tolerate");
					Item item1254 = new Item(s.getKey(), "ellenkezik", "resist");
					Item item1255 = new Item(s.getKey(), "neheztel", "resent");
					Item item1256 = new Item(s.getKey(), "Egyre csak azt hajtogatta: “Csavaroztál a tejesemberrel!” (Chicago)",
							"He kept saying: “You went screwing the milkman”.");
					Item item1257 = new Item(s.getKey(), "Tiltakozom, hogy hátulról gyere ilyen módszerekkel.",
							"I object to your using that kind of dirty tricks to get at me.");
					Item item1258 = new Item(s.getKey(), "Muszáj volt egy-két célzást ejtenem.",
							"I couldn’t help dropping a thing or two.");
					Item item1259 = new Item(s.getKey(), "Élvezed, hogy ezt csinálod?", "Do you enjoy doing that?");
					Item item1260 = new Item(s.getKey(), "Megpróbálta kikerülni, hogy válaszolnia kelljen a kérdéseimre.",
							"He tried to avoid answering my questions.");
					Item item1261 = new Item(s.getKey(), "Bevallotta, hogy o lopta el a biciklit.",
							"She admitted stealing the bicycle.");
					Item item1262 = new Item(s.getKey(), "Késleltették a jelentés nyilvánosságra hozatalát.",
							"They delayed publishing the report.");
					Item item1263 = new Item(s.getKey(), "A rendorségnek végül sikerült megoldania a rejtélyt.",
							"Police have finally succeeded in solving the mystery.");
					Item item1264 = new Item(s.getKey(), "Nem emlékszem, hogy valaha is találkoztam volna vele.",
							"I don’t recall ever meeting her.");
					Item item1265 = new Item(s.getKey(), "Ragaszkodik hozzá, hogy minden évben külföldön nyaraljon.",
							"She insists on having a holiday abroad every year.");
					Item item1266 = new Item(s.getKey(), "mielott", "before");
					Item item1267 = new Item(s.getKey(), "miután", "after");
					Item item1268 = new Item(s.getKey(), "ahogy", "on");
					Item item1269 = new Item(s.getKey(), "amióta", "since");
					Item item1270 = new Item(s.getKey(), "azonkívül", "besides");
					Item item1271 = new Item(s.getKey(), "anélkül hogy", "without");
					Item item1272 = new Item(s.getKey(), "ahelyett, hogy", "instead of");
					Item item1273 = new Item(s.getKey(), "Reggeli elott szoktam fürödni.",
							"I usually take a bath before having breakfast.");
					Item item1274 = new Item(s.getKey(), "Nem sokkal azután hogy elvégezte az egyetemet, munkába állt.",
							"She started the job soon after leaving the university.");
					Item item1275 = new Item(s.getKey(), "Mióta eljöttünk Párizsból, már megnéztük Brüsszelt és Amszterdamot.",
							"Since leaving Paris, we’ve visited Brussels and Amsterdam.");
					Item item1276 = new Item(s.getKey(), "Azonkívül hogy profi focista, még fagyizót is vezet.",
							"Besides being a pro football player, he also runs an ice-cream shop.");
					Item item1277 = new Item(
							s.getKey(),
							"Anélkül hogy hálátlannak akarnék mutatkozni, meg kell jegyezzem, hogy nászajándékuk nagyobb léptéku is lehetett volna.",
							"Without wishing to appear ungrateful I think their wedding present could have been a bit more generous.");
					Item item1278 = new Item(s.getKey(), "Dolgoznod kéne ahelyett hogy ott döglesz.",
							"You should be working instead of lying there in bed.");
					Item item1279 = new Item(s.getKey(), "Miután megette a csontot, a kutya macskát kért.",
							"Having eaten the bone the dog asked for a cat.");
					Item item1280 = new Item(s.getKey(), "Miután bejejezte a mosogatást fozni kezdett.",
							"Finishing the wash up she started to cook.");
					Item item1281 = new Item(s.getKey(), "Miután visszatért külföldrol, elhatározta, hogy új életet kezd.",
							"Having returned from abroad she decided to start a new life.");
					Item item1282 = new Item(s.getKey(), "Az üzletbe menvén balesetet láttunk.",
							"Going to the shop we saw an accident.");
					Item item1283 = new Item(s.getKey(), "Napoleon kijött a házból, s közben a kutyái ugattak körülötte.",
							"Napoleon came out of the farmhouse with his dogs barking around him.");
					Item item1284 = new Item(s.getKey(), "Hangosan nevetve léptek a gyerekek a szobába be.",
							"The children came into the room laughing loudly.");
					Item item1285 = new Item(
							s.getKey(),
							"A választások közeledtével a kormánynak egyre kevesebb ideje van arra, hogy világossá tegye nézeteit.",
							"With the elections approaching the government is running out of time to settle its views.");
					Item item1286 = new Item(s.getKey(), "Megállt az út közepén megdöbbenve a hatalmas autó látványától.",
							"She stopped in the middle of the road surprised by the sight of the car.");
					Item item1287 = new Item(s.getKey(),
							"A férfi folytatta az ivást, miközben a felesége hamutartókat vagdosott hozzá.",
							"The man went on drinking with his wife throwing ashtrays at him.");
					Item item1288 = new Item(s.getKey(), "Egy pillanatra megállt és a fiút tanulmányozta.",
							"He paused for a moment studying the boy.");
					Item item1289 = new Item(s.getKey(), "A földön feküdt és levego után kapkodott.",
							"He was lying on the floor gasping for breath.");
					Item item1290 = new Item(
							s.getKey(),
							"Az idos hölgy a rendorség felé tartott, miközben egy ifjú ember ugrált körülötte bocsánatért esedezve.",
							"The old lady was heading for the police station with a young man jumping around her and begging her pardon.");
					Item item1291 = new Item(s.getKey(), "Mivel elfogyott a hentes húsa, hát bezárta a boltot.",
							"Having run out of meat, the butcher closed his shop.");
					Item item1292 = new Item(s.getKey(), "Mivel szegények volta, nem tudtak házat venni maguknak.",
							"Being very poor, they couldn’t afford to buy a house.");
					Item item1293 = new Item(s.getKey(), "Mivel félt az esotol, úgy döntött, hogy otthon marad.",
							"Being afraid of the rain, she decided to stay at home.");
					Item item1294 = new Item(s.getKey(), "Miután zavarta a lányt a kukák látványa, függönyt tett az ablakra.",
							"Troubled by the sight of the dustbins she put a curtain on the window. ");
					Item item1295 = new Item(s.getKey(), "Mivel más már nem volt, hát az anyósához fordult.",
							"Having no one else to turn to, she turned to her mother-in-law.");
					Item item1296 = new Item(s.getKey(), "Mivel pénzt nem talált a betöro, hát mindent szétvert.",
							"Finding no money in the house the burglar smashed the place.");
					Item item1297 = new Item(s.getKey(), "Mivel elfogyott a jég, kiment hogy hozzon.",
							"Having run out of ice, she went out to get some.");
					Item item1298 = new Item(s.getKey(), "mosolygó hölgy", "smiling lady");
					Item item1299 = new Item(s.getKey(), "felkelo nap", "rising sun");
					Item item1300 = new Item(s.getKey(), "hullócsillag", "falling star");
					Item item1301 = new Item(s.getKey(), "vágtázó halottkémek", "galloping coroners");
					Item item1302 = new Item(s.getKey(), "mosó medve (a maci, amelyik épp mos)", "washing bear");
					Item item1303 = new Item(s.getKey(), "füstölo Trabant", "fuming Trabant");
					Item item1304 = new Item(s.getKey(), "pancsoló kislány", "splashing girl");
					Item item1305 = new Item(s.getKey(), "éneklo kutya", "singing dog");
					Item item1306 = new Item(s.getKey(), "nyávogó macska", "meowing cat");
					Item item1307 = new Item(s.getKey(), "fenyegeto levél", "threatening letter");
					Item item1308 = new Item(s.getKey(), "alvó oroszlán", "sleeping lion");
					Item item1309 = new Item(s.getKey(), "törött szív", "broken heart");
					Item item1310 = new Item(s.getKey(), "képzett ápoló", "trained nurse");
					Item item1311 = new Item(s.getKey(), "füstölt szalonna", "smoked bacon");
					Item item1312 = new Item(s.getKey(), "szopott gombóc", "sucked dumplings");
					Item item1313 = new Item(s.getKey(), "megfoltozott farmer", "patched jeans");
					Item item1314 = new Item(s.getKey(), "megalázott nyuszi", "humiliated rabbit");
					Item item1315 = new Item(s.getKey(), "elveszett és megtalált nyuszi", "lost and found rabbit");
					Item item1316 = new Item(s.getKey(), "A pancsoló kislány a füstölt szalonnát nyalogatja.",
							"The splashing girl is licking the smoked bacon.");
					Item item1317 = new Item(s.getKey(), "A megfoltozott farmer ott lóg a szárító kötélen.",
							"The patched jeans are hanging on the drying rope.");
					Item item1318 = new Item(s.getKey(), "A nyávogó macska zárt ajtók mögött ül.",
							"The meowing cat is sitting behind locked doors.");
					Item item1319 = new Item(s.getKey(), "Az éneklo kutya a kimeszelt házban vonyít.",
							"The singing dog is whining in the whitewashed house.");
					Item item1320 = new Item(s.getKey(), "A megpucolt tuzhelyen van a rotyogó húsleves.",
							"The boiling meat soup is on the cleaned cooker.");
					Item item1321 = new Item(s.getKey(), "Ismered azt a lányt, aki azzal a férfival táncol?",
							"Do you know the girl dancing with that man?");
					Item item1322 = new Item(s.getKey(), "A könyvek, melyek az asztalon vannak, sokba kerültek.",
							"The books lying on the desk were very expensive.");
					Item item1323 = new Item(s.getKey(), "Olyan ház ez, mely évszázadokkal ezelott épült. (“lett építve”)",
							"This is a house built some hundred years ago.");
					Item item1324 = new Item(s.getKey(), "Olyan ember o, akit mindenki becsül. (“becsülve van mindenki által”)",
							"He is a man trusted by everybody.");
					Item item1325 = new Item(s.getKey(), "Ki az a lány, aki a sarkon áll?",
							"Who is the girl standing at the corner?");
					Item item1326 = new Item(s.getKey(), "Kié az a Trabant, mely a Soroksári úton száguldozik?",
							"Whose is the Trabant racing on Soroksári road?");
					Item item1327 = new Item(s.getKey(), "A lány, aki az asztalnál ül, a novérem.",
							"The girl sitting at the table is my sister.");
					Item item1328 = new Item(s.getKey(), "A kígyó, mely a fuben fekszik, megmar, ha rálépsz.",
							"The snake sleeping in the grass will bite you if you tread upon it.");
					Item item1329 = new Item(s.getKey(), "A férfi, aki az autómat javítja, kiváló szakember.",
							"The man repairing my car is very good at his job.");
					Item item1330 = new Item(s.getKey(), "Az utcán rohanó fiú javító iskolából szökött meg.",
							"The boy running in the street escaped from a reform school.");
					Item item1331 = new Item(s.getKey(), "Hozd ide a papagájt, amelyik a ketrecében beszélget.",
							"Bring me the parrot speaking in its cage.");
					Item item1332 = new Item(s.getKey(), "A férfit, aki a bíró elott áll, rablógyilkossággal vádolják.",
							"The man standing in front of the judge is charged with capital murder.");
					Item item1333 = new Item(s.getKey(), "Hozd ide a borral teli flaskát.", "Get me the flask filled with wine.");
					Item item1334 = new Item(s.getKey(), "A csótányok megették az összes ennivalót, ami a konyhában maradt.",
							"The cockroaches ate all the food left in the kitchen.");
					Item item1335 = new Item(s.getKey(), "A fénykép, mely rólad készült, gyönyöru.",
							"The photo taken of you is beautiful.");
					Item item1336 = new Item(s.getKey(), "A Magyarországon készült kolbász világhíru.",
							"Sausages made in Hungary are very famous.");
					Item item1337 = new Item(s.getKey(), "A New York-ban eltöltött napok csodásak voltak.",
							"The days spent in New York were amazing.");
					Item item1338 = new Item(s.getKey(), "A kertben talált óra az enyém.",
							"The watch found in the garden belongs to me.");
					Item item1339 = new Item(s.getKey(), "Nehéz bátornak lenni, mikor az ember csak egy nagyon kicsi állat.",
							"It's hard to be brave when you are only a very small animal.");
					Item item1340 = new Item(s.getKey(), "Könnyu másnak vermet ásni.", "It's easy to dig a pit for others.");
					Item item1341 = new Item(s.getKey(), "Szeretni jó, jó, jó.", "To love is good, it's good to love.");
					Item item1342 = new Item(s.getKey(), "A futés borzasztó drága lett az idén.",
							"Heating has become very expensive this year.");
					Item item1343 = new Item(s.getKey(), "A napozás olcsó, ha nem kell venni napolajat.",
							"Lying in the sun is cheap if you don't have to buy suntan lotion.");
					Item item1344 = new Item(s.getKey(), "A lejmolás csúnya dolog.", "Leeching is a nasty thing.");
					Item item1345 = new Item(s.getKey(), "Lejmolni a legegyszerubb.", "To be a leech is the most simple solution.");
					Item item1346 = new Item(s.getKey(), "Lopni még könnyebb.", "It's easier to steal.");
					Item item1347 = new Item(s.getKey(), "Nehezen tudta eldönteni melyiket vegye.",
							"It was difficult for him to decide which one to buy.");
					Item item1348 = new Item(s.getKey(), "Szörnyu volt látni, ahogy ott szenvednek a pályán.",
							"It was terrible to see them suffering in the field.");
					Item item1349 = new Item(s.getKey(), "Szerintem könnyu volt megírni.", "I think it was easy to write it.");
					Item item1350 = new Item(s.getKey(), "Lepihenni melletted, menedék a szívednek.",
							"To lie down and rest beside you is a shelter for my heart.");
					Item item1351 = new Item(s.getKey(), "Utálok csavarogni, mikor minden zsúfolt.",
							"I hate hanging about when everything is packed.");
					Item item1352 = new Item(s.getKey(), "Alig várom, hogy találkozhassunk.", "I'm looking forward to seeing you.");
					Item item1353 = new Item(s.getKey(), "Nincs értelme veszekedni.", "It's no use quarreling.");
					Item item1354 = new Item(s.getKey(), "Imádja, ha bámulják.", "She enjoys being stared at.");
					Item item1355 = new Item(s.getKey(), "Mindig iszik almalevet lefekvés elott.",
							"She always drinks apple juice before going to bed.");
					Item item1356 = new Item(s.getKey(), "Elrohant, miután meglátott.", "After seeing me he ran away.");
					Item item1357 = new Item(s.getKey(), "Gondold át, mielott meghívod.", "Think it over before inviting him.");
					Item item1358 = new Item(s.getKey(), "Adj valamit inni.", "Give me something to drink.");
					Item item1359 = new Item(s.getKey(), "Nincs senki, akihez szólhatnék.", "There is nobody to talk to.");
					Item item1360 = new Item(s.getKey(), "Unom már, hogy mindig én húzlak ki a csávából.",
							"I'm getting tired of saving your butt.");
					Item item1361 = new Item(s.getKey(), "Megpróbálunk valami jó megoldást találni mindenki számára.",
							"We're trying to find a proper solution for everybody.");
					Item item1362 = new Item(s.getKey(), "Nem felejtettél el tököt hozni?", "Did you remember to bring pumpkin?");
					Item item1363 = new Item(s.getKey(), "Emlékszem, hogy az asztalra tettem, de most nem találom sehol.",
							"I remember putting it on the table but now I can't find it anywhere.");
					Item item1364 = new Item(s.getKey(), "Kipróbálta milyen mezitláb futni.", "He tried running barefoot.");
					Item item1365 = new Item(s.getKey(), "Megpróbált fölkelni, de nem ment.", "He tried to get up but he failed.");
					Item item1366 = new Item(s.getKey(), "Megállt, hogy fölvegye a cipojét.", "She stopped to put on her shoes.");
					Item item1367 = new Item(s.getKey(), "Abbahagyta a cipohúzást.", "She stopped putting on her shoes.");
					Item item1368 = new Item(s.getKey(), "Sikerült utolérnem.", "I undertook to do it by the end of the month.");
					Item item1369 = new Item(s.getKey(), "Vállaltam, hogy a hónap végére megcsinálom.",
							"I managed to catch up with him.");
					Item item1370 = new Item(s.getKey(), "Nem sikerült utolérnem.", "I failed to catch up with him.");
					Item item1371 = new Item(s.getKey(), "Felajánlottam, hogy kifizetem a szállodát.",
							"I offered to pay for the hotel.");
					Item item1372 = new Item(s.getKey(), "Remélem, hogy hamarosan találkozunk.",
							"I hope to see you as soon as possible.");
					Item item1373 = new Item(s.getKey(), "Szólj, hogy hívjam fel az állatkertet.",
							"Remind me to call the zoo, please.");
					Item item1374 = new Item(s.getKey(), "Ez téged arra fog kötelezni, hogy minden kívánságát teljesítsd.",
							"That will oblige you to fulfil all her wishes.");
					Item item1375 = new Item(s.getKey(),
							"Tényleg akartam veled beszélni a dologról, de nem gondoltam, hogy ma ilyen korán hazajössz.",
							"I really meant to tell you about the situation very soon, but I didn't expect you to come home as early as that.");
					Item item1376 = new Item(s.getKey(), "Nem akarlak elveszíteni.", "I don't want to lose you.");
					Item item1377 = new Item(s.getKey(), "Féltem közel menni hozzá.", "I was afraid to approach her.");
					Item item1378 = new Item(s.getKey(), "A zsugori fazonja nem volt hajlandó kipengetni egy rongyot.",
							"The main gift refused to fork out a grand.");
					Item item1379 = new Item(s.getKey(), "Ne felejtsd el megnézni, nem hagytam-e nálad a csipkés kombiném.",
							"Don't forget to check if I have left my laced slip in your house.");
					Item item1380 = new Item(s.getKey(), "Fontos lesz majd, hogy tudj angolul.",
							"It will be very important for you to speak English.");
					Item item1381 = new Item(s.getKey(), "Nagyon betegnek tettette magát, de engem nem tudott átverni.",
							"He pretended to be very sick, but he failed to fool me.");
					Item item1382 = new Item(
							s.getKey(),
							"A rendor meglátott egy embert, aki közszemérem elleni vétséget követett el és úgy döntött, hogy eltartóztatja.",
							"The policeman caught sight of a man committing a public nuisance, so he decided to arrest him.");
					Item item1383 = new Item(s.getKey(), "Nem akartalak megbántani.", "I didn't mean to hurt your feelings.");
					Item item1384 = new Item(s.getKey(), "Abbahagytam az ivást meg dohányzást, mert nagyon drága mulatság.",
							"I gave up smoking and drinking because they are very expensive habits.");
					Item item1385 = new Item(s.getKey(), "Nem bánom ha itt maradsz éjszakára, de légyszíves ne horkolj.",
							"I don't mind you staying here for the night, but please don't snore.");
					Item item1386 = new Item(s.getKey(), "Érdemes megvenni ezt a csinos kis olasz cipot.",
							"It's worth buying that pretty little Italian pair of shoes.");
					Item item1387 = new Item(s.getKey(), "Érdemes venni ilyen bölcsot, mert a baba álomba tudja ringatni magát.",
							"It's worth buying a cradle like that because the baby can rock itself into sleep.");
					Item item1388 = new Item(s.getKey(), "Nem érdemes sírni elszalasztott lehetoségek miatt.",
							"It's no use crying after missed opportunities.");
					Item item1389 = new Item(s.getKey(), "Muszáj kiszelloztetnem, amikor elmegy.",
							"I can never help airing the room after she leaves.");
					Item item1390 = new Item(s.getKey(), "Mikor eloször ránéztem, nevetnem kellett, aztán meg sírnom.",
							"When I first looked at her I couldn't help laughing, but then I couldn't help crying.");
					Item item1391 = new Item(s.getKey(), "Ki nem állhatom, amikor telefüstöli a szobát.",
							"I can't stand him filling the room with smoke.");
					Item item1392 = new Item(s.getKey(),
							"Én élvezem, mikor kint vagyunk a nyílt tengeren egy kis gumicsónakban, és körülöttünk cápák.",
							"I really enjoy being out there upon the high sea in a small rubber boat surrounded by sharks.");
					Item item1393 = new Item(s.getKey(),
							"Élvezte, hogy itt fekszik a függoágyban és tíz szép lány kínálgatja itallal.",
							"He enjoyed lying in the hammock with ten girls offering him drinks.");
					Item item1394 = new Item(s.getKey(), "Nem tudtam megúszni, hogy ne találkozzam vele.",
							"I couldn't avoid meeting him.");
					Item item1395 = new Item(s.getKey(), "Javaslom, hogy mindent szavazzunk le.",
							"I suggest voting against everything.");
					Item item1396 = new Item(s.getKey(), "Nekem hiányzik, hogy minden reggel ötkor keljek.",
							"I miss having to go to work at five every morning.");
					Item item1397 = new Item(s.getKey(), "Megint kezdett pukkasztgatni, bár figyelmeztettem, hogy ne tegye.",
							"He started popping again, though I had warned him not to do it.");
					Item item1398 = new Item(s.getKey(), "Nem tudta megállni, hogy ne csússzon egyre közelebb hozzá.",
							"He couldn't help slipping closer and closer to her.");
					Item item1399 = new Item(s.getKey(), "Még csak tárgyalni se hajlandó arról, hogy leköltözzön egy libafarmra.",
							"She wouldn't even consider moving to the goose farm.");
					Item item1400 = new Item(s.getKey(), "El tudod te képzelni Zsuzsit, amint egy libafarmon él?",
							"Can you imagine Susie living on a goose farm?");
					Item item1401 = new Item(s.getKey(), "Kétlem, hogy oszinte egy ügyben.", "I doubt him being honest about it.");
					Item item1402 = new Item(s.getKey(), "Tagadom, hogy bármi ilyesmit tettem volna, uram.",
							"I deny doing anything like that, sir.");
					Item item1403 = new Item(s.getKey(), "A tyúkok nehezményezték, hogy napi két tojást kelljen tojniuk.",
							"The hens resented having to lay two eggs a day.");
					Item item1404 = new Item(s.getKey(), "Sosem említetted, hogy volt dolgod vele.",
							"You never mentioned having had an affair with him.");
					Item item1405 = new Item(s.getKey(), "Még egyszer nem kockáztatom meg, hogy kölcsönadjak neki.",
							"I won't risk lending him any money once again.");
					Item item1406 = new Item(s.getKey(), "Megfogta a tehén farkát, mely az istállóban kérodzött.",
							"He caught the tail of the cow ruminating in the barn.");
					Item item1407 = new Item(s.getKey(), "Dühös volt a soforre, aki az ablak alatt túráztatta a kocsiját.",
							"He was angry with the driver revving his car under the window.");
					Item item1408 = new Item(s.getKey(), "Megvigasztalta a lányt, aki ott sóhajtozott a szoba sarkában.",
							"He tried to comfort the girl sighing in the corner of the room.");
					Item item1409 = new Item(s.getKey(), "Te is láttad a csótányt, amelyik a lefolyó felé rohant?",
							"Did you also see the cockroach running towards the plug-hole?");
					Item item1410 = new Item(s.getKey(), "De szép az a medál, ami a nyakadban lóg.",
							"Wow, that's beautiful medal hanging round your neck.");
					Item item1411 = new Item(s.getKey(), "Kiszúrta azt az alakot, amelyik az Astoria sarkánál pénzt váltott.",
							"He spotted the guy changing money at the corner of Astoria.");
					Item item1412 = new Item(s.getKey(), "Nem vette meg a lovat, amelyik ott nyerített a karám sarkában.",
							"He didn't buy the horse neighing in the corner of the stock yard.");
					Item item1413 = new Item(s.getKey(), "Viszont megvette a birkát, amelyik ott bégetett a lovon.",
							"But he bought the sleep bleating on the horse.");
					Item item1414 = new Item(s.getKey(), "Levágta a bajszát, amelyik mindig böködte a lány fülcimpáját.",
							"He cut his moustache prickling the girl's earlobe all the time.");
					Item item1415 = new Item(s.getKey(), "Karjába kapta a lányt, aki a 'Júliá'-t énekelte.",
							"He held the girl singing 'Júlia'.");
					Item item1416 = new Item(s.getKey(), "Piroska észrevette a farkast, amint az a fák közt ólálkodott.",
							"Little Red Riding Hood noticed the wolf lurking in the woods.");
					Item item1417 = new Item(s.getKey(), "Minthogy húsz évig élt Olaszországban, tudta hogy kell spagettit fozni.",
							"Having lived in Italy for twenty years, he knew how to cook spaghetti.");
					Item item1418 = new Item(s.getKey(),
							"Minthogy kiválasztott egy pár kesztyut, úgy döntött vesz egy hozzávaló bundát.",
							"Having chosen a pair of gloves she decided to but a matching fur-coat.");
					Item item1419 = new Item(s.getKey(),
							"Miután már tíz éve o volt a legnagyobb sztár, elhatározta, hogy örökre visszavonul.",
							"Having been the greatest star for ten years she decided to retire for good.");
					Item item1420 = new Item(s.getKey(), "Miután leszerelt a hadseregtol, elment rendornek.",
							"Having been discharged from the army, he decided to join the police force.");
					Item item1421 = new Item(s.getKey(),
							"Mivel három kituno darabban már látta színpadon, neki szánta filmjének egyik foszerepét.",
							"Having seen her on stage in three excellent plays, he considered her for a leading part in his movie.");
					Item item1422 = new Item(s.getKey(), "Megkért, hogy menjek el.", "He asked me to leave.");
					Item item1423 = new Item(s.getKey(), "Felment a padlásra, s nem is nézett énrám.",
							"She went up to the loft without even glancing at me.");
					Item item1424 = new Item(s.getKey(), "Miután kiitta a sörét, elbúcsúzott.",
							"Having drained his beer glass, he said goodbye.");
					Item item1425 = new Item(s.getKey(), "Záróra!", "Closing time!");
					Item item1426 = new Item(s.getKey(), "Bejött a szobába, és mikor meglátott, rájött a csuklás.",
							"She came into the room and seeing me started hiccuping.");
					Item item1427 = new Item(s.getKey(), "Az istállóban tárolt széna és gabona illatától nagyon jól érezte magát.",
							"The smell of the hay and grain stored in the barn filled him with a sense of well-being.");
					Item item1428 = new Item(s.getKey(), "Sose csináltam még szakállassal.",
							"I've never done it with a bearded guy.");
					Item item1429 = new Item(s.getKey(), "Csak ez a takaró van, amire fekhetünk.",
							"I've got just blanket to lie on.");
					Item item1430 = new Item(s.getKey(),
							"A lány holmija mellé tette a cipojét, amibe betuszkolta a zokniját, és a harisnyagumiját.",
							"He placed his shoes stuffed with socks and garter next to her things.");
					Item item1431 = new Item(s.getKey(), "Suttogott, ahogy feküdt mellett.", "She whispered lying beside him.");
					Item item1432 = new Item(s.getKey(), "Nagyon örült, hogy megtalálta a nadrágját.",
							"He was overjoyed to find his pants.");
					Item item1433 = new Item(
							s.getKey(),
							"Ezt kapom azért, amiért téged szedtelek fel, ahelyett hogy megvártam volna azt, amelyiknek van vér a pucájában.",
							"It's what I get for picking you instead of waiting for the one with guts.");
					Item item1434 = new Item(s.getKey(), "Befagy a hátsó felem.", "My ass is frozen.");
					Item item1435 = new Item(s.getKey(), "Aztán továbbmentek, egy szó nélkül.",
							"Then they went on, neither speaking.");
					Item item1436 = new Item(s.getKey(), "Egy kutya kezdte követni oket.", "A dog began to follow them.");
					Item item1437 = new Item(s.getKey(), "Befejezted már a fésülködést?", "Have you finished combing your hair?");
					Item item1438 = new Item(s.getKey(), "Meglepetten látta, hogy teljesen üres az utca.",
							"He was surprised to see that the street was completely deserted.");
					Item item1439 = new Item(s.getKey(), "Rá se rántott, hogy megálljon a pirosnál.",
							"He didn't bother to stop at the reed light.");
					Item item1440 = new Item(s.getKey(), "Ennek semmi köze az üzlethez.", "That has nothing do with this deal.");
					Item item1441 = new Item(s.getKey(), "Neked most nem kéne itt lenned.", "You're not supposed to be here.");
					Item item1442 = new Item(s.getKey(), "Az ablakon beszurodo holdvilág fényében látta meg ot.",
							"By the moonlight straining through the window he saw her.");
					Item item1443 = new Item(s.getKey(), "Hangja halk és visszafogott volt.", "His voice was low and impressed.");
					Item item1444 = new Item(s.getKey(), "Az a szerencsénk, hogy beszéltél vele.",
							"We got lucky with you talking to her.");
					Item item1445 = new Item(s.getKey(), "Úgy döntött, hogy a saját feje után megy.",
							"He decided to use his own judgement.");
					Item item1446 = new Item(s.getKey(), "Érezte, ahogy egyre jobban feszíti belülrol a düh.",
							"He felt a furious anger rising in him.");
					Item item1447 = new Item(s.getKey(), "Nincs itt ma este senki, aki vigyázhatna a kicsire.",
							"There is no one here tonight to look after the nipper.");
					Item item1448 = new Item(s.getKey(), "A házból lépcsok vezettek az utcára.",
							"The house had steps leading down into the street.");
					Item item1449 = new Item(s.getKey(), "Az életemet mentetted meg azzal, hogy észrevetted a skorpiót.",
							"You saved my life by spotting the scorpion.");
					Item item1450 = new Item(s.getKey(), "Egy kocsi dübörgött végig az utcán.",
							"A car came roaring down the street.");
					Item item1451 = new Item(s.getKey(), "Te aztán jól elijesztetted a festoket, akiket festeni küldtek!",
							"You scared off the painters sent to paint the flat.");
					Item item1452 = new Item(s.getKey(), "Még vagy tíz percig maradtak a szobában és közben dohányoztak.",
							"They stayed in the room smoking for another ten minutes.");
					Item item1453 = new Item(s.getKey(), "A Józsi mellett álló lány így szólt…",
							"The girl standing beside Joe said…");
					Item item1454 = new Item(s.getKey(), "Érezte, hogy az oldalához szorítják a karját.",
							"He felt his arms pinned to his sides.");
					Item item1455 = new Item(s.getKey(), "Alig tudott beszélni.", "He had trouble talking.");
					Item item1456 = new Item(s.getKey(),
							"Két csodás órát töltöttek a lány heverojén fekve, miközben egy filmet néztek.",
							"They spent two brillo hours lying on her bed watching a film.");
					Item item1457 = new Item(s.getKey(), "Jót fog tenni neked, ha vegyülsz egy kicsit a munkásosztállyal.",
							"It'll do you good to mingle with the proletariat.");
					Item item1458 = new Item(s.getKey(), "Az ember hajlamos elfeledkezni a kötelességeirol.",
							"One tends to forget one has obligations to meet.");
					Item item1459 = new Item(s.getKey(), "A kínos helyzetet feloldandó, felhívta a nénikéjét.",
							"To create a diversion she telephoned her aunt.");
					Item item1460 = new Item(s.getKey(), "Körülnézve láttam, hogy jónéhányan táncolnak.",
							"Looking around I could see quite a few people dancing.");
					Item item1461 = new Item(s.getKey(), "Nem volt hajlanó felpróbálni azt az ízléstelen pulóvert.",
							"She refused to try the tasteless pullover on.");
					Item item1462 = new Item(s.getKey(), "Úgy vásárolt összevissza, mint egy tébolyult.",
							"She went mad buying clothes.");
					Item item1463 = new Item(s.getKey(), "Van valami ötleted, hogy hogyan lehet gyorsan egymilliót szerezni?",
							"Can you think of a way to make a million in a hurry?");
					Item item1464 = new Item(s.getKey(), "Tiszta ideg, ha arra gondol, hogy szabadságra kell mennie.",
							"He is getting neurotic about going on holiday.");
					Item item1465 = new Item(s.getKey(), "Szenvedett, ha arra gondolt, hogy két hetet kell eltöltenie nélküle.",
							"He was in anguish at the prospect of being without her for two weeks.");
					Item item1466 = new Item(s.getKey(), "A lépcson álltak és órákon át csengettek.",
							"They stood on the steps ringing the bell for ages.");
					Item item1467 = new Item(s.getKey(), "Lepusztult egy fazon volt.", "He was a miserable-looking bloke.");
					Item item1468 = new Item(s.getKey(), "Láttad, ahogy ott korzózott és dobozból szürcsölte a sört?",
							"Did you see him walking along the promenade swigging out of a can of lager?");
					Item item1469 = new Item(s.getKey(), "Még 339 mondat.", "Another 339 sentences to go.");
					Item item1470 = new Item(s.getKey(),
							"A BKV úgy ünnepelt, hogy minden dolgozójának adott egy ingyen buszjegyet.",
							"BPTC celebrated by giving every worker an extra bus ticket.");
					Item item1471 = new Item(s.getKey(), "A kutyák a kocsma elott álltak, és a gazdájukat várták.",
							"The dogs stood outside the bar waiting for their masters.");
					Item item1472 = new Item(s.getKey(), "Ne nyüszögj már!", "Stop whining!");
					Item item1473 = new Item(s.getKey(), "Menj és foglald el magad!", "Go and find something to do!");
					Item item1474 = new Item(s.getKey(), "Valamit el kell mondanom.", "I've got something to tell you.");
					Item item1475 = new Item(s.getKey(), "Micsoda megaláztatás, hogy nyalókát kaptam a születésnapomra!",
							"The humiliation of being given a lollipop for my birthday.");
					Item item1476 = new Item(s.getKey(), "Nem tudtam mit mondani, így hát csöndben maradtam.",
							"I couldn't think of anything to say so I kept quiet.");
					Item item1477 = new Item(s.getKey(), "Örülnél, ha megszabadulhatnál tolem, mi?",
							"You would be glad to get rid of me, wouldn't you?");
					Item item1478 = new Item(s.getKey(), "Beszélt, és közben fel se nézett az újságból:",
							"He spoke without looking up from his paper.");
					Item item1479 = new Item(s.getKey(), "És ha azt mondanám, hogy ez nekem nagyon sokat jelent?",
							"Supposing I said it meant a whole lot to me.");
					Item item1480 = new Item(s.getKey(), "Miközben beszélt, a szonyeg szélét rugdosta.",
							"He talked kicking at the edge of the rug.");
					Item item1481 = new Item(s.getKey(), "Abbahagynád ezt a témát?", "Will you quit harping on that subject?");
					Item item1482 = new Item(s.getKey(), "-Figyelj! - mondta, és felugrott.",
							"'Listen', he said leaping to his feet.");
					Item item1483 = new Item(s.getKey(), "Akár az igazat is megmondhatnád, ahelyett, hogy itt köntörfalazol.",
							"You might as well tell me the truth instead of beating about the bush.");
					Item item1484 = new Item(s.getKey(), "Mindent elrontasz azzal, hogy így állsz hozzá.",
							"You spoil everything by taking that attitude.");
					Item item1485 = new Item(s.getKey(),
							"Oly nagy rössel civakodtak és szidták egymást, hogy elfelejtették lemondani a meghívást. ",
							"They were so busy quarreling and calling each other names that they forgot to cancel the invitation.");
					Item item1486 = new Item(
							s.getKey(),
							"Nézd már, hogy teszi magát; enyhén szétnyílt ajkak, verdeso szempilák, aztán tágra nyílt szempár, idonként meg a karjára teszi a kezét.",
							"Look what an act she is putting on; parted lips, eyelashes fluttering, and then her eyes opening wide and now and then a hand laid on his sleeve.");
					Item item1487 = new Item(s.getKey(),
							"Nos, miután Józsi olyan volt amilyen, a lány nem tiltakozott a leosztás ellen. ",
							"Well, Joe being what he was, she didn't object to the share out.");
					Item item1488 = new Item(s.getKey(), "Azt vártam, hogy bejelentik a lány és Józsi eljegyzését.",
							"I expected to see her engagement to Joe announced.");
					Item item1489 = new Item(s.getKey(), "Nem volt senki, aki a számlát fizette volna.",
							"There was no one else to pay the bill.");
					Item item1490 = new Item(s.getKey(), "Muszáj volt egy-két célzást ejtenem róla.",
							"I couldn't help dropping a hint or two about him.");
					Item item1491 = new Item(s.getKey(), "Felesége is volt valahol titokban.",
							"He had a wife tucked away somewhere.");
					Item item1492 = new Item(s.getKey(), "Gondoltam kitesz magáért.", "I expected her to do herself well.");
					Item item1493 = new Item(
							s.getKey(),
							"Ismertem azt a szokást, hogy úgy rendel ételt, hogy az étlapon lévo legdrágább fogást választja, akár szereti, akár nem.",
							"I knew her habit of choosing a dinner by picking the highest prices on the menu, whether she liked the dish or not.");
					Item item1494 = new Item(s.getKey(), "Kénytelen vagyok azt mondani, hogy nem sajnállak.",
							"I'm bound to say I don't feel sorry for you.");
					Item item1495 = new Item(s.getKey(), "Javára legyen mondva, soha nem titkolta, hogy pénzsóvár.",
							"To do her justice she never concealed she was a mercenary.");
					Item item1496 = new Item(s.getKey(), "Olyan fiatal, és olyan jó ránézni.",
							"She is so young and easy to look at.");
					Item item1497 = new Item(s.getKey(),
							"Ha egy lány hajnali kettokor egy taxiban huzakodik, biztos lehet benne, hogy igazi úrihölgy.",
							"Fighting your way home in a taxi at two o'clock in the morning may help you to reassure that you're still a lady.");
					Item item1498 = new Item(s.getKey(), "Mindenkivel lekezelo volt, még velem is.",
							"She patronized everyone including me.");
					Item item1499 = new Item(
							s.getKey(),
							"Ezeknek a muanyag zacskóknak csak ki kéne bírni, hogy ne szakadjanak ki, ha az ember 800 méteren át cipeli oket.",
							"These carrier bags ought to stand up to being dragged half a mile without splitting.");
					Item item1500 = new Item(s.getKey(), "Egész este kenyértésztát dagasztottam.",
							"I spent all evening bashing dough about.");
					Item item1501 = new Item(s.getKey(), "Ültünk és fényképeket néztünk.", "We sat around looking at photos.");
					Item item1502 = new Item(s.getKey(), "Aztán horkolni kezdett.", "And then he started snoring.");
					Item item1503 = new Item(s.getKey(),
							"Nem lehet végigmenni az utcán anélkül, hogy bele ne ütköznél seftesekbe, akik Symphoniát árulnak.",
							"You can't walk down the street without bumping into wheeler dealers selling Symphonia cigarettes.");
					Item item1504 = new Item(s.getKey(), "Eltökélt szándéka, hogy beáll rendornek.",
							"It is his ambition to join the police force.");
					Item item1505 = new Item(s.getKey(), "Régi filmekben láttam, hogy így csinálják.",
							"I've seen it done in old films.");
					Item item1506 = new Item(s.getKey(), "Mielott felkelt, aludt.", "Before getting up he was sleeping.");
					Item item1507 = new Item(s.getKey(), "Miután aludt, felkelt.", "After sleeping he got up.");
					Item item1508 = new Item(s.getKey(), "Miközben aludt, felkelt. (Holdkóros.)",
							"While sleeping he got up. (He is a sleepwalker.)");
					Item item1509 = new Item(s.getKey(), "Értékes információt adott.",
							"He gave me a valuable piece of information.");
					Item item1510 = new Item(s.getKey(), "Adtam neki egy jó tanácsot.", "I gave her a good piece of advice.");
					Item item1511 = new Item(s.getKey(), "Adj néhány tanácsot.", "Give me some good advice.");
					Item item1512 = new Item(s.getKey(), "Nincs sok dolgunk.", "We don't have much work to do.");
					Item item1513 = new Item(s.getKey(), "Vettem két darab bútort.", "I bought two pieces of furniture.");
					Item item1514 = new Item(s.getKey(), "Jön a rendorség.", "The police are coming.");
					Item item1515 = new Item(s.getKey(), "Micsoda egy randa ido!", "What terrible weather!");
					Item item1516 = new Item(s.getKey(), "Két tetu ring két egéren.", "There are two lice rocking on two mice.");
					Item item1517 = new Item(s.getKey(), "A hírközlo szervek szerint a rendorség négy libát köröz.",
							"According to the media the police want four geese.");
					Item item1518 = new Item(s.getKey(), "Sok férfi van sok bútorban, de egy bútorban csak egy férfi van.",
							"There are a lot of men in a lot of furniture, but in one piece of furniture there's only one man.");
					Item item1519 = new Item(s.getKey(),
							"Nézd azt az intelligens tekintetet a birkák, a szarvasmarhák és az ökrök szemében.",
							"Look at the intelligent eyes of those sheep, cattle, and oxen.");
					Item item1520 = new Item(s.getKey(), "Sok kárt okozot már a selejt.",
							"A lot of damage has been caused by imperfect quality.");
					Item item1521 = new Item(s.getKey(), "Van néhány hírem; tulajdonképpen két hírem van.",
							"I've got some news; actually I've got two pieces of news.");
					Item item1522 = new Item(s.getKey(), "Mi újság?", "What is the news?");
					Item item1523 = new Item(s.getKey(), "Küldje el adatait a társkereso ügynökséghez.",
							"Send your personal data to the matchmaking agency.");
					Item item1524 = new Item(s.getKey(), "Kések és feleségek egyaránt jól meg tudnak vágni.",
							"Knives and wives can be equally sharp.");
					Item item1525 = new Item(s.getKey(), "Néhány dalt énekeltek.", "Some songs were sung.");
					Item item1526 = new Item(s.getKey(), "Van néhány jó könyvem.", "I have some good books.");
					Item item1527 = new Item(s.getKey(), "Van egy kis (valamennyi) kenyerem.", "I have some bread.");
					Item item1528 = new Item(s.getKey(), "Van valamennyi pénzem.", "I’ve got some money in my pocket.");
					Item item1529 = new Item(s.getKey(), "Van benne egy kis tej.", "There is some milk in it.");
					Item item1530 = new Item(s.getKey(), "Kaphatok még kávét?", "May I have some more coffee?");
					Item item1531 = new Item(s.getKey(), "Kérsz még sütit?", "Will you have some cake?");
					Item item1532 = new Item(s.getKey(), "Van egy kis pénzed? (Remélem, hogy van).", "Have you got some money?");
					Item item1533 = new Item(s.getKey(), "Egy kis bort, uram?", "Some wine, Sir?");
					Item item1534 = new Item(s.getKey(), "Valamilyen novel beszélt.", "He was talking to some woman.");
					Item item1535 = new Item(s.getKey(), "Valamilyen könyvben már olvastam ezt a történetet.",
							"I’ve read that story in some book.");
					Item item1536 = new Item(s.getKey(), "Valami férfi keresett ma reggel.", "Some man telephoned this morning.");
					Item item1537 = new Item(s.getKey(), "Van tojás a kosárban?", "Are there any eggs in the basket?");
					Item item1538 = new Item(s.getKey(), "Látsz pénzt az asztalon?", "Can you see any money on the table?");
					Item item1539 = new Item(s.getKey(), "Vannak diákok a teremben?", "Are there any students in the classroom?");
					Item item1540 = new Item(s.getKey(), "Van bor a flaskában?", "Is there any wine in the flask?");
					Item item1541 = new Item(s.getKey(), "Semmit nem kérdezett.", "He didn’t ask me any questions.");
					Item item1542 = new Item(s.getKey(), "Nincs cigaretta az asztalon.",
							"There aren’t any cigarettes on the table.");
					Item item1543 = new Item(s.getKey(), "Nincs pénzem.", "I ain’t got any money. (slang)");
					Item item1544 = new Item(s.getKey(), "Nem hiszem, hogy van tej a kancsóban.",
							"I don’t think there is any milk in the jug.");
					Item item1545 = new Item(s.getKey(), "Nincsenek barátai.", "He has no friends.");
					Item item1546 = new Item(s.getKey(), "Nincs idom.", "I have no time.");
					Item item1547 = new Item(s.getKey(), "Nincs még egy olyan lány, mint te.", "There is no girl like you.");
					Item item1548 = new Item(s.getKey(), "Egy szó sem jön könnyen.", "No words come easy to me.");
					Item item1549 = new Item(s.getKey(), "Nincs alsónemum.", "Ain’t got no underwear. (HAIR)");
					Item item1550 = new Item(s.getKey(), "Valamit látok a sarokban.", "I can see something in the corner.");
					Item item1551 = new Item(s.getKey(), "Nem látok semmit a sarokban.", "I can’t see anything in the corner.");
					Item item1552 = new Item(s.getKey(), "Nem látok semmit a sarokban.", "I can see nothing in the corner.");
					Item item1553 = new Item(s.getKey(), "Valaki van az ágy alatt.", "There is somebody under the bed.");
					Item item1554 = new Item(s.getKey(), "Senki nincs az ágy alatt.", "There isn’t anybody under the bed.");
					Item item1555 = new Item(s.getKey(), "Van valaki az ágy alatt?", "Is there anybody under the bed?");
					Item item1556 = new Item(s.getKey(), "Senki nincs az ágy alatt.", "There is nobody under the bed.");
					Item item1557 = new Item(s.getKey(), "Vannak néhányan, akik nem szeretik a bablevest.",
							"There are some who don't like bean soup.");
					Item item1558 = new Item(s.getKey(), "Néhányan megbetegedtek.", "Some got ill.");
					Item item1559 = new Item(s.getKey(), "Valaki kopog.", "Somebody is knocking.");
					Item item1560 = new Item(s.getKey(), "Semmi sem hasonlítható hozzád.", "Nothing compares to you.");
					Item item1561 = new Item(s.getKey(), "Van aki tud, van aki nem. Ez már csak így van.",
							"Some can, some can't. That's how it is.");
					Item item1562 = new Item(s.getKey(), "Nincs só a levesben.", "There isn't any salt in the soup.");
					Item item1563 = new Item(s.getKey(), "Ki van zárva.", "No way.");
					Item item1564 = new Item(s.getKey(), "Van otthon valaki? - Senki. - De valaki csak mondta azt, hogy senki!",
							"Is there anybody at home? - Nobody. - But somebody must have said nobody!");
					Item item1565 = new Item(s.getKey(), "Van még kávé a csészében?", "Is there some coffee in the cup?");
					Item item1566 = new Item(s.getKey(), "Sok hibát csinált.", "He made a lot of mistakes.");
					Item item1567 = new Item(s.getKey(), "A fia sok bajt okoz neki.", "His son gives him a lot of trouble.");
					Item item1568 = new Item(s.getKey(), "Minden évben sokat költenek sörre.",
							"Lots of money is spent on beer every year.");
					Item item1569 = new Item(s.getKey(), "Sok szabadidom van.", "I have got lots of leisure time.");
					Item item1570 = new Item(s.getKey(), "Sok autója van.", "She’s got a lot of cars.");
					Item item1571 = new Item(s.getKey(), "Nem vétett sok hibát.", "He didn’t make many mistakes.");
					Item item1572 = new Item(s.getKey(), "Sok hibát csinált?", "Did he make many mistakes?");
					Item item1573 = new Item(s.getKey(), "Nincs sok szabadideje.", "He hasn’t got much leisure time.");
					Item item1574 = new Item(s.getKey(), "Sok szabadideje van?", "Has he got much leisure time?");
					Item item1575 = new Item(s.getKey(), "A fia nem okozott sok gondot neki.",
							"His son didn’t give him much trouble.");
					Item item1576 = new Item(s.getKey(), "Sok autója van?", "Has she got many cars?");
					Item item1577 = new Item(s.getKey(), "Annyi baja van a kocsijával.", "He’s got so many problems with his car.");
					Item item1578 = new Item(s.getKey(), "Annyi mint két forintom van.", "I’ve got as much as two forints.");
					Item item1579 = new Item(s.getKey(), "Túl sok ember áll a tuz elott.",
							"There are too many people standing in front of the fire.");
					Item item1580 = new Item(s.getKey(), "Megírtam néhány levelet.", "I wrote a few letters.");
					Item item1581 = new Item(s.getKey(), "Kevés levelet írtam.", "I wrote few letters.");
					Item item1582 = new Item(s.getKey(), "Volt egy kis baja.", "He had a little trouble.");
					Item item1583 = new Item(s.getKey(), "Kevés baja volt.", "He had little trouble.");
					Item item1584 = new Item(s.getKey(), "Van egy kis idom.", "I’ve got a little time.");
					Item item1585 = new Item(s.getKey(), "Kevés idom van.", "I’ve got little time.");
					Item item1586 = new Item(s.getKey(), "Láttunk ott néhány embert.", "We saw a few people there.");
					Item item1587 = new Item(s.getKey(), "Kevés embert láttunk ott.", "We saw few people there.");
					Item item1588 = new Item(s.getKey(), "Sokan voltak a boltban.", "There were a lot of people in the shop.");
					Item item1589 = new Item(s.getKey(), "Sok gyereket kiszolgált már ez a bölcso.",
							"This cradle has been used by a lot of children.");
					Item item1590 = new Item(s.getKey(), "Sok bába közt elvész a gyerek.", "Too many cooks spoil the broth.");
					Item item1591 = new Item(s.getKey(), "Sok az eszkimó és kevés a fóka.",
							"There are too many Eskimos and too few seals.");
					Item item1592 = new Item(s.getKey(), "Kevés itt a fény.", "There's little light here.");
					Item item1593 = new Item(s.getKey(), "Nem sokat tehet, nem igaz?", "There isn't much he can do, is there?");
					Item item1594 = new Item(s.getKey(), "Néhány bab meg egy kis leves van a tányérjában.",
							"There are a few beans and there's a little soup in his plate.");
					Item item1595 = new Item(s.getKey(), "Az összes pénzem eltunt.", "All my money was gone.");
					Item item1596 = new Item(s.getKey(), "Az összes ember énekelt az utcán.",
							"All the people in the street were chanting.");
					Item item1597 = new Item(s.getKey(), "Az összes szalonnát megetted?", "Did you eat all the bacon?");
					Item item1598 = new Item(s.getKey(), "Összes álma semmivé foszlott.", "All his dreams were turned into ashes.");
					Item item1599 = new Item(s.getKey(), "Az összes sört meg akarod inni?", "Do you want to drink all the beer?");
					Item item1600 = new Item(s.getKey(), "A gyár összes dolgozója egyesüljön.",
							"All the workers of the factory should unite.");
					Item item1601 = new Item(s.getKey(), "A világ minden dolgozója egyesüljön.", "All workers should unite.");
					Item item1602 = new Item(s.getKey(), "Az összes gyerek az osztályban szereti a csokoládét.",
							"All the children in the class like chocolate.");
					Item item1603 = new Item(s.getKey(), "Az összes létezo gyerek szereti a csokoládét.",
							"All children like chocolate.");
					Item item1604 = new Item(s.getKey(), "Az összes lányt szeretem (egy bizonyos körben).", "I love all the girls.");
					Item item1605 = new Item(s.getKey(), "Az összes lányt szeretem (a világon).", "I love all girls.");
					Item item1606 = new Item(s.getKey(), "Kinek dollár, kinek gulden, de mindenkinek Nederlanden.",
							"Some need dollar some need gulden but all of us need Nederlanden (that’s an ad)");
					Item item1607 = new Item(s.getKey(), "Egész nap aludtam.", "I was sleeping all day.");
					Item item1608 = new Item(s.getKey(), "Egész éjjel rólad álmodtam.", "I was dreaming of you all night.");
					Item item1609 = new Item(s.getKey(), "Éjjel-nappal dolgozom.", "I work all night, I work all day.");
					Item item1610 = new Item(s.getKey(), "Az egész délután két kétpupú teve társaságában töltöttem.",
							"I spent all the afternoon in the company of two camels.");
					Item item1611 = new Item(s.getKey(), "Most, hogy kint vagyok, a szabadság minden egyes napját élvezem.",
							"Now that I’m out of prison, I enjoy each day of my freedom.");
					Item item1612 = new Item(s.getKey(), "A téesz minden tagja jelen volt.", "Every member of the TSZ was present.");
					Item item1613 = new Item(s.getKey(), "Mindenki verekedett.", "Everybody was Kung-Fu fighting.");
					Item item1614 = new Item(s.getKey(), "Minden egyes macskával külön beszéltem.",
							"I spoke to each cat separately.");
					Item item1615 = new Item(s.getKey(), "A vén fomacska minden piaci napon a napon üldögél. ",
							"Old Deutoronomy sits in the sun every market day.");
					Item item1616 = new Item(s.getKey(), "Minden nap mosok fogat.", "I clean my teeth every day.");
					Item item1617 = new Item(s.getKey(), "Mindnek megvan a maga szobája.", "Each has his own room.");
					Item item1618 = new Item(s.getKey(), "Mindegyik gyerekem más-más iskolába jár.",
							"Each of my children goes to a different school.");
					Item item1619 = new Item(s.getKey(), "Mind megette.", "He ate it all.");
					Item item1620 = new Item(s.getKey(), "Egész éjjel táncoltak.", "They danced all night.");
					Item item1621 = new Item(s.getKey(), "Minden kérdésre válaszolni kell.", "All the questions must be answered.");
					Item item1622 = new Item(s.getKey(), "Minden gyerek szereti a játékokat.", "All children like toys.");
					Item item1623 = new Item(s.getKey(), "Mindkét lány csinos.", "Both girls are pretty.");
					Item item1624 = new Item(s.getKey(), "Mindkét lány csinos.", "Both the girls are pretty.");
					Item item1625 = new Item(s.getKey(), "Mindkét lány csinos.", "Both of the girls are pretty.");
					Item item1626 = new Item(s.getKey(), "Mindkét kocsi tetszik.", "I like both these cars.");
					Item item1627 = new Item(s.getKey(), "Akár ezt, akár azt a narancsot elveheted.", "You can take either orange.");
					Item item1628 = new Item(s.getKey(), "Nagy házak vannak az útnak ezen az oldalán is, meg azon is.",
							"There are big houses on either side of the road.");
					Item item1629 = new Item(s.getKey(), "Ez az út, meg az is Rómába vezet.", "Either road will take you to Rome.");
					Item item1630 = new Item(s.getKey(), "Választhatod ezt a csokrot, vagy azt is. (Virágcsokrot természetesen.)",
							"You can choose either bunch.");
					Item item1631 = new Item(s.getKey(), "Ez a regény is tetszett, meg az is?",
							"Did you like either of the novels?");
					Item item1632 = new Item(s.getKey(), "Nem láttam sem ezt a filmet, sem azt.", "I did not see either film.");
					Item item1633 = new Item(s.getKey(), "Nem láttam sem ezt a filmet, sem azt.",
							"I did not see either of the films.");
					Item item1634 = new Item(s.getKey(), "Sem ez a mondat, sem az nem jó.", "Neither sentence is correct.");
					Item item1635 = new Item(s.getKey(), "Sem ez a mondat, sem az nem jó.", "Neither of the sentences is correct.");
					Item item1636 = new Item(s.getKey(), "Sem ezt a filmet nem láttam, sem azt.", "I saw neither film.");
					Item item1637 = new Item(s.getKey(), "Ez se tetszik, meg az se.", "I don't like either this or that.");
					Item item1638 = new Item(s.getKey(), "Egyik se tetszik.", "I don't like either.");
					Item item1639 = new Item(s.getKey(), "Nekem mind a ketto tetszik.", "I like both of them.");
					Item item1640 = new Item(s.getKey(), "Kettojük közül egyik se kéne.", "I wouldn't need either.");
					Item item1641 = new Item(s.getKey(), "Mindenki más meg tudta volna csinálni.",
							"Everybody else could have done it.");
					Item item1642 = new Item(s.getKey(), "Mindkét szüloje imádja.", "Both of his parents love him.");
					Item item1643 = new Item(s.getKey(), "Mind az apja, mind az anyja elismerte, hogy igaza volt.",
							"Both his father and mother admitted he was right.");
					Item item1644 = new Item(s.getKey(), "Joe barátn?je", "Joe’s girlfriend");
					Item item1645 = new Item(s.getKey(), "Apa kalapja", "Father’s hat");
					Item item1646 = new Item(s.getKey(), "a főnök titkárnője", "The boss’s secretary");
					Item item1647 = new Item(s.getKey(), "macskaszemek", "Cat’s eyes");
					Item item1648 = new Item(s.getKey(), "A patkány kicsinyei", "The rat’s babies");
					Item item1649 = new Item(s.getKey(), "egy percnyi séta", "1 minute’s walk");
					Item item1650 = new Item(s.getKey(), "egy méternyi távolság", "1 meter's distance");
					Item item1651 = new Item(s.getKey(), "Pokol Angyalai", "Hell´s Angels");
					Item item1652 = new Item(s.getKey(), "A Halál Kapuja", "Death’s Door");
					Item item1653 = new Item(s.getKey(), "kőhajtás", "Stone’s throw");
					Item item1654 = new Item(s.getKey(), "A fiúk pénze.", "The boys’ money.");
					Item item1655 = new Item(s.getKey(), "10 percnyi séta.", "10 minutes’ walk.");
					Item item1656 = new Item(s.getKey(), "A kemény legények bátorsága.", "The tough guys’ guts.");
					Item item1657 = new Item(s.getKey(), "szobaajtó", "the door of the room");
					Item item1658 = new Item(s.getKey(), "a lónak a farka", "the tail of the horse");
					Item item1659 = new Item(s.getKey(), "telefonzsinór", "the lead of the telephone");
					Item item1660 = new Item(s.getKey(), "Mari néni férje sógorának pipájának karimája.",
							"The brim of the pipe of the brother-in-law of Aunt Mary’s husband.");
					Item item1661 = new Item(s.getKey(), "A szobaajtó kilincse.", "The handle of the door of the room.");
					Item item1662 = new Item(s.getKey(), "Joe feleségének szeretoje.", "The lover of Joe’s wife.");
					Item item1663 = new Item(s.getKey(), "A kiskakas gyémánt félkrajcárja.", "The cockerel's diamond penny.");
					Item item1664 = new Item(s.getKey(), "Tom bisztrója.", "Tom's diner.");
					Item item1665 = new Item(s.getKey(), "A cigány lova.", "The gypsy's horse.");
					Item item1666 = new Item(s.getKey(), "A ló patája.", "The hoof of the horse.");
					Item item1667 = new Item(s.getKey(), "A szabadság vándorai.", "The wanderers of freedom.");
					Item item1668 = new Item(s.getKey(), "A Csepeli Munkásotthon.", "CSEPEL WORKERS' CLUB.");
					Item item1669 = new Item(s.getKey(), "A pupák pék pókja.", "The silly baker's spider.");
					Item item1670 = new Item(s.getKey(), "Gizi novérének a lánya.", "The daughter of Gizi's sister.");
					Item item1671 = new Item(s.getKey(), "A fonök kocsija.", "The boss's car.");
					Item item1672 = new Item(s.getKey(), "Két hét múlva találkozunk.", "1672) See you in two weeks' time.");
					Item item1673 = new Item(s.getKey(), "Olyan éhes vagyok, mint a farkas.", "I’m as hungry as a wolf.");
					Item item1674 = new Item(s.getKey(), "Nem olyan okos, mint gondoltam.", "He is not as clever as I’ve thought.");
					Item item1675 = new Item(s.getKey(), "Olyan makacs vagy, mint egy öszvér.", "You are as obstinate as a mule.");
					Item item1676 = new Item(s.getKey(), "De hisz nem olyan szép, mint gondolod.",
							"But she is not so pretty as you think.");
					Item item1677 = new Item(s.getKey(), "De hiszen ez a meccs nem olyan jó, mint vártam.",
							"But this match is not so good as I expected.");
					Item item1678 = new Item(s.getKey(), "Domborúbb vagy, mint Bo Derek.",
							"You have a more beautiful figure than Bo Derek.");
					Item item1679 = new Item(s.getKey(), "Az én kocsim jobb, mint bárki másé.",
							"My car is better than any other car.");
					Item item1680 = new Item(s.getKey(), "A hangod mélyebb, mint Amandáé.", "Your voice is deeper than Amanda’s.");
					Item item1681 = new Item(s.getKey(), "Ez a disco nem jobb, mint a Csillagfény.",
							"This disco is not better than Starlight.");
					Item item1682 = new Item(s.getKey(), "Nem szebb, mint a nap?", "Isn’t she more beautiful than the sun?");
					Item item1683 = new Item(s.getKey(), "Az én házam nagyobb, mint a tied.", "My house is bigger than yours.");
					Item item1684 = new Item(s.getKey(), "De a te házadban több a csótány, mint az enyémben.",
							"But there are more cockroaches in your house than in mine.");
					Item item1685 = new Item(s.getKey(), "Ez a legjobb pop zenekar, amit valaha hallottam.",
							"That’s the best pop group I have ever heard.");
					Item item1686 = new Item(s.getKey(), "Te vagy a legszebb lány, akivel valaha találkoztam.",
							"You are the most beautiful girl I have ever met.");
					Item item1687 = new Item(s.getKey(), "A legszebb virágot adtam neked, amit csak kapni lehetett.",
							"I gave you the nicest flowers I could buy.");
					Item item1688 = new Item(s.getKey(), "Gus a macskatársadalom legokosabb tagja.",
							"Gus is the cleverest cat in the cat society.");
					Item item1689 = new Item(s.getKey(), "Te vagy a világ leglustább kölyke.",
							"You are the laziest boy in the world.");
					Item item1690 = new Item(s.getKey(), "Egyszeruen te vagy a legjobb.", "You're simply the best.");
					Item item1691 = new Item(s.getKey(), "Te sem vagy különb.", "You're not much better.");
					Item item1692 = new Item(s.getKey(), "Ez a legrosszabb bableves, amit valaha ettem.",
							"This is the worst bean soup I've ever eaten.");
					Item item1693 = new Item(s.getKey(), "Te betegebb vagy, mint tegnap.",
							"Now you are worse than you were yesterday.");
					Item item1694 = new Item(s.getKey(), "Te vagy a legszebb lány a traktorgyárban.",
							"You're the prettiest girl in the tractor factory.");
					Item item1695 = new Item(s.getKey(), "Hideg a kezed.", "Your hand is cold.");
					Item item1696 = new Item(s.getKey(), "Messzebb van, mint gondoltam.", "It's farther than I can expected.");
					Item item1697 = new Item(s.getKey(), "Olyan fehér, mint a hó.", "It's as white as snow.");
					Item item1698 = new Item(s.getKey(), "A ló (általában a ló) nagy állat.", "A horse is a big animal.");
					Item item1699 = new Item(s.getKey(), "A ló nagy állat.", "Horses are big animals.");
					Item item1700 = new Item(s.getKey(), "Az arany (általában az arany) értékes fém.",
							"Gold is a valuable kind of metal.");
					Item item1701 = new Item(s.getKey(), "A cigaretta tönkreteheti az életed.", "Cigarettes may ruin your life.");
					Item item1702 = new Item(s.getKey(), "A macska egeret eszik.", "Cats eat mice.");
					Item item1703 = new Item(s.getKey(), "A tej egészséges.", "Milk is healthy.");
					Item item1704 = new Item(s.getKey(), "Nem olyan ember, aki cserbenhagyja a barátait.",
							"He is not a man to desert his friends.");
					Item item1705 = new Item(s.getKey(), "Olyan úton mentek, mely hegyek között kanyarog.",
							"They walked along a road winding among rolling hills.");
					Item item1706 = new Item(s.getKey(), "Olyan kérdést tett föl, amire nem tudtam válaszolni.",
							"He asked me a question which I could not answer.");
					Item item1707 = new Item(s.getKey(), "Tudsz zongorázni?", "Can you play the piano?");
					Item item1708 = new Item(s.getKey(), "A lányom hegedülni tanul.", "My daughter is studying the violin.");
					Item item1709 = new Item(s.getKey(), "Tanulsz gitározni?", "Do you study the guitar?");
					Item item1710 = new Item(s.getKey(), "Autószerelo.", "He is a car mechanic.");
					Item item1711 = new Item(s.getKey(), "Az a nagy fiú operaénekes.", "That big guy is an opera singer.");
					Item item1712 = new Item(s.getKey(), "Borzalmas angol tanár vagyok.", "I am a terrible English instructor.");
					Item item1713 = new Item(s.getKey(), "Tehetséges táncos és énekes.",
							"She is a talented singer and a ballet dancer.");
					Item item1714 = new Item(s.getKey(), "Milyen hideg nap!", "What a cold day!");
					Item item1715 = new Item(s.getKey(), "Micsoda gyönyöru lány!", "What a beautiful girl!");
					Item item1716 = new Item(s.getKey(), "Milyen buta hibát csináltál!", "What a silly mistake you’ve made!");
					Item item1717 = new Item(s.getKey(), "Milyen kár! (kivétel)", "What a pity!");
					Item item1718 = new Item(s.getKey(), "Micsoda szégyen! (kivétel)", "What a shame!");
					Item item1719 = new Item(s.getKey(), "Micsoda meglepetés! (kivétel)", "What a surprise!");
					Item item1720 = new Item(s.getKey(), "Micsoda ido!", "What weather!");
					Item item1721 = new Item(s.getKey(), "Reggel fölébredtem, és láttam, hogy a világ a feje tetejére állt.",
							"I woke up in the morning and found the world turned upside down.");
					Item item1722 = new Item(s.getKey(), "Délután egészen más volt a világ.",
							"The world looked so different in the afternoon.");
					Item item1723 = new Item(s.getKey(), "Esténként fekszik az ágyban és a szökésre gondol.",
							"In the evening he always lies in bed thinking of escaping.");
					Item item1724 = new Item(s.getKey(), "Hajnalban minden csendes volt.", "Everything was calm at dawn.");
					Item item1725 = new Item(s.getKey(), "Éjszakánként olyan magányos.", "At night she feels so lonely.");
					Item item1726 = new Item(s.getKey(), "Délben a harangok Hunyadi János emlékét idézik.",
							"At noon the bells ring in the memory of Hunyadi János.");
					Item item1727 = new Item(s.getKey(), "Éjfélkor hang sem hallik a járda felol.",
							"At midnight there are no sounds from the pavement.");
					Item item1728 = new Item(s.getKey(), "Napnyugtakor vörösbe borul a táj.", "At sunset the land turns into red.");
					Item item1729 = new Item(s.getKey(), "Az ipar gyorsan fejlodik a múlt század óta.",
							"Industry has been developing rapidly since the last century.");
					Item item1730 = new Item(s.getKey(), "Magyarország ipara fejlodik.", "The industry of Hungary is developing.");
					Item item1731 = new Item(s.getKey(),
							"A fegyverkezés pont olyan veszélyes a világ számára, mint régen a pestis volt.",
							"Armament is as dangerous to the world nowadays as Black Death was some decades ago.");
					Item item1732 = new Item(s.getKey(), "Az infláció mindig ciklikus periódusokban jelenik meg.",
							"Inflation always turns up in cyclical periods.");
					Item item1733 = new Item(s.getKey(),
							"A 30-as évek inflációja alapveto oka volt a második világháború kitörésének.",
							"The inflation of the 30s was a basic reason for World War II.");
					Item item1734 = new Item(s.getKey(), "Bábszínház az élet.", "Life is a world of puppets.");
					Item item1735 = new Item(s.getKey(), "Egy rendor élete teli van kalandokkal.",
							"The life of a policeman is full of adventures.");
					Item item1736 = new Item(s.getKey(), "A szerelem nehéz ügy.", "Love is problematic.");
					Item item1737 = new Item(s.getKey(), "A fiú szerelme keseru csalódásba fordult.",
							"The love of the boy turned into bitter disappointment.");
					Item item1738 = new Item(s.getKey(), "A gyerekek iskolában vannak.", "The pupils are at school.");
					Item item1739 = new Item(s.getKey(), "Csótányok masíroznak az iskola épületében.",
							"There are cockroaches marching in the school.");
					Item item1740 = new Item(s.getKey(), "A beteg ágyban van.", "The sick man is in bed.");
					Item item1741 = new Item(s.getKey(), "Az ágynemu nem az ágyban van.", "The bedclothes are not in the bed.");
					Item item1742 = new Item(s.getKey(), "Minden vasárnap templomba megyek.",
							"I always go to church on Sunday mornings.");
					Item item1743 = new Item(s.getKey(), "A templom (mint épület) a múlt században épült.",
							"The church was built in the last century.");
					Item item1744 = new Item(s.getKey(), "Nagyon rossz volt a kórházban?", "Was it very bad in hospital?");
					Item item1745 = new Item(s.getKey(), "Tizenhárom éve festik a kórházat (mint épületet).",
							"The hospital has been painted for 13 years.");
					Item item1746 = new Item(s.getKey(), "Az elefánt nagyon sokáig él.",
							"An elephant can live for a very long time.");
					Item item1747 = new Item(s.getKey(), "A pénz mozgatja a világot.", "Money makes the world go round.");
					Item item1748 = new Item(s.getKey(), "Az élet csodás.", "Life is wonderful.");
					Item item1749 = new Item(s.getKey(), "Nehéz a dolga a katonának.", "The life of a soldier is very hard.");
					Item item1750 = new Item(s.getKey(), "A foglalkozása? Mozdonyvezeto.", "His job? He's an engine driver.");
					Item item1751 = new Item(s.getKey(), "Olyan mesét mondott, amit senki nem hitt el.",
							"He told us a story that nobody believed.");
					Item item1752 = new Item(s.getKey(), "Nem szeret focizni, de imád zongorázni.",
							"He doesn't like to play football but he loves playing the piano.");
					Item item1753 = new Item(s.getKey(), "Bárcsak szeretnél. (de nincs rá esélyem)", "I wish you loved me.");
					Item item1754 = new Item(s.getKey(), "Bárcsak itt lennél. (de reménytelen)", "I wish you were here.");
					Item item1755 = new Item(s.getKey(), "Bárcsak tavasz lenne. (de tél van)", "If only it was spring.");
					Item item1756 = new Item(s.getKey(), "Bárcsak ne úgy viselkednél mint egy idegen. (de úgy viselkedsz)",
							"If only you didn’t behave like a stranger.");
					Item item1757 = new Item(s.getKey(), "Bárcsak ne lennél olyan boldogtalan. (de az vagy)",
							"I wish you weren’t so unhappy.");
					Item item1758 = new Item(s.getKey(), "Bárcsak írnál már. (Tudom, hogy fogsz írni, csak siettetni akarom.)",
							"I wish you would write me a letter.");
					Item item1759 = new Item(s.getKey(), "Bárcsak korábban indulnánk.", "If only we would start sooner.");
					Item item1760 = new Item(s.getKey(), "Bárcsak csörögne már a telefon.", "I wish you would telephone me.");
					Item item1761 = new Item(s.getKey(), "Bárcsak mindent megtettem volna azért, hogy boldog légy.",
							"If only I had done my best to make you happy.");
					Item item1762 = new Item(s.getKey(), "Bárcsak ne ivott vona annyit tegnap este.",
							"I wish he hadn’t drunk so much last night.");
					Item item1763 = new Item(s.getKey(), "Bárcsak el tudnál jönni meglátogatni.",
							"I wish you could come to see me.");
					Item item1764 = new Item(s.getKey(), "Bárcsak tudtam volna segíteni.", "I wish I could have helped you.");
					Item item1765 = new Item(s.getKey(), "Bárcsak gyorsabban tudnál vezetni.", "I wish you could drive faster.");
					Item item1766 = new Item(s.getKey(), "Bárcsak itt lennél.", "I wish you were here.");
					Item item1767 = new Item(s.getKey(), "Bárcsak szólna hozzám.", "If only he would talk to me.");
					Item item1768 = new Item(s.getKey(), "Bárcsak tudtam volna.", "I wish I had known.");
					Item item1769 = new Item(s.getKey(), "Bárcsak meg tudnálak érteni.", "I wish I could understand you.");
					Item item1770 = new Item(s.getKey(), "Bárcsak esne rám.", "I wish it would rain down on me.");
					Item item1771 = new Item(s.getKey(), "Bárcsak ne ettem volna meg.", "If only I hadn't eaten it.");
					Item item1772 = new Item(s.getKey(), "Óh, ha én is köztetek lehetnék.", "If only I could be with you.");
					Item item1773 = new Item(s.getKey(), "Bárcsak fiatalabb volnék húsz évvel.",
							"I wish I was twenty years younger.");
					Item item1774 = new Item(s.getKey(), "Mindig korán kelt, és reggeli elott sétált egyet.",
							"He would rise early and take a walk before breakfast.");
					Item item1775 = new Item(s.getKey(), "A férjem valaha minden szombat este discoba vitt.",
							"My husband used to take me to the disco every Saturday evening.");
					Item item1776 = new Item(s.getKey(), "Ebbe az iskolába jártam.", "I used to go to this school.");
					Item item1777 = new Item(s.getKey(), "Gyerekkorában gyakran mászott fára.",
							"When he was a child he would climb up trees.");
					Item item1778 = new Item(s.getKey(), "Nem dolgoztak itt.", "They didn’t use to work here.");
					Item item1779 = new Item(s.getKey(), "Ebben a házban éltél?", "Did you use to live in this house?");
					Item item1780 = new Item(s.getKey(), "Valaha 20 cigarettát szívott naponta.",
							"He used to smoke twenty cigarettes a day.");
					Item item1781 = new Item(s.getKey(), "Valaha lóversenyre jártam.", "I used to go to the races.");
					Item item1782 = new Item(s.getKey(), "Szeretsz, nem?", "You love me, don’t you?");
					Item item1783 = new Item(s.getKey(), "Szerettél, nem?", "You loved me, didn’t you?");
					Item item1784 = new Item(s.getKey(), "Hülye vagyok, nem?", "I am stupid, aren’t I?");
					Item item1785 = new Item(s.getKey(), "Gyere velem, jó?", "Come with me, will you?");
					Item item1786 = new Item(s.getKey(), "Bújjunk ágyba, jó?", "Let’s go to bed, shall we?");
					Item item1787 = new Item(s.getKey(), "Joe lát, nem?", "Joe can see, can’t he?");
					Item item1788 = new Item(s.getKey(), "Idejössz, nem?", "You will come here, won’t you?");
					Item item1789 = new Item(s.getKey(), "Nem tud autót javítani, ugye?", "He can’t repair cars, can he?");
					Item item1790 = new Item(s.getKey(), "Te szereted a patkányokat, nem?", "You like rats, don’t you?");
					Item item1791 = new Item(s.getKey(), "Semmit nem iszik, ugye?", "She doesn’t drink anything, does she?");
					Item item1792 = new Item(s.getKey(), "Elment Spanyolországba, nem?", "He went to Spain, didn’t he?");
					Item item1793 = new Item(s.getKey(), "A lányok nem jöttek vissza, ugye?", "The girls didn’t return, did they?");
					Item item1794 = new Item(s.getKey(), "Van valami a sarokban, nem?",
							"There is something in the corner, isn’t there?");
					Item item1795 = new Item(s.getKey(), "Belépünk a korlátlan lehetoségek korába, nem?",
							"We will enter in the era of infinite possibilities, won’t we?");
					Item item1796 = new Item(s.getKey(), "Judynak nem kéne így viselkednie, nem?",
							"Judy shouldn’t behave like that, should she?");
					Item item1797 = new Item(s.getKey(), "Bolondnak nevezett, nem?", "He called you a fool, didn’t he?");
					Item item1798 = new Item(s.getKey(), "Nagyon okos vagyok, nem?", "I am very clever, aren’t I?");
					Item item1799 = new Item(s.getKey(), "Nem vagyok valami eszes, igaz?", "I am not very clever, am I?");
					Item item1800 = new Item(s.getKey(), "Nézzük az emberi nemet, jó?", "Let’s look at mankind, shall we?");

					pm.makePersistent(item1200);
					pm.makePersistent(item1201);
					pm.makePersistent(item1202);
					pm.makePersistent(item1203);
					pm.makePersistent(item1204);
					pm.makePersistent(item1205);
					pm.makePersistent(item1206);
					pm.makePersistent(item1207);
					pm.makePersistent(item1208);
					pm.makePersistent(item1209);
					pm.makePersistent(item1210);
					pm.makePersistent(item1211);
					pm.makePersistent(item1212);
					pm.makePersistent(item1213);
					pm.makePersistent(item1214);
					pm.makePersistent(item1215);
					pm.makePersistent(item1216);
					pm.makePersistent(item1217);
					pm.makePersistent(item1218);
					pm.makePersistent(item1219);
					pm.makePersistent(item1220);
					pm.makePersistent(item1221);
					pm.makePersistent(item1222);
					pm.makePersistent(item1223);
					pm.makePersistent(item1224);
					pm.makePersistent(item1225);
					pm.makePersistent(item1226);
					pm.makePersistent(item1227);
					pm.makePersistent(item1228);
					pm.makePersistent(item1229);
					pm.makePersistent(item1230);
					pm.makePersistent(item1231);
					pm.makePersistent(item1232);
					pm.makePersistent(item1233);
					pm.makePersistent(item1234);
					pm.makePersistent(item1235);
					pm.makePersistent(item1236);
					pm.makePersistent(item1237);
					pm.makePersistent(item1238);
					pm.makePersistent(item1239);
					pm.makePersistent(item1240);
					pm.makePersistent(item1241);
					pm.makePersistent(item1242);
					pm.makePersistent(item1243);
					pm.makePersistent(item1244);
					pm.makePersistent(item1245);
					pm.makePersistent(item1246);
					pm.makePersistent(item1247);
					pm.makePersistent(item1248);
					pm.makePersistent(item1249);
					pm.makePersistent(item1250);
					pm.makePersistent(item1251);
					pm.makePersistent(item1252);
					pm.makePersistent(item1253);
					pm.makePersistent(item1254);
					pm.makePersistent(item1255);
					pm.makePersistent(item1256);
					pm.makePersistent(item1257);
					pm.makePersistent(item1258);
					pm.makePersistent(item1259);
					pm.makePersistent(item1260);
					pm.makePersistent(item1261);
					pm.makePersistent(item1262);
					pm.makePersistent(item1263);
					pm.makePersistent(item1264);
					pm.makePersistent(item1265);
					pm.makePersistent(item1266);
					pm.makePersistent(item1267);
					pm.makePersistent(item1268);
					pm.makePersistent(item1269);
					pm.makePersistent(item1270);
					pm.makePersistent(item1271);
					pm.makePersistent(item1272);
					pm.makePersistent(item1273);
					pm.makePersistent(item1274);
					pm.makePersistent(item1275);
					pm.makePersistent(item1276);
					pm.makePersistent(item1277);
					pm.makePersistent(item1278);
					pm.makePersistent(item1279);
					pm.makePersistent(item1280);
					pm.makePersistent(item1281);
					pm.makePersistent(item1282);
					pm.makePersistent(item1283);
					pm.makePersistent(item1284);
					pm.makePersistent(item1285);
					pm.makePersistent(item1286);
					pm.makePersistent(item1287);
					pm.makePersistent(item1288);
					pm.makePersistent(item1289);
					pm.makePersistent(item1290);
					pm.makePersistent(item1291);
					pm.makePersistent(item1292);
					pm.makePersistent(item1293);
					pm.makePersistent(item1294);
					pm.makePersistent(item1295);
					pm.makePersistent(item1296);
					pm.makePersistent(item1297);
					pm.makePersistent(item1298);
					pm.makePersistent(item1299);
					pm.makePersistent(item1300);
					pm.makePersistent(item1301);
					pm.makePersistent(item1302);
					pm.makePersistent(item1303);
					pm.makePersistent(item1304);
					pm.makePersistent(item1305);
					pm.makePersistent(item1306);
					pm.makePersistent(item1307);
					pm.makePersistent(item1308);
					pm.makePersistent(item1309);
					pm.makePersistent(item1310);
					pm.makePersistent(item1311);
					pm.makePersistent(item1312);
					pm.makePersistent(item1313);
					pm.makePersistent(item1314);
					pm.makePersistent(item1315);
					pm.makePersistent(item1316);
					pm.makePersistent(item1317);
					pm.makePersistent(item1318);
					pm.makePersistent(item1319);
					pm.makePersistent(item1320);
					pm.makePersistent(item1321);
					pm.makePersistent(item1322);
					pm.makePersistent(item1323);
					pm.makePersistent(item1324);
					pm.makePersistent(item1325);
					pm.makePersistent(item1326);
					pm.makePersistent(item1327);
					pm.makePersistent(item1328);
					pm.makePersistent(item1329);
					pm.makePersistent(item1330);
					pm.makePersistent(item1331);
					pm.makePersistent(item1332);
					pm.makePersistent(item1333);
					pm.makePersistent(item1334);
					pm.makePersistent(item1335);
					pm.makePersistent(item1336);
					pm.makePersistent(item1337);
					pm.makePersistent(item1338);
					pm.makePersistent(item1339);
					pm.makePersistent(item1340);
					pm.makePersistent(item1341);
					pm.makePersistent(item1342);
					pm.makePersistent(item1343);
					pm.makePersistent(item1344);
					pm.makePersistent(item1345);
					pm.makePersistent(item1346);
					pm.makePersistent(item1347);
					pm.makePersistent(item1348);
					pm.makePersistent(item1349);
					pm.makePersistent(item1350);
					pm.makePersistent(item1351);
					pm.makePersistent(item1352);
					pm.makePersistent(item1353);
					pm.makePersistent(item1354);
					pm.makePersistent(item1355);
					pm.makePersistent(item1356);
					pm.makePersistent(item1357);
					pm.makePersistent(item1358);
					pm.makePersistent(item1359);
					pm.makePersistent(item1360);
					pm.makePersistent(item1361);
					pm.makePersistent(item1362);
					pm.makePersistent(item1363);
					pm.makePersistent(item1364);
					pm.makePersistent(item1365);
					pm.makePersistent(item1366);
					pm.makePersistent(item1367);
					pm.makePersistent(item1368);
					pm.makePersistent(item1369);
					pm.makePersistent(item1370);
					pm.makePersistent(item1371);
					pm.makePersistent(item1372);
					pm.makePersistent(item1373);
					pm.makePersistent(item1374);
					pm.makePersistent(item1375);
					pm.makePersistent(item1376);
					pm.makePersistent(item1377);
					pm.makePersistent(item1378);
					pm.makePersistent(item1379);
					pm.makePersistent(item1380);
					pm.makePersistent(item1381);
					pm.makePersistent(item1382);
					pm.makePersistent(item1383);
					pm.makePersistent(item1384);
					pm.makePersistent(item1385);
					pm.makePersistent(item1386);
					pm.makePersistent(item1387);
					pm.makePersistent(item1388);
					pm.makePersistent(item1389);
					pm.makePersistent(item1390);
					pm.makePersistent(item1391);
					pm.makePersistent(item1392);
					pm.makePersistent(item1393);
					pm.makePersistent(item1394);
					pm.makePersistent(item1395);
					pm.makePersistent(item1396);
					pm.makePersistent(item1397);
					pm.makePersistent(item1398);
					pm.makePersistent(item1399);
					pm.makePersistent(item1400);
					pm.makePersistent(item1401);
					pm.makePersistent(item1402);
					pm.makePersistent(item1403);
					pm.makePersistent(item1404);
					pm.makePersistent(item1405);
					pm.makePersistent(item1406);
					pm.makePersistent(item1407);
					pm.makePersistent(item1408);
					pm.makePersistent(item1409);
					pm.makePersistent(item1410);
					pm.makePersistent(item1411);
					pm.makePersistent(item1412);
					pm.makePersistent(item1413);
					pm.makePersistent(item1414);
					pm.makePersistent(item1415);
					pm.makePersistent(item1416);
					pm.makePersistent(item1417);
					pm.makePersistent(item1418);
					pm.makePersistent(item1419);
					pm.makePersistent(item1420);
					pm.makePersistent(item1421);
					pm.makePersistent(item1422);
					pm.makePersistent(item1423);
					pm.makePersistent(item1424);
					pm.makePersistent(item1425);
					pm.makePersistent(item1426);
					pm.makePersistent(item1427);
					pm.makePersistent(item1428);
					pm.makePersistent(item1429);
					pm.makePersistent(item1430);
					pm.makePersistent(item1431);
					pm.makePersistent(item1432);
					pm.makePersistent(item1433);
					pm.makePersistent(item1434);
					pm.makePersistent(item1435);
					pm.makePersistent(item1436);
					pm.makePersistent(item1437);
					pm.makePersistent(item1438);
					pm.makePersistent(item1439);
					pm.makePersistent(item1440);
					pm.makePersistent(item1441);
					pm.makePersistent(item1442);
					pm.makePersistent(item1443);
					pm.makePersistent(item1444);
					pm.makePersistent(item1445);
					pm.makePersistent(item1446);
					pm.makePersistent(item1447);
					pm.makePersistent(item1448);
					pm.makePersistent(item1449);
					pm.makePersistent(item1450);
					pm.makePersistent(item1451);
					pm.makePersistent(item1452);
					pm.makePersistent(item1453);
					pm.makePersistent(item1454);
					pm.makePersistent(item1455);
					pm.makePersistent(item1456);
					pm.makePersistent(item1457);
					pm.makePersistent(item1458);
					pm.makePersistent(item1459);
					pm.makePersistent(item1460);
					pm.makePersistent(item1461);
					pm.makePersistent(item1462);
					pm.makePersistent(item1463);
					pm.makePersistent(item1464);
					pm.makePersistent(item1465);
					pm.makePersistent(item1466);
					pm.makePersistent(item1467);
					pm.makePersistent(item1468);
					pm.makePersistent(item1469);
					pm.makePersistent(item1470);
					pm.makePersistent(item1471);
					pm.makePersistent(item1472);
					pm.makePersistent(item1473);
					pm.makePersistent(item1474);
					pm.makePersistent(item1475);
					pm.makePersistent(item1476);
					pm.makePersistent(item1477);
					pm.makePersistent(item1478);
					pm.makePersistent(item1479);
					pm.makePersistent(item1480);
					pm.makePersistent(item1481);
					pm.makePersistent(item1482);
					pm.makePersistent(item1483);
					pm.makePersistent(item1484);
					pm.makePersistent(item1485);
					pm.makePersistent(item1486);
					pm.makePersistent(item1487);
					pm.makePersistent(item1488);
					pm.makePersistent(item1489);
					pm.makePersistent(item1490);
					pm.makePersistent(item1491);
					pm.makePersistent(item1492);
					pm.makePersistent(item1493);
					pm.makePersistent(item1494);
					pm.makePersistent(item1495);
					pm.makePersistent(item1496);
					pm.makePersistent(item1497);
					pm.makePersistent(item1498);
					pm.makePersistent(item1499);
					pm.makePersistent(item1500);
					pm.makePersistent(item1501);
					pm.makePersistent(item1502);
					pm.makePersistent(item1503);
					pm.makePersistent(item1504);
					pm.makePersistent(item1505);
					pm.makePersistent(item1506);
					pm.makePersistent(item1507);
					pm.makePersistent(item1508);
					pm.makePersistent(item1509);
					pm.makePersistent(item1510);
					pm.makePersistent(item1511);
					pm.makePersistent(item1512);
					pm.makePersistent(item1513);
					pm.makePersistent(item1514);
					pm.makePersistent(item1515);
					pm.makePersistent(item1516);
					pm.makePersistent(item1517);
					pm.makePersistent(item1518);
					pm.makePersistent(item1519);
					pm.makePersistent(item1520);
					pm.makePersistent(item1521);
					pm.makePersistent(item1522);
					pm.makePersistent(item1523);
					pm.makePersistent(item1524);
					pm.makePersistent(item1525);
					pm.makePersistent(item1526);
					pm.makePersistent(item1527);
					pm.makePersistent(item1528);
					pm.makePersistent(item1529);
					pm.makePersistent(item1530);
					pm.makePersistent(item1531);
					pm.makePersistent(item1532);
					pm.makePersistent(item1533);
					pm.makePersistent(item1534);
					pm.makePersistent(item1535);
					pm.makePersistent(item1536);
					pm.makePersistent(item1537);
					pm.makePersistent(item1538);
					pm.makePersistent(item1539);
					pm.makePersistent(item1540);
					pm.makePersistent(item1541);
					pm.makePersistent(item1542);
					pm.makePersistent(item1543);
					pm.makePersistent(item1544);
					pm.makePersistent(item1545);
					pm.makePersistent(item1546);
					pm.makePersistent(item1547);
					pm.makePersistent(item1548);
					pm.makePersistent(item1549);
					pm.makePersistent(item1550);
					pm.makePersistent(item1551);
					pm.makePersistent(item1552);
					pm.makePersistent(item1553);
					pm.makePersistent(item1554);
					pm.makePersistent(item1555);
					pm.makePersistent(item1556);
					pm.makePersistent(item1557);
					pm.makePersistent(item1558);
					pm.makePersistent(item1559);
					pm.makePersistent(item1560);
					pm.makePersistent(item1561);
					pm.makePersistent(item1562);
					pm.makePersistent(item1563);
					pm.makePersistent(item1564);
					pm.makePersistent(item1565);
					pm.makePersistent(item1566);
					pm.makePersistent(item1567);
					pm.makePersistent(item1568);
					pm.makePersistent(item1569);
					pm.makePersistent(item1570);
					pm.makePersistent(item1571);
					pm.makePersistent(item1572);
					pm.makePersistent(item1573);
					pm.makePersistent(item1574);
					pm.makePersistent(item1575);
					pm.makePersistent(item1576);
					pm.makePersistent(item1577);
					pm.makePersistent(item1578);
					pm.makePersistent(item1579);
					pm.makePersistent(item1580);
					pm.makePersistent(item1581);
					pm.makePersistent(item1582);
					pm.makePersistent(item1583);
					pm.makePersistent(item1584);
					pm.makePersistent(item1585);
					pm.makePersistent(item1586);
					pm.makePersistent(item1587);
					pm.makePersistent(item1588);
					pm.makePersistent(item1589);
					pm.makePersistent(item1590);
					pm.makePersistent(item1591);
					pm.makePersistent(item1592);
					pm.makePersistent(item1593);
					pm.makePersistent(item1594);
					pm.makePersistent(item1595);
					pm.makePersistent(item1596);
					pm.makePersistent(item1597);
					pm.makePersistent(item1598);
					pm.makePersistent(item1599);
					pm.makePersistent(item1600);
					pm.makePersistent(item1601);
					pm.makePersistent(item1602);
					pm.makePersistent(item1603);
					pm.makePersistent(item1604);
					pm.makePersistent(item1605);
					pm.makePersistent(item1606);
					pm.makePersistent(item1607);
					pm.makePersistent(item1608);
					pm.makePersistent(item1609);
					pm.makePersistent(item1610);
					pm.makePersistent(item1611);
					pm.makePersistent(item1612);
					pm.makePersistent(item1613);
					pm.makePersistent(item1614);
					pm.makePersistent(item1615);
					pm.makePersistent(item1616);
					pm.makePersistent(item1617);
					pm.makePersistent(item1618);
					pm.makePersistent(item1619);
					pm.makePersistent(item1620);
					pm.makePersistent(item1621);
					pm.makePersistent(item1622);
					pm.makePersistent(item1623);
					pm.makePersistent(item1624);
					pm.makePersistent(item1625);
					pm.makePersistent(item1626);
					pm.makePersistent(item1627);
					pm.makePersistent(item1628);
					pm.makePersistent(item1629);
					pm.makePersistent(item1630);
					pm.makePersistent(item1631);
					pm.makePersistent(item1632);
					pm.makePersistent(item1633);
					pm.makePersistent(item1634);
					pm.makePersistent(item1635);
					pm.makePersistent(item1636);
					pm.makePersistent(item1637);
					pm.makePersistent(item1638);
					pm.makePersistent(item1639);
					pm.makePersistent(item1640);
					pm.makePersistent(item1641);
					pm.makePersistent(item1642);
					pm.makePersistent(item1643);
					pm.makePersistent(item1644);
					pm.makePersistent(item1645);
					pm.makePersistent(item1646);
					pm.makePersistent(item1647);
					pm.makePersistent(item1648);
					pm.makePersistent(item1649);
					pm.makePersistent(item1650);
					pm.makePersistent(item1651);
					pm.makePersistent(item1652);
					pm.makePersistent(item1653);
					pm.makePersistent(item1654);
					pm.makePersistent(item1655);
					pm.makePersistent(item1656);
					pm.makePersistent(item1657);
					pm.makePersistent(item1658);
					pm.makePersistent(item1659);
					pm.makePersistent(item1660);
					pm.makePersistent(item1661);
					pm.makePersistent(item1662);
					pm.makePersistent(item1663);
					pm.makePersistent(item1664);
					pm.makePersistent(item1665);
					pm.makePersistent(item1666);
					pm.makePersistent(item1667);
					pm.makePersistent(item1668);
					pm.makePersistent(item1669);
					pm.makePersistent(item1670);
					pm.makePersistent(item1671);
					pm.makePersistent(item1672);
					pm.makePersistent(item1673);
					pm.makePersistent(item1674);
					pm.makePersistent(item1675);
					pm.makePersistent(item1676);
					pm.makePersistent(item1677);
					pm.makePersistent(item1678);
					pm.makePersistent(item1679);
					pm.makePersistent(item1680);
					pm.makePersistent(item1681);
					pm.makePersistent(item1682);
					pm.makePersistent(item1683);
					pm.makePersistent(item1684);
					pm.makePersistent(item1685);
					pm.makePersistent(item1686);
					pm.makePersistent(item1687);
					pm.makePersistent(item1688);
					pm.makePersistent(item1689);
					pm.makePersistent(item1690);
					pm.makePersistent(item1691);
					pm.makePersistent(item1692);
					pm.makePersistent(item1693);
					pm.makePersistent(item1694);
					pm.makePersistent(item1695);
					pm.makePersistent(item1696);
					pm.makePersistent(item1697);
					pm.makePersistent(item1698);
					pm.makePersistent(item1699);
					pm.makePersistent(item1700);
					pm.makePersistent(item1701);
					pm.makePersistent(item1702);
					pm.makePersistent(item1703);
					pm.makePersistent(item1704);
					pm.makePersistent(item1705);
					pm.makePersistent(item1706);
					pm.makePersistent(item1707);
					pm.makePersistent(item1708);
					pm.makePersistent(item1709);
					pm.makePersistent(item1710);
					pm.makePersistent(item1711);
					pm.makePersistent(item1712);
					pm.makePersistent(item1713);
					pm.makePersistent(item1714);
					pm.makePersistent(item1715);
					pm.makePersistent(item1716);
					pm.makePersistent(item1717);
					pm.makePersistent(item1718);
					pm.makePersistent(item1719);
					pm.makePersistent(item1720);
					pm.makePersistent(item1721);
					pm.makePersistent(item1722);
					pm.makePersistent(item1723);
					pm.makePersistent(item1724);
					pm.makePersistent(item1725);
					pm.makePersistent(item1726);
					pm.makePersistent(item1727);
					pm.makePersistent(item1728);
					pm.makePersistent(item1729);
					pm.makePersistent(item1730);
					pm.makePersistent(item1731);
					pm.makePersistent(item1732);
					pm.makePersistent(item1733);
					pm.makePersistent(item1734);
					pm.makePersistent(item1735);
					pm.makePersistent(item1736);
					pm.makePersistent(item1737);
					pm.makePersistent(item1738);
					pm.makePersistent(item1739);
					pm.makePersistent(item1740);
					pm.makePersistent(item1741);
					pm.makePersistent(item1742);
					pm.makePersistent(item1743);
					pm.makePersistent(item1744);
					pm.makePersistent(item1745);
					pm.makePersistent(item1746);
					pm.makePersistent(item1747);
					pm.makePersistent(item1748);
					pm.makePersistent(item1749);
					pm.makePersistent(item1750);
					pm.makePersistent(item1751);
					pm.makePersistent(item1752);
					pm.makePersistent(item1753);
					pm.makePersistent(item1754);
					pm.makePersistent(item1755);
					pm.makePersistent(item1756);
					pm.makePersistent(item1757);
					pm.makePersistent(item1758);
					pm.makePersistent(item1759);
					pm.makePersistent(item1760);
					pm.makePersistent(item1761);
					pm.makePersistent(item1762);
					pm.makePersistent(item1763);
					pm.makePersistent(item1764);
					pm.makePersistent(item1765);
					pm.makePersistent(item1766);
					pm.makePersistent(item1767);
					pm.makePersistent(item1768);
					pm.makePersistent(item1769);
					pm.makePersistent(item1770);
					pm.makePersistent(item1771);
					pm.makePersistent(item1772);
					pm.makePersistent(item1773);
					pm.makePersistent(item1774);
					pm.makePersistent(item1775);
					pm.makePersistent(item1776);
					pm.makePersistent(item1777);
					pm.makePersistent(item1778);
					pm.makePersistent(item1779);
					pm.makePersistent(item1780);
					pm.makePersistent(item1781);
					pm.makePersistent(item1782);
					pm.makePersistent(item1783);
					pm.makePersistent(item1784);
					pm.makePersistent(item1785);
					pm.makePersistent(item1786);
					pm.makePersistent(item1787);
					pm.makePersistent(item1788);
					pm.makePersistent(item1789);
					pm.makePersistent(item1790);
					pm.makePersistent(item1791);
					pm.makePersistent(item1792);
					pm.makePersistent(item1793);
					pm.makePersistent(item1794);
					pm.makePersistent(item1795);
					pm.makePersistent(item1796);
					pm.makePersistent(item1797);
					pm.makePersistent(item1798);
					pm.makePersistent(item1799);
					pm.makePersistent(item1800);

				}
			}
		}

	}

}
