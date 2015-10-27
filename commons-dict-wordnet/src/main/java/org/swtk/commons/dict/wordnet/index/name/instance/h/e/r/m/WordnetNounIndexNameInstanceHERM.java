package org.swtk.commons.dict.wordnet.index.name.instance.h.e.r.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHERM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"herm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03520891\"]}");
	add("{\"term\":\"herman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11064934\"]}");
	add("{\"term\":\"hermann\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10842390\"]}");
	add("{\"term\":\"hermannia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12220832\"]}");
	add("{\"term\":\"hermaphrodism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14491559\"]}");
	add("{\"term\":\"hermaphrodite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10191752\"]}");
	add("{\"term\":\"hermaphroditism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05015930\", \"14491559\"]}");
	add("{\"term\":\"hermaphroditus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09585655\"]}");
	add("{\"term\":\"hermeneutics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06193114\"]}");
	add("{\"term\":\"hermes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09585448\"]}");
	add("{\"term\":\"hermissenda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01954113\"]}");
	add("{\"term\":\"hermit\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10192120\", \"10538719\"]}");
	add("{\"term\":\"hermitage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03521097\"]}");
	add("{\"term\":\"hermosillo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08761390\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }