package org.swtk.commons.dict.wordnet.index.name.instance.s.t.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stamboul\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09064260\"]}");
	add("{\"term\":\"stambul\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09064260\"]}");
	add("{\"term\":\"stamen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11695547\"]}");
	add("{\"term\":\"stamina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05040073\"]}");
	add("{\"term\":\"stammel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04306966\"]}");
	add("{\"term\":\"stammer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14426326\"]}");
	add("{\"term\":\"stammerer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10666219\"]}");
	add("{\"term\":\"stamp\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"04166119\", \"04307101\", \"04307218\", \"06868867\", \"13395181\", \"06808977\", \"06868257\", \"08015015\", \"13936581\"]}");
	add("{\"term\":\"stampede\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07460870\", \"01125741\"]}");
	add("{\"term\":\"stamper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04307647\", \"10666381\", \"10666607\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }