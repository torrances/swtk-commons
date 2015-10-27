package org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCURV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"curvaceousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04694097\"]}");
	add("{\"term\":\"curvature\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05079832\", \"05109697\", \"14236810\"]}");
	add("{\"term\":\"curve\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02832880\", \"05079832\", \"00108695\", \"07013729\", \"13890262\"]}");
	add("{\"term\":\"curvet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00289034\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }