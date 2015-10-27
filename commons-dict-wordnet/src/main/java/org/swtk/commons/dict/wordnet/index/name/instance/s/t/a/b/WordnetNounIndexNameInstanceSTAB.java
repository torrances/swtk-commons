package org.swtk.commons.dict.wordnet.index.name.instance.s.t.a.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTAB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stab\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00790134\", \"01176455\", \"07510112\"]}");
	add("{\"term\":\"stabber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10663618\"]}");
	add("{\"term\":\"stabile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04301179\"]}");
	add("{\"term\":\"stabilisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01161512\", \"01269438\"]}");
	add("{\"term\":\"stabiliser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04301350\"]}");
	add("{\"term\":\"stability\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04745881\", \"13993571\", \"04785640\"]}");
	add("{\"term\":\"stabilization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01269438\", \"01161512\"]}");
	add("{\"term\":\"stabilizer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04301350\", \"04301564\", \"15077234\"]}");
	add("{\"term\":\"stable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04302017\"]}");
	add("{\"term\":\"stableboy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10663740\"]}");
	add("{\"term\":\"stableman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10663740\"]}");
	add("{\"term\":\"stablemate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02378090\"]}");
	add("{\"term\":\"stableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04785640\"]}");
	add("{\"term\":\"stabling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04302491\"]}");
	add("{\"term\":\"stabroek\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08968477\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }