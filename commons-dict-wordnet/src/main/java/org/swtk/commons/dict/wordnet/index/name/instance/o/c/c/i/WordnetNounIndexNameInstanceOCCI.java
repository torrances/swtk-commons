package org.swtk.commons.dict.wordnet.index.name.instance.o.c.c.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOCCI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"occident\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08700127\", \"08700313\"]}");
	add("{\"term\":\"occidental\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06910250\", \"10389544\"]}");
	add("{\"term\":\"occidentalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05175454\", \"06167773\"]}");
	add("{\"term\":\"occiput\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05548609\"]}");
	add("{\"term\":\"occitan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06978970\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }