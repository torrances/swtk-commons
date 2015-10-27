package org.swtk.commons.dict.wordnet.index.name.instance.w.i.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWIES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wiesbaden\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08792886\"]}");
	add("{\"term\":\"wiesel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11405743\"]}");
	add("{\"term\":\"wiesenboden\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15122561\"]}");
	add("{\"term\":\"wiesenthal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11406000\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }