package org.swtk.commons.dict.wordnet.index.name.instance.h.u.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHULL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hull\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03553806\", \"08897435\", \"11085557\", \"11085713\", \"11712459\", \"13160695\"]}");
	add("{\"term\":\"hullabaloo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00555337\"]}");
	add("{\"term\":\"hullo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06645018\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }