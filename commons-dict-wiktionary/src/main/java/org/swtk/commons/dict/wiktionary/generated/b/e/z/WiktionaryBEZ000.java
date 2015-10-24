package org.swtk.commons.dict.wiktionary.generated.b.e.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBEZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bezant", "{\"term\":\"bezant\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\"], \"text\":\"From Old french (842-ca. 1400) \u0027bezant\u0027 nominative \u0027bezanz\u0027 from Latin \u0027byzantius\u0027 (of byzantium)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A coin made of gold or silver, minted at Byzantium and used in currency throughout mediaeval Europe\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The heraldic representation of a gold coin\", \"priority\":2}]}, \"synonyms\":{}}");

	add("bezel", "{\"term\":\"bezel\", \"etymology\":{\"influencers\":[{},{},{},{}], \"languages\":[\"Breton\", \"English\", \"French\"], \"text\":\"From old French dialect \u0027biseau\u0027 (sloping edge) variation on \u0027bijou\u0027 (jewel) itself probably from Breton \u0027bisou\u0027 \u0027bizou\u0027 (ring worn on the finger) from \u0027biz\u0027 (finger) Unrelated to similar \u0027bevel\u0027 which is of distinct French origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The sloping edge or face on a cutting too\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The oblique side or face of a cut gem; especially the upper faceted portion of a brilliant (diamond), which projects from its settin\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The rim and flange which encompasses and fastens a jewel or other object, such as the crystal of a watch, in the cavity in which it is set; the collet\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The panel that covers the front of a computer case, or the panel covering each drive bay that can be removed to install a removable drive that requires external access, such as a CD/DVD-ROM drive, which usually has its own preinstalled bezel\", \"priority\":4}]}, \"synonyms\":{}}");

	add("bezoar", "{\"term\":\"bezoar\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\", \"French\", \"pahlavi\"], \"text\":\"From French {{m|fr|bézoard}}, based on Arabic \u0027بَازَهْر\u0027 from Pahlavi {{m|pal|pʾtzhl|tr\u003dpādzahr||bezoar, antidote}}. In ancient times, bezoars from animals were ground up and ingested as remedies for various maladies and as antidotes to poisons.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A mass, usually of hair or undigested vegetable matter, found in an animal\u0027s intestines; a hairball\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An enterolith\", \"priority\":2}]}, \"synonyms\":{}}");

	add("bezzy", "{\"term\":\"bezzy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{clipping|best|nocap\u003d1|lang\u003den}} {{suffix||y|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"best frien\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }