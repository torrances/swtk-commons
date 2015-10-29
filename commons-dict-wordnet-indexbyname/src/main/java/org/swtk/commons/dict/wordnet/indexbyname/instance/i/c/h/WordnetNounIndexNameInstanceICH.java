package org.swtk.commons.dict.wordnet.indexbyname.instance.i.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceICH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"i chronicles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06447321\"]}");
	add("{\"term\":\"ichneumon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02140540\"]}");
	add("{\"term\":\"ichneumon fly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02221023\"]}");
	add("{\"term\":\"ichneumonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02220887\"]}");
	add("{\"term\":\"ichor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05424816\", \"14963893\"]}");
	add("{\"term\":\"ichthyolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01048495\"]}");
	add("{\"term\":\"ichthyologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10216236\"]}");
	add("{\"term\":\"ichthyology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06082462\"]}");
	add("{\"term\":\"ichthyosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01726872\"]}");
	add("{\"term\":\"ichthyosauria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01726696\"]}");
	add("{\"term\":\"ichthyosauridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01727111\"]}");
	add("{\"term\":\"ichthyosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01727481\"]}");
	add("{\"term\":\"ichthyosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14182479\"]}");
	add("{\"term\":\"ichyostega\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01630972\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }