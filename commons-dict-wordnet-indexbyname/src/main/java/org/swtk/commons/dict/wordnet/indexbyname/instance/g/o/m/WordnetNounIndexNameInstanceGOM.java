package org.swtk.commons.dict.wordnet.indexbyname.instance.g.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"goma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08752686\"]}");
	add("{\"term\":\"gombrowicz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11026124\"]}");
	add("{\"term\":\"gomel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09034049\"]}");
	add("{\"term\":\"gomorrah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08813826\"]}");
	add("{\"term\":\"gomorrha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08813826\"]}");
	add("{\"term\":\"gompers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11026227\"]}");
	add("{\"term\":\"gomphothere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02509414\"]}");
	add("{\"term\":\"gomphotheriidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02509097\"]}");
	add("{\"term\":\"gomphotherium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02509261\"]}");
	add("{\"term\":\"gomphrena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11846457\"]}");
	add("{\"term\":\"gomuti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12605476\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }