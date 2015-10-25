package org.swtk.commons.dict.wiktionary.generated.o.o.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOOL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oolite", "{\"term\":\"oolite\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From {{confix|oo|lite|lang\u003den}}, after German \u0027oolit\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A rock consisting of spherical grains within a mineral cortex accreted around a nucleus, often of quartz grains\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, \u0027The Earth\u0027, Folio Society 2011, p. 170\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Here and there are beds of \u0027\u0027oolites\u0027\u0027, for example, made of little rounded grains – like millet seed – that form only in agitated warm waters, such as you might find off the Bahamas today\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"An ooid or oolith\", \"priority\":4}]}, \"synonyms\":{}}");

	add("oolith", "{\"term\":\"oolith\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027oolithus\u0027, from Ancient greek (to 1453) \u0027ᾠο-\u0027 (oo-) + \u0027λίθος\u0027 (stone) corresponding to {{confix|oo|lith|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A spherical granule of which oolite is composed, formed by concentric accretion of thin layers of a mineral around a core. Calcium carbonate (limestone) is the most common mineral that forms \u0027\u0027ooliths\u0027\u0027, but they may also form from other minerals such as dolomite and silica\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Oolite\", \"priority\":2}]}, \"synonyms\":{}}");

	add("oology", "{\"term\":\"oology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|oo|logy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study of eggs, especially of birds\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }