package org.swtk.commons.dict.wordnet.index.name.instance.c.a.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"camachile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11784947\"]}");
	add("{\"term\":\"camail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02945300\"]}");
	add("{\"term\":\"camaraderie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04660984\"]}");
	add("{\"term\":\"camarilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08258719\"]}");
	add("{\"term\":\"camas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12469801\"]}");
	add("{\"term\":\"camash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12469801\"]}");
	add("{\"term\":\"camass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12469801\"]}");
	add("{\"term\":\"camassia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12469529\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }