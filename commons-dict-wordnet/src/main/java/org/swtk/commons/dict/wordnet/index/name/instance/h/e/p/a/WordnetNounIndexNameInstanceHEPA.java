package org.swtk.commons.dict.wordnet.index.name.instance.h.e.p.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHEPA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hepadnavirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01338717\"]}");
	add("{\"term\":\"heparin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03520118\"]}");
	add("{\"term\":\"hepatic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11563091\"]}");
	add("{\"term\":\"hepatica\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11564466\", \"11755522\"]}");
	add("{\"term\":\"hepaticae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11562792\"]}");
	add("{\"term\":\"hepaticopsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11562792\"]}");
	add("{\"term\":\"hepatitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14153836\"]}");
	add("{\"term\":\"hepatocarcinoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14274656\"]}");
	add("{\"term\":\"hepatoflavin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15116040\"]}");
	add("{\"term\":\"hepatoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14274656\"]}");
	add("{\"term\":\"hepatomegaly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14126662\"]}");
	add("{\"term\":\"hepatotoxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15060670\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }