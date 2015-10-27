package org.swtk.commons.dict.wordnet.index.name.instance.c.a.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCATE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"catechesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00889560\"]}");
	add("{\"term\":\"catechin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15091804\"]}");
	add("{\"term\":\"catechism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06424414\", \"07208953\"]}");
	add("{\"term\":\"catechist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09920790\"]}");
	add("{\"term\":\"catecholamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14832099\"]}");
	add("{\"term\":\"catechu\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11777659\", \"11777902\"]}");
	add("{\"term\":\"catechumen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09920955\"]}");
	add("{\"term\":\"categorem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06765124\"]}");
	add("{\"term\":\"categoreme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06765124\"]}");
	add("{\"term\":\"categorisation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01014654\", \"05740701\", \"07955878\"]}");
	add("{\"term\":\"categorization\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01014654\", \"05740701\", \"07955878\"]}");
	add("{\"term\":\"category\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05847274\", \"08014145\"]}");
	add("{\"term\":\"catena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08393257\"]}");
	add("{\"term\":\"catenary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13891246\"]}");
	add("{\"term\":\"caterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09921095\"]}");
	add("{\"term\":\"catering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01106229\"]}");
	add("{\"term\":\"caterpillar\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02986962\", \"02311989\"]}");
	add("{\"term\":\"caterwaul\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07393169\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }