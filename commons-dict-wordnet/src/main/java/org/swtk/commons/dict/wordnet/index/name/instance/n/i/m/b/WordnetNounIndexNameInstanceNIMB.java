package org.swtk.commons.dict.wordnet.index.name.instance.n.i.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNIMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nimbleness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05011015\", \"05627336\"]}");
	add("{\"term\":\"nimblewill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12146101\"]}");
	add("{\"term\":\"nimbus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04958893\", \"09394597\"]}");
	add("{\"term\":\"nimby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10378274\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }