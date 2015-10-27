package org.swtk.commons.dict.wordnet.index.name.instance.b.u.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBUCH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"buchanan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10889518\"]}");
	add("{\"term\":\"bucharest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08832326\"]}");
	add("{\"term\":\"bucharesti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08832326\"]}");
	add("{\"term\":\"buchenwald\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02912868\"]}");
	add("{\"term\":\"buchloe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12133005\"]}");
	add("{\"term\":\"buchner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10889659\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }