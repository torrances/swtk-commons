package org.swtk.commons.dict.wiktionary.generated.w.i.p;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryWIP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("wiper", "{\"term\":\"wiper\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"someone who wipe\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Robert Browning, \u0027The Pied Piper of Hamelin\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"So, Willy, let you and me be \u0027\u0027wipers\u0027\u0027 / Of scores out with all men \u0026amp;mdash; especially pipers\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"something, such as a towel, that is used for wipin\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"something, such as a windscreen wiper, that is designed for wipin\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"a movable electric contact in some devic\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A junior role in the engine room of a ship, someone who wipes down machinery and generally keeps it clean\", \"priority\":7}]}, \"synonyms\":{}}");

	add("wipeout", "{\"term\":\"wipeout\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|wipe|out|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The action of the verb \u0026quot;wipe out\u0026quot\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The skateboarder had a nasty \u0027\u0027wipeout\u0027\u0027 as she came off the ramp\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027wipeout\u0027\u0027 of this industry could be catastrophic\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }