package org.swtk.commons.dict.wordnet.index.name.instance.h.o.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hour\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05138288\", \"15253706\", \"15253174\", \"15252642\"]}");
	add("{\"term\":\"hourglass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03549323\"]}");
	add("{\"term\":\"houri\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09568129\", \"10388227\"]}");
	add("{\"term\":\"hours\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15142458\", \"15143042\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }