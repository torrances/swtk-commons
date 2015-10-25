package org.swtk.commons.dict.wiktionary.generated.o.n.u;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryONU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("onus", "{\"term\":\"onus\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027onus\u0027 (burden)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A legal obligation\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027onus\u0027\u0027 is on the landlord to make sure the walls are protected from mildew\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"burden of Burden of proof, onus proband\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027onus\u0027\u0027 is on those who disagree with my proposal to explain why\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Stigma\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Blame\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Responsibility; burden\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }