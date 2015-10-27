package org.swtk.commons.dict.wordnet.index.name.instance.a.r.a.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARAW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"arawak\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06930540\", \"09822670\"]}");
	add("{\"term\":\"arawakan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06930540\", \"09822670\"]}");
	add("{\"term\":\"arawn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09531208\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }