package org.swtk.commons.dict.wordnet.index.name.instance.k.e.t.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKETO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ketoacidosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14043311\"]}");
	add("{\"term\":\"ketoaciduria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14294982\"]}");
	add("{\"term\":\"ketohexose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14951725\"]}");
	add("{\"term\":\"ketone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14950432\"]}");
	add("{\"term\":\"ketonemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14290707\"]}");
	add("{\"term\":\"ketonuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14294982\"]}");
	add("{\"term\":\"ketoprofen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03617343\"]}");
	add("{\"term\":\"ketorolac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03617587\"]}");
	add("{\"term\":\"ketose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14951877\"]}");
	add("{\"term\":\"ketosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14290707\"]}");
	add("{\"term\":\"ketosteroid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15082730\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }