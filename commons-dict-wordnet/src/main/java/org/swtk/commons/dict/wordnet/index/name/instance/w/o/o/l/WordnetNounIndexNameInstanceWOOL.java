package org.swtk.commons.dict.wordnet.index.name.instance.w.o.o.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWOOL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wool\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01902234\", \"15128784\", \"04606562\"]}");
	add("{\"term\":\"woolen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04606562\"]}");
	add("{\"term\":\"woolf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11416662\"]}");
	add("{\"term\":\"woolgatherer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10013439\"]}");
	add("{\"term\":\"woolgathering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05777723\"]}");
	add("{\"term\":\"woollcott\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11416938\"]}");
	add("{\"term\":\"woollen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04606562\"]}");
	add("{\"term\":\"woolley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11417089\"]}");
	add("{\"term\":\"woolsorter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10810119\"]}");
	add("{\"term\":\"woolworth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11417266\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }