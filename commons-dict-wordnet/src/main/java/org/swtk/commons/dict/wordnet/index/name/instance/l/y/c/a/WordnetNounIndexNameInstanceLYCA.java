package org.swtk.commons.dict.wordnet.index.name.instance.l.y.c.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLYCA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lycaena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02284639\"]}");
	add("{\"term\":\"lycaenid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02284439\"]}");
	add("{\"term\":\"lycaenidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02284204\"]}");
	add("{\"term\":\"lycaeon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02119282\"]}");
	add("{\"term\":\"lycanthrope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09526253\"]}");
	add("{\"term\":\"lycanthropy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05208451\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }