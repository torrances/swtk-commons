package org.swtk.commons.dict.wordnet.index.name.instance.s.u.r.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSURR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"surrealism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08487221\"]}");
	add("{\"term\":\"surrealist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10699292\"]}");
	add("{\"term\":\"surrebuttal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06575631\"]}");
	add("{\"term\":\"surrebutter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06575631\"]}");
	add("{\"term\":\"surrejoinder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06575792\"]}");
	add("{\"term\":\"surrender\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00068527\", \"00214192\", \"07269695\", \"07557821\"]}");
	add("{\"term\":\"surrenderer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10699445\"]}");
	add("{\"term\":\"surrey\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04372199\", \"08905188\"]}");
	add("{\"term\":\"surrogate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10025383\", \"10699600\"]}");
	add("{\"term\":\"surround\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08584764\"]}");
	add("{\"term\":\"surroundings\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08584764\", \"14537546\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }