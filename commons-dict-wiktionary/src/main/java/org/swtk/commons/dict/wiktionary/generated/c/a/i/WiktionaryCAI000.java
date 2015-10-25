package org.swtk.commons.dict.wiktionary.generated.c.a.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCAI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cainophobia", "{\"term\":\"cainophobia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From the Ancient greek (to 1453) roots {{m|grc|καινός|4\u003dnew}} or {{m|grc|καινότης|4\u003dnewness}} + {{m|grc|φόβος|4\u003dfear}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The fear of newness and/or of things that are new\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1962\u0027\u0027, \u0027Liberal Education\u0027, Volume 48, [http://books.google.com/books?id\u003dnIosAAAAIAAJ\u0026amp;q\u003d%22cainophobia%22 page 518\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"It is not by means of a social xenophobia and \u0027\u0027cainophobia\u0027\u0027 that we shall succeed in junking our sawdust goals but only by a sincere and passionate openness to new experience\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2009\u0027\u0027, Bruce I. Reiner, \u0026quot;[http://link.springer.com/article/10.1007/s10278-009-9239-z/fulltext.html The Challenges, Opportunities, and Imperative of Structured Reporting in Medical Imaging]\u0026quot;, \u0027Journal of Digital Imaging\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The question to ask is whether this free text fixation is the result of report optimization, inertia, or \u0027\u0027cainophobia\", \"priority\":5}]}, \"synonyms\":{}}");

	add("cairn", "{\"term\":\"cairn\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Scottish Gaelic\", \"scots\"], \"text\":\"From Scots \u0027cairn\u0027 from Scottish gaelic \u0027carn\u0027 (heap of stones) compare Old Irish \u0027carn\u0027 Welsh \u0027carn\u0027 probably from a Proto-celtic word meaning ‘horn’.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A rounded or conical heap of stones erected by early inhabitants of the British Isles, apparently as a sepulchral monument\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Now here let us place the gray stone of her \u0027\u0027cairn\u0027\u0027.\u0027 -Campbell\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A pile of stones heaped up as a landmark, to guide travelers on land or at sea, or to arrest attention, as in surveying, or in leaving traces of an exploring party, etc\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A cairn terrier\", \"priority\":4}]}, \"synonyms\":{}}");

	add("cairngormstone", "{\"term\":\"cairngormstone\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|Cairngorm|stone|lang\u003den}}. Gaelic \u0027carn\u0027 () + \u0027gorm\u0027 () + English \u0027stone\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A yellow or smoky brown variety of rock crystal, found especially in the mountains of in Scotland\", \"priority\":1}]}, \"synonyms\":{}}");

	add("caitiff", "{\"term\":\"caitiff\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"English\", \"French\", \"old french (842-ca. 1400)\", \"Italian\", \"Latin\", \"anglo-norman\"], \"text\":\"From Anglo-norman \u0027caitif\u0027 (captive) akin to Old french (842-ca. 1400) \u0027chaitif\u0027 () (French \u0027chétif\u0027 , from a Proto-Romance alteration of Latin \u0027captivus\u0027 (captive) compare Italian \u0027cattivo\u0027 (bad, wicked)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A base or despicable person; a wretc\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a captive or prisoner, particularly a galley slav\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"a villain, a coward or wretc\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Late\u0027\u0027 \u0027\u002714th\u0027\u0027 \u0027\u0027century\u0027\u0027, Geoffrey Chaucer, \u0026quot;The Knight\u0027s Tale\u0026quot;, \u0027The Canterbury Tales\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"For, certes, lord, þer is noon of us alle / Þat she ne haþ been a duchesse or a queene. / Now be we \u0027\u0027caytyves\u0027\u0027, as it is wel seene, / Þanked be Fortune and hire false wheel\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1989\u0027\u0027, Anthony Burgess, \u0027The Devil\u0027s Mode\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"‘There are plenty of Huns who have defected to the Romans, seeking gold and a quiet life. One of my first tasks as paramount chief is to bring those \u0027\u0027caitiffs\u0027\u0027 back and crucify them.’\", \"priority\":7}]}, \"synonyms\":{}}");

	add("caixin", "{\"term\":\"caixin\", \"etymology\":{\"influencers\":[], \"languages\":[\"mandarin chinese\", \"English\"], \"text\":\"From Mandarin chinese \u0027菜心|tr\u003dcàixīn|lang\u003dcmn\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"choy sum\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }