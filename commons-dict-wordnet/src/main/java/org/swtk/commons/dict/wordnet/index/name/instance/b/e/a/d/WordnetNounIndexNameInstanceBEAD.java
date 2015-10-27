package org.swtk.commons.dict.wordnet.index.name.instance.b.e.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBEAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bead\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02818372\", \"13924278\", \"02818206\"]}");
	add("{\"term\":\"beading\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02818372\", \"02818524\"]}");
	add("{\"term\":\"beadle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10858727\", \"09864178\"]}");
	add("{\"term\":\"beads\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02818735\"]}");
	add("{\"term\":\"beadsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09864306\"]}");
	add("{\"term\":\"beadwork\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02818372\", \"02818524\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }