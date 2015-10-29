package org.swtk.commons.dict.wordnet.indexbyname.instance.e.p.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEPA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"epa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08139934\"]}");
	add("{\"term\":\"epacridaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12273137\"]}");
	add("{\"term\":\"epacris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12273746\"]}");
	add("{\"term\":\"epacris family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12273137\"]}");
	add("{\"term\":\"epacris impressa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12274004\"]}");
	add("{\"term\":\"epacris obtusifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12274181\"]}");
	add("{\"term\":\"epacris purpurascens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12274352\"]}");
	add("{\"term\":\"epanalepsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07114418\"]}");
	add("{\"term\":\"epanaphora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07115344\"]}");
	add("{\"term\":\"epanodos\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07114510\", \"07114631\"]}");
	add("{\"term\":\"epanorthosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07117924\"]}");
	add("{\"term\":\"eparch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10081131\", \"10081239\"]}");
	add("{\"term\":\"eparchy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08568871\", \"08671835\"]}");
	add("{\"term\":\"epaulet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03297121\"]}");
	add("{\"term\":\"epaulette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03297121\"]}");
	add("{\"term\":\"epauliere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03297273\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }