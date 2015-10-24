package org.swtk.commons.dict.wiktionary.generated.p.o.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPOU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pouch", "{\"term\":\"pouch\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"frankish\", \"old french (842-ca. 1400)\"], \"text\":\"From \u0027pouche\u0027 borrowed from Old french (842-ca. 1400) \u0027poche\u0027 \u0027puche\u0027 (whence French \u0027poche\u0027 compare also the Anglo-Norman variant \u0027poke\u0027 , of Germanic origin: from Old Low Franconian {{m|frk|*poka||pouch}} (compare Middle Dutch \u0027poke\u0027 Old English \u0027pocca\u0027 dialectal German \u0027pfoch\u0027 or Frankish Compare \u0027pocket\u0027, \u0027poke\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small bag usually closed with a drawstring\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A pocket in which a marsupial carries its young\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Any pocket or bag-shaped object, such as a cheek pouch\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A protuberant belly; a paunch\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A cyst or sac containing fluid\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A silicle, or short pod, as of the shepherd\u0027s purse\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A bulkhead in the hold of a vessel, to prevent grain etc. from shifting\", \"priority\":7}]}, \"synonyms\":{}}");

	add("poult", "{\"term\":\"poult\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"Old english (ca. 450-1100) \u0027pulte\u0027 from Old french (842-ca. 1400) \u0027poulet\u0027 (young fowl) diminutive of \u0027poule\u0027 () from Latin \u0027pulla\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A young table-bird: turkey, partridge, grouse etc\", \"priority\":1}]}, \"synonyms\":{}}");

	add("poulaine", "{\"term\":\"poulaine\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"anglo-norman\"], \"text\":\"From Anglo-norman \u0027poleine\u0027 and Middle french (ca. 1400-1600) \u0027poulaine\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A long, pointed toe of a shoe, a style fashionable in the 14th and 15th centurie\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a shoe in such a style\", \"priority\":2}]}, \"synonyms\":{}}");

	add("pouncehug", "{\"term\":\"pouncehug\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|pounce|hug|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An enthusiastic embrace in which one person pounces on another and hugs them\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pourer", "{\"term\":\"pourer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|pour|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who, or that which, pours\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, Cheryl Charming, \u0027Just Shots: A Little Book of Liquid Fun\u0027 (page 1\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Simply screw off a bottle lid and then push the \u0027\u0027pourer\u0027\u0027 into the bottle. If your bottle has a wide mouth, then you\u0027ll have to buy a wide pourer\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, Claudio Delang, \u0027Living at the Edge of Thai Society\u0027 (page 104\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The visitor then passes the cup to others who are present. Each person takes a sip, handing the cup back to the \u0027\u0027pourer\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }