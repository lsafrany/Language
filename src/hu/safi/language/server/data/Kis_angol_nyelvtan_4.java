package hu.safi.language.server.data;

import hu.safi.language.server.ServerConstants;
import hu.safi.language.server.jdo.Item;
import hu.safi.language.server.jdo.SubTheme;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class Kis_angol_nyelvtan_4 {

	public Kis_angol_nyelvtan_4(PersistenceManager pm) {
		super();

		Query querySubTheme = pm.newQuery("select from " + SubTheme.class.getName());
		@SuppressWarnings("unchecked")
		List<SubTheme> subThemeList = (List<SubTheme>) pm.newQuery(querySubTheme).execute();
		if (!subThemeList.isEmpty()) {
			for (SubTheme s : subThemeList) {
				if (s.getName().equals(ServerConstants.THEME2_SUBTHEME4)) {
					
					Item item1801 = new Item(s.getKey(), "Át kell kelnie a folyón, nem?", "He must cross the river, mustn’t he?");
					Item item1802 = new Item(s.getKey(), "Várj itt, jó?", "Wait here, will you?");
					Item item1803 = new Item(s.getKey(), "Ne bánts, jó?", "Don’t hurt me, will you?");
					Item item1804 = new Item(s.getKey(), "Reméljük a legjobbakat, jó?", "Let’s hope for the best, shall we?");
					Item item1805 = new Item(s.getKey(), "Hiszel nekem, nem?", "You believe me, don’t you?");
					Item item1806 = new Item(s.getKey(), "Nem értette, ugye?", "He didn’t understand it, did he?");
					Item item1807 = new Item(s.getKey(), "Ülj le, jó?", "Sit down, will you?");
					Item item1808 = new Item(s.getKey(), "Fogd be a szád, jó?", "Shut up, will you?");
					Item item1809 = new Item(s.getKey(), "Bevette, nem?", "He lapped it up, didn’t he?");
					Item item1810 = new Item(s.getKey(), "Nem szereti a könnyfakasztó sztorikat, ugye?",
							"She doesn’t like tearjerkers, does she?");
					Item item1811 = new Item(s.getKey(), "Nem vagy vastag, mi?", "You ain’t loaded, are you?");
					Item item1812 = new Item(s.getKey(), "Oly sok a gonoszság a földön, nem?",
							"There is so much wickedness on earth, isn’t there?");
					Item item1813 = new Item(s.getKey(), "Most már fejezd be, O.K.?", "Finish it, will you?");
					Item item1814 = new Item(s.getKey(), "Ugye megmondtam, hogy ne vidd be a szobába!",
							"I've told you not take it into the room, haven't I?");
					Item item1815 = new Item(s.getKey(), "Jó, mi?", "It's good, isn't it?");
					Item item1816 = new Item(s.getKey(), "Megszerzed nekem, ugye?", "You'll get it for me, won't you?");
					Item item1817 = new Item(s.getKey(), "Ülj le, jó?", "Sit down, will you?");
					Item item1818 = new Item(s.getKey(), "Kezdjük, jó?", "Let's start it, shall we?");
					Item item1819 = new Item(s.getKey(), "Szép a szemem, ugyebár?", "My eyes are beautiful, aren't they?");
					Item item1820 = new Item(s.getKey(), "Nem vagy finnyás, ugye?", "You aren't choosy, are you?");
					Item item1821 = new Item(s.getKey(), "Most utálsz, ugye?", "You hate me now, don't you?");
					Item item1822 = new Item(s.getKey(), "Én vagyok a te mucikád, ugye?", "I am your sweetie pie, aren't I?");
					Item item1823 = new Item(s.getKey(), "Nem én vagyok a következo, ugye?", "I'm not the next one, am I?");
					Item item1824 = new Item(s.getKey(), "Nem tudod megcsinálni, ugye?", "You can't do it, can you?");
					Item item1825 = new Item(s.getKey(), "Nem vettél ki pénzt a fiókomból, ugye?",
							"You didn't take money out of my drawer, did you?");
					Item item1826 = new Item(s.getKey(), "Ugye nem lesz ma órád?", "You won't have a lesson today, will you?");
					Item item1827 = new Item(s.getKey(), "Jellemzo!", "Oh, you would, would you?");
					Item item1828 = new Item(s.getKey(), "Inkább aludnék.", "I would rather sleep.");
					Item item1829 = new Item(s.getKey(), "Inkább aludj.", "I would rather you slept.");
					Item item1830 = new Item(s.getKey(), "Inkább busszal mennék.", "I would rather take a bus.");
					Item item1831 = new Item(s.getKey(), "Menj inkább villamossal.", "I would rather you took a tram.");
					Item item1832 = new Item(s.getKey(), "Inkább meghalna.", "He would rather die.");
					Item item1833 = new Item(s.getKey(), "Inkább ne fontoskodj!", "I would rather you didn’t make a fuss.");
					Item item1834 = new Item(s.getKey(), "Most inkább rádiót hallgatnék.", "I'd rather listen to the radio now.");
					Item item1835 = new Item(s.getKey(), "Menj inkább kocsival.", "I'd rather you went by car.");
					Item item1836 = new Item(s.getKey(), "Inkább inna, mint enne.", "He would rather drink than eat.");
					Item item1837 = new Item(s.getKey(), "Inkább ennék.", "I'd rather eat.");
					Item item1838 = new Item(s.getKey(), "Inkább igyál.", "I'd rather you drank.");
					Item item1839 = new Item(s.getKey(), "Te most inkább ne figyelj ide, jó?",
							"I'd rather you didn't listen now, will you?");
					Item item1840 = new Item(s.getKey(), "Inkább focizna.", "How would rather play football.");
					Item item1841 = new Item(s.getKey(), "Szórakozz inkább a nénikéddel, jó?",
							"I'd rather you fooled with your auntie, will you?");
					Item item1842 = new Item(s.getKey(), "Úgy néz ki, hogy mindjárt esik.", "It looks as if it’s going to rain.");
					Item item1843 = new Item(s.getKey(), "Úgy néz ki, hogy hamarosan abbahagyja a munkát.",
							"It looks as if he’s going to give up his job.");
					Item item1844 = new Item(s.getKey(), "Úgy néz ki, hogy mindjárt rosszul lesz.",
							"It looks as if he’s going to be sick.");
					Item item1845 = new Item(s.getKey(), "Úgy néz ki, hogy o a legszebb lány a partin.",
							"She looks as if she is the most beautiful girl at the party.");
					Item item1846 = new Item(s.getKey(),
							"Úgy tunik, hogy az autó nekiment egy fának (mert most össze van törve - ezért present perfect).",
							"It looks as if the car has hit a tree.");
					Item item1847 = new Item(s.getKey(), "Úgy tunik, hogy a tolvajok az ablakon át jöttek be.",
							"It looks as if the thieves got in through the window.");
					Item item1848 = new Item(s.getKey(), "Olyan volt, mintha a világ a feje tetejére állt volna.",
							"It was as though the world had turned upside down.");
					Item item1849 = new Item(s.getKey(), "Úgy nézel ki, mintha már napok óta nem ettél volna.",
							"You look as if you hadn’t eaten for days.");
					Item item1850 = new Item(s.getKey(), "Úgy beszél, mintha megfenyegették volna.",
							"He speaks as if he had been threatened.");
					Item item1851 = new Item(s.getKey(), "Úgy látszik mindjárt kiderül (az ég)!",
							"It looks as if it's going to clear up.");
					Item item1852 = new Item(s.getKey(), "Úgy látszik mindjárt balra fordul.",
							"He looks as if he's going to turn left.");
					Item item1853 = new Item(s.getKey(), "Úgy látszik az ablakon át jött be.",
							"It looks as if he got in through the window.");
					Item item1854 = new Item(s.getKey(), "Olyan mintha citromba harapott volna.",
							"It looks as if he's swallowed a lemon.");
					Item item1855 = new Item(s.getKey(), "Olyan vagy, mint aki kísértetet látott.",
							"You look as if you've seen a ghost.");
					Item item1856 = new Item(s.getKey(), "Úgy látszik bal lábbal kelt föl.",
							"He looks as if he got out of bed the wrong side.");
					Item item1857 = new Item(s.getKey(), "Úgy látszik kezd bedilizni.", "She looks as if she's cracking up.");
					Item item1858 = new Item(s.getKey(), "Olyan volt, mintha földbe gyökerezett volna a lábam.",
							"It was as though my legs were stuck to the floor.");
					Item item1859 = new Item(s.getKey(), "Úgy fölugrott, mintha a darázs csípte volna. ",
							"He jumped up as though he had been stung by a wasp.");
					Item item1860 = new Item(s.getKey(), "Úgy beszél, mintha o lenne a legjobb horgász.",
							"He talks as if he was the best fisherman.");
					Item item1861 = new Item(s.getKey(), "Úgy fut, mintha az életéért futna.",
							"He runs as if he was running for his life.");
					Item item1862 = new Item(s.getKey(), "Olyan volt, mintha a világ a feje tetejére állt volna.",
							"It was as if the world had turned upside down.");
					Item item1863 = new Item(s.getKey(), "Olyan volt, mintha a mennyben járnék.",
							"I felt as though I was in heaven.");
					Item item1864 = new Item(s.getKey(), "Úgy néz ki, mint aki már napok óta nem evett.",
							"He looks as if he hasn't eaten for days.");
					Item item1865 = new Item(s.getKey(), "Olyan volt, mintha egy fekete függönyt húztak volna közénk.",
							"It was as though a black curtain had been drawn between them and me.");
					Item item1866 = new Item(s.getKey(), "Mit gondolsz, mikor beszélhetek veled?",
							"When do you think I can talk to you?");
					Item item1867 = new Item(s.getKey(), "Mit gondolsz, mi ez?", "What do you think this is?");
					Item item1868 = new Item(s.getKey(), "Mit gondolsz, hogy van az anyósom?",
							"How do you think my mother-in-law is?");
					Item item1869 = new Item(s.getKey(), "Mit mondtál, hova dugta a whiskymet?",
							"Where did you say she hid my whisky?");
					Item item1870 = new Item(s.getKey(), "Mit mondtál, kivel találkoztál?", "Who did you say you had met?");
					Item item1871 = new Item(s.getKey(), "Mit mondtál, mit mondtál?", "What did you say you said?");
					Item item1872 = new Item(s.getKey(), "Azt gondolod, hogy én Róbert bácsi vagyok?",
							"Do you think I am Róbert bácsi?");
					Item item1873 = new Item(s.getKey(), "Mit gondolsz, mi mozog a zöldleveles bokorban?",
							"What do you think is moving in the bush with green leaves?");
					Item item1874 = new Item(s.getKey(), "Szerinted róka?", "Do you think it's a fox?");
					Item item1875 = new Item(s.getKey(), "Mit mondtál, melyik nap érkezik?",
							"Which day did you say he was going to arrive?");
					Item item1876 = new Item(s.getKey(), "Mit gondolsz, hol született?", "Where do you think he was born?");
					Item item1877 = new Item(s.getKey(), "Szerinted hány kacsájuk van?", "How many ducks do you think they have?");
					Item item1878 = new Item(s.getKey(), "Mit gondolsz, van benne kolbász?",
							"Do you think there is any sausage in it?");
					Item item1879 = new Item(s.getKey(), "Mit gondolsz, ki vagy?", "Who do you think you are?");
					Item item1880 = new Item(s.getKey(), "Szerinted mikor no már be a feje lágya?",
							"When do you think he'll grow up?");
					Item item1881 = new Item(s.getKey(), "Mit gondolsz, hány óra?", "What time do you think it is?");
					Item item1882 = new Item(s.getKey(), "Mit mondtál, mit mondott, mit gondol, mi van rajta?",
							"What did you say she said she thought she was wearing?");
					Item item1883 = new Item(s.getKey(), "Nem hiszem, hogy szereti a noket.", "I don’t think he loves women.");
					Item item1884 = new Item(s.getKey(), "Azt hittem, nem voltál ott.", "I didn’t think you were there.");
					Item item1885 = new Item(s.getKey(), "Azt hiszem nem tetszik nekem ez a hely.",
							"I don’t think I like this place.");
					Item item1886 = new Item(s.getKey(), "Azt hiszem nekem meg te nem tetszel.", "I don’t think I like you.");
					Item item1887 = new Item(s.getKey(), "Azt hiszem ezt nem hallottam.", "I don’t think I’ve heard that.");
					Item item1888 = new Item(s.getKey(), "Azt hiszem nem is mondtam.", "I don’t think I’ve said it.");
					Item item1889 = new Item(s.getKey(), "Nem gondolkodom, tehát vagyok.", "I don’t think, therefore I am.");
					Item item1890 = new Item(s.getKey(), "Nem hiszem, hogy disznóhús.", "I don't think it's pork.");
					Item item1891 = new Item(s.getKey(), "Azt hiszem nincs nálam pénz.", "I don't think I have any money on me.");
					Item item1892 = new Item(s.getKey(), "Én nem hiszem, hogy normális vagyok.",
							"I don't think I'm in my right mind.");
					Item item1893 = new Item(s.getKey(), "Azt hiszem nem jött össze nekik.", "I don't think they hit it off.");
					Item item1894 = new Item(s.getKey(), "Azt hiszem nem szeret.", "I don't think she loves me.");
					Item item1895 = new Item(s.getKey(), "Azt hiszem nincs otthon senki.", "I don't think there's anybody at home.");
					Item item1896 = new Item(s.getKey(), "Szerintem nem elég hosszú.", "I don't think it's long enough.");
					Item item1897 = new Item(s.getKey(), "Azt hiszem nincs cipopasztám.", "I don't think I have any shoe paste.");
					Item item1898 = new Item(s.getKey(), "Azt hiszem nincs több mondat.",
							"I don't think there are any more sentences.");
					Item item1899 = new Item(s.getKey(), "Szerintem te nem figyelsz rám.", "I don't think you're listening to me.");
					Item item1900 = new Item(s.getKey(), "Leüljünk?", "Shall we take a seat?");
					Item item1901 = new Item(s.getKey(), "Mozijegyet egyet vegyek,", "Shall I buy a ticket to the movie?");
					Item item1902 = new Item(s.getKey(), "Együtt énekeljünk?", "Shall we sing together?");
					Item item1903 = new Item(s.getKey(), "Felhívjam az anyósod?", "Shall I telephone your mother-in-law?");
					Item item1904 = new Item(s.getKey(), "Várjunk rá?", "Shall we wait for him to come?");
					Item item1905 = new Item(s.getKey(), "Mozijegyet egyet vegyek?", "Shall I book one movie ticket?");
					Item item1906 = new Item(s.getKey(), "Szóljak neki?", "Shall I call him?");
					Item item1907 = new Item(s.getKey(), "Játsszunk egy parti ultit?", "Shall we play a game of ulti?");
					Item item1908 = new Item(s.getKey(), "Melyik utcánál forduljak balra?",
							"Which turning shall I take to the left?");
					Item item1909 = new Item(s.getKey(), "Mit vegyek fel?", "What shall I put on?");
					Item item1910 = new Item(s.getKey(), "Hová üljünk?", "Where shall we sit?");
					Item item1911 = new Item(s.getKey(), "Elmenjünk ma este valahova?", "Shall we go out tonight?");
					Item item1912 = new Item(s.getKey(), "Megmossam a hátad?", "Shall I wash your back?");
					Item item1913 = new Item(s.getKey(), "Leoltsam a lámpát?", "Shall I turn off the light?");
					Item item1914 = new Item(s.getKey(), "Mikor hagyjuk már abba?", "When shall we stop it?");
					Item item1915 = new Item(s.getKey(), "Azt akarják, hogy táncoljak.", "They want me to dance.");
					Item item1916 = new Item(s.getKey(), "Azt akarod, hogy o menjen vásárolni?", "Do you want him to go shopping?");
					Item item1917 = new Item(s.getKey(), "Szeretnéd, ha megmutatnám?", "Would you like me to show you?");
					Item item1918 = new Item(s.getKey(), "Azt akarom, hogy menj közelebb, és csólold meg.",
							"I want you to go closer and kiss him.");
					Item item1919 = new Item(s.getKey(), "Csak azt akarom, hogy boldog légy.", "I just want you to be happy.");
					Item item1920 = new Item(s.getKey(), "Nem akarlak megijeszteni.", "I don't want to frighten you.");
					Item item1921 = new Item(s.getKey(), "Nem akarom, hogy megijedj.", "I don't want you to get frightened.");
					Item item1922 = new Item(s.getKey(), "Szeretném, ha szeretnél.", "I'd like you to love me.");
					Item item1923 = new Item(s.getKey(), "Szeretnék szántani, hat ökröt hajtani.",
							"I'd like to plough and drive six oxen.");
					Item item1924 = new Item(s.getKey(), "Szeretném, ha Józsi szántana.", "I'd like Joe to plough.");
					Item item1925 = new Item(s.getKey(), "Szeretném bejárni a földet.", "I'd like to travel around the world.");
					Item item1926 = new Item(s.getKey(), "Napot akarok látni.", "I want to see the sun.");
					Item item1927 = new Item(s.getKey(), "Azt akarom, hogy csinos légy.", "I want you to be pretty.");
					Item item1928 = new Item(s.getKey(), "Azt akarom, hogy légy légy.", "I want you to be a fly.");
					Item item1929 = new Item(s.getKey(), "Fogni akarom a kezedet.", "I want to hold your hand.");
					Item item1930 = new Item(s.getKey(), "Szabad akarok lenni.", "I want to break free.");
					Item item1931 = new Item(s.getKey(), "Azt szeretném, ha szabad lennél.", "I'd like you to be free.");
					Item item1932 = new Item(s.getKey(), "Itt az ideje, hogy új életet kezdjünk.", "It’s time we began a new life.");
					Item item1933 = new Item(s.getKey(), "Legfobb ideje, hogy föladd a levelet.",
							"It’s high time you posted the letter.");
					Item item1934 = new Item(s.getKey(), "Itt az ideje, hogy elvedd Judyt.", "It’s time you married Judy.");
					Item item1935 = new Item(s.getKey(), "Legfobb ideje, hogy leüljünk ebédelni.",
							"It’s high time we sat down to lunch.");
					Item item1936 = new Item(s.getKey(), "Ideje, hogy lefeküdj.", "It's time you went to bed.");
					Item item1937 = new Item(s.getKey(), "Legfobb ideje, hogy elzárd.", "It's high time you turned it off.");
					Item item1938 = new Item(s.getKey(), "Ideje, hogy legyen rám egy kis ideje.",
							"It's time you had some time for me.");
					Item item1939 = new Item(s.getKey(), "Legfobb ideje, hogy fölöltözz.", "It's high time you put on your dress.");
					Item item1940 = new Item(s.getKey(), "Ideje hogy újra kihívják a vak zongorahangolót.",
							"It's time the blind piano turner called again.");
					Item item1941 = new Item(s.getKey(), "Ideje már, hogy levágasd a hajad!",
							"It's about time you had your hair cut!");
					Item item1942 = new Item(s.getKey(), "Ideje, hogy beköltözzünk.", "It's time we moved in.");
					Item item1943 = new Item(s.getKey(), "Kedvem van táncolni.", "I feel like dancing.");
					Item item1944 = new Item(s.getKey(), "Van kedved leülni a hideg padlóra?",
							"Do you feel like sitting on the cold floor?");
					Item item1945 = new Item(s.getKey(), "Nagy kedve van a pályaudvaron tölteni egy éjszakát.",
							"He feels like spending a night at a station.");
					Item item1946 = new Item(s.getKey(), "Tényleg van kedved csavarogni egyet Manhattanben?",
							"Do you really feel like hanging about in Manhattan?");
					Item item1947 = new Item(s.getKey(), "Van kedved táncolni?", "Do you feel like dancing?");
					Item item1948 = new Item(s.getKey(), "Mulatni volna kedvem.", "I feel like having fun.");
					Item item1949 = new Item(s.getKey(), "Kedvem volna lovagolni.", "I feel like riding.");
					Item item1950 = new Item(s.getKey(), "Mindig azt tette, amihez kedve volt.",
							"He always did what he felt like doing.");
					Item item1951 = new Item(s.getKey(), "Nincs kedvem vasalni.", "I don't feel like ironing.");
					Item item1952 = new Item(s.getKey(), "Van kedved egy csésze kávéhoz?", "Do you feel like a cup of tea?");
					Item item1953 = new Item(s.getKey(), "A macska szereti a papagájt és a patkányt is.",
							"Cats like parrots and rats, too.");
					Item item1954 = new Item(s.getKey(), "A macska szereti a papagájt és a patkány is.",
							"Cats like parrots and so do rats.");
					Item item1955 = new Item(s.getKey(), "Táncolni voltam tegnap este és a feleségem is.",
							"I was out to dance last night and so was my wife.");
					Item item1956 = new Item(s.getKey(), "Szereti a telet és a nyarat is.", "He likes winter and summer, too.");
					Item item1957 = new Item(s.getKey(), "Hazahajtottunk és Józsi is ezt tette.", "We drove home, and so did Joe.");
					Item item1958 = new Item(s.getKey(), "A macska nem szereti a papagájt és a patkányt sem.",
							"Cats don’t like parrots and rats, either.");
					Item item1959 = new Item(s.getKey(), "A macska nem szereti a papagájt és a patkány sem szereti a papagájt.",
							"Cats don’t like parrots and neither/nor do rats.");
					Item item1960 = new Item(s.getKey(), "Nem vette le a csizmáját és a ruháját sem.",
							"She didn’t take off her boots and her dress, either.");
					Item item1961 = new Item(s.getKey(), "Nem veheted el azt a not és a barátod sem.",
							"You can’t marry that woman and neither can your friend.");
					Item item1962 = new Item(s.getKey(), "A honvéd nem tisztelgett az ormesternek és a tábornoknak sem.",
							"The private didn’t salute to the sergeant and the general, either.");
					Item item1963 = new Item(s.getKey(), "Én nem rúgtam ki magát és a fonököm sem.",
							"I didn’t fire you and neither did my boss.");
					Item item1964 = new Item(s.getKey(), "Nem látszott fáradtnak és boldogtalannak sem.",
							"He didn’t look worn out and unhappy either.");
					Item item1965 = new Item(s.getKey(), "Ua. mint az elozo, de így is lehet képezni.",
							"He didn’t look worn out or unhappy.");
					Item item1966 = new Item(s.getKey(), "A cimborám nem reggelizett ágyban és a barátnoje sem.",
							"My buddy didn’t have breakfast in bed and neither did his baby.");
					Item item1967 = new Item(s.getKey(), "Tuzoltó leszel, vagy katona.",
							"You will either be a fireman or a soldier.");
					Item item1968 = new Item(s.getKey(), "Nem hiszek se magának, se a feleségének.",
							"I don’t believe either you or your wife.");
					Item item1969 = new Item(s.getKey(), "Nem hiszek se magának, se a feleségének.",
							"I believe neither you nor your wife.");
					Item item1970 = new Item(s.getKey(), "Elveheted ezt is, vagy azt is.", "You can take either this or that.");
					Item item1971 = new Item(s.getKey(), "Sem o, sem az albérloje nem panaszkodott a körülményekre.",
							"Neither he nor his lodger complained of the circumstances.");
					Item item1972 = new Item(s.getKey(), "Nem volt hozzászokva sem a hideghez, sem a ködhöz.",
							"He was accustomed to neither cold nor fog.");
					Item item1973 = new Item(s.getKey(), "Nem szeretlek és a kutya sem.",
							"I don't like you and neither does the dog.");
					Item item1974 = new Item(s.getKey(), "Icereg a macska, és a hörcsög is.",
							"The cat is fidgeting and so is the hamster.");
					Item item1975 = new Item(s.getKey(), "Párizsit eszik és sajtot is.", "He is eating párizsi and cheese, too.");
					Item item1976 = new Item(s.getKey(), "Hideg van, meg sötét is.", "It's cold and dark, too.");
					Item item1977 = new Item(s.getKey(), "Nem tetszik ez, és nem tetszik az se.",
							"I don't like this, and I don1t like that, either.");
					Item item1978 = new Item(s.getKey(), "Nincsen apám, se anyám.", "I've got neither father, nor mother.");
					Item item1979 = new Item(s.getKey(), "Énekelek és táncolok is.", "I sing and dance, too.");
					Item item1980 = new Item(s.getKey(), "Csöpög a csap és a WC is.", "The tap is dripping and so is the lavatory.");
					Item item1981 = new Item(s.getKey(), "Nincs rajtam pizsama éa papucs se.",
							"I'm not wearing pyjamas and slippers, either.");
					Item item1982 = new Item(s.getKey(), "A nyuszin van sapka és a farkason is. ",
							"The rabbit is wearing a cap and so is the wolf.");
					Item item1983 = new Item(s.getKey(), "Remélem elkapják. Én is.", "I hope they'll catch him. So do I.");
					Item item1984 = new Item(s.getKey(), "Hófehérkének nincs fehér ruhája, és a törpéknek sincs.",
							"Snow White has no whites and neither do the dwarfs.");
					Item item1985 = new Item(s.getKey(), "A törpéknek van ágya és Hófehérkének is.",
							"The dwarfs have beds and so does Snow White.");
					Item item1986 = new Item(s.getKey(), "A szatyorban volt szalonna és kolbász is, és a hátizsákban is.",
							"The bag contained bacon and sausages, too, and so did the rucksack.");
					Item item1987 = new Item(s.getKey(), "Nem találta a helyét és a fejét sem.",
							"She didn't find her place and her head, either.");
					Item item1988 = new Item(s.getKey(), "Táncolt a menyasszony és a volegény is.",
							"The bridge was dancing and so was the groom.");
					Item item1989 = new Item(s.getKey(), "Csiga-biga palota, ablaka sincs, ajtaja sincs.",
							"Snaily snail castle; it's got neither window, nor door.");
					Item item1990 = new Item(s.getKey(), "Nem ehetsz, míg meg nem mostad a kezed.",
							"You may not eat until you have washed your hands.");
					Item item1991 = new Item(s.getKey(), "Nem ment be, míg engedélyt nem kapott.",
							"He didn’t go in until he had been given permission.");
					Item item1992 = new Item(s.getKey(), "Egy szót sem szólok hozzád, amíg nem adod vissza a pénzem.",
							"I won’t speak to you until you have given me the money you borrowed.");
					Item item1993 = new Item(s.getKey(), "Nem értette, míg el nem magyaráztam neki.",
							"He didn’t understand it until I had explained it to him.");
					Item item1994 = new Item(s.getKey(), "Semmit nem tudtam róla, míg föl nem hívott.",
							"I didn't know anything about it until he had called.");
					Item item1995 = new Item(s.getKey(), "Nem mehetsz be a szobába, amíg le nem vetted a cipodet.",
							"You may not go into the room until you have taken off your shoes.");
					Item item1996 = new Item(s.getKey(), "Nem indulunk, amíg Bob meg nem jön.",
							"We won't start until bob has come.");
					Item item1997 = new Item(s.getKey(), "Ha lesz pénzem, megadom.", "When I have money, I’ll give it back.");
					Item item1998 = new Item(s.getKey(), "Ha nagy leszek, meghálálom. ",
							"When I grow up, I’ll return your kindness.");
					Item item1999 = new Item(s.getKey(), "Mihelyst beérünk az alagútba, megpróbál majd megölni.",
							"As soon as we get into the tunnel, he will try to kill you.");
					Item item2000 = new Item(s.getKey(), "Le kell ülnünk még mielott a lámpák kialszanak.",
							"We will have to take our seats before the lights go out.");
					Item item2001 = new Item(s.getKey(), "Pihennünk kell majd miután kocogunk.",
							"We shall need a rest after we’ve been jogging.");
					Item item2002 = new Item(s.getKey(), "Nem szabad lonöd, míg meg nem közelítetted a nyuszit.",
							"You mustn’t shoot until you’ve approached the hare.");
					Item item2003 = new Item(s.getKey(), "Amikor majd tél lesz elmegyünk szánkózni.",
							"When writer time comes, we'll go sledding.");
					Item item2004 = new Item(s.getKey(), "Amikor visszajövök, új életet kezdek.",
							"When I come back, I'm going to start my life all over again.");
					Item item2005 = new Item(s.getKey(), "Visszaadom mihelyt megtalálom.",
							"I'll give it back as soon as I find it.");
					Item item2006 = new Item(s.getKey(), "Majd bemegyek, ha nem lesz benn az oroszlán.",
							"I'll go in when there's no lion inside.");
					Item item2007 = new Item(s.getKey(), "Alig dolgoztál ma.", "You have hardly worked today.");
					Item item2008 = new Item(s.getKey(), "Keményen dolgoztál ma.", "You have worked hard today.");
					Item item2009 = new Item(s.getKey(), "Alig valószínu, hogy megváltozol.",
							"You are hardly likely to change now.");
					Item item2010 = new Item(s.getKey(), "Ne játsszatok olyan keményen.", "Don’t play so hard.");
					Item item2011 = new Item(s.getKey(), "Hozzászoktam, hogy éjszaka dolgozzam.",
							"I’ve got used to working at night.");
					Item item2012 = new Item(s.getKey(), "Hozzá van szokva, hogy helikopteren utazzék.",
							"She is used to travelling by helicopter.");
					Item item2013 = new Item(s.getKey(), "Valaha hozzá volt szokva, hogy használt kocsit használjon.",
							"He used to be used to using used cars.");
					Item item2014 = new Item(s.getKey(), "Emlékszem, hogyan öleltél át.", "I remember how you used to hold me.");
					Item item2015 = new Item(s.getKey(), "Régen minden más volt.", "Things used to be different.");
					Item item2016 = new Item(s.getKey(), "A lányok régebben rövidebb szoknyát hordtak.",
							"Girls used to wear shorter skirts.");
					Item item2017 = new Item(s.getKey(), "Régen mosollyal az arcomon gitároztam.",
							"I used to play my guitar with a smile on my face.");
					Item item2018 = new Item(s.getKey(), "Itt valaha vár állott.", "There used to be a castle here.");
					Item item2019 = new Item(s.getKey(), "A dolgozók régen még kaptak jutalmat november 7-én.",
							"The workers used to get extra money on November 7th.");
					Item item2020 = new Item(s.getKey(), "Nem az vagy, aki valaha voltál.", "You're not the man you used to be.");
					Item item2021 = new Item(s.getKey(), "Amikor még ifjú házasok voltunk, minden nap felhívtál.",
							"When we were just married you used to telephone me every day.");
					Item item2022 = new Item(s.getKey(), "Régen azért soványabb voltál.", "You used to be thinner.");
					Item item2023 = new Item(s.getKey(), "Régen gazember volt, de most barátságos alak.",
							"He used to be a jerk, but now he is a friendly guy.");
					Item item2024 = new Item(s.getKey(), "Történtesen (véletlenül) nem találkoztál vele?",
							"Did you happen to meet her?");
					Item item2025 = new Item(s.getKey(), "Történetesen ot bámultam, amikor a férje fejbevágott.",
							"I happened to be looking at her when her husband hit me on the head.");
					Item item2026 = new Item(s.getKey(), "Úgy alakult, hogy örökölt néhány milliót.",
							"He happened to inherit some million dollars.");
					Item item2027 = new Item(s.getKey(), "Joe-éknál futballoztam.", "I played football at Joe’s.");
					Item item2028 = new Item(s.getKey(), "El tudsz jönni holnap?", "Can you come to my place tomorrow?");
					Item item2029 = new Item(s.getKey(), "Tényleg el akarsz menni hozzá?", "Do you really want to go to his place?");
					Item item2030 = new Item(s.getKey(), "Nálunk az élet könnyu és boldog.", "Life is easy and happy with us.");
					Item item2031 = new Item(s.getKey(), "Átmentek az utcán.", "They went across the street.");
					Item item2032 = new Item(s.getKey(), "Át tudsz jönni az erdon?", "Can you come through the forest?");
					Item item2033 = new Item(s.getKey(), "Sikerült átmennie a jégen.", "He managed to walk across the ice.");
					Item item2034 = new Item(s.getKey(), "Fuss be az ajtón át!", "Run in through the door.");
					Item item2035 = new Item(s.getKey(), "Reggeliztél már?", "Have you had breakfast yet?");
					Item item2036 = new Item(s.getKey(), "Mindig 12-kor ebédelsz?", "Do you always have lunch at 12?");
					Item item2037 = new Item(s.getKey(), "-Semmi mást nem vacsorázott, csak levest.",
							"He had nothing but soup for dinner.");
					Item item2038 = new Item(s.getKey(), "Fél évig nem vacsorázott.", "She didn’t have dinner for half a year.");
					Item item2039 = new Item(s.getKey(), "Tájékoztatnom kell Önöket.", "I am to inform you.");
					Item item2040 = new Item(s.getKey(), "Gratulálnod kéne neki.", "You are to congratulate him.");
					Item item2041 = new Item(s.getKey(), "Úgy van, hogy májusban esküszünk.", "We are to be married in May.");
					Item item2042 = new Item(s.getKey(), "Úgy volt, hogy hétfon hazajönnek.", "They were to come home on Monday.");
					Item item2043 = new Item(s.getKey(), "Soha többé nem láthatta a feleségét.",
							"He was never to see his wife again.");
					Item item2044 = new Item(s.getKey(), "Az öregember soha többé nem állhatott lábra.",
							"The old man was never to walk again.");
					Item item2045 = new Item(s.getKey(), "Hánykor legyek ott?", "At what time am I to be there?");
					Item item2046 = new Item(s.getKey(), "Egy kis szigeten éljünk, csak te meg én?",
							"Are we to live in a small island?");
					Item item2047 = new Item(s.getKey(), "A könyvet nem lehetett megtalálni.", "The book was not to be found.");
					Item item2048 = new Item(s.getKey(), "A fiút nem engedték be a kocsmába.", "The boy was not to enter the pub.");
					Item item2049 = new Item(s.getKey(),
							"Év végére kellet volna felépíteni az új utat (de már most biztos, hogy nem lesz kész.",
							"Work on the new road was to have been completed by the end of the year.");
					Item item2050 = new Item(s.getKey(),
							"Hatkor kellet volna leszállnia a gépnek, de még mindig München-ben van (most 5 óra van).",
							"His plane was to have landed at six, but it is still in Munich.");
					Item item2051 = new Item(s.getKey(), "Hová is mehettem volna?", "Where was I to go?");
					Item item2052 = new Item(s.getKey(), "Most mit tegyek?", "What am I to do now?");
					Item item2053 = new Item(s.getKey(), "Úgy volt, hogy pénteken jönnek haza.",
							"They were to come home on Friday.");
					Item item2054 = new Item(s.getKey(), "Úgy van, hogy júniusban esküszünk.", "We are to be married in June.");
					Item item2055 = new Item(s.getKey(), "Másnap kellett volna elmennünk, de megbetegedtem.",
							"We were to have gone away the next day, but I was ill.");
					Item item2056 = new Item(s.getKey(), "Az elitélteknek 10-kor ágyban kell lenniük.",
							"All prisoners are to be in bed by 10 o'clock.");
					Item item2057 = new Item(s.getKey(), "Itt nem dohányozhatsz.", "You are not to smoke here.");
					Item item2058 = new Item(s.getKey(), "Az asztal fából készült.", "The table is made of wood.");
					Item item2059 = new Item(s.getKey(), "A Trabantom papírból készült.", "My Trabant is made of paper.");
					Item item2060 = new Item(s.getKey(), "A sör komlóból és árpából készül.", "Beer is made from barley and hops.");
					Item item2061 = new Item(s.getKey(), "A bor szolobol készül.", "Wine is made from grapes.");
					Item item2062 = new Item(s.getKey(), "Tízemeletes házban élek.", "I live in a ten-storey house.");
					Item item2063 = new Item(s.getKey(),
							"Néhányan azt gondolják, hogy egy kétszobás lakás elég egy héttagú családnak.",
							"Some think that a two-room flat is enough for a seven membered family.");
					Item item2064 = new Item(s.getKey(), "Láttam, amint 16 éves fiúk ragasztót szagolnak.",
							"I saw sixteen-year-old boys sniffing glue.");
					Item item2065 = new Item(s.getKey(), "Elso szerelme egy 16 éves, félszemu, háromfülu lány volt.",
							"His first love was a 16-year-old, one-eyed, three-eared girl.");
					Item item2066 = new Item(s.getKey(), "A baleset oka gyorshajtás volt.",
							"The reason for the accident was speeding.");
					Item item2067 = new Item(s.getKey(), "A tömegkarambol oka a rossz ido volt.",
							"The cause of the pile up was bad weather.");
					Item item2068 = new Item(s.getKey(), "A távozásának az oka nem magyarázható.",
							"The reason for his leaving can’t be explained.");
					Item item2069 = new Item(s.getKey(), "Azért vagyok itt, mert éhezem.",
							"The reason why I am here is that I’m starving.");
					Item item2070 = new Item(s.getKey(), "E könyv megírásának a magyarázata igen egyszeru.",
							"The cause of writing this book is simple.");
					Item item2071 = new Item(s.getKey(), "Sikerült átmennie a vizsgán.", "She managed to pass the exam.");
					Item item2072 = new Item(s.getKey(), "Sikerült megszereznie az adatokat.", "He succeeded in getting the data.");
					Item item2073 = new Item(s.getKey(), "Sikerült megjavítanom a kocsit.", "I was able to repair the car.");
					Item item2074 = new Item(s.getKey(), "Nem sikerült levágni a füvet azzal a régi funyíróval.",
							"He failed to cut the grass with that old lawn-mower.");
					Item item2075 = new Item(s.getKey(), "Végre sikerült kijutnom a megszokott kerékvágásból.",
							"At last I managed to get out of this rut.");
					Item item2076 = new Item(s.getKey(), "Sikerült kiszállni a buliból?", "Did you succeed in backing out?");
					Item item2077 = new Item(s.getKey(), "Már megint nem sikerült kijönnie a fizetésébol.",
							"She failed to make ends meet again.");
					Item item2078 = new Item(s.getKey(), "a szegények", "the poor");
					Item item2079 = new Item(s.getKey(), "a gazdagok", "the rich");
					Item item2080 = new Item(s.getKey(), "a vakok", "the blind");
					Item item2081 = new Item(s.getKey(), "a mozgássérültek", "the disabled");
					Item item2082 = new Item(s.getKey(), "A gazdagoknak sikerült megmenteniük a vagyonukat.",
							"The rich managed to save their wealth.");
					Item item2083 = new Item(s.getKey(), "A szegények soha nem tudnak lépést tartani a gazdagokkal.",
							"The poor can never keep up with the rich.");
					Item item2084 = new Item(s.getKey(), "Speciális TV musor van a süketnémák számára.",
							"There is a special program on TV for the deaf and the dumb.");
					Item item2085 = new Item(s.getKey(), "A magányosok gyakran felidézik gyerekkor emlékeiket.",
							"The lonely often call up their childhood memories.");
					Item item2086 = new Item(s.getKey(), "Egyre több és több munkahely létesült mozgássérültek számára.",
							"There are more and more places of work for the disabled.");
					Item item2087 = new Item(s.getKey(), "Micsoda no!", "What a woman!");
					Item item2088 = new Item(s.getKey(), "Milyen gyönyöru no!", "What a beautiful woman!");
					Item item2089 = new Item(s.getKey(), "Olyan öröm dolgozni vele.", "To work with him is such a pleasure.");
					Item item2090 = new Item(s.getKey(), "Ez olyan nehéz kérdés.", "This is such a difficult question.");
					Item item2091 = new Item(s.getKey(), "Milyen okos vagy!", "How clever you are!");
					Item item2092 = new Item(s.getKey(), "Olyan gyönyöru vagy!", "You are so beautiful!");
					Item item2093 = new Item(s.getKey(), "Micsoda képtelenség!", "What nonsense!");
					Item item2094 = new Item(s.getKey(), "Milyen hülye egy pali az az ormester!",
							"What a stupid guy that sergeant is.");
					Item item2095 = new Item(s.getKey(), "Nyáron oly gyönöru voltál!", "In summer you were so beautiful!");
					Item item2096 = new Item(s.getKey(), "Micsoda élet!", "What a life to live!");
					Item item2097 = new Item(s.getKey(), "Milyen fáradtnak látszol!", "How worn you look.");
					Item item2098 = new Item(s.getKey(), "Micsoda ido!", "What weather!");
					Item item2099 = new Item(s.getKey(), "Minél több a pénzed, annál boldogabban élsz.",
							"The more money you have the happier you live.");
					Item item2100 = new Item(s.getKey(), "Minél hamarább jössz, annál több sütit kapsz.",
							"The sooner you arrive the more cakes you’ll get.");
					Item item2101 = new Item(s.getKey(), "Minél kopaszabb vagyok, annál vonzóbb vagyok.",
							"The balder the more attractive I am.");
					Item item2102 = new Item(s.getKey(), "Minél hosszabb, annál jobb.", "The longer the better.");
					Item item2103 = new Item(s.getKey(), "Minél nagyobb Pistike feje, annál több víz megyen bele.",
							"The bigger Pistike's head, the more water goes in.");
					Item item2104 = new Item(s.getKey(), "Minél sötétebb van, annál kevésbé látlak.",
							"The darker, the less I can see you.");
					Item item2105 = new Item(s.getKey(), "Minél kevésbé látlak, annál jobban tetszel.",
							"The less I can see you, the more I like you.");
					Item item2106 = new Item(s.getKey(), "Minél többet beszél, annál kevesebbet mond.",
							"The more he talks, the less he says.");
					Item item2107 = new Item(s.getKey(), "Minél vékonyabb a nyaka, annál vékonyabb a dereka.",
							"The thinner her neck, the thinner her waist.");
					Item item2108 = new Item(s.getKey(), "Minél zöldebb, annál büdösebb.", "The greener, the more stinking.");
					Item item2109 = new Item(s.getKey(), "Az, aki szereti az állatokat, nem lehet olyan rossz ember.",
							"The one who likes animals can’t be that bad.");
					Item item2110 = new Item(s.getKey(), "Az, akit a sárga irigység emészt, a sógorom.",
							"The person who is green with envy is my brother-inlaw.");
					Item item2111 = new Item(s.getKey(), "Aki nem lép egyszerre, nem kap rétest estére. (körülbelül)",
							"He who doesn’t step in line won’t get strudel for supper.");
					Item item2112 = new Item(s.getKey(), "Aki hallja, adja át.", "The one who can hear it should transmit it.");
					Item item2113 = new Item(s.getKey(), "Te voltál az, akiben mindenek fölött megbíztam.",
							"You were the one I trusted above all.");
					Item item2114 = new Item(s.getKey(), "Egyre csak mondogatta/hajtogatta…", "She kept saying…");
					Item item2115 = new Item(s.getKey(), "Állandóan nyaggat a gyerek, hogy vigyem ki a Vidám Parkba.",
							"The child keeps pestering me to take him to the fun fair.");
					Item item2116 = new Item(s.getKey(), "A válla fölött nézegetett hátra.", "He kept glancing over his shoulder.");
					Item item2117 = new Item(s.getKey(), "Bocs, hogy megvárakoztattalak.", "I’m sorry to keep you waiting.");
					Item item2118 = new Item(s.getKey(), "Miért nyaggatsz már?", "Why do you keep bugging me?");
					Item item2119 = new Item(s.getKey(), "Menj addig, míg a lámpához nem érsz.",
							"Keep going till you reach the traffic light.");
					Item item2120 = new Item(s.getKey(), "Rávették, hogy menjen el.", "He was made to leave.");
					Item item2121 = new Item(s.getKey(), "Mi tesz boldoggá?", "What makes you happy?");
					Item item2122 = new Item(s.getKey(), "Miért szaladt el?", "What made him run away?");
					Item item2123 = new Item(s.getKey(), "A nagy pénztol a levegobe ugrálok.",
							"Big-big-big money makes me jump for joy.");
					Item item2124 = new Item(s.getKey(), "Az alkohol elveszi az ember eszét.", "Alcohol makes people lose control.");
					Item item2125 = new Item(s.getKey(), "Ha vért látok, rosszul leszek.", "The sight of blood makes me sick.");
					Item item2126 = new Item(s.getKey(), "Ha meghallom a saját hangom a rádióban, szívem büszkeséggel telik meg.",
							"The sound of my own voice on the radio makes my heart swell with pride.");
					Item item2127 = new Item(s.getKey(), "Mit teszel, ha meglátsz egy csótányt?",
							"What does the sight of a cockroach make you do?");
					Item item2128 = new Item(s.getKey(), "Izzadni kezdek, ha meglátok egy miniszoknyás lányt.",
							"The sight of a girl in mini skirt makes me sweat.");
					Item item2129 = new Item(s.getKey(), "A harangok hangja gyermekkoromra emlékeztet.",
							"The sound of the bells makes me remember my childhood.");
					Item item2130 = new Item(s.getKey(), "Mit teszel, ha meghallod a zongora hangját?",
							"What does the sound of a piano make you do?");
					Item item2131 = new Item(s.getKey(), "Azt hiszem, el kéne menned a fogorvoshoz.",
							"I think you ought to go to the dentist.");
					Item item2132 = new Item(s.getKey(), "Erosen köhögsz, úgy vélem abba kéne hagynod a dohányzást.",
							"You are getting a smoker's cough, I think you should give up smoking. ");
					Item item2133 = new Item(s.getKey(), "Azt javaslom, hogy vegyél hallókészüléket, ha nagyot hallasz.",
							"I suggest that you buy a hearing aid if you are hard of hearing.");
					Item item2134 = new Item(s.getKey(), "Jobban tennéd, ha kiküldenéd a gyerekeket.",
							"You'd better send the children out.");
					Item item2135 = new Item(s.getKey(), "Azt tanácsolom, hogy pihend ki magad, ha idegösszeroppanásod van.",
							"I advise you to have a complete rest if you have a nervous breakdown.");
					Item item2136 = new Item(s.getKey(), "Miért nem kérded meg tole, hogy mi izgatja?",
							"Why don't you ask him what's upsetting him?");
					Item item2137 = new Item(s.getKey(), "Miért nem nézed meg a szótárban?",
							"Why not look it up in the dictionary?");
					Item item2138 = new Item(s.getKey(), "Mi lenne, ha lekopnál?", "How about beating it?");
					Item item2139 = new Item(s.getKey(), "Ha rám hallgatsz békén hagyod.",
							"If you take my advice, you'll leave him alone.");
					Item item2140 = new Item(s.getKey(), "Ha neked lennék, keresnék magamnak egy barátnot.",
							"If I were you, I'd find a girlfriend.");
					Item item2141 = new Item(s.getKey(), "Nem kell mindjárt durváskodni.", "There's no need to be rude.");
					Item item2142 = new Item(s.getKey(), "Azt javaslom, hogy CASCO-t is kössön.",
							"I recommend you to make a comprehensive policy on your car.");
					Item item2143 = new Item(s.getKey(), "Jobb lenne, ha a pénzét bankban tartaná.",
							"It would be better if you kept your money in a bank.");
					Item item2144 = new Item(s.getKey(), "Tanácsos lenne, ha abbahagyná az ivást.",
							"It would be advisable for you to give up drinking.");
					Item item2145 = new Item(s.getKey(), "Jó lenne, ha fölállnánk és elmennénk.",
							"It would be a good thing if we got up and left.");
					Item item2146 = new Item(s.getKey(), "Leszoktam arról, hogy késon keljek.",
							"I've got out of the habit of getting up late.");
					Item item2147 = new Item(s.getKey(), "Az a szokásom, hogy kávét iszom reggelire.",
							"I am in the habit of drinking coffee for breakfast.");
					Item item2148 = new Item(s.getKey(), "Rászoktam, hogy köszönjek a szomszédomnak.",
							"I've got into the habit of saying 'good morning' to my neighbor.");
					Item item2149 = new Item(s.getKey(), "Leszoktam arról, hogy reggelenként fürödjek.",
							"I got out of the habit of having a bath in the morning.");
					Item item2150 = new Item(s.getKey(), "Az a szokásom, hogy sört ebédelek.",
							"I am in the habit of drinking beer for lunch.");
					Item item2151 = new Item(s.getKey(), "Rászoktam arra, hogy gyorsan vezessek.",
							"I've got into the habit of driving very fast.");
					Item item2152 = new Item(s.getKey(), "Nem megy a világítás, mert a villanykörte hiányzik.",
							"The light doesn't work, because the light bulb is missing.");
					Item item2153 = new Item(s.getKey(), "A kocsiról hiányzik az egyik lökhárító.",
							"The car has got one of the bumpers missing.");
					Item item2154 = new Item(s.getKey(), "A tranzisztorok hiányoznak a zsebrádióból.",
							"The transistors are missing from the pocket radio.");
					Item item2155 = new Item(s.getKey(), "Ha hiányoznak a lábai, az asztal nem áll meg.",
							"If the legs are missing, the table won't stand up.");
					Item item2156 = new Item(s.getKey(), "Vigyázz, itt hiányzik egy lépcso.",
							"Be careful, there's a stair missing.");
					Item item2157 = new Item(s.getKey(), "A széknek hiányzik az egyik lába.", "The chair's got a leg missing.");
					Item item2158 = new Item(s.getKey(), "Ki kell hagyni száradni a fát.", "The wood needs drying out.");
					Item item2159 = new Item(s.getKey(), "Az ablakokat meg kell javítani.", "The windows want repairing.");
					Item item2160 = new Item(s.getKey(), "Az egész autót újra kell dukkózni.", "The whole car needs re-spraying.");
					Item item2161 = new Item(s.getKey(), "A házat ki kell takarítani.", "The house is in need of cleaning.");
					Item item2162 = new Item(s.getKey(), "A füvet le kell vágni.", "The grass needs to be cut.");
					Item item2163 = new Item(s.getKey(), "Az elemeket ki kell cserélni.", "The batteries want replacing.");
					Item item2164 = new Item(s.getKey(), "A virágokat meg kell öntözni.", "The flowers need to be watered.");
					Item item2165 = new Item(s.getKey(), "Nagyon fáj a fejem, rámférne (jól esne) egy kis séta.",
							"I've got such a headache, I could do with a short walk.");
					Item item2166 = new Item(s.getKey(), "Rámférne egy fogyókúra, olyn kövér vagyok.",
							"I could do with a slimming course, I am so fat.");
					Item item2167 = new Item(s.getKey(), "Jól esne egy zuhany, ragadok a kosztól.",
							"I could do with a shower, I am so sticky.");
					Item item2168 = new Item(s.getKey(), "Sajnálom, de elfogyott a cigarettám.",
							"I'm sorry, but I've run out of cigarettes.");
					Item item2169 = new Item(s.getKey(), "Momentán abszolute nincs nálam gyufa.", "I'm right out of matches.");
					Item item2170 = new Item(s.getKey(), "Hamarosan elfogyott az ital a bulin.",
							"We soon ran out of drinks at the party.");
					Item item2171 = new Item(s.getKey(), "Nincs pénze.", "She is out of money.");
					Item item2172 = new Item(s.getKey(), "Elfogyott a borunk.", "We've run out of wine.");
					Item item2173 = new Item(s.getKey(), "Kevés a poharad?", "Are you short of glasses?");
					Item item2174 = new Item(s.getKey(), "Kevés volt a hamutartó, így kölcsön kellett kérni.",
							"They were short of ashtrays, so they had to borrow some.");
					Item item2175 = new Item(s.getKey(), "A hónap vége felé mindig kevés a pénzem.",
							"At the end of the month I'm always short of money.");
					Item item2176 = new Item(s.getKey(), "Azt mondja, nem tud meglenni napi tíz óra alvás nélkül.",
							"He says he can't survive without ten hours' sleep.");
					Item item2177 = new Item(s.getKey(), "Nem tudok meglenni nélküled.", "I can't do without you.");
					Item item2178 = new Item(s.getKey(), "Az ember nem tud meglenni oxigén nélkül.",
							"Humans can't do without oxygen.");
					Item item2179 = new Item(s.getKey(), "A virág nem tud meglenni víz nélkül.", "Flowers can't do without water.");
					Item item2180 = new Item(s.getKey(), "Nem tud meglenni két kocsi nélkül.",
							"She can't survive without two cars.");
					Item item2181 = new Item(s.getKey(), "(O) mondta (nekem), hogy találkozunk éjfélkor.",
							"She told me to meet her at midnight.");
					Item item2182 = new Item(s.getKey(), "Elmesélte neki élete történetét.", "He told her the story of his life.");
					Item item2183 = new Item(s.getKey(), "A fiú mondta a lánynak, hogy tartsák meg az eljegyzésüket.",
							"The boy told the girl to plight their troth");
					Item item2184 = new Item(s.getKey(), "Ne hazudj!", "Don't tell lies.");
					Item item2185 = new Item(s.getKey(), "Azt mondta, hogy remek dolog a napon szerelmeskedni.",
							"He said that it was fun to make love in the sun. (Amanda Lear).");
					Item item2186 = new Item(s.getKey(), "Azt mondja, hogy nem ér rá.", "He says he's busy.");
					Item item2187 = new Item(s.getKey(), "Csak azt akarom mondani, hogy ha van rá mód…",
							"I only want to say if there's a way (Superstar).");
					Item item2188 = new Item(s.getKey(), "Zseni vagy – mondta Béla Marcinak.",
							"You are a genius, Béla said to Marci.");
					Item item2189 = new Item(s.getKey(), "Szép idonk van, nemde? – mondta Juliska.",
							"Nice day, ain't it?, Juliska said.");
					Item item2190 = new Item(s.getKey(), "Azt tanácsolom, hogy itt maradj,", "I advise you to stay here.");
					Item item2191 = new Item(s.getKey(),
							"Azt javasolta, hogy menjünk el. (Láthatod, hogy a mellékmondat többféleképpen építheto fel.)",
							"She suggested that we go/should go/went.");
					Item item2192 = new Item(s.getKey(), "Azt javaslom, hogy ne rúgj be.", "I suggest that you don't get drunk.");
					Item item2193 = new Item(s.getKey(), "Azt javasolta, hogy menjek el.", "He suggested that I should leave.");
					Item item2194 = new Item(s.getKey(), "Hogy vagy? -Jól köszönöm.", "How are you? -Fine, thank you.");
					Item item2195 = new Item(s.getKey(), "Le akarsz ülni?", "Would you like to take a seat?");
					Item item2196 = new Item(s.getKey(), "Nem. Köszönöm, nem vagyok fáradt.", "No, thank you, I'm not tired.");
					Item item2197 = new Item(s.getKey(), "Hogy hívják azt az embert, aki kihúzza a fogadat?",
							"What do you call the person who takes out your tooth?");
					Item item2198 = new Item(s.getKey(), "Hogy hívják ezt a gépet?", "What is this machine called?");
					Item item2199 = new Item(s.getKey(), "családi ház", "house, detached house");
					Item item2200 = new Item(s.getKey(), "ikerház", "semi-detached house");
					Item item2201 = new Item(s.getKey(), "bérház", "block of flats");
					Item item2202 = new Item(s.getKey(), "lakótelep", "housing estate");
					Item item2203 = new Item(s.getKey(), "sorház", "terraced house");
					Item item2204 = new Item(s.getKey(), "pontház", "detached house");
					Item item2205 = new Item(s.getKey(), "öröklakás", "free-hold flat");
					Item item2206 = new Item(s.getKey(), "tanácsi lakás", "council flat");
					Item item2207 = new Item(s.getKey(), "szövetkezeti lakás", "cooperative flat");
					Item item2208 = new Item(s.getKey(), "társasház", "a small block of flats");
					Item item2209 = new Item(s.getKey(), "albérlet", "digs, subtenancy, lodgings, rented room");
					Item item2210 = new Item(s.getKey(), "társbérlet", "co-tenancy");
					Item item2211 = new Item(s.getKey(), "Nagyon jól éreztük magunkat a bulin. ",
							"We had a very good time at the party.");
					Item item2212 = new Item(s.getKey(), "A hét végén már jobban fogja érezni magát.",
							"At the end of the week you will feel well.");
					Item item2213 = new Item(s.getKey(), "Tegnap érkezett Maggie Budapestre.",
							"Margaret Thatcher arrived in Budapest last night.");
					Item item2214 = new Item(s.getKey(), "Végre megérkeztünk az állomásra.", "At last we arrived at the station.");
					Item item2215 = new Item(s.getKey(), "Egy kedves ifjú pár látható a fényképen.",
							"There is a nice married couple in the photo.");
					Item item2216 = new Item(s.getKey(), "Két narancs látható a festményen.",
							"There are two oranges in the picture.");
					Item item2217 = new Item(s.getKey(), "Kocsival mentek az állatkertba.", "They went to the zoo by car.");
					Item item2218 = new Item(s.getKey(), "Az én kocsimmal mentünk az állatkertbe.", "We went to the zoo in my car.");
					Item item2219 = new Item(s.getKey(), "Az eloadás végén mind elmentek a kocsmába.",
							"At the end of the play they all went to the pub.");
					Item item2220 = new Item(s.getKey(), "Végül senki nem maradt a színpadon.",
							"In the end nobody stayed on the stage.");
					Item item2221 = new Item(s.getKey(), "Több órája várok rád.", "I have been waiting for you for several hours.");
					Item item2222 = new Item(s.getKey(), "Több, mint 3 órája várok rád.",
							"I have been waiting for you for more than 3 hours.");
					Item item2223 = new Item(s.getKey(), "Érdemes megvenni azt a Mercit.", "It is worth buying this Mercedes.");
					Item item2224 = new Item(s.getKey(), "Nem érdemes tovább várni.", "It is no use waiting any longer.");
					Item item2225 = new Item(s.getKey(), "Megenném, ha nem lenne zöld.", "I would eat it if it wasn't green.");
					Item item2226 = new Item(s.getKey(), "Azt mondta, hogy a jövo héten majd meglátogat.",
							"He said he would visit me the next week.");
					Item item2227 = new Item(s.getKey(), "Amikor én még kissrác voltam, minden nap fociztam.",
							"When I was a kid I would play football every day.");
					Item item2228 = new Item(s.getKey(), "Nem voltam hajlandó megengedni neki, hogy fölszúrja az orromat.",
							"I wouldn't let her prick my nose.");
					Item item2229 = new Item(s.getKey(), "Pont olyan vagy, mint az anyósom.", "You're just like my mother-in-law.");
					Item item2230 = new Item(s.getKey(), "Pont olyan kedves vagy, mint az anyósom.",
							"You're just as nice as my mother-in-law.");
					Item item2231 = new Item(s.getKey(), "Úgy dolgozik, mint egy rabszolga (de nem rabszolga).",
							"He works like a slave.");
					Item item2232 = new Item(s.getKey(), "Rabszolgaként dolgozik. (pl. egy gyarmaton)", "He works as a slave.");
					Item item2233 = new Item(s.getKey(), "Mint a mókus fenn a fán.", "Like a squirrel up in the tree…");
					Item item2234 = new Item(s.getKey(), "Olyan szép vagy, mint a nap.", "You're as beautiful as the sun.");
					Item item2235 = new Item(s.getKey(), "Ez a könyv olyan, mint egy rossz álom.", "This book is like a bad dream.");
					Item item2236 = new Item(s.getKey(), "Elment. Csak úgy.", "Off he went. Just like that.");
					Item item2237 = new Item(s.getKey(), "Olyan kicsi vagy, mint egy törpe.", "You're as small as a dwarf.");
					Item item2238 = new Item(s.getKey(), "Te meg olyan vagy, mint egy gozmozdony.",
							"You're just like a steam engine.");
					Item item2239 = new Item(s.getKey(), "Olyan a szemed, mint egy kispárna.",
							"Your eyes are like a little pillow.");
					Item item2240 = new Item(s.getKey(), "Heten vannak, mint a gonoszok.", "They are seven like the evil.");
					Item item2241 = new Item(s.getKey(), "Mint a filmeken.", "Like a movie scene.");
					Item item2242 = new Item(s.getKey(), "Pont olyan csinos, mint a mamája.", "She's as pretty as her mother.");
					Item item2243 = new Item(s.getKey(), "Elég gazdag ahhoz, hogy megvegye a villát.",
							"He is rich enough to buy the villa.");
					Item item2244 = new Item(s.getKey(), "Nem elég okos ahhoz, hogy megértse.",
							"She is not clever enough to understand it.");
					Item item2245 = new Item(s.getKey(), "Túl részeg ahhoz, hogy egy szót is kinyögjön.",
							"He is too drunk to speak.");
					Item item2246 = new Item(s.getKey(), "Az utca túl sáros ahhoz, hogy Pisti átmenjen a túlsó oldalra.",
							"The street is too muddy for Pisti to cross (it).");
					Item item2247 = new Item(s.getKey(), "Túl nagy a szél ahhoz, hogy most vitorlázzunk.",
							"It is too windy for us to sail now.");
					Item item2248 = new Item(s.getKey(), "Túl hangos a zene ahhoz, hogy a bébi aludni tudjon.",
							"The music is too loud for the baby to sleep.");
					Item item2249 = new Item(s.getKey(), "A vonat nem ment elég lassan ahhoz, hogy fel tudjon ugrani rá.",
							"The train was not slow enough for him to jump on.");
					Item item2250 = new Item(s.getKey(), "Túl sok nekem ez a sör ahhoz, hogy megigyam.",
							"That beer is too much for me to drink.");
					Item item2251 = new Item(s.getKey(), "A tea túl forró volt ahhoz, hogy a légy világcsúcsot ússzon benne.",
							"The tea was too hot for the fly to beat the world record.");
					Item item2252 = new Item(s.getKey(), "Hu de jól áll az a mini szoknya!", "That mini skirt really suits you.");
					Item item2253 = new Item(s.getKey(), "Igazán jól áll ez a frizura.", "That hair style suits you.");
					Item item2254 = new Item(s.getKey(), "Jó a farmer mérete.", "That pair of jeans fits me.");
					Item item2255 = new Item(s.getKey(), "Jó lesz méretileg az a blúz?", "Does that blouse fit you, Madam?");
					Item item2256 = new Item(s.getKey(), "Olyan függönyt kell vennem, amelyik megy a fotelhez.",
							"I've got to buy a curtain that matches the armchair.");
					Item item2257 = new Item(s.getKey(), "Olyan blúzt vett, amelyik megy a nadrágkosztümjéhez.",
							"She's bought a blouse that goes with her pants-suit.");
					Item item2258 = new Item(s.getKey(), "Megy a függöny a tapétához?", "Does the curtain match the wallpaper?");
					Item item2259 = new Item(s.getKey(), "De jól áll az a pulóver.", "That pullover really suits you.");
					Item item2260 = new Item(s.getKey(), "Pont jó a cipo.", "Those shoes fit me.");
					Item item2261 = new Item(s.getKey(), "Öreg vagy te már, nem áll jól a láncos dzseki.",
							"You're too old; a chain jacket doesn't suit you.");
					Item item2262 = new Item(s.getKey(),
							"Hu, de jó kis sapka. Hu, és pont jó. Hu de jól áll. Hu, és a sáladhoz is megy.",
							"Hmm, that's a good cap. Hmm, and it fits you. Hmm, and it suits you, too. Hmm, and it goes with your scarf.");
					Item item2263 = new Item(s.getKey(), "murvás út", "gravelled road");
					Item item2264 = new Item(s.getKey(), "földút", "rutted road");
					Item item2265 = new Item(s.getKey(), "földút", "dirt road");
					Item item2266 = new Item(s.getKey(), "aszfaltút", "asphalt road");
					Item item2267 = new Item(s.getKey(), "úton az irodába", "on the way to the office");
					Item item2268 = new Item(s.getKey(), "Meg tudná mondani az utat Denton Cottage felé?",
							"Can you tell me the way to Denton Cottage? (Czobor – Horlai)");
					Item item2269 = new Item(s.getKey(), "Az út hosszú volt, az út pedig zsúfolt.",
							"The way was long and the road was busy.");
					Item item2270 = new Item(s.getKey(), "autósztráda", "motorway");
					Item item2271 = new Item(s.getKey(), "foút", "highway");
					Item item2272 = new Item(s.getKey(), "vasút (a sínek)", "railway");
					Item item2273 = new Item(s.getKey(), "kölcsönkér", "borrow");
					Item item2274 = new Item(s.getKey(), "kölcsönad", "lend");
					Item item2275 = new Item(s.getKey(), "Egy pók van a falon. Hu, az egy kaszáspók!",
							"There is a spider on the wall. Hey, it's (a) daddy longlegs.");
					Item item2276 = new Item(s.getKey(), "Úttörok állnak a zászló alatt.",
							"There are some pioneers standing under the flag.");
					Item item2277 = new Item(s.getKey(), "Az úttörok énekelnek.", "The pioneers are singing.");
					Item item2278 = new Item(s.getKey(), "Egy kislány áll a sarkon.", "There is a girl standing on the corner.");
					Item item2279 = new Item(s.getKey(), "A kislányon mini szoknya van.", "The girl is wearing a mini skirt.");
					Item item2280 = new Item(s.getKey(), "Két rendor ül egy Zsiguliban.",
							"There are two policemen sitting in a Zsiguli.");
					Item item2281 = new Item(s.getKey(), "A rendorök a lányt nézik.", "The policemen are looking at the girl.");
					Item item2282 = new Item(s.getKey(), "Gumibot van a rendor kezében.",
							"There is a truncheon in the policeman's hand.");
					Item item2283 = new Item(s.getKey(), "A gumibot fekete.", "The truncheon is black.");
					Item item2284 = new Item(s.getKey(), "Egy macska kacag a házteton.", "There is a cat laughing on the roof.");
					Item item2285 = new Item(s.getKey(), "A macska szereti a romantikus történeteket.",
							"The cat likes romantic stories.");
					Item item2286 = new Item(s.getKey(), "Egy bolha egyensúlyozott a macska bajuszán.",
							"There was a flea balancing on the cat's moustache.");
					Item item2287 = new Item(s.getKey(), "Fecskék repültek Dél-Afrika felé.",
							"There were swallows flying towards South-Africa.");
					Item item2288 = new Item(s.getKey(), "Egy banán van a citromfán.", "There's a banana on the lemon tree.");
					Item item2289 = new Item(s.getKey(), "Bogarak voltak a fürdoszobában.", "There were beetles in the bathroom.");
					Item item2290 = new Item(s.getKey(), "Egy légy csuszkált a kopasz fején.",
							"There was a fly skidding on his bald head.");
					Item item2291 = new Item(s.getKey(), "Aztán a légy a pitére szállt.", "Then the fly flew on the pie.");
					Item item2292 = new Item(s.getKey(), "A pite az asztalon van.", "The pie is on the table.");
					Item item2293 = new Item(s.getKey(), "A sütoben is van pite.", "There's some pie in the oven, too.");
					Item item2294 = new Item(s.getKey(), "Két süto volt a konyhában.", "There were two ovens in the kitchen.");
					Item item2295 = new Item(s.getKey(), "A konyha a fürdoszoba mellett van.",
							"The kitchen is beside the bathroom.");
					Item item2296 = new Item(s.getKey(), "Egy csomó fürdoszoba van a házában.",
							"There are a lot of bathrooms in his house.");
					Item item2297 = new Item(s.getKey(), "Csak egy ház van az utcában.", "There's only one house in the street.");
					Item item2298 = new Item(s.getKey(), "Zengo hangú férfikórus énekelte a Bunkócska refrénjét.",
							"There was a sonorous voiced men's chorus singing the refrain of Coshlet.");
					Item item2299 = new Item(s.getKey(), "Hat órája alszik.", "She's been sleeping for 6 hours.");
					Item item2300 = new Item(s.getKey(), "Reggel óta alszik.", "She's been sleeping since morning.");
					Item item2301 = new Item(s.getKey(), "reggel óta", "since morning");
					Item item2302 = new Item(s.getKey(), "hat hónapja", "for six months");
					Item item2303 = new Item(s.getKey(), "hetek óta", "for weeks");
					Item item2304 = new Item(s.getKey(), "Két évig tanultam zongorázni.", "I studied the piano for two years.");
					Item item2305 = new Item(s.getKey(), "Két évet volt katona.", "He was a soldier for two years.");
					Item item2306 = new Item(s.getKey(), "Alig indultunk el, máris defektet kaptunk.",
							"Hardly had we started when the car got a flat tyre.");
					Item item2307 = new Item(s.getKey(), "Alig kezdodött a meccs, máris zuhogott.",
							"No sooner had the game begun than it started raining.");
					Item item2308 = new Item(s.getKey(), "Alig ültünk le, mikor láttuk, hogy már mennünk is kell.",
							"No sooner had we sat down than we found it was time to go.");
					Item item2309 = new Item(s.getKey(), "Alig jött meg, máris mennie kellett.",
							"Hardly had he arrived when he had to leave again.");
					Item item2310 = new Item(s.getKey(), "Jobb lenne, ha nem öltöznél fel.", "You'd better not put on your dress.");
					Item item2311 = new Item(s.getKey(), "Jobban tenném, ha aludnék.", "I'd better sleep.");
					Item item2312 = new Item(s.getKey(), "Jobb, ha nem mondod meg neki.", "You'd better not tell him.");
					Item item2313 = new Item(s.getKey(), "Jobb lenne, ha most hazamennénk.", "We'd better go home now.");
					Item item2314 = new Item(s.getKey(), "Jobban tetted volna, ha becsukod a szemed.",
							"You'd better have closed your eyes.");
					Item item2315 = new Item(s.getKey(), "Jobb lett volna, ha nem mész el.", "You'd better not have left.");
					Item item2316 = new Item(s.getKey(), "Jobb, ha csöndben maradsz.", "You'd better be quiet.");
					Item item2317 = new Item(s.getKey(), "Jobban tennéd, ha felöltöznél.", "You'd better put on your dress.");
					Item item2318 = new Item(s.getKey(), "Jobb, ha nem megyünk együtt.", "We'd better not go together.");
					Item item2319 = new Item(s.getKey(), "Jobb lett volna, ha alszik.", "He had better have slept.");
					Item item2320 = new Item(s.getKey(), "Jobb, ha nem beszélek annyit.", "I'd better not talk so much.");
					Item item2321 = new Item(s.getKey(), "Jobban teszed, ha becsukod a szemed.", "You'd better close your eyes.");
					Item item2322 = new Item(s.getKey(), "Jobb, ha nem eszed meg.", "You'd better not eat it.");
					Item item2323 = new Item(s.getKey(), "Jobb lett volna, ha lifttel megyünk.", "We'd better have used the lift.");
					Item item2324 = new Item(s.getKey(), "Senki nem hallotta, hogy elhagyta a házat.",
							"Nobody heard him leave the house.");
					Item item2325 = new Item(s.getKey(), "Senki nem hallotta, hogy elhagyta a házat.",
							"Nobody heard him leaving the house.");
					Item item2326 = new Item(s.getKey(), "Láttam, hogy ott állank kéz a kézben.",
							"I saw them standing hand in hand.");
					Item item2327 = new Item(s.getKey(), "Még sosem láttam sírni.", "I've never seen her cry.");
					Item item2328 = new Item(s.getKey(), "Láttam, ahogy ott áll.", "And I saw her standing there. (Beatles)");
					Item item2329 = new Item(s.getKey(), "Hallom, hogy valaki kopog.", "I can hear someone knocking.");
					Item item2330 = new Item(s.getKey(), "Hallod, hogy dobog a szívem?", "Can you hear my heart beat?");
					Item item2331 = new Item(s.getKey(), "Láttam, hogy kéz a kézben sétálnak a kertben. ",
							"I saw them walking hand in hand in the garden.");
					Item item2332 = new Item(s.getKey(), "Hallottam, hogy Juliska énekel a fürdoszobában.",
							"I heard Julia singing in the bathroom.");
					Item item2333 = new Item(s.getKey(), "Hallod hogy ugat a Kriszti?", "Can you hear Christie bark?");
					Item item2334 = new Item(s.getKey(), "Látod azt a kísértetet, amint tetorol tetore ugrál?",
							"Can you see that ghost jumping from rooftop to rooftop?");
					Item item2335 = new Item(s.getKey(), "Láttam, hogy mosolyog.", "I saw her smile.");
					Item item2336 = new Item(s.getKey(), "És láttam, ahogy ott állt.", "And I saw her standing there.");
					Item item2337 = new Item(s.getKey(), "Hallottam, hogy nyílik az ajtó.", "I heard the door opening.");
					Item item2338 = new Item(s.getKey(), "Épp menni készültél?", "Were you about to leave?");
					Item item2339 = new Item(s.getKey(), "Épp menni készültél?", "Were you going to leave?");
					Item item2340 = new Item(s.getKey(), "Nem akartam én megenni, épp csak azon voltam, hogy megkóstoljam.",
							"I wasn't going to eat it, I was just about to taste it.");
					Item item2341 = new Item(s.getKey(), "Azt mondják, hogy K. gyáva.", "K. is said to be a coward.");
					Item item2342 = new Item(s.getKey(), "Úgy tunik, K. csatamezot keres. (épp most)",
							"K. seems to be looking for a battlefield.");
					Item item2343 = new Item(s.getKey(), "A jelentések szerint K.-nak van egy lova.",
							"K. is reported to have a horse.");
					Item item2344 = new Item(s.getKey(), "Úgy vélik, hogy K. ismeri a királyt.", "K. is thought to know the king.");
					Item item2345 = new Item(s.getKey(), "Azt mondják K.-ról, hogy fiatal korában nagy kujon volt.",
							"K. is said to have been a lady-killer when he was young.");
					Item item2346 = new Item(s.getKey(), "Úgy tunik, hogy K. elvesztette a lovát.",
							"K. seems to have lost his horse.");
					Item item2347 = new Item(s.getKey(), "A jelentések szerint K. a várba ment.",
							"K. is reported to have left for the castle.");
					Item item2348 = new Item(s.getKey(), "Tavaly még úgy tunt, hogy K. ismeri a kapuzáró jelszót.",
							"Last year K. seemed to know the gate locking password.");
					Item item2349 = new Item(s.getKey(), "Azt mondták, hogy K. egy gyáva.", "K. was said to be a coward.");
					Item item2350 = new Item(s.getKey(), "Jelentették, hogy K.-nak van egy lova.",
							"K. was reported to have a horse.");
					Item item2351 = new Item(s.getKey(), "Azt mondták, hogy K. elvesztette a lovát.",
							"K. was said to have lost his horse.");
					Item item2352 = new Item(s.getKey(), "Jelentették, hogy K. megszökött lovastul.",
							"K. was reported to have run away with his horse.");
					Item item2353 = new Item(s.getKey(), "Azt mondják, hogy K.-t otthagyta a lova.",
							"K. is said to have been deserted by his horse.");
					Item item2354 = new Item(s.getKey(), "Úgy tunik, hogy K.-t minden gyerek szereti.",
							"K. seems to be loved by every child.");
					Item item2355 = new Item(s.getKey(), "Jelentették, hogy K.-t körözi a rendorség.",
							"K. was reported to be wanted by the police.");
					Item item2356 = new Item(s.getKey(), "Úgy tunik, hogy K.-t legyozték.", "K. seemed to have been defeated.");
					Item item2357 = new Item(s.getKey(), "Úgy látszik forr.", "It seems to be boiling.");
					Item item2358 = new Item(s.getKey(), "Azt mondják, 14 éves sem volt, mikor elvesztette.",
							"She is said to have been less than fourteen when she lost it.");
					Item item2359 = new Item(s.getKey(), "Azt mondják, hogy jobb egy lúdnyak két tyúknyaknál.",
							"One goose neck is said to be better than two hen necks.");
					Item item2360 = new Item(s.getKey(), "Feltehetoen vidéken bújkál.",
							"He is supposed to be hiding in the country.");
					Item item2361 = new Item(s.getKey(), "Úgy látszott, becsukták az ajtót.",
							"The door seemed to have been closed.");
					Item item2362 = new Item(s.getKey(), "Azt hiszik róla, hogy külföldi.", "She is believed to be a foreigner.");
					Item item2363 = new Item(s.getKey(), "Azt hitték, hogy dolgozunk.", "We were thought to be working.");
					Item item2364 = new Item(s.getKey(), "Úgy tunt, hogy van még hátra egy pár.",
							"There seemed to be a few more left.");
					Item item2365 = new Item(s.getKey(), "Azt mondják, ez már az utolsó mondat.",
							"This sentence is said to be the last one.");
					Item item2366 = new Item(s.getKey(), "Úgy látszik Évi megette a zsömlét.", "Eve seems to have eaten the roll.");
					Item item2367 = new Item(s.getKey(), "A jelentések szerint az ötödikrol zuhant ki.",
							"He is reported to have fallen from the fifth floor.");
					Item item2368 = new Item(s.getKey(), "Látszott rajta, hogy egész éjjel sírt.",
							"He seemed to have been crying all night.");
					Item item2369 = new Item(s.getKey(), "Azt hitték szegényrol, hogy szegény, pedig gazdag volt.",
							"The poor bloke was thought to be poor though he was rich.");
					Item item2370 = new Item(s.getKey(), "Azt mondják róla, hogy nem szeret senkit.", "He is said to love nobody.");
					Item item2371 = new Item(s.getKey(), "Azt mondják, hogy el kellett utaznia.",
							"She's said to have had to leave.");
					Item item2372 = new Item(s.getKey(), "Úgy látszik, nem érdekli semmi.",
							"He doesn't seem to care about anything.");
					Item item2373 = new Item(s.getKey(), "Úgy látszott, hogy forr.", "It seemed to be boiling.");
					Item item2374 = new Item(s.getKey(), "Azt hitték róla, hogy okos.", "He was thought to be clever.");
					Item item2375 = new Item(s.getKey(), "Lopott kocsinak tunt.", "It seemed to be a stolen car.");
					Item item2376 = new Item(s.getKey(), "Azt hitték, hogy ellopták a kocsiját.",
							"His car was thought to have been stolen.");
					Item item2377 = new Item(s.getKey(),
							"Úgy tartják, hogy Magyarország olyan mint a gyapjú; minden nagymosásnál összemegy.",
							"Hungary is believed to be similar to wool; she shrinks with every big wash.");
					Item item2378 = new Item(s.getKey(), "Meddig tart már, hogy levedd azt a szoknyát?",
							"How long will it take you to take off that skirt?");
					Item item2379 = new Item(s.getKey(),
							"Csak az tartott két órát, míg a mosolyt levakarták az arcáról. (Top Secret)",
							"It took them two hours to take the smile off his face.");
					Item item2380 = new Item(s.getKey(), "Egy hét is beletelt, mire Józsi kifestette a szobámat.",
							"It took Joe a week to paint my room.");
					Item item2381 = new Item(s.getKey(), "Meddig tart már, hogy kicseréld azt a zárat?",
							"How long does it take you to change that lock?");
					Item item2382 = new Item(s.getKey(), "Két perc alatt ott voltam.", "It took me two minutes to get there.");
					Item item2383 = new Item(s.getKey(), "Egy fél nap is lesz, míg kicserélik a fotengelyt.",
							"It will take them half a day to replace the crankshaft.");
					Item item2384 = new Item(s.getKey(), "Mennyi ido alatt érész Erzsébetrol Csepelre?",
							"Hoe long does it take you to get to Csepel from Erzsébet.");
					Item item2385 = new Item(s.getKey(), "Ha gyalog megyek 20 perc, ha kocsival, 30.",
							"It takes me 20 minutes on foot and 30 minutes by car.");
					Item item2386 = new Item(s.getKey(), "Mennyi ido alatt fognak Székesfehérvárról Moszkvába érni?",
							"How long will it take them to get to Moscow from Székesfehérvár?");
					Item item2387 = new Item(s.getKey(), "Négy nap alatt értünk Hágába.",
							"It took us four days to get to the Hague.");
					Item item2388 = new Item(s.getKey(), "Kevesebb mint 10 perc alatt összeütötte a rántottát.",
							"It took her less than 10 minutes to make scrambled eggs.");
					Item item2389 = new Item(s.getKey(), "Mennyi ido alatt olvastad el a 'Háború és Béké'-t?",
							"How long did it take you to read 'War and Peace'?");
					Item item2390 = new Item(s.getKey(), "Megkérdeztem a címét.", "I asked him his address.");
					Item item2391 = new Item(s.getKey(), "Málnát kért tolem.", "He asked me for some raspberries.");
					Item item2392 = new Item(s.getKey(), "Kérdezd meg tole, hány óra.", "Ask him the time.");
					Item item2393 = new Item(s.getKey(), "Órát kérj tole a születésnapodra.",
							"Ask him for a watch for your birthday.");
					Item item2394 = new Item(s.getKey(), "Greenwich-i ido szerint 5 óra van.",
							"It is 5 hours GMT (Greenwich Mean Time).");
					Item item2395 = new Item(s.getKey(), "Találkozzunk hatkor.", "Let's meet at 6 o'clock.");
					Item item2396 = new Item(s.getKey(), "Nálunk, a Csepeli Munkásotthonban egy tanítási óra 45 perc.",
							"With us, in Csepel Workers' Home, one lesson is 45 minutes.");
					Item item2397 = new Item(s.getKey(), "Jól énekelnek.", "They are good at singing.");
					Item item2398 = new Item(s.getKey(), "Nyelvekbol jó.", "She is good at languages.");
					Item item2399 = new Item(s.getKey(), "Nagyon jól vezet.", "He's very good at driving.");
					Item item2400 = new Item(s.getKey(), "Ezer éve nem találkoztam velük.", "It's ages since I met them.");
					Item item2401 = new Item(s.getKey(), "Két hónapja nem beszéltünk.", "It's two months since we talked.");
					Item item2402 = new Item(s.getKey(), "Jobb szeretem a sört, mint a bort.", "I prefer beer to wine.");
					Item item2403 = new Item(s.getKey(), "Inkább Görögországba mennék.", "I'd prefer to go to Greece.");
					Item item2404 = new Item(s.getKey(), "Jobban szeretem a macskákat, mint a kutyákat.", "I prefer cats to dogs.");
					Item item2405 = new Item(s.getKey(), "Jobb szeret korán kelni.", "He prefers to get up early.");
					Item item2406 = new Item(s.getKey(), "Jobb szeret késon kelni.", "He prefers getting up late.");
					Item item2407 = new Item(s.getKey(), "Jobb szeretnek futni, mint úszni.", "They prefer running to swimming.");
					Item item2408 = new Item(s.getKey(), "Elraboltak 2 millió forintot.", "They stole 2 million forints.");
					Item item2409 = new Item(s.getKey(), "Kiraboltak egy bankot.", "They robbed a bank.");
					Item item2410 = new Item(s.getKey(), "100 forintot raboltak el az idos hölgytol.",
							"They stole 100 forints from the old lady.");
					Item item2411 = new Item(s.getKey(), "100 forintot raboltak el az idos hölgytol.",
							"They robbed the old lady of 100 forints.");
					Item item2412 = new Item(s.getKey(), "az egyetlen ember az irodában, aki dohányzik.",
							"He's the only person in the office who smokes.");
					Item item2413 = new Item(s.getKey(), "Az egyetlen probléma, hogy kicsit drága.",
							"The only problem is that it's rather expensive.");
					Item item2414 = new Item(s.getKey(), "Ez az egyetlen lehetoség, hogy meggyozzük ot.",
							"This is the only way to convince him.");
					Item item2415 = new Item(s.getKey(), "Mindig csak a tiéd leszek.", "You're the only one who'll have me.");
					Item item2416 = new Item(s.getKey(), "Ez az egyetlen kijárat.", "This is the only exit.");
					Item item2417 = new Item(s.getKey(), "Bárhová is mész, én veled megyek.",
							"Wherever you go, I'm coming with you.");
					Item item2418 = new Item(s.getKey(), "Bárhová is mész, bármit is csinálsz, én ott leszek.",
							"Wherever you go, whatever you do, I'll be there. (Susie)");
					Item item2419 = new Item(s.getKey(), "Barki is az, nem akarok találkozni vele.",
							"Whoever it is, I don't want to see him.");
					Item item2420 = new Item(s.getKey(), "Akárhogy is fáj, a Fradi itt a sztár.",
							"However much it hurts, Fradi is the first.");
					Item item2421 = new Item(s.getKey(), "Bármekkora is a fülem, nem hallok semmit.",
							"However big my ears, I can't hear a thing.");
					Item item2422 = new Item(s.getKey(), "Bármibe kerül, én megveszem neked.",
							"Whatever it costs, I'll buy it for you.");
					Item item2423 = new Item(s.getKey(), "Akármelyiket veszi el, úgyis megbánja.",
							"Whichever he marries, he'll regret it.");
					Item item2424 = new Item(s.getKey(), "Bármit iszol, rosszul leszel.", "Whatever you drink, you'll get sick.");
					Item item2425 = new Item(s.getKey(), "Akárki mondja, hazudik.", "Whoever says it is a liar.");
					Item item2426 = new Item(s.getKey(), "Akármennyi pénze is van, hülye oszt kész.",
							"However much money he has, he's stupid and that's it.");
					Item item2427 = new Item(s.getKey(), "Bármit is javasolok, mindig ellenkezik.",
							"Whatever I suggest, he always disagrees.");
					Item item2428 = new Item(s.getKey(), "Fölvette a kabátját.", "She put on her coat.");
					Item item2429 = new Item(s.getKey(), "Levette a cipojét.", "He took off his shoes.");
					Item item2430 = new Item(s.getKey(), "Vagyok én olyan legény, mint te.", "I am as tough a guy as you are.");
					Item item2431 = new Item(s.getKey(), "Vagyok én olyan lány, mint amilyen legény te vagy.",
							"I am as tough a girl as tough a guy you are.");
					Item item2432 = new Item(s.getKey(), "A poros nyomába se léphetsz az elso feleségemnek.",
							"You are nothing like my first wife.");
					Item item2433 = new Item(s.getKey(), "Te nem tudod mit beszélsz.", "You don't know what you're saying.");
					Item item2434 = new Item(s.getKey(), "Pontosan tudom, hogy milyen no volt az elso feleséged.",
							"I know exactly what kind of a woman your first wife was.");
					Item item2435 = new Item(s.getKey(), "Igyekezett mindenkinek örömet szerezni.",
							"She tried hard to please everyone.");
					Item item2436 = new Item(s.getKey(), "Már csak ilyen volt.", "She was just like that.");
					Item item2437 = new Item(s.getKey(), "De azért nem volt olyan önzo, mint te.",
							"But she wasn't as selfish as you are.");
					Item item2438 = new Item(s.getKey(), "Sokkal jobban fozött mint te, és kész.",
							"She was much better at cooking than you and that's it.");
					Item item2439 = new Item(s.getKey(), "Én még ilyen marhát nem láttam.", "I haven't seen a moron like you.");
					Item item2440 = new Item(s.getKey(), "Most már viselkedjél.", "Control yourself.");
					Item item2441 = new Item(s.getKey(), "Elvigyelek valahová az este?", "Shall I take you out tonight?");
					Item item2442 = new Item(s.getKey(), "És milyen jól néz ki meztelen.", "And how good she looks naked.");
					Item item2443 = new Item(s.getKey(), "Lehet, hogy festi magát.", "She may use make-up.");
					Item item2444 = new Item(s.getKey(), "Attól még nem lesz kopaszabb.", "That won't make her balder.");
					Item item2445 = new Item(s.getKey(), "Nincs több, ugye?", "There's no more, is there?");
					Item item2446 = new Item(s.getKey(), "Nincs.", "No.");

					pm.makePersistent(item1801);
					pm.makePersistent(item1802);
					pm.makePersistent(item1803);
					pm.makePersistent(item1804);
					pm.makePersistent(item1805);
					pm.makePersistent(item1806);
					pm.makePersistent(item1807);
					pm.makePersistent(item1808);
					pm.makePersistent(item1809);
					pm.makePersistent(item1810);
					pm.makePersistent(item1811);
					pm.makePersistent(item1812);
					pm.makePersistent(item1813);
					pm.makePersistent(item1814);
					pm.makePersistent(item1815);
					pm.makePersistent(item1816);
					pm.makePersistent(item1817);
					pm.makePersistent(item1818);
					pm.makePersistent(item1819);
					pm.makePersistent(item1820);
					pm.makePersistent(item1821);
					pm.makePersistent(item1822);
					pm.makePersistent(item1823);
					pm.makePersistent(item1824);
					pm.makePersistent(item1825);
					pm.makePersistent(item1826);
					pm.makePersistent(item1827);
					pm.makePersistent(item1828);
					pm.makePersistent(item1829);
					pm.makePersistent(item1830);
					pm.makePersistent(item1831);
					pm.makePersistent(item1832);
					pm.makePersistent(item1833);
					pm.makePersistent(item1834);
					pm.makePersistent(item1835);
					pm.makePersistent(item1836);
					pm.makePersistent(item1837);
					pm.makePersistent(item1838);
					pm.makePersistent(item1839);
					pm.makePersistent(item1840);
					pm.makePersistent(item1841);
					pm.makePersistent(item1842);
					pm.makePersistent(item1843);
					pm.makePersistent(item1844);
					pm.makePersistent(item1845);
					pm.makePersistent(item1846);
					pm.makePersistent(item1847);
					pm.makePersistent(item1848);
					pm.makePersistent(item1849);
					pm.makePersistent(item1850);
					pm.makePersistent(item1851);
					pm.makePersistent(item1852);
					pm.makePersistent(item1853);
					pm.makePersistent(item1854);
					pm.makePersistent(item1855);
					pm.makePersistent(item1856);
					pm.makePersistent(item1857);
					pm.makePersistent(item1858);
					pm.makePersistent(item1859);
					pm.makePersistent(item1860);
					pm.makePersistent(item1861);
					pm.makePersistent(item1862);
					pm.makePersistent(item1863);
					pm.makePersistent(item1864);
					pm.makePersistent(item1865);
					pm.makePersistent(item1866);
					pm.makePersistent(item1867);
					pm.makePersistent(item1868);
					pm.makePersistent(item1869);
					pm.makePersistent(item1870);
					pm.makePersistent(item1871);
					pm.makePersistent(item1872);
					pm.makePersistent(item1873);
					pm.makePersistent(item1874);
					pm.makePersistent(item1875);
					pm.makePersistent(item1876);
					pm.makePersistent(item1877);
					pm.makePersistent(item1878);
					pm.makePersistent(item1879);
					pm.makePersistent(item1880);
					pm.makePersistent(item1881);
					pm.makePersistent(item1882);
					pm.makePersistent(item1883);
					pm.makePersistent(item1884);
					pm.makePersistent(item1885);
					pm.makePersistent(item1886);
					pm.makePersistent(item1887);
					pm.makePersistent(item1888);
					pm.makePersistent(item1889);
					pm.makePersistent(item1890);
					pm.makePersistent(item1891);
					pm.makePersistent(item1892);
					pm.makePersistent(item1893);
					pm.makePersistent(item1894);
					pm.makePersistent(item1895);
					pm.makePersistent(item1896);
					pm.makePersistent(item1897);
					pm.makePersistent(item1898);
					pm.makePersistent(item1899);
					pm.makePersistent(item1900);
					pm.makePersistent(item1901);
					pm.makePersistent(item1902);
					pm.makePersistent(item1903);
					pm.makePersistent(item1904);
					pm.makePersistent(item1905);
					pm.makePersistent(item1906);
					pm.makePersistent(item1907);
					pm.makePersistent(item1908);
					pm.makePersistent(item1909);
					pm.makePersistent(item1910);
					pm.makePersistent(item1911);
					pm.makePersistent(item1912);
					pm.makePersistent(item1913);
					pm.makePersistent(item1914);
					pm.makePersistent(item1915);
					pm.makePersistent(item1916);
					pm.makePersistent(item1917);
					pm.makePersistent(item1918);
					pm.makePersistent(item1919);
					pm.makePersistent(item1920);
					pm.makePersistent(item1921);
					pm.makePersistent(item1922);
					pm.makePersistent(item1923);
					pm.makePersistent(item1924);
					pm.makePersistent(item1925);
					pm.makePersistent(item1926);
					pm.makePersistent(item1927);
					pm.makePersistent(item1928);
					pm.makePersistent(item1929);
					pm.makePersistent(item1930);
					pm.makePersistent(item1931);
					pm.makePersistent(item1932);
					pm.makePersistent(item1933);
					pm.makePersistent(item1934);
					pm.makePersistent(item1935);
					pm.makePersistent(item1936);
					pm.makePersistent(item1937);
					pm.makePersistent(item1938);
					pm.makePersistent(item1939);
					pm.makePersistent(item1940);
					pm.makePersistent(item1941);
					pm.makePersistent(item1942);
					pm.makePersistent(item1943);
					pm.makePersistent(item1944);
					pm.makePersistent(item1945);
					pm.makePersistent(item1946);
					pm.makePersistent(item1947);
					pm.makePersistent(item1948);
					pm.makePersistent(item1949);
					pm.makePersistent(item1950);
					pm.makePersistent(item1951);
					pm.makePersistent(item1952);
					pm.makePersistent(item1953);
					pm.makePersistent(item1954);
					pm.makePersistent(item1955);
					pm.makePersistent(item1956);
					pm.makePersistent(item1957);
					pm.makePersistent(item1958);
					pm.makePersistent(item1959);
					pm.makePersistent(item1960);
					pm.makePersistent(item1961);
					pm.makePersistent(item1962);
					pm.makePersistent(item1963);
					pm.makePersistent(item1964);
					pm.makePersistent(item1965);
					pm.makePersistent(item1966);
					pm.makePersistent(item1967);
					pm.makePersistent(item1968);
					pm.makePersistent(item1969);
					pm.makePersistent(item1970);
					pm.makePersistent(item1971);
					pm.makePersistent(item1972);
					pm.makePersistent(item1973);
					pm.makePersistent(item1974);
					pm.makePersistent(item1975);
					pm.makePersistent(item1976);
					pm.makePersistent(item1977);
					pm.makePersistent(item1978);
					pm.makePersistent(item1979);
					pm.makePersistent(item1980);
					pm.makePersistent(item1981);
					pm.makePersistent(item1982);
					pm.makePersistent(item1983);
					pm.makePersistent(item1984);
					pm.makePersistent(item1985);
					pm.makePersistent(item1986);
					pm.makePersistent(item1987);
					pm.makePersistent(item1988);
					pm.makePersistent(item1989);
					pm.makePersistent(item1990);
					pm.makePersistent(item1991);
					pm.makePersistent(item1992);
					pm.makePersistent(item1993);
					pm.makePersistent(item1994);
					pm.makePersistent(item1995);
					pm.makePersistent(item1996);
					pm.makePersistent(item1997);
					pm.makePersistent(item1998);
					pm.makePersistent(item1999);
					pm.makePersistent(item2000);
					pm.makePersistent(item2001);
					pm.makePersistent(item2002);
					pm.makePersistent(item2003);
					pm.makePersistent(item2004);
					pm.makePersistent(item2005);
					pm.makePersistent(item2006);
					pm.makePersistent(item2007);
					pm.makePersistent(item2008);
					pm.makePersistent(item2009);
					pm.makePersistent(item2010);
					pm.makePersistent(item2011);
					pm.makePersistent(item2012);
					pm.makePersistent(item2013);
					pm.makePersistent(item2014);
					pm.makePersistent(item2015);
					pm.makePersistent(item2016);
					pm.makePersistent(item2017);
					pm.makePersistent(item2018);
					pm.makePersistent(item2019);
					pm.makePersistent(item2020);
					pm.makePersistent(item2021);
					pm.makePersistent(item2022);
					pm.makePersistent(item2023);
					pm.makePersistent(item2024);
					pm.makePersistent(item2025);
					pm.makePersistent(item2026);
					pm.makePersistent(item2027);
					pm.makePersistent(item2028);
					pm.makePersistent(item2029);
					pm.makePersistent(item2030);
					pm.makePersistent(item2031);
					pm.makePersistent(item2032);
					pm.makePersistent(item2033);
					pm.makePersistent(item2034);
					pm.makePersistent(item2035);
					pm.makePersistent(item2036);
					pm.makePersistent(item2037);
					pm.makePersistent(item2038);
					pm.makePersistent(item2039);
					pm.makePersistent(item2040);
					pm.makePersistent(item2041);
					pm.makePersistent(item2042);
					pm.makePersistent(item2043);
					pm.makePersistent(item2044);
					pm.makePersistent(item2045);
					pm.makePersistent(item2046);
					pm.makePersistent(item2047);
					pm.makePersistent(item2048);
					pm.makePersistent(item2049);
					pm.makePersistent(item2050);
					pm.makePersistent(item2051);
					pm.makePersistent(item2052);
					pm.makePersistent(item2053);
					pm.makePersistent(item2054);
					pm.makePersistent(item2055);
					pm.makePersistent(item2056);
					pm.makePersistent(item2057);
					pm.makePersistent(item2058);
					pm.makePersistent(item2059);
					pm.makePersistent(item2060);
					pm.makePersistent(item2061);
					pm.makePersistent(item2062);
					pm.makePersistent(item2063);
					pm.makePersistent(item2064);
					pm.makePersistent(item2065);
					pm.makePersistent(item2066);
					pm.makePersistent(item2067);
					pm.makePersistent(item2068);
					pm.makePersistent(item2069);
					pm.makePersistent(item2070);
					pm.makePersistent(item2071);
					pm.makePersistent(item2072);
					pm.makePersistent(item2073);
					pm.makePersistent(item2074);
					pm.makePersistent(item2075);
					pm.makePersistent(item2076);
					pm.makePersistent(item2077);
					pm.makePersistent(item2078);
					pm.makePersistent(item2079);
					pm.makePersistent(item2080);
					pm.makePersistent(item2081);
					pm.makePersistent(item2082);
					pm.makePersistent(item2083);
					pm.makePersistent(item2084);
					pm.makePersistent(item2085);
					pm.makePersistent(item2086);
					pm.makePersistent(item2087);
					pm.makePersistent(item2088);
					pm.makePersistent(item2089);
					pm.makePersistent(item2090);
					pm.makePersistent(item2091);
					pm.makePersistent(item2092);
					pm.makePersistent(item2093);
					pm.makePersistent(item2094);
					pm.makePersistent(item2095);
					pm.makePersistent(item2096);
					pm.makePersistent(item2097);
					pm.makePersistent(item2098);
					pm.makePersistent(item2099);
					pm.makePersistent(item2100);
					pm.makePersistent(item2101);
					pm.makePersistent(item2102);
					pm.makePersistent(item2103);
					pm.makePersistent(item2104);
					pm.makePersistent(item2105);
					pm.makePersistent(item2106);
					pm.makePersistent(item2107);
					pm.makePersistent(item2108);
					pm.makePersistent(item2109);
					pm.makePersistent(item2110);
					pm.makePersistent(item2111);
					pm.makePersistent(item2112);
					pm.makePersistent(item2113);
					pm.makePersistent(item2114);
					pm.makePersistent(item2115);
					pm.makePersistent(item2116);
					pm.makePersistent(item2117);
					pm.makePersistent(item2118);
					pm.makePersistent(item2119);
					pm.makePersistent(item2120);
					pm.makePersistent(item2121);
					pm.makePersistent(item2122);
					pm.makePersistent(item2123);
					pm.makePersistent(item2124);
					pm.makePersistent(item2125);
					pm.makePersistent(item2126);
					pm.makePersistent(item2127);
					pm.makePersistent(item2128);
					pm.makePersistent(item2129);
					pm.makePersistent(item2130);
					pm.makePersistent(item2131);
					pm.makePersistent(item2132);
					pm.makePersistent(item2133);
					pm.makePersistent(item2134);
					pm.makePersistent(item2135);
					pm.makePersistent(item2136);
					pm.makePersistent(item2137);
					pm.makePersistent(item2138);
					pm.makePersistent(item2139);
					pm.makePersistent(item2140);
					pm.makePersistent(item2141);
					pm.makePersistent(item2142);
					pm.makePersistent(item2143);
					pm.makePersistent(item2144);
					pm.makePersistent(item2145);
					pm.makePersistent(item2146);
					pm.makePersistent(item2147);
					pm.makePersistent(item2148);
					pm.makePersistent(item2149);
					pm.makePersistent(item2150);
					pm.makePersistent(item2151);
					pm.makePersistent(item2152);
					pm.makePersistent(item2153);
					pm.makePersistent(item2154);
					pm.makePersistent(item2155);
					pm.makePersistent(item2156);
					pm.makePersistent(item2157);
					pm.makePersistent(item2158);
					pm.makePersistent(item2159);
					pm.makePersistent(item2160);
					pm.makePersistent(item2161);
					pm.makePersistent(item2162);
					pm.makePersistent(item2163);
					pm.makePersistent(item2164);
					pm.makePersistent(item2165);
					pm.makePersistent(item2166);
					pm.makePersistent(item2167);
					pm.makePersistent(item2168);
					pm.makePersistent(item2169);
					pm.makePersistent(item2170);
					pm.makePersistent(item2171);
					pm.makePersistent(item2172);
					pm.makePersistent(item2173);
					pm.makePersistent(item2174);
					pm.makePersistent(item2175);
					pm.makePersistent(item2176);
					pm.makePersistent(item2177);
					pm.makePersistent(item2178);
					pm.makePersistent(item2179);
					pm.makePersistent(item2180);
					pm.makePersistent(item2181);
					pm.makePersistent(item2182);
					pm.makePersistent(item2183);
					pm.makePersistent(item2184);
					pm.makePersistent(item2185);
					pm.makePersistent(item2186);
					pm.makePersistent(item2187);
					pm.makePersistent(item2188);
					pm.makePersistent(item2189);
					pm.makePersistent(item2190);
					pm.makePersistent(item2191);
					pm.makePersistent(item2192);
					pm.makePersistent(item2193);
					pm.makePersistent(item2194);
					pm.makePersistent(item2195);
					pm.makePersistent(item2196);
					pm.makePersistent(item2197);
					pm.makePersistent(item2198);
					pm.makePersistent(item2199);
					pm.makePersistent(item2200);
					pm.makePersistent(item2201);
					pm.makePersistent(item2202);
					pm.makePersistent(item2203);
					pm.makePersistent(item2204);
					pm.makePersistent(item2205);
					pm.makePersistent(item2206);
					pm.makePersistent(item2207);
					pm.makePersistent(item2208);
					pm.makePersistent(item2209);
					pm.makePersistent(item2210);
					pm.makePersistent(item2211);
					pm.makePersistent(item2212);
					pm.makePersistent(item2213);
					pm.makePersistent(item2214);
					pm.makePersistent(item2215);
					pm.makePersistent(item2216);
					pm.makePersistent(item2217);
					pm.makePersistent(item2218);
					pm.makePersistent(item2219);
					pm.makePersistent(item2220);
					pm.makePersistent(item2221);
					pm.makePersistent(item2222);
					pm.makePersistent(item2223);
					pm.makePersistent(item2224);
					pm.makePersistent(item2225);
					pm.makePersistent(item2226);
					pm.makePersistent(item2227);
					pm.makePersistent(item2228);
					pm.makePersistent(item2229);
					pm.makePersistent(item2230);
					pm.makePersistent(item2231);
					pm.makePersistent(item2232);
					pm.makePersistent(item2233);
					pm.makePersistent(item2234);
					pm.makePersistent(item2235);
					pm.makePersistent(item2236);
					pm.makePersistent(item2237);
					pm.makePersistent(item2238);
					pm.makePersistent(item2239);
					pm.makePersistent(item2240);
					pm.makePersistent(item2241);
					pm.makePersistent(item2242);
					pm.makePersistent(item2243);
					pm.makePersistent(item2244);
					pm.makePersistent(item2245);
					pm.makePersistent(item2246);
					pm.makePersistent(item2247);
					pm.makePersistent(item2248);
					pm.makePersistent(item2249);
					pm.makePersistent(item2250);
					pm.makePersistent(item2251);
					pm.makePersistent(item2252);
					pm.makePersistent(item2253);
					pm.makePersistent(item2254);
					pm.makePersistent(item2255);
					pm.makePersistent(item2256);
					pm.makePersistent(item2257);
					pm.makePersistent(item2258);
					pm.makePersistent(item2259);
					pm.makePersistent(item2260);
					pm.makePersistent(item2261);
					pm.makePersistent(item2262);
					pm.makePersistent(item2263);
					pm.makePersistent(item2264);
					pm.makePersistent(item2265);
					pm.makePersistent(item2266);
					pm.makePersistent(item2267);
					pm.makePersistent(item2268);
					pm.makePersistent(item2269);
					pm.makePersistent(item2270);
					pm.makePersistent(item2271);
					pm.makePersistent(item2272);
					pm.makePersistent(item2273);
					pm.makePersistent(item2274);
					pm.makePersistent(item2275);
					pm.makePersistent(item2276);
					pm.makePersistent(item2277);
					pm.makePersistent(item2278);
					pm.makePersistent(item2279);
					pm.makePersistent(item2280);
					pm.makePersistent(item2281);
					pm.makePersistent(item2282);
					pm.makePersistent(item2283);
					pm.makePersistent(item2284);
					pm.makePersistent(item2285);
					pm.makePersistent(item2286);
					pm.makePersistent(item2287);
					pm.makePersistent(item2288);
					pm.makePersistent(item2289);
					pm.makePersistent(item2290);
					pm.makePersistent(item2291);
					pm.makePersistent(item2292);
					pm.makePersistent(item2293);
					pm.makePersistent(item2294);
					pm.makePersistent(item2295);
					pm.makePersistent(item2296);
					pm.makePersistent(item2297);
					pm.makePersistent(item2298);
					pm.makePersistent(item2299);
					pm.makePersistent(item2300);
					pm.makePersistent(item2301);
					pm.makePersistent(item2302);
					pm.makePersistent(item2303);
					pm.makePersistent(item2304);
					pm.makePersistent(item2305);
					pm.makePersistent(item2306);
					pm.makePersistent(item2307);
					pm.makePersistent(item2308);
					pm.makePersistent(item2309);
					pm.makePersistent(item2310);
					pm.makePersistent(item2311);
					pm.makePersistent(item2312);
					pm.makePersistent(item2313);
					pm.makePersistent(item2314);
					pm.makePersistent(item2315);
					pm.makePersistent(item2316);
					pm.makePersistent(item2317);
					pm.makePersistent(item2318);
					pm.makePersistent(item2319);
					pm.makePersistent(item2320);
					pm.makePersistent(item2321);
					pm.makePersistent(item2322);
					pm.makePersistent(item2323);
					pm.makePersistent(item2324);
					pm.makePersistent(item2325);
					pm.makePersistent(item2326);
					pm.makePersistent(item2327);
					pm.makePersistent(item2328);
					pm.makePersistent(item2329);
					pm.makePersistent(item2330);
					pm.makePersistent(item2331);
					pm.makePersistent(item2332);
					pm.makePersistent(item2333);
					pm.makePersistent(item2334);
					pm.makePersistent(item2335);
					pm.makePersistent(item2336);
					pm.makePersistent(item2337);
					pm.makePersistent(item2338);
					pm.makePersistent(item2339);
					pm.makePersistent(item2340);
					pm.makePersistent(item2341);
					pm.makePersistent(item2342);
					pm.makePersistent(item2343);
					pm.makePersistent(item2344);
					pm.makePersistent(item2345);
					pm.makePersistent(item2346);
					pm.makePersistent(item2347);
					pm.makePersistent(item2348);
					pm.makePersistent(item2349);
					pm.makePersistent(item2350);
					pm.makePersistent(item2351);
					pm.makePersistent(item2352);
					pm.makePersistent(item2353);
					pm.makePersistent(item2354);
					pm.makePersistent(item2355);
					pm.makePersistent(item2356);
					pm.makePersistent(item2357);
					pm.makePersistent(item2358);
					pm.makePersistent(item2359);
					pm.makePersistent(item2360);
					pm.makePersistent(item2361);
					pm.makePersistent(item2362);
					pm.makePersistent(item2363);
					pm.makePersistent(item2364);
					pm.makePersistent(item2365);
					pm.makePersistent(item2366);
					pm.makePersistent(item2367);
					pm.makePersistent(item2368);
					pm.makePersistent(item2369);
					pm.makePersistent(item2370);
					pm.makePersistent(item2371);
					pm.makePersistent(item2372);
					pm.makePersistent(item2373);
					pm.makePersistent(item2374);
					pm.makePersistent(item2375);
					pm.makePersistent(item2376);
					pm.makePersistent(item2377);
					pm.makePersistent(item2378);
					pm.makePersistent(item2379);
					pm.makePersistent(item2380);
					pm.makePersistent(item2381);
					pm.makePersistent(item2382);
					pm.makePersistent(item2383);
					pm.makePersistent(item2384);
					pm.makePersistent(item2385);
					pm.makePersistent(item2386);
					pm.makePersistent(item2387);
					pm.makePersistent(item2388);
					pm.makePersistent(item2389);
					pm.makePersistent(item2390);
					pm.makePersistent(item2391);
					pm.makePersistent(item2392);
					pm.makePersistent(item2393);
					pm.makePersistent(item2394);
					pm.makePersistent(item2395);
					pm.makePersistent(item2396);
					pm.makePersistent(item2397);
					pm.makePersistent(item2398);
					pm.makePersistent(item2399);
					pm.makePersistent(item2400);
					pm.makePersistent(item2401);
					pm.makePersistent(item2402);
					pm.makePersistent(item2403);
					pm.makePersistent(item2404);
					pm.makePersistent(item2405);
					pm.makePersistent(item2406);
					pm.makePersistent(item2407);
					pm.makePersistent(item2408);
					pm.makePersistent(item2409);
					pm.makePersistent(item2410);
					pm.makePersistent(item2411);
					pm.makePersistent(item2412);
					pm.makePersistent(item2413);
					pm.makePersistent(item2414);
					pm.makePersistent(item2415);
					pm.makePersistent(item2416);
					pm.makePersistent(item2417);
					pm.makePersistent(item2418);
					pm.makePersistent(item2419);
					pm.makePersistent(item2420);
					pm.makePersistent(item2421);
					pm.makePersistent(item2422);
					pm.makePersistent(item2423);
					pm.makePersistent(item2424);
					pm.makePersistent(item2425);
					pm.makePersistent(item2426);
					pm.makePersistent(item2427);
					pm.makePersistent(item2428);
					pm.makePersistent(item2429);
					pm.makePersistent(item2430);
					pm.makePersistent(item2431);
					pm.makePersistent(item2432);
					pm.makePersistent(item2433);
					pm.makePersistent(item2434);
					pm.makePersistent(item2435);
					pm.makePersistent(item2436);
					pm.makePersistent(item2437);
					pm.makePersistent(item2438);
					pm.makePersistent(item2439);
					pm.makePersistent(item2440);
					pm.makePersistent(item2441);
					pm.makePersistent(item2442);
					pm.makePersistent(item2443);
					pm.makePersistent(item2444);
					pm.makePersistent(item2445);
					pm.makePersistent(item2446);

				}
			}
		}

	}

}
