package org.swtk.commons.dict.wordnet.index.name.instance.c.a.l.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCALD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"calder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10898761\"]}");
	add("{\"term\":\"caldera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09254024\"]}");
	add("{\"term\":\"calderon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10898907\"]}");
	add("{\"term\":\"caldron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02942602\"]}");
	add("{\"term\":\"caldwell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10899116\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }