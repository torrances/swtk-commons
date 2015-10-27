package org.swtk.commons.dict.wordnet.index.name.instance.j.u.d.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJUDA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"juda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08816975\"]}");
	add("{\"term\":\"judaea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08817123\"]}");
	add("{\"term\":\"judah\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08816975\", \"11113459\"]}");
	add("{\"term\":\"judaica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07993684\"]}");
	add("{\"term\":\"judaism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06243034\", \"08110979\"]}");
	add("{\"term\":\"judas\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03608332\", \"10244788\", \"11113664\", \"11114045\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }