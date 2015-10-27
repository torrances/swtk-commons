package org.swtk.commons.dict.wordnet.index.name.instance.f.r.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFRIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"friedan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11002446\"]}");
	add("{\"term\":\"friedcake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07654285\"]}");
	add("{\"term\":\"friedman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11002654\"]}");
	add("{\"term\":\"friend\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"09699104\", \"10697152\", \"09783207\", \"09804483\", \"10132360\"]}");
	add("{\"term\":\"friendlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04630029\"]}");
	add("{\"term\":\"friendliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04661694\", \"07514854\"]}");
	add("{\"term\":\"friendly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08414446\"]}");
	add("{\"term\":\"friendship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13954178\"]}");
	add("{\"term\":\"frier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07661078\"]}");
	add("{\"term\":\"fries\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07726825\"]}");
	add("{\"term\":\"friesian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02410042\"]}");
	add("{\"term\":\"friesland\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08971158\", \"08971286\"]}");
	add("{\"term\":\"frieze\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03401833\", \"03401923\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }