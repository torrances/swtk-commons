package org.swtk.commons.dict.wiktionary.generated.n.u.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNUI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nuisance", "{\"term\":\"nuisance\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\", \"anglo-norman\"], \"text\":\"From Anglo-norman \u0027nusaunce\u0027 \u0027\u0027 etc., from Old french (842-ca. 1400) \u0027nuisance\u0027 from \u0027nuisir\u0027 () (, from Latin {{m|la|noceō||I harm}}, {{m|la|nocēre}}).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A minor annoyance or inconvenience\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A person or thing causing annoyance or inconvenience\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Anything harmful or offensive to the community or to a member of it, for which a legal remedy exists\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"a public \u0027\u0027nuisance\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }