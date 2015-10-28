package org.swtk.commons.dict.wordnet.indexbyname.instance.e.d.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEDW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"edward\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"10969774\", \"10969944\", \"10970084\", \"10970211\", \"10970440\", \"10970778\", \"10971009\", \"10971270\", \"10971451\", \"10971689\"]}");
	add("{\"term\":\"edwardian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10066195\"]}");
	add("{\"term\":\"edwards\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10971940\"]}");
	add("{\"term\":\"edwin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10972911\"]}");
	add("{\"term\":\"edwy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10973027\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }