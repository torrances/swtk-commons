package org.swtk.commons.dict.wiktionary.generated.j.e.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJER000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jeremiad", "{\"term\":\"jeremiad\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Hebrew\", \"Latin\"], \"text\":\"From French \u0027jérémiade\u0027 from \u0027jérémie\u0027 from Latin \u0027ieremias\u0027 from Hebrew \u0027ירמיה\u0027 (jeremiah) {{w|Jeremiah}} was a biblical prophet who lamented the moral state of Judah and predicted her downfall.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A long speech or prose work that bitterly laments the state of society and its morals, and often contains a prophecy of its coming downfall\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1895\u0027\u0027 — , \u0027s:The Moving The Moving Finger\u0027, \u0027s:The Moving Finger/A Digger\u0027s A Digger\u0027s Christmas\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"quot;Father Maguire,\u0026quot; he said in the broadest of Cork brogues, without the ghost of a smile on his grave Irish face, \u0026quot;is it a song yez wantin\u0027? Well, thin, it\u0027s just a \u0027\u0027jeremiad\u0027\u0027 I \u0027d be singin\u0027 yez, an\u0027 not another song at all, at all.\u0026quot\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2006:\u0027\u0027 \u0027The Columbus Dispatch\u0027, May\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"“This is precisely the manner of Balkanization that Schlesinger cautioned us about in his prescient \u0027\u0027jeremiad\u0027\u0027 on multiculturalism, The Disuniting of America\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, \u0027The Guardian\u0027, [http://film.guardian.co.uk/cannes2007/story/0,,2083430,00.html\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Cannes is smacking its lips in anticipation of filmmaker and provocateur Michael Moore\u0027s latest \u0027\u0027jeremiad\u0027\u0027 against the US administration, which receives its premiere at the film festival today\", \"priority\":7}]}, \"synonyms\":{}}");

	add("jerkdom", "{\"term\":\"jerkdom\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|jerk|dom|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or essence of being a jerk\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jerker", "{\"term\":\"jerker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|jerk|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A North American river chub\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Someone or something that jerks\", \"priority\":2}]}, \"synonyms\":{}}");

	add("jerkhood", "{\"term\":\"jerkhood\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|jerk|hood|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or essence of being a jerk\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jerkwater", "{\"term\":\"jerkwater\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A train on a branch line\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1975\u0027\u0027, Indiana Historical Society, \u0027Indiana Magazine of History\u0027, Vol. 71, no. 1 (Mar. 1975), page 35\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"…] by bailing from near streams with buckets, (the brake-man called this operation \u0027\u0027jerking water\u0027\u0027) and from this the road gets its name of \u0027\u0027jerkwater\u0027\u0027 road\", \"priority\":3}]}, \"synonyms\":{}}");

	add("jeroboam", "{\"term\":\"jeroboam\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"First king of the Kingdom of Israel\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jersey", "{\"term\":\"jersey\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From a typical fisherman\u0027s sweater used on the island of Jersey.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A garment knitted from wool, worn over the upper body\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A shirt worn by a member of an athletic team, usually oversized, typically depicting the athlete\u0027s name and team number as well as the team\u0027s logotype\", \"priority\":2}]}, \"synonyms\":{}}");

	add("jerusalem", "{\"term\":\"jerusalem\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"ancient hebrew\"], \"text\":\"From {{m|la|Ierusalem}}, {{m|la|Hierusalem}}, from Latin {{m|la|Hierosolyma}}, from Ancient greek (to 1453) {{m|grc|Ἰερουσαλήμ}}, from Ancient hebrew {{m|he|יְרוּשָׁלַיִם|tr\u003dYərūšālayim}}, from Western Semitic {{m|und||Urušalimmi}} (attested in Ancient Egyptian as {{rfscript|egy}}), a compound of Semitic *\u0027uru\u0027 \u0026quot;house, town\u0026quot; and *\u0027salim\u0027, which meant either \u0026quot;peace\u0026quot; or \u0026quot;Shalim, Canaanite goddess of twilight\u0026quot;.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The city located on in the Judean Mountains between the Mediterranean and the Dead Sea which is holy to Judaism (Temple of Solomon and the capital of the ancient kingdoms of Israel and Judea), Christianity (Christ’s crucifixion and resurrection) and Islam (Muhammad’s ascension to heaven\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }