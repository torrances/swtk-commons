package org.swtk.commons.dict.wordnet.index.name.instance.u.r.e.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceURET {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ureter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05520486\"]}");
	add("{\"term\":\"ureteritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14381175\"]}");
	add("{\"term\":\"ureterocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14596182\"]}");
	add("{\"term\":\"ureterostenosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14596315\"]}");
	add("{\"term\":\"urethane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15108844\"]}");
	add("{\"term\":\"urethra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05520671\"]}");
	add("{\"term\":\"urethritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14591002\"]}");
	add("{\"term\":\"urethrocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14596399\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }