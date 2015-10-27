package org.swtk.commons.dict.wordnet.index.name.instance.b.a.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBAIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bail\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05912039\", \"13371991\"]}");
	add("{\"term\":\"bailee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09852338\"]}");
	add("{\"term\":\"bailey\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02778694\", \"02778818\", \"10850732\", \"10850959\"]}");
	add("{\"term\":\"bailiff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09852471\"]}");
	add("{\"term\":\"bailiffship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00590355\"]}");
	add("{\"term\":\"bailiwick\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06005806\", \"08568239\"]}");
	add("{\"term\":\"bailment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01110876\"]}");
	add("{\"term\":\"bailor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09852635\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }