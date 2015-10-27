package org.swtk.commons.dict.wordnet.index.name.instance.t.r.i.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRIB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tribade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10274662\"]}");
	add("{\"term\":\"tribadism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00859159\"]}");
	add("{\"term\":\"tribalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00383547\"]}");
	add("{\"term\":\"tribalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05963674\", \"13951976\"]}");
	add("{\"term\":\"tribalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00383547\"]}");
	add("{\"term\":\"tribe\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07986142\", \"08125750\", \"08185430\", \"08389338\"]}");
	add("{\"term\":\"tribesman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10748276\"]}");
	add("{\"term\":\"tribolium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02184251\"]}");
	add("{\"term\":\"tribologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10748379\"]}");
	add("{\"term\":\"tribology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06144546\"]}");
	add("{\"term\":\"tribonema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01404327\"]}");
	add("{\"term\":\"tribonemaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01404158\"]}");
	add("{\"term\":\"tribromoethanol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04488400\"]}");
	add("{\"term\":\"tribromomethane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14644727\"]}");
	add("{\"term\":\"tribulation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07387559\"]}");
	add("{\"term\":\"tribulus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12744206\"]}");
	add("{\"term\":\"tribunal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08346380\"]}");
	add("{\"term\":\"tribune\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04488511\", \"10748480\"]}");
	add("{\"term\":\"tribuneship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00606464\"]}");
	add("{\"term\":\"tributary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09301903\"]}");
	add("{\"term\":\"tribute\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00786409\", \"01124708\", \"06709958\"]}");
	add("{\"term\":\"tributyrin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14812766\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }