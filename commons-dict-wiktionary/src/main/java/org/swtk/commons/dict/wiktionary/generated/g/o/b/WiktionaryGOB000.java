package org.swtk.commons.dict.wiktionary.generated.g.o.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGOB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gobbet", "{\"term\":\"gobbet\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"middle french (ca. 1400-1600)\"], \"text\":\"From Middle english (1100-1500) \u0027gobet\u0027 from Middle french (ca. 1400-1600) \u0027gobet\u0027 (mouthful, piece) lt;ref\u0026gt;{{R:Webster NCD 1974|gobbet}}\u0026lt;/ref\u0026gt;. See gober.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a quantity of liquid, often in a sticky blotc\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a lump or chunk of something, especially of raw mea\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Wycli\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"He] had broken the stocks to small \u0027\u0027gobbets\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"an extract of text, or image (especially a quotation), provided as a context for analysis, translation or discussion in an examination\", \"priority\":5}]}, \"synonyms\":{}}");

	add("gobbledygook", "{\"term\":\"gobbledygook\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"First attested in a memo by US Representative (Texas) {{w|Maury Maverick}} dated March 30, 1944, banning \u0026quot;gobbledygook language\u0026quot;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Nonsense; meaningless or encrypted language\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Something written in an overly complex, incoherent, or incomprehensible manner\", \"priority\":2}]}, \"synonyms\":{}}");

	add("gobbler", "{\"term\":\"gobbler\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|gobble|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A turkey\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A male turkey; a tom; a stag; a jake\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"One who eats food very quickly, without decorum\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"My dog is such a \u0027\u0027gobbler\u0027\u0027: she can empty her food dish in less than a minute\", \"priority\":4}]}, \"synonyms\":{}}");

	add("gobline", "{\"term\":\"gobline\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|gob|line|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of the ropes or chains serving as stays for the dolphin striker or the bowsprit\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gobshite", "{\"term\":\"gobshite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|gob|t1\u003dmouth|shite|t2\u003dexcrement|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who engages in nonsensical chatter or unwanted conversation\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"What\u0027s that \u0027\u0027gobshite\u0027\u0027 talking about now\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A person of very poor judgment and unpleasant character\", \"priority\":3}]}, \"synonyms\":{}}");

	add("gobstopper", "{\"term\":\"gobstopper\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|gob|stopper|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A type of hard long-lasting candy, usually spherical in shape\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }