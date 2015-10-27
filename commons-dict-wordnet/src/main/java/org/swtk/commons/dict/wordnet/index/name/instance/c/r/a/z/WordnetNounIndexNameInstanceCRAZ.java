package org.swtk.commons.dict.wordnet.index.name.instance.c.r.a.z;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRAZ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"craze\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04700622\", \"14415281\", \"05759170\"]}");
	add("{\"term\":\"craziness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00513854\", \"05655001\", \"14421293\"]}");
	add("{\"term\":\"crazy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09995813\"]}");
	add("{\"term\":\"crazyweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12575031\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }