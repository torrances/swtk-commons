package org.swtk.commons.dict.wordnet.index.name.instance.a.b.s.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABSO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"absolute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05863039\"]}");
	add("{\"term\":\"absoluteness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04745638\", \"05131799\"]}");
	add("{\"term\":\"absolution\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00095060\", \"14597894\"]}");
	add("{\"term\":\"absolutism\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05967204\", \"06223441\", \"08457622\", \"14467378\"]}");
	add("{\"term\":\"absolutist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09774729\"]}");
	add("{\"term\":\"absolver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09774886\"]}");
	add("{\"term\":\"absorbance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05096574\"]}");
	add("{\"term\":\"absorbate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14621808\"]}");
	add("{\"term\":\"absorbency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04948141\"]}");
	add("{\"term\":\"absorbent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14621593\"]}");
	add("{\"term\":\"absorber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14622259\"]}");
	add("{\"term\":\"absorptance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13607658\"]}");
	add("{\"term\":\"absorption\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"05708052\", \"05712213\", \"13455861\", \"13456051\", \"13445356\", \"13445095\"]}");
	add("{\"term\":\"absorptivity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05017246\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }