package org.swtk.commons.dict.wiktionary.generated.j.u.t;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJUT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jute", "{\"term\":\"jute\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Sanskrit\"], \"text\":\"{{borrowing|bn|tr\u003djhūṭo|lang\u003den}}{{rfscript|bn}}, from Sanskrit {{m|sa|जूट||twisted hair}}, from {{m|psu|जुष्टि|tr\u003djuṣṭi}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The coarse, strong fiber of the East Indian plant, used to make mats, paper, gunny cloth etc\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The plants from which this fibre is obtained\", \"priority\":2}]}, \"synonyms\":{}}");

	add("jute", "{\"term\":\"jute\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin plural \u0027Jutae, Juti\u0027 (in w:Bede|Bede), corresponding to Old English \u0027Eotas|Ēotas, Iotas|Īotas\u0027. Ultimately from Proto-germanic {{m|gem-pro|*eutaz}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A member of the Germanic tribe that existed in modern-day Denmark that invaded England about the same time as the Angles and the Saxons in the beginning of the Middle Ages, but were eventually either consumed culturally or driven out of the island\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }