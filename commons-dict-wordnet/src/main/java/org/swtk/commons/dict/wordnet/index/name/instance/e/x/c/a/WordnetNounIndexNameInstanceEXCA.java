package org.swtk.commons.dict.wordnet.index.name.instance.e.x.c.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXCA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"excalibur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03306975\"]}");
	add("{\"term\":\"excavation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00924141\", \"03307066\", \"08567651\", \"00943790\"]}");
	add("{\"term\":\"excavator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04002774\", \"09640322\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }