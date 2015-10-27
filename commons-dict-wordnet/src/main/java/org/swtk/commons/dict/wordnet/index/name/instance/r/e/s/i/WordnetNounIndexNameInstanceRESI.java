package org.swtk.commons.dict.wordnet.index.name.instance.r.e.s.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRESI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"resid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15005343\"]}");
	add("{\"term\":\"residence\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03724592\", \"01055844\", \"04086356\", \"08576500\"]}");
	add("{\"term\":\"residency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00600179\", \"01055844\"]}");
	add("{\"term\":\"resident\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10208897\", \"10543112\"]}");
	add("{\"term\":\"residual\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13314012\", \"13833030\"]}");
	add("{\"term\":\"residue\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13833030\", \"15029068\"]}");
	add("{\"term\":\"residuum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13833030\"]}");
	add("{\"term\":\"resignation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06523551\", \"07268935\", \"07557821\"]}");
	add("{\"term\":\"resilience\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07365167\", \"05027863\"]}");
	add("{\"term\":\"resiliency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05027863\", \"07365167\"]}");
	add("{\"term\":\"resin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14918291\"]}");
	add("{\"term\":\"resinoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14720114\"]}");
	add("{\"term\":\"resistance\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"01171807\", \"04087045\", \"04653729\", \"05221162\", \"08377599\", \"14550556\", \"14550773\", \"00958098\", \"11524386\", \"11524062\", \"00203133\"]}");
	add("{\"term\":\"resister\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09792668\", \"10368974\"]}");
	add("{\"term\":\"resistivity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11524386\"]}");
	add("{\"term\":\"resistor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04087045\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }