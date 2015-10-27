package org.swtk.commons.dict.wordnet.index.name.instance.m.e.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMENT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mentalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05981874\"]}");
	add("{\"term\":\"mentality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05625839\", \"06205574\"]}");
	add("{\"term\":\"mentation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05778923\"]}");
	add("{\"term\":\"mentha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12875685\"]}");
	add("{\"term\":\"menthol\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03752352\", \"14974533\"]}");
	add("{\"term\":\"menticirrhus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02599803\"]}");
	add("{\"term\":\"mention\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06719256\", \"06776392\", \"06778981\"]}");
	add("{\"term\":\"mentioner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10329014\"]}");
	add("{\"term\":\"mentor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10329163\"]}");
	add("{\"term\":\"mentum\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05284599\", \"05607372\", \"11711206\"]}");
	add("{\"term\":\"mentzelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12055892\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }