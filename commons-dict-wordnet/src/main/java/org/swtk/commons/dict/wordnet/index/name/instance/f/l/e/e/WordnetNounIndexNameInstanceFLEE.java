package org.swtk.commons.dict.wordnet.index.name.instance.f.l.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fleece\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01902234\", \"03367485\", \"14787687\", \"15129319\"]}");
	add("{\"term\":\"fleer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06729056\", \"10134739\"]}");
	add("{\"term\":\"fleet\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08309677\", \"08310257\", \"08310411\", \"08310752\"]}");
	add("{\"term\":\"fleetingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05062840\"]}");
	add("{\"term\":\"fleetness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05066168\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }