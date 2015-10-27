package org.swtk.commons.dict.wordnet.index.name.instance.f.a.i.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFAIR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fair\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01120503\", \"08425224\", \"08425514\", \"00520389\"]}");
	add("{\"term\":\"fairbanks\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10985353\", \"10985542\"]}");
	add("{\"term\":\"fairground\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08632207\"]}");
	add("{\"term\":\"fairlead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03323081\"]}");
	add("{\"term\":\"fairness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04692745\", \"04984514\", \"06212765\", \"04846385\"]}");
	add("{\"term\":\"fairway\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08632475\", \"08635326\", \"08586848\"]}");
	add("{\"term\":\"fairy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10095821\", \"09563541\"]}");
	add("{\"term\":\"fairyland\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05635465\", \"05640889\"]}");
	add("{\"term\":\"fairytale\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06770000\", \"07237241\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }