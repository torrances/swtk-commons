package org.swtk.commons.dict.wordnet.index.name.instance.m.o.l.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOLO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"moloch\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01691602\", \"09542589\", \"10481571\"]}");
	add("{\"term\":\"molokai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09102798\"]}");
	add("{\"term\":\"molossidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02151788\"]}");
	add("{\"term\":\"molothrus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01577638\"]}");
	add("{\"term\":\"molotov\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09031742\", \"11204917\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }