package org.swtk.commons.dict.wordnet.index.name.instance.d.e.v.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEVO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"devoir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01232201\"]}");
	add("{\"term\":\"devolution\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01143481\", \"13481502\"]}");
	add("{\"term\":\"devolvement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01143481\"]}");
	add("{\"term\":\"devon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02409511\", \"08902171\"]}");
	add("{\"term\":\"devonian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15152934\"]}");
	add("{\"term\":\"devonshire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08902171\"]}");
	add("{\"term\":\"devotedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07559879\"]}");
	add("{\"term\":\"devotee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10097373\"]}");
	add("{\"term\":\"devotion\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01044796\", \"01046545\", \"01209043\", \"07559879\"]}");
	add("{\"term\":\"devotional\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01034842\"]}");
	add("{\"term\":\"devourer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10030518\"]}");
	add("{\"term\":\"devoutness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04834230\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }