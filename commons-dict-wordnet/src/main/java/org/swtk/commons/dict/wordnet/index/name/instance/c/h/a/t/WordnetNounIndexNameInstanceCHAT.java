package org.swtk.commons.dict.wordnet.index.name.instance.c.h.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chat\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01563277\", \"01572477\", \"07149558\"]}");
	add("{\"term\":\"chateau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03014569\"]}");
	add("{\"term\":\"chateaubriand\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07676106\", \"10913582\"]}");
	add("{\"term\":\"chatelaine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03014672\", \"09930923\"]}");
	add("{\"term\":\"chateura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01835325\"]}");
	add("{\"term\":\"chatroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06370874\"]}");
	add("{\"term\":\"chattahoochee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09265420\"]}");
	add("{\"term\":\"chattanooga\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01277882\", \"09163299\"]}");
	add("{\"term\":\"chattel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13266745\"]}");
	add("{\"term\":\"chatter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07393381\", \"07393552\", \"07151648\"]}");
	add("{\"term\":\"chatterbox\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09931028\", \"12083282\"]}");
	add("{\"term\":\"chatterer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01553402\", \"09931028\"]}");
	add("{\"term\":\"chattering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07393381\", \"07393552\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }