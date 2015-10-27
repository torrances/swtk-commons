package org.swtk.commons.dict.wordnet.index.name.instance.p.e.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePEEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"peel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07754329\", \"11248029\"]}");
	add("{\"term\":\"peeler\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03911028\", \"10432529\", \"10683779\"]}");
	add("{\"term\":\"peeling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11465660\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }