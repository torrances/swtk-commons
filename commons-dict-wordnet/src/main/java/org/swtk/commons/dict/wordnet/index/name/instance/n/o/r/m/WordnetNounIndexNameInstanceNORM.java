package org.swtk.commons.dict.wordnet.index.name.instance.n.o.r.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNORM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"norm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06031110\", \"13876685\"]}");
	add("{\"term\":\"norma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09395087\"]}");
	add("{\"term\":\"normal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05675457\"]}");
	add("{\"term\":\"normalcy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04802662\", \"14524492\"]}");
	add("{\"term\":\"normalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01161177\"]}");
	add("{\"term\":\"normaliser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10382127\"]}");
	add("{\"term\":\"normality\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04721334\", \"04802662\", \"13602112\", \"14524492\"]}");
	add("{\"term\":\"normalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01161177\"]}");
	add("{\"term\":\"normalizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10382127\"]}");
	add("{\"term\":\"norman\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09732656\", \"11229296\", \"11229418\"]}");
	add("{\"term\":\"normandie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08964334\"]}");
	add("{\"term\":\"normandy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08964334\"]}");
	add("{\"term\":\"normodyne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03635835\"]}");
	add("{\"term\":\"normothermia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14067854\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }