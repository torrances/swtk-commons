package org.swtk.commons.dict.wordnet.indexbyname.instance.r.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rag\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00515669\", \"06278546\", \"07074884\", \"15195833\", \"04053034\"]}");
	add("{\"term\":\"ragamuffin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10524257\"]}");
	add("{\"term\":\"ragbag\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04053184\", \"08416934\"]}");
	add("{\"term\":\"rage\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05759170\", \"14003613\", \"14062661\", \"14060217\", \"07532236\"]}");
	add("{\"term\":\"ragee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12139178\"]}");
	add("{\"term\":\"raggedness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04824399\", \"04955418\"]}");
	add("{\"term\":\"ragi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12139178\"]}");
	add("{\"term\":\"raglan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04053370\"]}");
	add("{\"term\":\"ragnarok\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06384548\"]}");
	add("{\"term\":\"ragout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07608227\"]}");
	add("{\"term\":\"ragpicker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10524398\"]}");
	add("{\"term\":\"ragsorter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10524549\"]}");
	add("{\"term\":\"ragtag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08418776\"]}");
	add("{\"term\":\"ragtime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07074884\"]}");
	add("{\"term\":\"ragusa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08836687\"]}");
	add("{\"term\":\"ragweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11939916\", \"12032722\"]}");
	add("{\"term\":\"ragwort\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12032580\", \"12032722\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }