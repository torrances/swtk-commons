package org.swtk.commons.dict.wiktionary.generated.u.p.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUPD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("updo", "{\"term\":\"updo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|up|do|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A woman\u0027s hairdo in which most hair is kept above the nec\", \"priority\":1}]}, \"synonyms\":{}}");

	add("update", "{\"term\":\"update\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{prefix|up|date|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An advisement providing more up-to-date information than currently known\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"He gave me an \u0027\u0027update\u0027\u0027 on the situation in New York\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A change in information, a modification of existing or known data\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"I just made an \u0027\u0027update\u0027\u0027 to the Wikipedia article on guerillas\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"An additional piece of information. An addition to existing information\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"I just made an \u0027\u0027update\u0027\u0027 to my blog about my trip to Rome\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A modification of something to a more recent, up-to-date version; (\u0027in software\u0027) a minor upgrade\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Our database receives an \u0027\u0027update\u0027\u0027 every morning at 3 AM\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"I have a couple of \u0027\u0027updates\u0027\u0027 to install on your laptop\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A version of something which is newer than other versions\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"quot;\u0027You should try the update: it rocks.\u0027\u0026quot\", \"priority\":11}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }