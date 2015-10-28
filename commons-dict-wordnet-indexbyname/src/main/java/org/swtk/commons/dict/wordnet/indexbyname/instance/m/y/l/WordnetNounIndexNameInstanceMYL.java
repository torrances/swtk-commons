package org.swtk.commons.dict.wordnet.indexbyname.instance.m.y.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMYL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mylanta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14801682\"]}");
	add("{\"term\":\"mylar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14616397\"]}");
	add("{\"term\":\"myliobatidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01501463\"]}");
	add("{\"term\":\"mylitta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09539633\"]}");
	add("{\"term\":\"mylodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02462116\"]}");
	add("{\"term\":\"mylodontid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02461821\"]}");
	add("{\"term\":\"mylodontidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02461632\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }