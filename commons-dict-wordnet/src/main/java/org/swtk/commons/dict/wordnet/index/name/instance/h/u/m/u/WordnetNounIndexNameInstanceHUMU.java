package org.swtk.commons.dict.wordnet.index.name.instance.h.u.m.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHUMU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"humulin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05418392\"]}");
	add("{\"term\":\"humulus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12418099\"]}");
	add("{\"term\":\"humus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07873707\", \"14932973\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }