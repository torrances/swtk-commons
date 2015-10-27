package org.swtk.commons.dict.wordnet.index.name.instance.b.e.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBENI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"benignancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04848212\"]}");
	add("{\"term\":\"benignity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00035041\", \"04848212\"]}");
	add("{\"term\":\"benin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08777253\"]}");
	add("{\"term\":\"beninese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09713665\"]}");
	add("{\"term\":\"benison\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07204222\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }