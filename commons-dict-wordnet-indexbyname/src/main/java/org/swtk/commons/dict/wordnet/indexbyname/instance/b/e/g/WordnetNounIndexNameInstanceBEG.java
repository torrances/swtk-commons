package org.swtk.commons.dict.wordnet.indexbyname.instance.b.e.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBEG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"begetter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10100638\"]}");
	add("{\"term\":\"beggar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09866418\"]}");
	add("{\"term\":\"beggarman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09866675\"]}");
	add("{\"term\":\"beggarweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12547259\"]}");
	add("{\"term\":\"beggarwoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09866752\"]}");
	add("{\"term\":\"beggary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14517616\", \"07202656\"]}");
	add("{\"term\":\"begging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07202656\"]}");
	add("{\"term\":\"begin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10861253\"]}");
	add("{\"term\":\"beginner\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10127072\", \"10383612\"]}");
	add("{\"term\":\"beginning\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00236302\", \"08524579\", \"05876673\", \"15290329\", \"07305628\"]}");
	add("{\"term\":\"begonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12380625\"]}");
	add("{\"term\":\"begoniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12380251\"]}");
	add("{\"term\":\"beguilement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00516425\", \"04693737\"]}");
	add("{\"term\":\"beguiler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09929832\", \"10017621\"]}");
	add("{\"term\":\"beguine\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00536358\", \"07069034\", \"10622103\"]}");
	add("{\"term\":\"begum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09866833\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }