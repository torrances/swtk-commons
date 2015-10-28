package org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gad\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04297397\", \"14404122\"]}");
	add("{\"term\":\"gadaba\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06994785\", \"09693897\"]}");
	add("{\"term\":\"gadabout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10136562\"]}");
	add("{\"term\":\"gaddafi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11270277\"]}");
	add("{\"term\":\"gaddi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03414716\"]}");
	add("{\"term\":\"gadfly\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02195661\", \"10439375\"]}");
	add("{\"term\":\"gadget\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02732963\"]}");
	add("{\"term\":\"gadgeteer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10136674\"]}");
	add("{\"term\":\"gadgetry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03414830\"]}");
	add("{\"term\":\"gadidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02524547\"]}");
	add("{\"term\":\"gadiformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02523872\"]}");
	add("{\"term\":\"gadoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02524277\"]}");
	add("{\"term\":\"gadolinite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14699730\"]}");
	add("{\"term\":\"gadolinium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14662219\"]}");
	add("{\"term\":\"gadsden\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09076696\"]}");
	add("{\"term\":\"gadus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02524878\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }