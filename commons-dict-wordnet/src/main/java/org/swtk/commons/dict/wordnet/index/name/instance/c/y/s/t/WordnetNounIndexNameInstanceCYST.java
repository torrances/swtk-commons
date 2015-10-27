package org.swtk.commons.dict.wordnet.index.name.instance.c.y.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCYST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cyst\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05525229\", \"14226478\"]}");
	add("{\"term\":\"cysteine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14628632\"]}");
	add("{\"term\":\"cystine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14628794\"]}");
	add("{\"term\":\"cystitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14212184\"]}");
	add("{\"term\":\"cystocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14320468\"]}");
	add("{\"term\":\"cystolith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09246394\"]}");
	add("{\"term\":\"cystoparalysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14109518\"]}");
	add("{\"term\":\"cystophora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02083586\"]}");
	add("{\"term\":\"cystoplegia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14109518\"]}");
	add("{\"term\":\"cystopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13216445\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }