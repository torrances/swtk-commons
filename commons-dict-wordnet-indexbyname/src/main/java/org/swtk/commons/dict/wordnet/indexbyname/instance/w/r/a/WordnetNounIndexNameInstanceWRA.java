package org.swtk.commons.dict.wordnet.indexbyname.instance.w.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWRA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wrack\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01400705\", \"07350181\", \"01400419\"]}");
	add("{\"term\":\"wraith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05906778\"]}");
	add("{\"term\":\"wrangle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07164846\", \"07198809\"]}");
	add("{\"term\":\"wrangler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10205835\", \"10812386\"]}");
	add("{\"term\":\"wrangling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07164846\"]}");
	add("{\"term\":\"wrap\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04613084\", \"07714527\", \"04612804\"]}");
	add("{\"term\":\"wraparound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04612930\"]}");
	add("{\"term\":\"wrapper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04612804\", \"04613084\", \"03823187\"]}");
	add("{\"term\":\"wrapping\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04376112\", \"04613084\"]}");
	add("{\"term\":\"wrapping paper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15129689\"]}");
	add("{\"term\":\"wrasse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02610492\"]}");
	add("{\"term\":\"wrath\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00760325\", \"07532144\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }