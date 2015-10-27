package org.swtk.commons.dict.wordnet.index.name.instance.e.x.o.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXOS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"exoskeleton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05594409\"]}");
	add("{\"term\":\"exosphere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09300338\"]}");
	add("{\"term\":\"exostosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14257799\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }