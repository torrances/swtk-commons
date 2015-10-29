package org.swtk.commons.dict.wordnet.indexbyname.instance.h.i.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHIM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"himalaya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09326553\"]}");
	add("{\"term\":\"himalaya honeysuckle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12693773\"]}");
	add("{\"term\":\"himalaya mountains\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09326553\"]}");
	add("{\"term\":\"himalayan cedar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11644418\"]}");
	add("{\"term\":\"himalayan lilac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12331155\"]}");
	add("{\"term\":\"himalayan rhubarb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12624034\"]}");
	add("{\"term\":\"himalayas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09326553\"]}");
	add("{\"term\":\"himalayish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06944501\"]}");
	add("{\"term\":\"himantoglossum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12089989\"]}");
	add("{\"term\":\"himantoglossum hircinum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12090180\"]}");
	add("{\"term\":\"himantopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02037048\"]}");
	add("{\"term\":\"himantopus himantopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02037864\"]}");
	add("{\"term\":\"himantopus himantopus leucocephalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02038056\"]}");
	add("{\"term\":\"himantopus mexicanus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02037625\"]}");
	add("{\"term\":\"himantopus stilt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02037315\"]}");
	add("{\"term\":\"himmler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11070532\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }